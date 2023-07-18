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

    // 商家租赁订单创建时间,长度不超过32位
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

    // 租金总额 单位分
    @NameInMap("total_rent_money")
    @Validation(required = true, minimum = 1)
    public Long totalRentMoney;

    // 订单租期, 比如6期,12期,24期,36期,填数字
    @NameInMap("rent_term")
    @Validation(required = true, minimum = 1)
    public Long rentTerm;

    // 订单租期对应的单位,如果是租期为6,租期单位为MONTH,代表租6个月
    // 月: MONTH
    @NameInMap("rent_unit")
    @Validation(required = true, maxLength = 16)
    public String rentUnit;

    // 到期买断价 单位分，若为买断形式传买断金额，否则传到期归还金额
    @NameInMap("buy_out_price")
    public Long buyOutPrice;

    // 芝麻信用 订单免押金额  单位分
    @NameInMap("deposit_free")
    public Long depositFree;

    // 芝麻信用 实际预授权金额  单位分
    @NameInMap("acutal_pre_auth_free")
    public Long acutalPreAuthFree;

    // 网商代扣协议号或预授权协议号,网商代扣和预授权必填,长度不超过64位
    @NameInMap("mybank_agreement_no")
    @Validation(maxLength = 64)
    public String mybankAgreementNo;

    // 网商代扣受理订单号,网商代扣必填,长度不超过64位
    @NameInMap("mybank_agreement_order_id")
    @Validation(maxLength = 64)
    public String mybankAgreementOrderId;

    // 用英文单词替代数字
    // -网商代扣：MY_BANK_PROXY_WITHHOLDING
    // -合同代扣：CONTRACT_PROXY_WITHHOLDING
    @NameInMap("order_withhold_type")
    @Validation(required = true, maxLength = 32)
    public String orderWithholdType;

    // 首付款金额 单位分
    @NameInMap("down_payment")
    public Long downPayment;

    // 承诺详情,选择代扣是非必填, 按期数从小到大且连续排序
    @NameInMap("promise_details")
    public java.util.List<BclCreatePromiseDetailInfo> promiseDetails;

    // 物流方式：
    // POST 邮寄
    // OFFLINE 线下自取
    @NameInMap("logistic_type")
    @Validation(required = true, maxLength = 16)
    public String logisticType;

    // 商品列表
    @NameInMap("product_infos")
    @Validation(required = true)
    public java.util.List<BclOrderProductInfo> productInfos;

    // - 实名：REAL_PERSON,
    // - 风控：RISK,
    @NameInMap("service_types")
    public java.util.List<String> serviceTypes;

    // 用户下单时候的ip地址,如果可选服务选择了风控,必填 ,长度不超过32位
    @NameInMap("user_ip")
    @Validation(maxLength = 32)
    public String userIp;

    // 承租人实人认证完成后回跳地址(比如商户小程序下单地址),选择实人认证服务时必填
    @NameInMap("real_person_return_url")
    @Validation(maxLength = 512)
    public String realPersonReturnUrl;

    // 签署流程信息，如果使用租赁代扣创建则必填
    @NameInMap("contract_flow_info")
    public BclContractFlowInfo contractFlowInfo;

    // 资方定义订单的其他额外字段，以json形式传递, 如果需要一键融资,则必填,长度不超过4096位
    @NameInMap("order_extra_info")
    @Validation(maxLength = 4096)
    public String orderExtraInfo;

    // 资方定义用户的其他额外字段，以json形式传递, 如果需要一键融资,则必填,长度不超过4096位
    @NameInMap("user_extra_info")
    @Validation(maxLength = 4096)
    public String userExtraInfo;

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

    public CreateBclOrderRequest setOrderExtraInfo(String orderExtraInfo) {
        this.orderExtraInfo = orderExtraInfo;
        return this;
    }
    public String getOrderExtraInfo() {
        return this.orderExtraInfo;
    }

    public CreateBclOrderRequest setUserExtraInfo(String userExtraInfo) {
        this.userExtraInfo = userExtraInfo;
        return this;
    }
    public String getUserExtraInfo() {
        return this.userExtraInfo;
    }

}
