package com.gd.domain.video;

import com.gd.domain.base.BaseModel;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/9/18.
 */
public class Res_Attr extends BaseModel {
    private Integer ResID;
    private String DeviceID;
    //private String Name;
    private String name;
    private String Manufacturer;
    private String Model;
    private String Owner;
    private String CivilCode;
    private String Block;
    private String Address;
    private Integer Parental;
    private String ParentID;
    private Integer SafetyWay;
    private Integer RegisterWay;
    private String CertNum;
    private Integer Certifiable;
    private Integer ErrCode;
    private Timestamp EndTime;
    private Integer Secrecy;
    private String IPAddress;
    private Integer Port;
    private String UsrName;
    private String Password;
    private String Status;
    private Double Longitude;
    private Double Latitude;
    private Integer PlatformID;
    private Integer ResType;
    private Integer SipServiceID;
    private Integer GuardFlag;
   private String branch;
   private String ProtocolType;
   private int ui=1;//标记前端样式

    //通道数量
    private int channelNum;
    //设备厂家
    private String deviceType;
    public String getProtocolType() {
        return ProtocolType;
    }

    public void setProtocolType(String protocolType) {
        ProtocolType = protocolType;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Integer getResID() {
        return ResID;
    }

    public void setResID(Integer resID) {
        ResID = resID;
    }

    public String getDeviceID() {
        return DeviceID;
    }

    public void setDeviceID(String deviceID) {
        DeviceID = deviceID;
    }

    public int getUi() {
        return ui;
    }

    public void setUi(int ui) {
        this.ui = ui;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public String getCivilCode() {
        return CivilCode;
    }

    public void setCivilCode(String civilCode) {
        CivilCode = civilCode;
    }

    public String getBlock() {
        return Block;
    }

    public void setBlock(String block) {
        Block = block;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Integer getParental() {
        return Parental;
    }

    public void setParental(Integer parental) {
        Parental = parental;
    }

    public String getParentID() {
        return ParentID;
    }

    public void setParentID(String parentID) {
        ParentID = parentID;
    }

    public Integer getSafetyWay() {
        return SafetyWay;
    }

    public void setSafetyWay(Integer safetyWay) {
        SafetyWay = safetyWay;
    }

    public Integer getRegisterWay() {
        return RegisterWay;
    }

    public void setRegisterWay(Integer registerWay) {
        RegisterWay = registerWay;
    }

    public String getCertNum() {
        return CertNum;
    }

    public void setCertNum(String certNum) {
        CertNum = certNum;
    }

    public Integer getCertifiable() {
        return Certifiable;
    }

    public void setCertifiable(Integer certifiable) {
        Certifiable = certifiable;
    }

    public Integer getErrCode() {
        return ErrCode;
    }

    public void setErrCode(Integer errCode) {
        ErrCode = errCode;
    }

    public Timestamp getEndTime() {
        return EndTime;
    }

    public void setEndTime(Timestamp endTime) {
        EndTime = endTime;
    }

    public Integer getSecrecy() {
        return Secrecy;
    }

    public void setSecrecy(Integer secrecy) {
        Secrecy = secrecy;
    }

    public String getIPAddress() {
        return IPAddress;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    public Integer getPort() {
        return Port;
    }

    public void setPort(Integer port) {
        Port = port;
    }

    public String getUsrName() {
        return UsrName;
    }

    public void setUsrName(String usrName) {
        UsrName = usrName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Double getLongitude() {
        return Longitude;
    }

    public void setLongitude(Double longitude) {
        Longitude = longitude;
    }

    public Double getLatitude() {
        return Latitude;
    }

    public void setLatitude(Double latitude) {
        Latitude = latitude;
    }

    public Integer getPlatformID() {
        return PlatformID;
    }

    public void setPlatformID(Integer platformID) {
        PlatformID = platformID;
    }

    public Integer getResType() {
        return ResType;
    }

    public void setResType(Integer resType) {
        ResType = resType;
    }

    public Integer getSipServiceID() {
        return SipServiceID;
    }

    public void setSipServiceID(Integer sipServiceID) {
        SipServiceID = sipServiceID;
    }

    public Integer getGuardFlag() {
        return GuardFlag;
    }

    public void setGuardFlag(Integer guardFlag) {
        GuardFlag = guardFlag;
    }

    public int getChannelNum() {
        return channelNum;
    }

    public void setChannelNum(int channelNum) {
        this.channelNum = channelNum;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    @Override
    public boolean equals(Object obj) {
        Res_Attr other = (Res_Attr) obj;
        if (name.equalsIgnoreCase(other.name)){
            if(ResType.equals(other.ResType)){
                if(ProtocolType.equalsIgnoreCase(other.ProtocolType)){
                    if(IPAddress.equalsIgnoreCase(other.IPAddress)){
                        if(Port.equals(other.Port)){
                            if(UsrName.equalsIgnoreCase(other.UsrName)){
                                if(Password.equalsIgnoreCase(other.Password)) {
                                    return SipServiceID.equals(other.SipServiceID);
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
