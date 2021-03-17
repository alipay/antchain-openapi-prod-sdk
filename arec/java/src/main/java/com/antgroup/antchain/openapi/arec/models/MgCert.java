// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class MgCert extends TeaModel {
    // 房产编号
    @NameInMap("house_no")
    public String houseNo;

    // 坐落
    @NameInMap("location")
    public String location;

    // 抵押登记回执编号
    @NameInMap("mg_cert_no")
    public String mgCertNo;

    // 新他项权证号
    @NameInMap("new_other_right_cert_no")
    public String newOtherRightCertNo;

    // 新他项权证电子证照地址
    @NameInMap("new_other_right_cert_path")
    public String newOtherRightCertPath;

    // 新他项权证类型，比如：MORTGAGE_REG_CERT=不动产登记证明(抵押权登记)
    @NameInMap("new_other_right_cert_type")
    public String newOtherRightCertType;

    // 权利人
    @NameInMap("mortgagee_json")
    public String mortgageeJson;

    // 抵押义务人
    @NameInMap("mortgagor_json")
    public String mortgagorJson;

    // 证明权力或事项
    @NameInMap("proof")
    public String proof;

    // 不动产返回其他信息
    @NameInMap("other")
    public String other;

    // 不动产返回附记信息
    @NameInMap("supplement")
    public String supplement;

    // 发证工本号
    @NameInMap("license_number")
    public String licenseNumber;

    // 缮证人
    @NameInMap("printer")
    public String printer;

    // 缮证时间
    @NameInMap("print_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String printTime;

    // 发证人
    @NameInMap("issuer")
    public String issuer;

    // 发证时间
    @NameInMap("issuance_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String issuanceTime;

    // 区县代码
    @NameInMap("district_code")
    public String districtCode;

    // 省编号
    @NameInMap("province_code")
    public String provinceCode;

    // 不动产单元号
    @NameInMap("house_unit_code")
    public String houseUnitCode;

    // 是否在房产链已解抵
    @NameInMap("released")
    public String released;

    // 房产链内部解抵押单号
    @NameInMap("mg_release_order_no")
    public String mgReleaseOrderNo;

    // 登记证明种类,MORTGAGE=抵押权证明
    @NameInMap("reg_cert_type")
    public String regCertType;

    // 发证机关
    @NameInMap("issuing_authority")
    public String issuingAuthority;

    // 债权金额
    @NameInMap("debt_amt")
    public String debtAmt;

    // 抵押权开始时间
    @NameInMap("mg_right_start_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String mgRightStartDate;

    // 抵押权结束日期
    @NameInMap("mg_right_end_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String mgRightEndDate;

    // 抵押方式，MAX_AMOUNT_MORT=最高额抵押
    @NameInMap("mortgage_type")
    public String mortgageType;

    public static MgCert build(java.util.Map<String, ?> map) throws Exception {
        MgCert self = new MgCert();
        return TeaModel.build(map, self);
    }

    public MgCert setHouseNo(String houseNo) {
        this.houseNo = houseNo;
        return this;
    }
    public String getHouseNo() {
        return this.houseNo;
    }

    public MgCert setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public MgCert setMgCertNo(String mgCertNo) {
        this.mgCertNo = mgCertNo;
        return this;
    }
    public String getMgCertNo() {
        return this.mgCertNo;
    }

    public MgCert setNewOtherRightCertNo(String newOtherRightCertNo) {
        this.newOtherRightCertNo = newOtherRightCertNo;
        return this;
    }
    public String getNewOtherRightCertNo() {
        return this.newOtherRightCertNo;
    }

    public MgCert setNewOtherRightCertPath(String newOtherRightCertPath) {
        this.newOtherRightCertPath = newOtherRightCertPath;
        return this;
    }
    public String getNewOtherRightCertPath() {
        return this.newOtherRightCertPath;
    }

    public MgCert setNewOtherRightCertType(String newOtherRightCertType) {
        this.newOtherRightCertType = newOtherRightCertType;
        return this;
    }
    public String getNewOtherRightCertType() {
        return this.newOtherRightCertType;
    }

    public MgCert setMortgageeJson(String mortgageeJson) {
        this.mortgageeJson = mortgageeJson;
        return this;
    }
    public String getMortgageeJson() {
        return this.mortgageeJson;
    }

    public MgCert setMortgagorJson(String mortgagorJson) {
        this.mortgagorJson = mortgagorJson;
        return this;
    }
    public String getMortgagorJson() {
        return this.mortgagorJson;
    }

    public MgCert setProof(String proof) {
        this.proof = proof;
        return this;
    }
    public String getProof() {
        return this.proof;
    }

    public MgCert setOther(String other) {
        this.other = other;
        return this;
    }
    public String getOther() {
        return this.other;
    }

    public MgCert setSupplement(String supplement) {
        this.supplement = supplement;
        return this;
    }
    public String getSupplement() {
        return this.supplement;
    }

    public MgCert setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
        return this;
    }
    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    public MgCert setPrinter(String printer) {
        this.printer = printer;
        return this;
    }
    public String getPrinter() {
        return this.printer;
    }

    public MgCert setPrintTime(String printTime) {
        this.printTime = printTime;
        return this;
    }
    public String getPrintTime() {
        return this.printTime;
    }

    public MgCert setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public MgCert setIssuanceTime(String issuanceTime) {
        this.issuanceTime = issuanceTime;
        return this;
    }
    public String getIssuanceTime() {
        return this.issuanceTime;
    }

    public MgCert setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }
    public String getDistrictCode() {
        return this.districtCode;
    }

    public MgCert setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }
    public String getProvinceCode() {
        return this.provinceCode;
    }

    public MgCert setHouseUnitCode(String houseUnitCode) {
        this.houseUnitCode = houseUnitCode;
        return this;
    }
    public String getHouseUnitCode() {
        return this.houseUnitCode;
    }

    public MgCert setReleased(String released) {
        this.released = released;
        return this;
    }
    public String getReleased() {
        return this.released;
    }

    public MgCert setMgReleaseOrderNo(String mgReleaseOrderNo) {
        this.mgReleaseOrderNo = mgReleaseOrderNo;
        return this;
    }
    public String getMgReleaseOrderNo() {
        return this.mgReleaseOrderNo;
    }

    public MgCert setRegCertType(String regCertType) {
        this.regCertType = regCertType;
        return this;
    }
    public String getRegCertType() {
        return this.regCertType;
    }

    public MgCert setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
        return this;
    }
    public String getIssuingAuthority() {
        return this.issuingAuthority;
    }

    public MgCert setDebtAmt(String debtAmt) {
        this.debtAmt = debtAmt;
        return this;
    }
    public String getDebtAmt() {
        return this.debtAmt;
    }

    public MgCert setMgRightStartDate(String mgRightStartDate) {
        this.mgRightStartDate = mgRightStartDate;
        return this;
    }
    public String getMgRightStartDate() {
        return this.mgRightStartDate;
    }

    public MgCert setMgRightEndDate(String mgRightEndDate) {
        this.mgRightEndDate = mgRightEndDate;
        return this;
    }
    public String getMgRightEndDate() {
        return this.mgRightEndDate;
    }

    public MgCert setMortgageType(String mortgageType) {
        this.mortgageType = mortgageType;
        return this;
    }
    public String getMortgageType() {
        return this.mortgageType;
    }

}
