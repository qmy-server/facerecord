package com.gd.domain.org;

import com.gd.domain.base.BaseModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by Administrator on 2017/12/15 0015.
 */
public class Org0 extends BaseModel {
    @ApiModelProperty(value = "组织名称",required = false)
    private String orgName;
    @ApiModelProperty(value = "组织领导人",required = false)
    private String leader;
    @ApiModelProperty(value = "父节点id",required = true)
    private String parentId;
    @ApiModelProperty(value = "父节点name",required = true)
    private String parentName;
    @ApiModelProperty(value = "组织路径",required = false)
    private String path;
    private List<Org> children;


    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Org> getChildren() {
        return children;
    }

    public void setChildren(List<Org> children) {
        this.children = children;
    }


}
