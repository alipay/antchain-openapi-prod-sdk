// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UploadIpAuthtradesalesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 上传记录的用户的链上账户Id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 订单ID
    @NameInMap("ip_order_id")
    @Validation(required = true)
    public String ipOrderId;

    // true 只上链不走真实支付，false 上链并链下真实支付账单
    @NameInMap("only_call_blockchain")
    @Validation(required = true)
    public Boolean onlyCallBlockchain;

    // 授权佣金比例
    @NameInMap("auth_rate")
    @Validation(required = true)
    public String authRate;

    // 本次结算周期开始时间
    @NameInMap("settlement_begin_time")
    @Validation(required = true)
    public Long settlementBeginTime;

    // 本次结算周期结束时间
    @NameInMap("settlement_end_time")
    @Validation(required = true)
    public Long settlementEndTime;

    // 终端商品销售数量
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 销售金额
    @NameInMap("sales")
    @Validation(required = true)
    public String sales;

    // 实付金额
    @NameInMap("payment")
    @Validation(required = true)
    public String payment;

    // 商品信息
    @NameInMap("goods_info")
    @Validation(required = true)
    public String goodsInfo;

    // 数据上传操作者
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 备注信息
    @NameInMap("memo")
    public String memo;

    public static UploadIpAuthtradesalesRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadIpAuthtradesalesRequest self = new UploadIpAuthtradesalesRequest();
        return TeaModel.build(map, self);
    }

    public UploadIpAuthtradesalesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadIpAuthtradesalesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadIpAuthtradesalesRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public UploadIpAuthtradesalesRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public UploadIpAuthtradesalesRequest setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public UploadIpAuthtradesalesRequest setOnlyCallBlockchain(Boolean onlyCallBlockchain) {
        this.onlyCallBlockchain = onlyCallBlockchain;
        return this;
    }
    public Boolean getOnlyCallBlockchain() {
        return this.onlyCallBlockchain;
    }

    public UploadIpAuthtradesalesRequest setAuthRate(String authRate) {
        this.authRate = authRate;
        return this;
    }
    public String getAuthRate() {
        return this.authRate;
    }

    public UploadIpAuthtradesalesRequest setSettlementBeginTime(Long settlementBeginTime) {
        this.settlementBeginTime = settlementBeginTime;
        return this;
    }
    public Long getSettlementBeginTime() {
        return this.settlementBeginTime;
    }

    public UploadIpAuthtradesalesRequest setSettlementEndTime(Long settlementEndTime) {
        this.settlementEndTime = settlementEndTime;
        return this;
    }
    public Long getSettlementEndTime() {
        return this.settlementEndTime;
    }

    public UploadIpAuthtradesalesRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public UploadIpAuthtradesalesRequest setSales(String sales) {
        this.sales = sales;
        return this;
    }
    public String getSales() {
        return this.sales;
    }

    public UploadIpAuthtradesalesRequest setPayment(String payment) {
        this.payment = payment;
        return this;
    }
    public String getPayment() {
        return this.payment;
    }

    public UploadIpAuthtradesalesRequest setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
        return this;
    }
    public String getGoodsInfo() {
        return this.goodsInfo;
    }

    public UploadIpAuthtradesalesRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UploadIpAuthtradesalesRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
