// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class WhitelistOrderItem extends TeaModel {
    // 订单号
    /**
     * <strong>example:</strong>
     * <p>WL202605011200000001</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 白名单地址
    /**
     * <strong>example:</strong>
     * <p>0x742d35Cc6634C0532925a3b844Bc9e7595f0bEb</p>
     */
    @NameInMap("whitelist_address")
    @Validation(required = true)
    public String whitelistAddress;

    // 链网络
    /**
     * <strong>example:</strong>
     * <p>Ethereum</p>
     */
    @NameInMap("blockchain")
    @Validation(required = true)
    public String blockchain;

    // 创建人
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("maker_name")
    @Validation(required = true)
    public String makerName;

    // 审批人
    /**
     * <strong>example:</strong>
     * <p>李四</p>
     */
    @NameInMap("checker_name")
    @Validation(required = true)
    public String checkerName;

    // 提交时间
    /**
     * <strong>example:</strong>
     * <p>2026-05-01 12:00:00</p>
     */
    @NameInMap("submit_time")
    @Validation(required = true)
    public String submitTime;

    // 审批通过时间
    /**
     * <strong>example:</strong>
     * <p>2026-05-01 14:00:00</p>
     */
    @NameInMap("audit_pass_time")
    @Validation(required = true)
    public String auditPassTime;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static WhitelistOrderItem build(java.util.Map<String, ?> map) throws Exception {
        WhitelistOrderItem self = new WhitelistOrderItem();
        return TeaModel.build(map, self);
    }

    public WhitelistOrderItem setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public WhitelistOrderItem setWhitelistAddress(String whitelistAddress) {
        this.whitelistAddress = whitelistAddress;
        return this;
    }
    public String getWhitelistAddress() {
        return this.whitelistAddress;
    }

    public WhitelistOrderItem setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public WhitelistOrderItem setMakerName(String makerName) {
        this.makerName = makerName;
        return this;
    }
    public String getMakerName() {
        return this.makerName;
    }

    public WhitelistOrderItem setCheckerName(String checkerName) {
        this.checkerName = checkerName;
        return this;
    }
    public String getCheckerName() {
        return this.checkerName;
    }

    public WhitelistOrderItem setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public String getSubmitTime() {
        return this.submitTime;
    }

    public WhitelistOrderItem setAuditPassTime(String auditPassTime) {
        this.auditPassTime = auditPassTime;
        return this;
    }
    public String getAuditPassTime() {
        return this.auditPassTime;
    }

    public WhitelistOrderItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
