package com.gd.dao.org;

import com.gd.domain.base.BaseModel;
import com.gd.domain.org.Org;
import com.gd.domain.org.Org0;
import com.gd.domain.org.Org_User;
import com.gd.domain.userinfo.UserInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by dell on 2017/4/30.
 * Good Luck !
 * へ　　　　　／|
 * 　　/＼7　　　 ∠＿/
 * 　 /　│　　 ／　／
 * 　│　Z ＿,＜　／　　 /`ヽ
 * 　│　　　　　ヽ　　 /　　〉
 * 　 Y　　　　　`　 /　　/
 * 　ｲ●　､　●　　⊂⊃〈　　/
 * 　()　 へ　　　　|　＼〈
 * 　　>ｰ ､_　 ィ　 │ ／／
 * 　 / へ　　 /　ﾉ＜| ＼＼
 * 　 ヽ_ﾉ　　(_／　 │／／
 * 　　7　　　　　　　|／
 * 　　＞―r￣￣`ｰ―＿
 */
@Repository("orgDao")
public interface IOrgDao {
    @Select("<script>SELECT  * FROM sys_org WHERE 1=1\n" +
            "<if test=\"id!=null and id!=''\">\n" +
            "AND ID=#{id}\n" +
            "</if>\n" +
            "<if test=\"orgName!=null and orgName!=''\">\n" +
            "AND ORGNAME=#{orgName}\n" +
            "</if>\n" +
            "<if test=\"leader!=null and leader!=''\">\n" +
            "AND LEADER=#{leader}\n" +
            "</if>\n" +
            "<if test=\"parentId!=null and parentId!=''\">\n" +
            "AND PARENTID=#{parentId}\n" +
            "</if>\n" +
            "<if test=\"parentName!=null and parentName!=''\">\n" +
            "AND PARENTNAME=#{parentName}\n" +
            "</if>\n" +
            "<if test=\"path!=null and path!=''\">\n" +
            "AND PATH=#{path}\n" +
            "</if>\n" +
            "<if test=\"orderNum!=null and orderNum!=''\">\n" +
            "AND ORDERNUM=#{orderNum}\n" +
            "</if>\n" +
            "<if test=\"ifuse!=null and ifuse!=''\">\n" +
            "AND IFUSE=#{ifuse}\n" +
            "</if></script>")
    List<Org> queryForObject(BaseModel baseModel);
    @Select("<script>SELECT  * FROM sys_org WHERE 1=1\n" +
            "<if test=\"id!=null and id!=''\">\n" +
            "AND ID=#{id}\n" +
            "</if>\n" +
            "<if test=\"orgName!=null and orgName!=''\">\n" +
            "AND ORGNAME=#{orgName}\n" +
            "</if>\n" +
            "<if test=\"leader!=null and leader!=''\">\n" +
            "AND LEADER=#{leader}\n" +
            "</if>\n" +
            "<if test=\"parentId!=null and parentId!=''\">\n" +
            "AND PARENTID=#{parentId}\n" +
            "</if>\n" +
            "<if test=\"parentName!=null and parentName!=''\">\n" +
            "AND PARENTNAME=#{parentName}\n" +
            "</if>\n" +
            "<if test=\"path!=null and path!=''\">\n" +
            "AND PATH=#{path}\n" +
            "</if>\n" +
            "<if test=\"orderNum!=null and orderNum!=''\">\n" +
            "AND ORDERNUM=#{orderNum}\n" +
            "</if>\n" +
            "<if test=\"ifuse!=null and ifuse!=''\">\n" +
            "AND IFUSE=#{ifuse}\n" +
            "</if></script>")
    List<Org_User> queryForObject1(BaseModel baseModel);
    @Select("<script>SELECT  * FROM sys_org WHERE 1=1\n" +
            "<if test=\"id!=null and id!=''\">\n" +
            "AND ID=#{id}\n" +
            "</if>\n" +
            "<if test=\"orgName!=null and orgName!=''\">\n" +
            "AND ORGNAME=#{orgName}\n" +
            "</if>\n" +
            "<if test=\"leader!=null and leader!=''\">\n" +
            "AND LEADER=#{leader}\n" +
            "</if>\n" +
            "<if test=\"parentId!=null and parentId!=''\">\n" +
            "AND PARENTID=#{parentId}\n" +
            "</if>\n" +
            "<if test=\"parentName!=null and parentName!=''\">\n" +
            "AND PARENTNAME=#{parentName}\n" +
            "</if>\n" +
            "<if test=\"path!=null and path!=''\">\n" +
            "AND PATH=#{path}\n" +
            "</if>\n" +
            "<if test=\"orderNum!=null and orderNum!=''\">\n" +
            "AND ORDERNUM=#{orderNum}\n" +
            "</if>\n" +
            "<if test=\"ifuse!=null and ifuse!=''\">\n" +
            "AND IFUSE=#{ifuse}\n" +
            "</if></script>")
    List<Org0> queryForObject0(BaseModel baseModel);
    //查询org下面是否存在org
    @Select("<script>SELECT * FROM sys_org WHERE parentId = #{id}</script>")
    List<Org> queryChildernByOrg(BaseModel baseModel);
    //查询org下面是否存在人
    @Select("<script>SELECT * FROM sys_userinfo WHERE orgId = #{id}</script>")
    List<UserInfo> queryChildernByUserInfo(BaseModel baseModel);
    //新增org
    @Insert("<script> INSERT INTO sys_org" +
            " (ORGNAME,CREATETIME,UPDATETIME,IFUSE,ORDERNUM,PARENTID,PARENTNAME,PATH) VALUES\n" +
            "  (#{orgName},#{createTime},#{updateTime}," +
            "#{ifuse},#{orderNum},#{parentId},#{parentName},#{path})" +
            "</script>")
    @Options(useGeneratedKeys=true, keyProperty="id",keyColumn = "id")
    int insertOrg(BaseModel baseModel);
    //更新org
    @Update("<script> UPDATE sys_org " +
            "<trim prefix=\"set\" suffixOverrides=\",\">" +
            "<if test=\"orgName!=null and orgName!=''\">\n" +
            "ORGNAME=#{orgName},\n" +
            "</if>\n" +
            "<if test=\"leader!=null and leader!=''\">\n" +
            "LEADER=#{leader},\n" +
            "</if>\n" +
            "<if test=\"path!=null and path!=''\">\n" +
            "PATH=#{path},\n" +
            "</if>\n" +
            "<if test=\"parentName!=null and parentName!=''\">\n" +
            "PARENTNAME=#{parentName},\n" +
            "</if>\n" +
            "<if test=\"parentId!=null and parentId!=''\">\n" +
            "PARENTID=#{parentId},\n" +
            "</if>\n" +
            "<if test=\"createTime!=null and createTime!=''\">\n" +
            "createTime=#{createTime},\n" +
            "</if>\n" +
            "<if test=\"updateTime!=null and updateTime!=''\">\n" +
            "updateTime=#{updateTime},\n" +
            "</if>\n" +
            "<if test=\"orderNum!=null and orderNum!=''\">\n" +
            "orderNum=#{orderNum},\n" +
            "</if>\n" +
            "<if test=\"ifuse!=null and ifuse!=''\">\n" +
            "IFUSE=#{ifuse},\n" +
            "</if>\n" +
            "</trim>"+
            " WHERE id=#{id}</script>")
    int updateOrg(BaseModel baseModel);
    //删除org
    @Delete("<script>DELETE from sys_org where " +
            "<if test=\"parentId!=null and parentId!=''\">\n" +
            "PARENTID=#{parentId}\n" +
            "</if>\n" +
            "<if test=\"id!=null and id!=''\">\n" +
            "ID=#{id}\n" +
            "</if>\n" +
            "</script>")
    int deleteOrg(BaseModel baseModel);
    //查询org下面的人和APP
    @Select("<script>" +
            "SELECT su.*,sa.`APPID` AS appId,ta.* FROM sys_userinfo su \n" +
            "\tLEFT JOIN sys_account_user sau ON su.`ID`=sau.`USERID` \n" +
            "\tLEFT JOIN sys_account sa ON sau.`ACCOUNTID`=sa.`ID` \n" +
            "\tLEFT JOIN tbl_app ta ON sa.`APPID`=ta.`ID`\n" +
            "\tWHERE su.`ORGID`=#{orgId}" +
            "</script>")
    List<Map<String,String>> queryUserInfoApp(String orgId);
    //查询org的map<id,name>
    @Select("<script>" +
            "SELECT so.`ID` AS id,so.`ORGNAME` AS orgname FROM sys_org so" +
            "</script>")
    List<Map<String,String>> queryOrgIdOrgName();

    @Select("<script>SELECT ID FROM sys_org WHERE PARENTID=#{parentId}</script>")
     String selectOrgId(Org org);
    @Select("<script>SELECT * FROM sys_org WHERE ID=#{id}</script>")
    Org getGroupOne(String id);
    @Update("UPDATE sys_userinfo set PARENTORG=#{parentorg},ORG=#{org} where ORGID=#{orgId}")
    void updateUserInfoOrg(UserInfo userInfo);
}
