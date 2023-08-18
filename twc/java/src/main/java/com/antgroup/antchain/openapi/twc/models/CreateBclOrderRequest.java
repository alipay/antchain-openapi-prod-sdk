// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateBclOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单外部id 商家关联自己的订单,长度不超过64位
    @NameInMap("order_outer_id")
    @Validation(required = true, maxLength = 64)
    public String orderOuterId;

    // 商家租赁订单创建时间
    // 长度不超过32位 
    // 示例：2023-06-27T10:50:23+08:00
    @NameInMap("order_create_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String orderCreateTime;

    // 承租人用户信息
    @NameInMap("user_info")
    @Validation(required = true)
    public BclUserInfo userInfo;

    // 到期形式
    // DUE_BUYOUT 到期买断 
    // DUE_RETURN 到期归还
    @NameInMap("due_mode")
    @Validation(required = true, maxLength = 16)
    public String dueMode;

    // 租金总额，单位：分
    // 最小值需大于0
    @NameInMap("total_rent_money")
    @Validation(required = true, minimum = 1)
    public Long totalRentMoney;

    // 租期，单位：月
    // 最小值需大于0
    @NameInMap("rent_term")
    @Validation(required = true, minimum = 1)
    public Long rentTerm;

    // 订单租期单位，
    // 1.月：MONTH
    // 例如：rent_term入参12，rent_unit入参MONTH代表租期12个月
    @NameInMap("rent_unit")
    @Validation(required = true, maxLength = 16)
    public String rentUnit;

    // 到期买断价，单位：分
    // 到期金额，最小值需大于0，若为买断形式传买断金额，否则传到期归还金额
    @NameInMap("buy_out_price")
    public Long buyOutPrice;

    // 芝麻信用订单免押金额，单位：分
    // 最小值需大于0
    @NameInMap("deposit_free")
    public Long depositFree;

    // 芝麻信用实际预授权金额，单位：分
    // 最小值需大于0
    @NameInMap("acutal_pre_auth_free")
    public Long acutalPreAuthFree;

    // 代扣协议号
    // 网商代扣和预授权代扣必填，长度不超过64位
    @NameInMap("mybank_agreement_no")
    @Validation(maxLength = 64)
    public String mybankAgreementNo;

    // 网商代扣受理订单号
    // 网商代扣必填，长度不超过64位
    @NameInMap("mybank_agreement_order_id")
    @Validation(maxLength = 64)
    public String mybankAgreementOrderId;

    // 租金支付方式
    // 1.网商代扣：MY_BANK_PROXY_WITHHOLDING 
    // 2.预授权代扣：PRE_AUTHORIZATION_WITHHOLDING
    // 3.租赁代扣：PROXY_WITHHOLDING
    @NameInMap("order_withhold_type")
    @Validation(required = true, maxLength = 32)
    public String orderWithholdType;

    // 首付款金额 单位分
    @NameInMap("down_payment")
    public Long downPayment;

    // 承诺详情
    // 按期数从小到大且连续排序
    @NameInMap("promise_details")
    public java.util.List<BclCreatePromiseDetailInfo> promiseDetails;

    // 物流方式
    // 1.邮寄：POST 
    // 2.线下自取：OFFLINE
    @NameInMap("logistic_type")
    @Validation(required = true, maxLength = 16)
    public String logisticType;

    // 商品列表
    @NameInMap("product_infos")
    @Validation(required = true)
    public java.util.List<BclOrderProductInfo> productInfos;

    // 需要使用的增值服务
    // 1.实名：REAL_PERSON
    // 2.风控：RISK
    // 3.租赁合同：CONTRACT
    // 实人和合同服务使用最长超时时间为72小时
    @NameInMap("service_types")
    public java.util.List<String> serviceTypes;

    // 用户下单时的ip地址
    // 如果可选服务选择了风控，必须填写，长度不超过32位
    @NameInMap("user_ip")
    @Validation(maxLength = 32)
    public String userIp;

    // 承租人实人认证完成后回跳地址
    // 比如商户小程序下单地址，选择实人认证服务时必填
    @NameInMap("real_person_return_url")
    @Validation(maxLength = 512)
    public String realPersonReturnUrl;

    // 签署流程信息
    // 当service_types为包含CONTRACT时或order_withhold_type为PROXY_WITHHOLDING时必填
    @NameInMap("contract_flow_info")
    public BclContractFlowInfo contractFlowInfo;

    // 是	是否不需要融资：
    // 1.明确这笔订单不需要融资：true
    // 2.该笔订单后续可能融资也可能不融资：false
    // 注意：标明不需要融资可以提升代扣回款速度
    @NameInMap("none_financing")
    public Boolean noneFinancing;

    public static CreateBclOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBclOrderRequest self = new CreateBclOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateBclOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBclOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBclOrderRequest setOrderOuterId(String orderOuterId) {
        this.orderOuterId = orderOuterId;
        return this;
    }
    public String getOrderOuterId() {
        return this.orderOuterId;
    }

    public CreateBclOrderRequest setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
        return this;
    }
    public String getOrderCreateTime() {
        return this.orderCreateTime;
    }

    public CreateBclOrderRequest setUserInfo(BclUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public BclUserInfo getUserInfo() {
        return this.userInfo;
    }

    public CreateBclOrderRequest setDueMode(String dueMode) {
        this.dueMode = dueMode;
        return this;
    }
    public String getDueMode() {
        return this.dueMode;
    }

    public CreateBclOrderRequest setTotalRentMoney(Long totalRentMoney) {
        this.totalRentMoney = totalRentMoney;
        return this;
    }
    public Long getTotalRentMoney() {
        return this.totalRentMoney;
    }

    public CreateBclOrderRequest setRentTerm(Long rentTerm) {
        this.rentTerm = rentTerm;
        return this;
    }
    public Long getRentTerm() {
        return this.rentTerm;
    }

    public CreateBclOrderRequest setRentUnit(String rentUnit) {
        this.rentUnit = rentUnit;
        return this;
    }
    public String getRentUnit() {
        return this.rentUnit;
    }

    public CreateBclOrderRequest setBuyOutPrice(Long buyOutPrice) {
        this.buyOutPrice = buyOutPrice;
        return this;
    }
    public Long getBuyOutPrice() {
        return this.buyOutPrice;
    }

    public CreateBclOrderRequest setDepositFree(Long depositFree) {
        this.depositFree = depositFree;
        return this;
    }
    public Long getDepositFree() {
        return this.depositFree;
    }

    public CreateBclOrderRequest setAcutalPreAuthFree(Long acutalPreAuthFree) {
        this.acutalPreAuthFree = acutalPreAuthFree;
        return this;
    }
    public Long getAcutalPreAuthFree() {
        return this.acutalPreAuthFree;
    }

    public CreateBclOrderRequest setMybankAgreementNo(String mybankAgreementNo) {
        this.mybankAgreementNo = mybankAgreementNo;
        return this;
    }
    public String getMybankAgreementNo() {
        return this.mybankAgreementNo;
    }

    public CreateBclOrderRequest setMybankAgreementOrderId(String mybankAgreementOrderId) {
        this.mybankAgreementOrderId = mybankAgreementOrderId;
        return this;
    }
    public String getMybankAgreementOrderId() {
        return this.mybankAgreementOrderId;
    }

    public CreateBclOrderRequest setOrderWithholdType(String orderWithholdType) {
        this.orderWithholdType = orderWithholdType;
        return this;
    }
    public String getOrderWithholdType() {
        return this.orderWithholdType;
    }

    public CreateBclOrderRequest setDownPayment(Long downPayment) {
        this.downPayment = downPayment;
        return this;
    }
    public Long getDownPayment() {
        return this.downPayment;
    }

    public CreateBclOrderRequest setPromiseDetails(java.util.List<BclCreatePromiseDetailInfo> promiseDetails) {
        this.promiseDetails = promiseDetails;
        return this;
    }
    public java.util.List<BclCreatePromiseDetailInfo> getPromiseDetails() {
        return this.promiseDetails;
    }

    public CreateBclOrderRequest setLogisticType(String logisticType) {
        this.logisticType = logisticType;
        return this;
    }
    public String getLogisticType() {
        return this.logisticType;
    }

    public CreateBclOrderRequest setProductInfos(java.util.List<BclOrderProductInfo> productInfos) {
        this.productInfos = productInfos;
        return this;
    }
    public java.util.List<BclOrderProductInfo> getProductInfos() {
        return this.productInfos;
    }

    public CreateBclOrderRequest setServiceTypes(java.util.List<String> serviceTypes) {
        this.serviceTypes = serviceTypes;
        return this;
    }
    public java.util.List<String> getServiceTypes() {
        return this.serviceTypes;
    }

    public CreateBclOrderRequest setUserIp(String userIp) {
        this.userIp = userIp;
        return this;
    }
    public String getUserIp() {
        return this.userIp;
    }

    public CreateBclOrderRequest setRealPersonReturnUrl(String realPersonReturnUrl) {
        this.realPersonReturnUrl = realPersonReturnUrl;
        return this;
    }
    public String getRealPersonReturnUrl() {
        return this.realPersonReturnUrl;
    }

    public CreateBclOrderRequest setContractFlowInfo(BclContractFlowInfo contractFlowInfo) {
        this.contractFlowInfo = contractFlowInfo;
        return this;
    }
    public BclContractFlowInfo getContractFlowInfo() {
        return this.contractFlowInfo;
    }

    public CreateBclOrderRequest setNoneFinancing(Boolean noneFinancing) {
        this.noneFinancing = noneFinancing;
        return this;
    }
    public Boolean getNoneFinancing() {
        return this.noneFinancing;
    }

}
