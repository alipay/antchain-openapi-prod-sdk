// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class OrderInfo extends TeaModel {
    // 订单 id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String orderId;

    // 订单创建时间，格式为2019-08-31 12:00:00
    @NameInMap("order_create_time")
    @Validation(required = true)
    public String orderCreateTime;

    // 订单支付时间，格式为 2019-08-31 12:00:00
    @NameInMap("order_pay_time")
    @Validation(required = true)
    public String orderPayTime;

    // 订单支付 id
    @NameInMap("order_pay_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String orderPayId;

    // 订单支付类型；1:预授权，2:信用套餐，3:支付宝代扣，4:其他，5:网商直付通代扣，6:网商委托代扣
    @NameInMap("order_pay_type")
    @Validation(required = true)
    public Long orderPayType;

    // 订单支付主题
    @NameInMap("order_pay_subject")
    @Validation(required = true, maxLength = 500, minLength = 1)
    public String orderPaySubject;

    // 租期，单位：月
    @NameInMap("rent_term")
    @Validation(required = true, minimum = 1)
    public Long rentTerm;

    // 月租金 精确到分，即 1234 表示 12.34 元
    @NameInMap("rent_price_per_month")
    @Validation(required = true)
    public Long rentPricePerMonth;

    // 到期买断价 精确到分，即 1234 表示 12.34 元
    @NameInMap("buy_out_price")
    @Validation(required = true)
    public Long buyOutPrice;

    // 租赁合同,需要客户自己提供合并的 url
    @NameInMap("lease_contract_url")
    @Validation(required = true, maxLength = 1000, minLength = 1)
    public String leaseContractUrl;

    // 仓库类型；1: 实体仓 2: 虚拟仓
    @NameInMap("store_type")
    @Validation(required = true)
    public Long storeType;

    // 承租人收货地址
    @NameInMap("user_address")
    @Validation(required = true, maxLength = 100, minLength = 1)
    public String userAddress;

    // 供应商在金融科技对应的租户 id，若填写此字段，则会走供应商模式
    @NameInMap("supplier_isv_account")
    @Validation(required = true, maxLength = 100, minLength = 1)
    public String supplierIsvAccount;

    // 省份编码
    @NameInMap("province_code")
    @Validation(required = true)
    public String provinceCode;

    // 城市编码
    @NameInMap("city_code")
    @Validation(required = true)
    public String cityCode;

    // 地区码
    @NameInMap("district_code")
    @Validation(required = true)
    public String districtCode;

    // 到期形式；1:到期买断 2:到期归还
    @NameInMap("due_mode")
    @Validation(required = true)
    public Long dueMode;

    // 租赁合同 id，可用作幂等
    @NameInMap("contract_id")
    @Validation(maxLength = 100)
    public String contractId;

    // 租金总额，精确到分，即 1234 表示 12.34 元
    @NameInMap("total_rent_money")
    @Validation(required = true)
    public Long totalRentMoney;

    // 保险单号
    @NameInMap("insurance_number")
    @Validation(maxLength = 100)
    public String insuranceNumber;

    // 保险地址
    @NameInMap("insurance_url")
    @Validation(maxLength = 1000)
    public String insuranceUrl;

    // 蚁盾分数
    @NameInMap("yidun_score")
    public Long yidunScore;

    // 网商直付通模式的代扣协议号，订单类型为网商直付通模式为必填
    @NameInMap("agreement_no")
    @Validation(maxLength = 100)
    public String agreementNo;

    // 直付通代扣受理订单号，订单类型为网商直付通模式为必填
    @NameInMap("agreement_order_id")
    @Validation(maxLength = 100)
    public String agreementOrderId;

    // 首付款金额, 精确到分，即 1234 表示 12.34 元，订单类型为网商直付通模式为必填
    @NameInMap("down_payment")
    public Long downPayment;

    // 订单付款内容描述
    @NameInMap("order_pay_body")
    @Validation(maxLength = 500)
    public String orderPayBody;

    // 额外信息
    @NameInMap("extra_info")
    public String extraInfo;

    public static OrderInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderInfo self = new OrderInfo();
        return TeaModel.build(map, self);
    }

    public OrderInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OrderInfo setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
        return this;
    }
    public String getOrderCreateTime() {
        return this.orderCreateTime;
    }

    public OrderInfo setOrderPayTime(String orderPayTime) {
        this.orderPayTime = orderPayTime;
        return this;
    }
    public String getOrderPayTime() {
        return this.orderPayTime;
    }

    public OrderInfo setOrderPayId(String orderPayId) {
        this.orderPayId = orderPayId;
        return this;
    }
    public String getOrderPayId() {
        return this.orderPayId;
    }

    public OrderInfo setOrderPayType(Long orderPayType) {
        this.orderPayType = orderPayType;
        return this;
    }
    public Long getOrderPayType() {
        return this.orderPayType;
    }

    public OrderInfo setOrderPaySubject(String orderPaySubject) {
        this.orderPaySubject = orderPaySubject;
        return this;
    }
    public String getOrderPaySubject() {
        return this.orderPaySubject;
    }

    public OrderInfo setRentTerm(Long rentTerm) {
        this.rentTerm = rentTerm;
        return this;
    }
    public Long getRentTerm() {
        return this.rentTerm;
    }

    public OrderInfo setRentPricePerMonth(Long rentPricePerMonth) {
        this.rentPricePerMonth = rentPricePerMonth;
        return this;
    }
    public Long getRentPricePerMonth() {
        return this.rentPricePerMonth;
    }

    public OrderInfo setBuyOutPrice(Long buyOutPrice) {
        this.buyOutPrice = buyOutPrice;
        return this;
    }
    public Long getBuyOutPrice() {
        return this.buyOutPrice;
    }

    public OrderInfo setLeaseContractUrl(String leaseContractUrl) {
        this.leaseContractUrl = leaseContractUrl;
        return this;
    }
    public String getLeaseContractUrl() {
        return this.leaseContractUrl;
    }

    public OrderInfo setStoreType(Long storeType) {
        this.storeType = storeType;
        return this;
    }
    public Long getStoreType() {
        return this.storeType;
    }

    public OrderInfo setUserAddress(String userAddress) {
        this.userAddress = userAddress;
        return this;
    }
    public String getUserAddress() {
        return this.userAddress;
    }

    public OrderInfo setSupplierIsvAccount(String supplierIsvAccount) {
        this.supplierIsvAccount = supplierIsvAccount;
        return this;
    }
    public String getSupplierIsvAccount() {
        return this.supplierIsvAccount;
    }

    public OrderInfo setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }
    public String getProvinceCode() {
        return this.provinceCode;
    }

    public OrderInfo setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public OrderInfo setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }
    public String getDistrictCode() {
        return this.districtCode;
    }

    public OrderInfo setDueMode(Long dueMode) {
        this.dueMode = dueMode;
        return this;
    }
    public Long getDueMode() {
        return this.dueMode;
    }

    public OrderInfo setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public OrderInfo setTotalRentMoney(Long totalRentMoney) {
        this.totalRentMoney = totalRentMoney;
        return this;
    }
    public Long getTotalRentMoney() {
        return this.totalRentMoney;
    }

    public OrderInfo setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
        return this;
    }
    public String getInsuranceNumber() {
        return this.insuranceNumber;
    }

    public OrderInfo setInsuranceUrl(String insuranceUrl) {
        this.insuranceUrl = insuranceUrl;
        return this;
    }
    public String getInsuranceUrl() {
        return this.insuranceUrl;
    }

    public OrderInfo setYidunScore(Long yidunScore) {
        this.yidunScore = yidunScore;
        return this;
    }
    public Long getYidunScore() {
        return this.yidunScore;
    }

    public OrderInfo setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public OrderInfo setAgreementOrderId(String agreementOrderId) {
        this.agreementOrderId = agreementOrderId;
        return this;
    }
    public String getAgreementOrderId() {
        return this.agreementOrderId;
    }

    public OrderInfo setDownPayment(Long downPayment) {
        this.downPayment = downPayment;
        return this;
    }
    public Long getDownPayment() {
        return this.downPayment;
    }

    public OrderInfo setOrderPayBody(String orderPayBody) {
        this.orderPayBody = orderPayBody;
        return this;
    }
    public String getOrderPayBody() {
        return this.orderPayBody;
    }

    public OrderInfo setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
