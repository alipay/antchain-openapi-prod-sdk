// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryMypointsOrderinstructionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务请求单号
    @NameInMap("biz_id")
    public String bizId;

    // 链ID
    @NameInMap("chain_id")
    public String chainId;

    // 环境标识
    @NameInMap("env")
    public String env;

    // 扩展信息
    @NameInMap("extend_info")
    public String extendInfo;

    // 订单ID(env+chain_id+tenant_id+sku_id+biz_id)
    @NameInMap("order_id")
    public String orderId;

    // 预下单ID
    @NameInMap("pre_order_id")
    public String preOrderId;

    // 包含集分宝数量(个)
    @NameInMap("sku_amount")
    public Long skuAmount;

    // SKU ID
    @NameInMap("sku_id")
    public String skuId;

    // 面值
    @NameInMap("sku_value")
    public String skuValue;

    // 状态(0:初始,1:失败可重试,2:失败不可重试,3:成功)
    @NameInMap("status")
    public Long status;

    // 商家在金融云的租户ID
    @NameInMap("tenant_id")
    public String tenantId;

    public static QueryMypointsOrderinstructionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMypointsOrderinstructionResponse self = new QueryMypointsOrderinstructionResponse();
        return TeaModel.build(map, self);
    }

    public QueryMypointsOrderinstructionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMypointsOrderinstructionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMypointsOrderinstructionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMypointsOrderinstructionResponse setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryMypointsOrderinstructionResponse setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryMypointsOrderinstructionResponse setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public QueryMypointsOrderinstructionResponse setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public QueryMypointsOrderinstructionResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryMypointsOrderinstructionResponse setPreOrderId(String preOrderId) {
        this.preOrderId = preOrderId;
        return this;
    }
    public String getPreOrderId() {
        return this.preOrderId;
    }

    public QueryMypointsOrderinstructionResponse setSkuAmount(Long skuAmount) {
        this.skuAmount = skuAmount;
        return this;
    }
    public Long getSkuAmount() {
        return this.skuAmount;
    }

    public QueryMypointsOrderinstructionResponse setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public QueryMypointsOrderinstructionResponse setSkuValue(String skuValue) {
        this.skuValue = skuValue;
        return this;
    }
    public String getSkuValue() {
        return this.skuValue;
    }

    public QueryMypointsOrderinstructionResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryMypointsOrderinstructionResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
