// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryMypointsPreorderinstructionResponse extends TeaModel {
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

    // 商家的预算库代码
    @NameInMap("budget_code")
    public String budgetCode;

    // 链ID
    @NameInMap("chain_id")
    public String chainId;

    // 环境标识
    @NameInMap("env")
    public String env;

    // 扩展信息
    @NameInMap("extend_info")
    public String extendInfo;

    // 备注信息
    @NameInMap("memo")
    public String memo;

    // 商家在支付宝域的标识
    @NameInMap("pid")
    public String pid;

    // 集分宝产品码
    @NameInMap("product_code")
    public String productCode;

    // 集分宝SKU预下单ID
    @NameInMap("pre_order_id")
    public String preOrderId;

    // 订单中剩余的可下单商品数量
    @NameInMap("remain_count")
    public Long remainCount;

    // 包含集分宝数量(个)
    @NameInMap("sku_amount")
    public Long skuAmount;

    // 集分宝SKU的ID
    @NameInMap("sku_id")
    public String skuId;

    // SKU面值
    @NameInMap("sku_value")
    public String skuValue;

    // 流水状态(0初始状态, 1采购失败可重试, 2采购失败不可重试, 3采购成功, 4预算库创建失败可重试, 5预算库创建失败不可重试, 6预算库叉棍见成功, 7预算调拨失败可重试, 8预算库调拨失败不可重试, 9预算库调拨成功)
    @NameInMap("status")
    public Long status;

    // 商户在金融云的租户ID
    @NameInMap("tenant_id")
    public String tenantId;

    // 总下单集分宝数量
    @NameInMap("total_amount")
    public Long totalAmount;

    // 集分宝SKU的预下单数量
    @NameInMap("total_count")
    public Long totalCount;

    // 总下单金额
    @NameInMap("total_value")
    public String totalValue;

    public static QueryMypointsPreorderinstructionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMypointsPreorderinstructionResponse self = new QueryMypointsPreorderinstructionResponse();
        return TeaModel.build(map, self);
    }

    public QueryMypointsPreorderinstructionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMypointsPreorderinstructionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMypointsPreorderinstructionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMypointsPreorderinstructionResponse setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryMypointsPreorderinstructionResponse setBudgetCode(String budgetCode) {
        this.budgetCode = budgetCode;
        return this;
    }
    public String getBudgetCode() {
        return this.budgetCode;
    }

    public QueryMypointsPreorderinstructionResponse setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryMypointsPreorderinstructionResponse setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public QueryMypointsPreorderinstructionResponse setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public String getExtendInfo() {
        return this.extendInfo;
    }

    public QueryMypointsPreorderinstructionResponse setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public QueryMypointsPreorderinstructionResponse setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public QueryMypointsPreorderinstructionResponse setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryMypointsPreorderinstructionResponse setPreOrderId(String preOrderId) {
        this.preOrderId = preOrderId;
        return this;
    }
    public String getPreOrderId() {
        return this.preOrderId;
    }

    public QueryMypointsPreorderinstructionResponse setRemainCount(Long remainCount) {
        this.remainCount = remainCount;
        return this;
    }
    public Long getRemainCount() {
        return this.remainCount;
    }

    public QueryMypointsPreorderinstructionResponse setSkuAmount(Long skuAmount) {
        this.skuAmount = skuAmount;
        return this;
    }
    public Long getSkuAmount() {
        return this.skuAmount;
    }

    public QueryMypointsPreorderinstructionResponse setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public QueryMypointsPreorderinstructionResponse setSkuValue(String skuValue) {
        this.skuValue = skuValue;
        return this;
    }
    public String getSkuValue() {
        return this.skuValue;
    }

    public QueryMypointsPreorderinstructionResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryMypointsPreorderinstructionResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryMypointsPreorderinstructionResponse setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public QueryMypointsPreorderinstructionResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryMypointsPreorderinstructionResponse setTotalValue(String totalValue) {
        this.totalValue = totalValue;
        return this;
    }
    public String getTotalValue() {
        return this.totalValue;
    }

}
