// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyInsuranceYzbRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
    // yyyyMMdd请传递当前时间。 
    // 身份标识可自定义。
    // 其他编码建议为随机值。
    // 当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；	
    @NameInMap("trade_no")
    @Validation(required = true, maxLength = 64)
    public String tradeNo;

    // 保司编码，PAIC---平安广分、CPIC---太保深分，CPIC_SUZHOU-太保苏分
    @NameInMap("external_channel_code")
    @Validation(required = true, maxLength = 32)
    public String externalChannelCode;

    // 险种编码，05-驿站宝
    @NameInMap("external_product_code")
    @Validation(required = true, maxLength = 2)
    public String externalProductCode;

    // 投保人姓名，保险协议中的投保人全称
    @NameInMap("tbr_name")
    @Validation(required = true, maxLength = 100)
    public String tbrName;

    // 投保人证件类型，01-居民身份证,03--统一社会信用代码
    @NameInMap("tbr_id_type")
    @Validation(required = true, maxLength = 2)
    public String tbrIdType;

    // 投保人证件号码
    @NameInMap("tbr_id_no")
    @Validation(required = true, maxLength = 30)
    public String tbrIdNo;

    // 被保人姓名，实际的保险被保人名称
    @NameInMap("bbr_name")
    @Validation(required = true, maxLength = 100)
    public String bbrName;

    // 被保人证件类型，01--居民身份证、03--统一社会信用代码
    @NameInMap("bbr_id_type")
    @Validation(required = true, maxLength = 2)
    public String bbrIdType;

    // 被保人证件号码
    @NameInMap("bbr_id_no")
    @Validation(required = true, maxLength = 30)
    public String bbrIdNo;

    // 被保人联系方式
    @NameInMap("bbr_contact")
    @Validation(required = true, maxLength = 30)
    public String bbrContact;

    // 受益人名称，实际的保险受益人名称
    @NameInMap("beneficiary_name")
    @Validation(required = true, maxLength = 100)
    public String beneficiaryName;

    // 受益人证件类型，01--居民身份证、03--统一社会信用代码
    @NameInMap("beneficiary_id_type")
    @Validation(required = true, maxLength = 2)
    public String beneficiaryIdType;

    // 受益人证件号码
    @NameInMap("beneficiary_no")
    @Validation(required = true, maxLength = 30)
    public String beneficiaryNo;

    // 保险起期，格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("insure_start")
    @Validation(required = true)
    public String insureStart;

    // 套餐编码，
    // 平安（PK00053022、PK00053025、PK00053026、PK00125463、PK00125467）
    // 太保（xjbdbnd01、pssmyd02、xnfayd03、xnfayd04、xnfayd05）
    @NameInMap("product_package_type")
    @Validation(required = true, maxLength = 20)
    public String productPackageType;

    // 站点ID，站点的唯一标识
    @NameInMap("site_id")
    @Validation(required = true, maxLength = 30)
    public String siteId;

    // 站点名称
    @NameInMap("site_name")
    @Validation(required = true, maxLength = 100)
    public String siteName;

    // 总资产，单位（元），最多2位小数，超过拒绝请求
    @NameInMap("total_assets")
    @Validation(required = true)
    public String totalAssets;

    // 雇员人数，站点的雇佣人员数
    @NameInMap("employee_num")
    @Validation(required = true)
    public String employeeNum;

    // 省编码，站点位于的省份编码
    @NameInMap("province_code")
    @Validation(required = true, maxLength = 10)
    public String provinceCode;

    // 市编码，站点位于的市区编码
    @NameInMap("city_code")
    @Validation(required = true, maxLength = 10)
    public String cityCode;

    // 区编码,站点位于的区县编码
    @NameInMap("district_code")
    @Validation(required = true, maxLength = 10)
    public String districtCode;

    // 完整地址，站点的详细地址
    @NameInMap("whole_address")
    @Validation(required = true, maxLength = 300)
    public String wholeAddress;

    // 方案名称，菜鸟驿站宝、菜鸟校园驿站宝、溪鸟公共服务站保障，上门人员综合险-30万保额，上门人员综合险-50万保额
    @NameInMap("scheme_name")
    @Validation(required = true, maxLength = 100)
    public String schemeName;

    // 意健险被保人姓名
    @NameInMap("acpl_bbr_name")
    @Validation(required = true, maxLength = 100)
    public String acplBbrName;

    // 意健险被保人身份证号
    @NameInMap("acpl_bbr_id_no")
    @Validation(required = true, maxLength = 30)
    public String acplBbrIdNo;

    // 产品市场编码，平安---保司端险种编码、太保--与套餐编码保持一致
    @NameInMap("pdt_mkt_code")
    @Validation(maxLength = 16)
    public String pdtMktCode;

    public static ApplyInsuranceYzbRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInsuranceYzbRequest self = new ApplyInsuranceYzbRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInsuranceYzbRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInsuranceYzbRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyInsuranceYzbRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public ApplyInsuranceYzbRequest setExternalChannelCode(String externalChannelCode) {
        this.externalChannelCode = externalChannelCode;
        return this;
    }
    public String getExternalChannelCode() {
        return this.externalChannelCode;
    }

    public ApplyInsuranceYzbRequest setExternalProductCode(String externalProductCode) {
        this.externalProductCode = externalProductCode;
        return this;
    }
    public String getExternalProductCode() {
        return this.externalProductCode;
    }

    public ApplyInsuranceYzbRequest setTbrName(String tbrName) {
        this.tbrName = tbrName;
        return this;
    }
    public String getTbrName() {
        return this.tbrName;
    }

    public ApplyInsuranceYzbRequest setTbrIdType(String tbrIdType) {
        this.tbrIdType = tbrIdType;
        return this;
    }
    public String getTbrIdType() {
        return this.tbrIdType;
    }

    public ApplyInsuranceYzbRequest setTbrIdNo(String tbrIdNo) {
        this.tbrIdNo = tbrIdNo;
        return this;
    }
    public String getTbrIdNo() {
        return this.tbrIdNo;
    }

    public ApplyInsuranceYzbRequest setBbrName(String bbrName) {
        this.bbrName = bbrName;
        return this;
    }
    public String getBbrName() {
        return this.bbrName;
    }

    public ApplyInsuranceYzbRequest setBbrIdType(String bbrIdType) {
        this.bbrIdType = bbrIdType;
        return this;
    }
    public String getBbrIdType() {
        return this.bbrIdType;
    }

    public ApplyInsuranceYzbRequest setBbrIdNo(String bbrIdNo) {
        this.bbrIdNo = bbrIdNo;
        return this;
    }
    public String getBbrIdNo() {
        return this.bbrIdNo;
    }

    public ApplyInsuranceYzbRequest setBbrContact(String bbrContact) {
        this.bbrContact = bbrContact;
        return this;
    }
    public String getBbrContact() {
        return this.bbrContact;
    }

    public ApplyInsuranceYzbRequest setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
        return this;
    }
    public String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    public ApplyInsuranceYzbRequest setBeneficiaryIdType(String beneficiaryIdType) {
        this.beneficiaryIdType = beneficiaryIdType;
        return this;
    }
    public String getBeneficiaryIdType() {
        return this.beneficiaryIdType;
    }

    public ApplyInsuranceYzbRequest setBeneficiaryNo(String beneficiaryNo) {
        this.beneficiaryNo = beneficiaryNo;
        return this;
    }
    public String getBeneficiaryNo() {
        return this.beneficiaryNo;
    }

    public ApplyInsuranceYzbRequest setInsureStart(String insureStart) {
        this.insureStart = insureStart;
        return this;
    }
    public String getInsureStart() {
        return this.insureStart;
    }

    public ApplyInsuranceYzbRequest setProductPackageType(String productPackageType) {
        this.productPackageType = productPackageType;
        return this;
    }
    public String getProductPackageType() {
        return this.productPackageType;
    }

    public ApplyInsuranceYzbRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public ApplyInsuranceYzbRequest setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public ApplyInsuranceYzbRequest setTotalAssets(String totalAssets) {
        this.totalAssets = totalAssets;
        return this;
    }
    public String getTotalAssets() {
        return this.totalAssets;
    }

    public ApplyInsuranceYzbRequest setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
        return this;
    }
    public String getEmployeeNum() {
        return this.employeeNum;
    }

    public ApplyInsuranceYzbRequest setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }
    public String getProvinceCode() {
        return this.provinceCode;
    }

    public ApplyInsuranceYzbRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public ApplyInsuranceYzbRequest setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }
    public String getDistrictCode() {
        return this.districtCode;
    }

    public ApplyInsuranceYzbRequest setWholeAddress(String wholeAddress) {
        this.wholeAddress = wholeAddress;
        return this;
    }
    public String getWholeAddress() {
        return this.wholeAddress;
    }

    public ApplyInsuranceYzbRequest setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

    public ApplyInsuranceYzbRequest setAcplBbrName(String acplBbrName) {
        this.acplBbrName = acplBbrName;
        return this;
    }
    public String getAcplBbrName() {
        return this.acplBbrName;
    }

    public ApplyInsuranceYzbRequest setAcplBbrIdNo(String acplBbrIdNo) {
        this.acplBbrIdNo = acplBbrIdNo;
        return this;
    }
    public String getAcplBbrIdNo() {
        return this.acplBbrIdNo;
    }

    public ApplyInsuranceYzbRequest setPdtMktCode(String pdtMktCode) {
        this.pdtMktCode = pdtMktCode;
        return this;
    }
    public String getPdtMktCode() {
        return this.pdtMktCode;
    }

}
