// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class House extends TeaModel {
    // 房屋所在区/县地区编码
    @NameInMap("area_code")
    public String areaCode;

    // 是否有异议，Y-是，N-否
    @NameInMap("claimed")
    public String claimed;

    // 是否有文件备案
    @NameInMap("file_recorded")
    public String fileRecorded;

    // 产证编号
    @NameInMap("house_cert_no")
    public String houseCertNo;

    // 权证类型，比如：HOUSE_CERT=房屋所有权证
    @NameInMap("house_cert_type")
    public String houseCertType;

    // 房产编号
    @NameInMap("house_code")
    public String houseCode;

    // 抵押信息列表
    @NameInMap("house_mg_infos")
    public java.util.List<HouseMgInfo> houseMgInfos;

    // 房产编号
    @NameInMap("house_no")
    public String houseNo;

    // 产权人列表
    @NameInMap("house_owners")
    public java.util.List<HouseOwner> houseOwners;

    // 限制信息列表
    @NameInMap("house_restriction_infos")
    public java.util.List<HouseRestrictionInfo> houseRestrictionInfos;

    // 不动产单元号
    @NameInMap("house_unit_code")
    public String houseUnitCode;

    // 不动产单元号，待废弃字段
    @NameInMap("house_unit_codes")
    public java.util.List<String> houseUnitCodes;

    // 隐形产权人列表
    @NameInMap("invisible_house_owners")
    public java.util.List<HouseOwner> invisibleHouseOwners;

    // 房屋所在地址信息
    @NameInMap("location")
    public String location;

    // 是否有抵押，Y-是，N-否
    @NameInMap("mortgaged")
    public String mortgaged;

    // 共有情况,比如：SHARE_COOWNER=共同共有
    @NameInMap("ownership_status")
    public String ownershipStatus;

    // 数据获取时间
    @NameInMap("query_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String queryTime;

    // 用途,比如：HOUSE=住宅
    @NameInMap("realty_usage")
    public String realtyUsage;

    // 是否有查封：Y-是，N-否
    @NameInMap("seized")
    public String seized;

    // 土地分摊面积
    @NameInMap("sharing_land_area")
    public String sharingLandArea;

    // 土地分摊面积单位，比如：SQUARE_METER=平方米
    @NameInMap("sharing_land_area_unit")
    public String sharingLandAreaUnit;

    // 当前产证归属的房产链产权人内部编号
    @NameInMap("house_owner_cm_no")
    public String houseOwnerCmNo;

    // 建筑面积
    @NameInMap("structure_area")
    public String structureArea;

    // 建筑面积单位，比如：SQUARE_METER=平方米
    @NameInMap("structure_area_unit")
    public String structureAreaUnit;

    // 权利性质
    @NameInMap("rights_nature")
    public String rightsNature;

    // 权利类型,STATE_OWNED_CONSTRUCTION_LAND_AND_BUILDING=国有建设用地使用权/房屋（构筑物）所有权
    @NameInMap("rights_type")
    public String rightsType;

    // 房屋性质,COMMERCIAL_HOUSING=商品房
    @NameInMap("house_nature")
    public String houseNature;

    // 土地证号
    @NameInMap("land_cert_no")
    public String landCertNo;

    // 土地用途
    @NameInMap("land_usage")
    public String landUsage;

    // 土地性质,SELL=出让
    @NameInMap("land_nature")
    public String landNature;

    // 土地使用权开始日期
    @NameInMap("land_use_start_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String landUseStartDate;

    // 土地使用权终止日期
    @NameInMap("land_use_end_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String landUseEndDate;

    // 总层数
    @NameInMap("total_floor")
    public String totalFloor;

    // 所在层
    @NameInMap("its_floor")
    public String itsFloor;

    // 建造年份
    @NameInMap("built_year")
    public String builtYear;

    // 登薄日期
    @NameInMap("reg_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String regDate;

    // 证书附记备注
    @NameInMap("cert_remark")
    public String certRemark;

    // 证书状态描述
    @NameInMap("cert_status")
    public String certStatus;

    public static House build(java.util.Map<String, ?> map) throws Exception {
        House self = new House();
        return TeaModel.build(map, self);
    }

    public House setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    public String getAreaCode() {
        return this.areaCode;
    }

    public House setClaimed(String claimed) {
        this.claimed = claimed;
        return this;
    }
    public String getClaimed() {
        return this.claimed;
    }

    public House setFileRecorded(String fileRecorded) {
        this.fileRecorded = fileRecorded;
        return this;
    }
    public String getFileRecorded() {
        return this.fileRecorded;
    }

    public House setHouseCertNo(String houseCertNo) {
        this.houseCertNo = houseCertNo;
        return this;
    }
    public String getHouseCertNo() {
        return this.houseCertNo;
    }

    public House setHouseCertType(String houseCertType) {
        this.houseCertType = houseCertType;
        return this;
    }
    public String getHouseCertType() {
        return this.houseCertType;
    }

    public House setHouseCode(String houseCode) {
        this.houseCode = houseCode;
        return this;
    }
    public String getHouseCode() {
        return this.houseCode;
    }

    public House setHouseMgInfos(java.util.List<HouseMgInfo> houseMgInfos) {
        this.houseMgInfos = houseMgInfos;
        return this;
    }
    public java.util.List<HouseMgInfo> getHouseMgInfos() {
        return this.houseMgInfos;
    }

    public House setHouseNo(String houseNo) {
        this.houseNo = houseNo;
        return this;
    }
    public String getHouseNo() {
        return this.houseNo;
    }

    public House setHouseOwners(java.util.List<HouseOwner> houseOwners) {
        this.houseOwners = houseOwners;
        return this;
    }
    public java.util.List<HouseOwner> getHouseOwners() {
        return this.houseOwners;
    }

    public House setHouseRestrictionInfos(java.util.List<HouseRestrictionInfo> houseRestrictionInfos) {
        this.houseRestrictionInfos = houseRestrictionInfos;
        return this;
    }
    public java.util.List<HouseRestrictionInfo> getHouseRestrictionInfos() {
        return this.houseRestrictionInfos;
    }

    public House setHouseUnitCode(String houseUnitCode) {
        this.houseUnitCode = houseUnitCode;
        return this;
    }
    public String getHouseUnitCode() {
        return this.houseUnitCode;
    }

    public House setHouseUnitCodes(java.util.List<String> houseUnitCodes) {
        this.houseUnitCodes = houseUnitCodes;
        return this;
    }
    public java.util.List<String> getHouseUnitCodes() {
        return this.houseUnitCodes;
    }

    public House setInvisibleHouseOwners(java.util.List<HouseOwner> invisibleHouseOwners) {
        this.invisibleHouseOwners = invisibleHouseOwners;
        return this;
    }
    public java.util.List<HouseOwner> getInvisibleHouseOwners() {
        return this.invisibleHouseOwners;
    }

    public House setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public House setMortgaged(String mortgaged) {
        this.mortgaged = mortgaged;
        return this;
    }
    public String getMortgaged() {
        return this.mortgaged;
    }

    public House setOwnershipStatus(String ownershipStatus) {
        this.ownershipStatus = ownershipStatus;
        return this;
    }
    public String getOwnershipStatus() {
        return this.ownershipStatus;
    }

    public House setQueryTime(String queryTime) {
        this.queryTime = queryTime;
        return this;
    }
    public String getQueryTime() {
        return this.queryTime;
    }

    public House setRealtyUsage(String realtyUsage) {
        this.realtyUsage = realtyUsage;
        return this;
    }
    public String getRealtyUsage() {
        return this.realtyUsage;
    }

    public House setSeized(String seized) {
        this.seized = seized;
        return this;
    }
    public String getSeized() {
        return this.seized;
    }

    public House setSharingLandArea(String sharingLandArea) {
        this.sharingLandArea = sharingLandArea;
        return this;
    }
    public String getSharingLandArea() {
        return this.sharingLandArea;
    }

    public House setSharingLandAreaUnit(String sharingLandAreaUnit) {
        this.sharingLandAreaUnit = sharingLandAreaUnit;
        return this;
    }
    public String getSharingLandAreaUnit() {
        return this.sharingLandAreaUnit;
    }

    public House setHouseOwnerCmNo(String houseOwnerCmNo) {
        this.houseOwnerCmNo = houseOwnerCmNo;
        return this;
    }
    public String getHouseOwnerCmNo() {
        return this.houseOwnerCmNo;
    }

    public House setStructureArea(String structureArea) {
        this.structureArea = structureArea;
        return this;
    }
    public String getStructureArea() {
        return this.structureArea;
    }

    public House setStructureAreaUnit(String structureAreaUnit) {
        this.structureAreaUnit = structureAreaUnit;
        return this;
    }
    public String getStructureAreaUnit() {
        return this.structureAreaUnit;
    }

    public House setRightsNature(String rightsNature) {
        this.rightsNature = rightsNature;
        return this;
    }
    public String getRightsNature() {
        return this.rightsNature;
    }

    public House setRightsType(String rightsType) {
        this.rightsType = rightsType;
        return this;
    }
    public String getRightsType() {
        return this.rightsType;
    }

    public House setHouseNature(String houseNature) {
        this.houseNature = houseNature;
        return this;
    }
    public String getHouseNature() {
        return this.houseNature;
    }

    public House setLandCertNo(String landCertNo) {
        this.landCertNo = landCertNo;
        return this;
    }
    public String getLandCertNo() {
        return this.landCertNo;
    }

    public House setLandUsage(String landUsage) {
        this.landUsage = landUsage;
        return this;
    }
    public String getLandUsage() {
        return this.landUsage;
    }

    public House setLandNature(String landNature) {
        this.landNature = landNature;
        return this;
    }
    public String getLandNature() {
        return this.landNature;
    }

    public House setLandUseStartDate(String landUseStartDate) {
        this.landUseStartDate = landUseStartDate;
        return this;
    }
    public String getLandUseStartDate() {
        return this.landUseStartDate;
    }

    public House setLandUseEndDate(String landUseEndDate) {
        this.landUseEndDate = landUseEndDate;
        return this;
    }
    public String getLandUseEndDate() {
        return this.landUseEndDate;
    }

    public House setTotalFloor(String totalFloor) {
        this.totalFloor = totalFloor;
        return this;
    }
    public String getTotalFloor() {
        return this.totalFloor;
    }

    public House setItsFloor(String itsFloor) {
        this.itsFloor = itsFloor;
        return this;
    }
    public String getItsFloor() {
        return this.itsFloor;
    }

    public House setBuiltYear(String builtYear) {
        this.builtYear = builtYear;
        return this;
    }
    public String getBuiltYear() {
        return this.builtYear;
    }

    public House setRegDate(String regDate) {
        this.regDate = regDate;
        return this;
    }
    public String getRegDate() {
        return this.regDate;
    }

    public House setCertRemark(String certRemark) {
        this.certRemark = certRemark;
        return this;
    }
    public String getCertRemark() {
        return this.certRemark;
    }

    public House setCertStatus(String certStatus) {
        this.certStatus = certStatus;
        return this;
    }
    public String getCertStatus() {
        return this.certStatus;
    }

}
