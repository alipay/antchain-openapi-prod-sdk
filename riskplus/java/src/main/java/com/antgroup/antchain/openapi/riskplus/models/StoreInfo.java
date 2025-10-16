// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class StoreInfo extends TeaModel {
    // 品牌
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("store_brand")
    @Validation(required = true)
    public String storeBrand;

    // 品牌，商户入驻时需填写，
    // TBJHF: 赛鸽出行
    // AIJNBJ: 智迈电动车
    // KJOKJBO: 金箭出行
    // IFJRJTIJ: 骑士智行
    // KVMPOH: 巨龙智行
    // NPGBRVBO: 摩生态A
    /**
     * <strong>example:</strong>
     * <p>IFJRJTIJ</p>
     */
    @NameInMap("traffic_platform")
    public String trafficPlatform;

    // 门店ID
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("store_id")
    @Validation(required = true)
    public String storeId;

    // 门店名称
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("store_name")
    @Validation(required = true)
    public String storeName;

    // 统一社会信用代码
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("usci")
    @Validation(required = true)
    public String usci;

    // 门店-省，浙江省
    /**
     * <strong>example:</strong>
     * <p>浙江省</p>
     */
    @NameInMap("province")
    @Validation(required = true)
    public String province;

    // 省编码
    /**
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("province_code")
    public String provinceCode;

    // 门店-市，杭州市
    /**
     * <strong>example:</strong>
     * <p>杭州市</p>
     */
    @NameInMap("city")
    @Validation(required = true)
    public String city;

    // 市编码
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("city_code")
    public String cityCode;

    // 门店-区，滨江区
    /**
     * <strong>example:</strong>
     * <p>滨江区</p>
     */
    @NameInMap("district")
    @Validation(required = true)
    public String district;

    // 区编码
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("district_code")
    public String districtCode;

    // 门店-详细地址，
    // 望江路万达广场一层001号
    /**
     * <strong>example:</strong>
     * <p>望江路万达广场一层001号</p>
     */
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 门店-经度
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("longitude")
    public String longitude;

    // 门店-纬度
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("latitude")
    public String latitude;

    // 营业执照-开始时间，yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd</p>
     */
    @NameInMap("store_start_date")
    @Validation(required = true)
    public String storeStartDate;

    // 营业执照-结束时间，yyyy-MM-dd，长期上送：9999-12-31
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd</p>
     */
    @NameInMap("store_end_date")
    @Validation(required = true)
    public String storeEndDate;

    // 门店类型，
    // 个体: 个体工商户；企业
    /**
     * <strong>example:</strong>
     * <p>个体</p>
     */
    @NameInMap("store_type")
    @Validation(required = true)
    public String storeType;

    // 法人-姓名
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("legal_person_name")
    @Validation(required = true)
    public String legalPersonName;

    // 法人-身份证号
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("legal_person_id_card")
    @Validation(required = true)
    public String legalPersonIdCard;

    // 法人-手机号
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("legal_person_mobile")
    @Validation(required = true)
    public String legalPersonMobile;

    // 法人-身份证有效期，，身份证反面格式：如yyyy.MM.dd-长期
    /**
     * <strong>example:</strong>
     * <p>yyyy.MM.dd-长期</p>
     */
    @NameInMap("effective_date")
    @Validation(required = true)
    public String effectiveDate;

    // 对公-开户行名称
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("bank_name")
    public String bankName;

    // 对公-开户行编码
    /**
     * <strong>example:</strong>
     * <p>ICBC</p>
     */
    @NameInMap("bank_code")
    public String bankCode;

    // 对公-支行名称
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("branch_name")
    public String branchName;

    // 对公-联行号
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("cnaps_code")
    public String cnapsCode;

    // 对公-银行账户名称
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("account_name")
    public String accountName;

    // 对公-银行账户号
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("account_number")
    public String accountNumber;

    // 对公-开户行所在省，浙江
    /**
     * <strong>example:</strong>
     * <p>浙江</p>
     */
    @NameInMap("bank_province")
    public String bankProvince;

    // 对公-开户行所在市，杭州
    /**
     * <strong>example:</strong>
     * <p>杭州</p>
     */
    @NameInMap("bank_city")
    public String bankCity;

    // 对私-银行卡号
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("payee_bank_card")
    public String payeeBankCard;

    // 对私-银行名称
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("payee_bank_name")
    public String payeeBankName;

    // 对私-银行编码
    /**
     * <strong>example:</strong>
     * <p>ICBC</p>
     */
    @NameInMap("payee_bank_code")
    public String payeeBankCode;

    // 蚂蚁数科入驻账号
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("login_tenant")
    public String loginTenant;

    // 入驻时间
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd</p>
     */
    @NameInMap("login_date")
    public String loginDate;

    // 结算支付宝账户，交易资金结算的具体支付宝账号，商户入驻时需填写
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:xxxx@126.com">xxxx@126.com</a></p>
     */
    @NameInMap("alipay_logon_id")
    public String alipayLogonId;

    // 支付宝openId，商户入驻时（非必填）
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("info_source_open_id")
    public String infoSourceOpenId;

    // 签约支付宝账户，商户入驻时（非必填）
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("binding_alipay_logon_id")
    public String bindingAlipayLogonId;

    public static StoreInfo build(java.util.Map<String, ?> map) throws Exception {
        StoreInfo self = new StoreInfo();
        return TeaModel.build(map, self);
    }

    public StoreInfo setStoreBrand(String storeBrand) {
        this.storeBrand = storeBrand;
        return this;
    }
    public String getStoreBrand() {
        return this.storeBrand;
    }

    public StoreInfo setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public StoreInfo setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public StoreInfo setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public StoreInfo setUsci(String usci) {
        this.usci = usci;
        return this;
    }
    public String getUsci() {
        return this.usci;
    }

    public StoreInfo setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public StoreInfo setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }
    public String getProvinceCode() {
        return this.provinceCode;
    }

    public StoreInfo setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public StoreInfo setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public StoreInfo setDistrict(String district) {
        this.district = district;
        return this;
    }
    public String getDistrict() {
        return this.district;
    }

    public StoreInfo setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }
    public String getDistrictCode() {
        return this.districtCode;
    }

    public StoreInfo setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public StoreInfo setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public StoreInfo setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public StoreInfo setStoreStartDate(String storeStartDate) {
        this.storeStartDate = storeStartDate;
        return this;
    }
    public String getStoreStartDate() {
        return this.storeStartDate;
    }

    public StoreInfo setStoreEndDate(String storeEndDate) {
        this.storeEndDate = storeEndDate;
        return this;
    }
    public String getStoreEndDate() {
        return this.storeEndDate;
    }

    public StoreInfo setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

    public StoreInfo setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
        return this;
    }
    public String getLegalPersonName() {
        return this.legalPersonName;
    }

    public StoreInfo setLegalPersonIdCard(String legalPersonIdCard) {
        this.legalPersonIdCard = legalPersonIdCard;
        return this;
    }
    public String getLegalPersonIdCard() {
        return this.legalPersonIdCard;
    }

    public StoreInfo setLegalPersonMobile(String legalPersonMobile) {
        this.legalPersonMobile = legalPersonMobile;
        return this;
    }
    public String getLegalPersonMobile() {
        return this.legalPersonMobile;
    }

    public StoreInfo setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }
    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    public StoreInfo setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public StoreInfo setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }
    public String getBankCode() {
        return this.bankCode;
    }

    public StoreInfo setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public StoreInfo setCnapsCode(String cnapsCode) {
        this.cnapsCode = cnapsCode;
        return this;
    }
    public String getCnapsCode() {
        return this.cnapsCode;
    }

    public StoreInfo setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public StoreInfo setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public StoreInfo setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince;
        return this;
    }
    public String getBankProvince() {
        return this.bankProvince;
    }

    public StoreInfo setBankCity(String bankCity) {
        this.bankCity = bankCity;
        return this;
    }
    public String getBankCity() {
        return this.bankCity;
    }

    public StoreInfo setPayeeBankCard(String payeeBankCard) {
        this.payeeBankCard = payeeBankCard;
        return this;
    }
    public String getPayeeBankCard() {
        return this.payeeBankCard;
    }

    public StoreInfo setPayeeBankName(String payeeBankName) {
        this.payeeBankName = payeeBankName;
        return this;
    }
    public String getPayeeBankName() {
        return this.payeeBankName;
    }

    public StoreInfo setPayeeBankCode(String payeeBankCode) {
        this.payeeBankCode = payeeBankCode;
        return this;
    }
    public String getPayeeBankCode() {
        return this.payeeBankCode;
    }

    public StoreInfo setLoginTenant(String loginTenant) {
        this.loginTenant = loginTenant;
        return this;
    }
    public String getLoginTenant() {
        return this.loginTenant;
    }

    public StoreInfo setLoginDate(String loginDate) {
        this.loginDate = loginDate;
        return this;
    }
    public String getLoginDate() {
        return this.loginDate;
    }

    public StoreInfo setAlipayLogonId(String alipayLogonId) {
        this.alipayLogonId = alipayLogonId;
        return this;
    }
    public String getAlipayLogonId() {
        return this.alipayLogonId;
    }

    public StoreInfo setInfoSourceOpenId(String infoSourceOpenId) {
        this.infoSourceOpenId = infoSourceOpenId;
        return this;
    }
    public String getInfoSourceOpenId() {
        return this.infoSourceOpenId;
    }

    public StoreInfo setBindingAlipayLogonId(String bindingAlipayLogonId) {
        this.bindingAlipayLogonId = bindingAlipayLogonId;
        return this;
    }
    public String getBindingAlipayLogonId() {
        return this.bindingAlipayLogonId;
    }

}
