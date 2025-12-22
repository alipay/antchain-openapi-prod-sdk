// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclOrderInfo extends TeaModel {
    // 订单外部id,商户自己定义的订单id
    /**
     * <strong>example:</strong>
     * <p>asdasdqwe123wer</p>
     */
    @NameInMap("order_outer_id")
    @Validation(required = true)
    public String orderOuterId;

    // 订单创建时间
    /**
     * <strong>example:</strong>
     * <p>2023-04-05 12:12:23</p>
     */
    @NameInMap("order_create_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String orderCreateTime;

    // DUE_BUYOUT 到期买断 
    // DUE_RETURN 到期归还
    /**
     * <strong>example:</strong>
     * <p>DUE_BUYOUT</p>
     */
    @NameInMap("due_mode")
    @Validation(required = true)
    public String dueMode;

    // 订单总金额 单位分
    /**
     * <strong>example:</strong>
     * <p>12300</p>
     */
    @NameInMap("total_money")
    @Validation(required = true)
    public Long totalMoney;

    // 到期买断价  单位分，
    // 到期金额，若为买断形式传买断金额，否则传到期归还金额
    /**
     * <strong>example:</strong>
     * <p>12300</p>
     */
    @NameInMap("buy_out_price")
    public Long buyOutPrice;

    // 芝麻信用订单免押金额 单位分
    /**
     * <strong>example:</strong>
     * <p>10035</p>
     */
    @NameInMap("deposit_free")
    public Long depositFree;

    // 芝麻信用 实际预授权金额 单位分
    /**
     * <strong>example:</strong>
     * <p>12322</p>
     */
    @NameInMap("acutal_pre_auth_free")
    public Long acutalPreAuthFree;

    // 网商直付通模式的代扣协议号
    /**
     * <strong>example:</strong>
     * <p>ssdsf23324dfsdfsdf</p>
     */
    @NameInMap("mybank_agreement_no")
    public String mybankAgreementNo;

    // 直付通代扣受理订单号
    /**
     * <strong>example:</strong>
     * <p>asdasdqwewqes223</p>
     */
    @NameInMap("mybank_agreement_order_id")
    public String mybankAgreementOrderId;

    // -网商代扣：MY_BANK_PROXY_WITHHOLDING
    // -合同代扣：CONTRACT_PROXY_WITHHOLDING
    /**
     * <strong>example:</strong>
     * <p>MY_BANK_PROXY_WITHHOLDING</p>
     */
    @NameInMap("order_withhold_type")
    @Validation(required = true)
    public String orderWithholdType;

    // 首付款金额 单位分
    /**
     * <strong>example:</strong>
     * <p>12323</p>
     */
    @NameInMap("down_payment")
    public Long downPayment;

    // 商品列表
    /**
     * <strong>example:</strong>
     * <p>SANDBOX12312</p>
     */
    @NameInMap("product_infos")
    @Validation(required = true)
    public java.util.List<BclOrderProductInfo> productInfos;

    // 物流方式： POST 邮寄 OFFLINE 线下自取
    /**
     * <strong>example:</strong>
     * <p>POST</p>
     */
    @NameInMap("logistic_type")
    @Validation(required = true)
    public String logisticType;

    // 订单状态
    // 已创建 CREATED
    // 待发起 PRE_SUBMIT
    // 已发起 SUBMIT
    // 履约中 PERFORMING
    // 履约完成 PERFORMED
    // 订单完结 ORDER_FINISH
    // 风控失败 RISK_FAIL
    // 核身失败 IDENTITY_NOT_MATCH
    // 网商订单核验失败 MY_BANK_VERIFY_FAIL
    // 实人中 PERSON_FACE_VERIFY
    // 实人认证失败 PERSON_FACE_VERIFY_FAIL
    // 订单异常 ORDER_ERROR
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>CREATED</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 订单状态失败的描述
    /**
     * <strong>example:</strong>
     * <p>核身没有通过</p>
     */
    @NameInMap("status_remark")
    public String statusRemark;

    // 承租方用户信息
    @NameInMap("user_info")
    @Validation(required = true)
    public BclUserInfo userInfo;

    public static BclOrderInfo build(java.util.Map<String, ?> map) throws Exception {
        BclOrderInfo self = new BclOrderInfo();
        return TeaModel.build(map, self);
    }

    public BclOrderInfo setOrderOuterId(String orderOuterId) {
        this.orderOuterId = orderOuterId;
        return this;
    }
    public String getOrderOuterId() {
        return this.orderOuterId;
    }

    public BclOrderInfo setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
        return this;
    }
    public String getOrderCreateTime() {
        return this.orderCreateTime;
    }

    public BclOrderInfo setDueMode(String dueMode) {
        this.dueMode = dueMode;
        return this;
    }
    public String getDueMode() {
        return this.dueMode;
    }

    public BclOrderInfo setTotalMoney(Long totalMoney) {
        this.totalMoney = totalMoney;
        return this;
    }
    public Long getTotalMoney() {
        return this.totalMoney;
    }

    public BclOrderInfo setBuyOutPrice(Long buyOutPrice) {
        this.buyOutPrice = buyOutPrice;
        return this;
    }
    public Long getBuyOutPrice() {
        return this.buyOutPrice;
    }

    public BclOrderInfo setDepositFree(Long depositFree) {
        this.depositFree = depositFree;
        return this;
    }
    public Long getDepositFree() {
        return this.depositFree;
    }

    public BclOrderInfo setAcutalPreAuthFree(Long acutalPreAuthFree) {
        this.acutalPreAuthFree = acutalPreAuthFree;
        return this;
    }
    public Long getAcutalPreAuthFree() {
        return this.acutalPreAuthFree;
    }

    public BclOrderInfo setMybankAgreementNo(String mybankAgreementNo) {
        this.mybankAgreementNo = mybankAgreementNo;
        return this;
    }
    public String getMybankAgreementNo() {
        return this.mybankAgreementNo;
    }

    public BclOrderInfo setMybankAgreementOrderId(String mybankAgreementOrderId) {
        this.mybankAgreementOrderId = mybankAgreementOrderId;
        return this;
    }
    public String getMybankAgreementOrderId() {
        return this.mybankAgreementOrderId;
    }

    public BclOrderInfo setOrderWithholdType(String orderWithholdType) {
        this.orderWithholdType = orderWithholdType;
        return this;
    }
    public String getOrderWithholdType() {
        return this.orderWithholdType;
    }

    public BclOrderInfo setDownPayment(Long downPayment) {
        this.downPayment = downPayment;
        return this;
    }
    public Long getDownPayment() {
        return this.downPayment;
    }

    public BclOrderInfo setProductInfos(java.util.List<BclOrderProductInfo> productInfos) {
        this.productInfos = productInfos;
        return this;
    }
    public java.util.List<BclOrderProductInfo> getProductInfos() {
        return this.productInfos;
    }

    public BclOrderInfo setLogisticType(String logisticType) {
        this.logisticType = logisticType;
        return this;
    }
    public String getLogisticType() {
        return this.logisticType;
    }

    public BclOrderInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public BclOrderInfo setStatusRemark(String statusRemark) {
        this.statusRemark = statusRemark;
        return this;
    }
    public String getStatusRemark() {
        return this.statusRemark;
    }

    public BclOrderInfo setUserInfo(BclUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public BclUserInfo getUserInfo() {
        return this.userInfo;
    }

}
