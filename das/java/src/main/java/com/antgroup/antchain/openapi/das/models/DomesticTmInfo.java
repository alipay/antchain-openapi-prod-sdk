// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class DomesticTmInfo extends TeaModel {
    // 商标名称
    /**
     * <strong>example:</strong>
     * <p>商标名称</p>
     */
    @NameInMap("tm_name")
    public String tmName;

    // 注册证号
    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("tm_reg_num")
    public String tmRegNum;

    // 国际分类
    /**
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("int_cls")
    public String intCls;

    // 商标状态
    /**
     * <strong>example:</strong>
     * <p>status</p>
     */
    @NameInMap("tm_status")
    public String tmStatus;

    // 专用期开始时间
    /**
     * <strong>example:</strong>
     * <p>2021-10-07T00:00:00</p>
     */
    @NameInMap("property_bgn_date")
    public String propertyBgnDate;

    // 注册日期
    // 
    /**
     * <strong>example:</strong>
     * <p>2022-08-28T00:00:00</p>
     */
    @NameInMap("reg_date")
    public String regDate;

    // 是否共有商标
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_share")
    public Boolean isShare;

    // 商标共有人信息(共有商标才有该数据)
    @NameInMap("coowner_infos")
    public java.util.List<TmCoownerInfo> coownerInfos;

    // 专用期结束时间
    /**
     * <strong>example:</strong>
     * <p>2031-10-06T00:00:00</p>
     */
    @NameInMap("property_end_date")
    public String propertyEndDate;

    // 商标类别
    /**
     * <strong>example:</strong>
     * <p>0001</p>
     */
    @NameInMap("form_type")
    public String formType;

    // 权利人中文名称
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("owner_name_cn")
    public String ownerNameCn;

    // 权利人中文地址
    /**
     * <strong>example:</strong>
     * <p>中文地址信息</p>
     */
    @NameInMap("owner_addr_cn")
    public String ownerAddrCn;

    // 权利人英文名称
    /**
     * <strong>example:</strong>
     * <p>Bob</p>
     */
    @NameInMap("owner_name_en")
    public String ownerNameEn;

    // 权利人英文地址
    /**
     * <strong>example:</strong>
     * <p>英文地址信息</p>
     */
    @NameInMap("owner_addr_en")
    public String ownerAddrEn;

    // 申请人中文名称
    /**
     * <strong>example:</strong>
     * <p>张*</p>
     */
    @NameInMap("applicant_name_cn")
    public String applicantNameCn;

    // 申请人中文地址
    /**
     * <strong>example:</strong>
     * <p>中文地址信息</p>
     */
    @NameInMap("applicant_addr_cn")
    public String applicantAddrCn;

    // 申请人外文名称
    /**
     * <strong>example:</strong>
     * <p>Bob</p>
     */
    @NameInMap("applicant_name_en")
    public String applicantNameEn;

    // 申请人英文地址
    /**
     * <strong>example:</strong>
     * <p>英文地址信息</p>
     */
    @NameInMap("applicant_addr_en")
    public String applicantAddrEn;

    // 权利人社会信用统一代码
    /**
     * <strong>example:</strong>
     * <p>1234567W</p>
     */
    @NameInMap("owner_uscc")
    public String ownerUscc;

    // 商标唯一标识码
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("tid")
    public String tid;

    public static DomesticTmInfo build(java.util.Map<String, ?> map) throws Exception {
        DomesticTmInfo self = new DomesticTmInfo();
        return TeaModel.build(map, self);
    }

    public DomesticTmInfo setTmName(String tmName) {
        this.tmName = tmName;
        return this;
    }
    public String getTmName() {
        return this.tmName;
    }

    public DomesticTmInfo setTmRegNum(String tmRegNum) {
        this.tmRegNum = tmRegNum;
        return this;
    }
    public String getTmRegNum() {
        return this.tmRegNum;
    }

    public DomesticTmInfo setIntCls(String intCls) {
        this.intCls = intCls;
        return this;
    }
    public String getIntCls() {
        return this.intCls;
    }

    public DomesticTmInfo setTmStatus(String tmStatus) {
        this.tmStatus = tmStatus;
        return this;
    }
    public String getTmStatus() {
        return this.tmStatus;
    }

    public DomesticTmInfo setPropertyBgnDate(String propertyBgnDate) {
        this.propertyBgnDate = propertyBgnDate;
        return this;
    }
    public String getPropertyBgnDate() {
        return this.propertyBgnDate;
    }

    public DomesticTmInfo setRegDate(String regDate) {
        this.regDate = regDate;
        return this;
    }
    public String getRegDate() {
        return this.regDate;
    }

    public DomesticTmInfo setIsShare(Boolean isShare) {
        this.isShare = isShare;
        return this;
    }
    public Boolean getIsShare() {
        return this.isShare;
    }

    public DomesticTmInfo setCoownerInfos(java.util.List<TmCoownerInfo> coownerInfos) {
        this.coownerInfos = coownerInfos;
        return this;
    }
    public java.util.List<TmCoownerInfo> getCoownerInfos() {
        return this.coownerInfos;
    }

    public DomesticTmInfo setPropertyEndDate(String propertyEndDate) {
        this.propertyEndDate = propertyEndDate;
        return this;
    }
    public String getPropertyEndDate() {
        return this.propertyEndDate;
    }

    public DomesticTmInfo setFormType(String formType) {
        this.formType = formType;
        return this;
    }
    public String getFormType() {
        return this.formType;
    }

    public DomesticTmInfo setOwnerNameCn(String ownerNameCn) {
        this.ownerNameCn = ownerNameCn;
        return this;
    }
    public String getOwnerNameCn() {
        return this.ownerNameCn;
    }

    public DomesticTmInfo setOwnerAddrCn(String ownerAddrCn) {
        this.ownerAddrCn = ownerAddrCn;
        return this;
    }
    public String getOwnerAddrCn() {
        return this.ownerAddrCn;
    }

    public DomesticTmInfo setOwnerNameEn(String ownerNameEn) {
        this.ownerNameEn = ownerNameEn;
        return this;
    }
    public String getOwnerNameEn() {
        return this.ownerNameEn;
    }

    public DomesticTmInfo setOwnerAddrEn(String ownerAddrEn) {
        this.ownerAddrEn = ownerAddrEn;
        return this;
    }
    public String getOwnerAddrEn() {
        return this.ownerAddrEn;
    }

    public DomesticTmInfo setApplicantNameCn(String applicantNameCn) {
        this.applicantNameCn = applicantNameCn;
        return this;
    }
    public String getApplicantNameCn() {
        return this.applicantNameCn;
    }

    public DomesticTmInfo setApplicantAddrCn(String applicantAddrCn) {
        this.applicantAddrCn = applicantAddrCn;
        return this;
    }
    public String getApplicantAddrCn() {
        return this.applicantAddrCn;
    }

    public DomesticTmInfo setApplicantNameEn(String applicantNameEn) {
        this.applicantNameEn = applicantNameEn;
        return this;
    }
    public String getApplicantNameEn() {
        return this.applicantNameEn;
    }

    public DomesticTmInfo setApplicantAddrEn(String applicantAddrEn) {
        this.applicantAddrEn = applicantAddrEn;
        return this;
    }
    public String getApplicantAddrEn() {
        return this.applicantAddrEn;
    }

    public DomesticTmInfo setOwnerUscc(String ownerUscc) {
        this.ownerUscc = ownerUscc;
        return this;
    }
    public String getOwnerUscc() {
        return this.ownerUscc;
    }

    public DomesticTmInfo setTid(String tid) {
        this.tid = tid;
        return this;
    }
    public String getTid() {
        return this.tid;
    }

}
