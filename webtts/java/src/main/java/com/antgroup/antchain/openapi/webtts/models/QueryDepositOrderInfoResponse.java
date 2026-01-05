// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class QueryDepositOrderInfoResponse extends TeaModel {
    // 订单id
    /**
     * <strong>example:</strong>
     * <p>202512301338236627142T870720</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 订单类型
    /**
     * <strong>example:</strong>
     * <p>DEPOSIT</p>
     */
    @NameInMap("order_type")
    @Validation(required = true)
    public String orderType;

    // 区块链名称
    /**
     * <strong>example:</strong>
     * <p>Ethereum</p>
     */
    @NameInMap("blockchain")
    @Validation(required = true)
    public String blockchain;

    // 代币名称
    /**
     * <strong>example:</strong>
     * <p>USDC</p>
     */
    @NameInMap("token_symbol")
    @Validation(required = true)
    public String tokenSymbol;

    // deposit数量
    /**
     * <strong>example:</strong>
     * <p>100.001</p>
     */
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // deposit交易hash
    /**
     * <strong>example:</strong>
     * <p>0xa95311ca68c47ceac58cfa63581ffe60d492e6daa5b1726758103cdc52e85095</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 交易发起地址，为白名单地址
    /**
     * <strong>example:</strong>
     * <p>0xf5be944e4829aa055957e45bdf1b41175744f0a2</p>
     */
    @NameInMap("from_address")
    @Validation(required = true)
    public String fromAddress;

    // 交易接收地址，为托管钱包地址
    /**
     * <strong>example:</strong>
     * <p>0xf5be944e4829aa055957e45bdf1b41175744f0a2</p>
     */
    @NameInMap("to_address")
    @Validation(required = true)
    public String toAddress;

    // 订单创建时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("create_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createTime;

    // 订单状态
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("order_status")
    @Validation(required = true)
    public String orderStatus;

    // 订单备注
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("remark")
    @Validation(required = true)
    public String remark;

    public static QueryDepositOrderInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDepositOrderInfoResponse self = new QueryDepositOrderInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryDepositOrderInfoResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryDepositOrderInfoResponse setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public QueryDepositOrderInfoResponse setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public QueryDepositOrderInfoResponse setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

    public QueryDepositOrderInfoResponse setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public QueryDepositOrderInfoResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public QueryDepositOrderInfoResponse setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
        return this;
    }
    public String getFromAddress() {
        return this.fromAddress;
    }

    public QueryDepositOrderInfoResponse setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }
    public String getToAddress() {
        return this.toAddress;
    }

    public QueryDepositOrderInfoResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public QueryDepositOrderInfoResponse setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public QueryDepositOrderInfoResponse setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
