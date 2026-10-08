// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class WhitelistOrderListItem extends TeaModel {
    // 白名单订单号
    /**
     * <strong>example:</strong>
     * <p>WL202605011200000001</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 链名称
    /**
     * <strong>example:</strong>
     * <p>Ethereum</p>
     */
    @NameInMap("blockchain")
    @Validation(required = true)
    public String blockchain;

    // 白名单地址
    /**
     * <strong>example:</strong>
     * <p>0x742d35Cc6634C0532925a3b844Bc9e7595f0bEb</p>
     */
    @NameInMap("whitelist_address")
    @Validation(required = true)
    public String whitelistAddress;

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
     * <p>SUCCESS</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // checker审批备注
    /**
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("checker_remark")
    public String checkerRemark;

    public static WhitelistOrderListItem build(java.util.Map<String, ?> map) throws Exception {
        WhitelistOrderListItem self = new WhitelistOrderListItem();
        return TeaModel.build(map, self);
    }

    public WhitelistOrderListItem setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public WhitelistOrderListItem setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public WhitelistOrderListItem setWhitelistAddress(String whitelistAddress) {
        this.whitelistAddress = whitelistAddress;
        return this;
    }
    public String getWhitelistAddress() {
        return this.whitelistAddress;
    }

    public WhitelistOrderListItem setMakerName(String makerName) {
        this.makerName = makerName;
        return this;
    }
    public String getMakerName() {
        return this.makerName;
    }

    public WhitelistOrderListItem setCheckerName(String checkerName) {
        this.checkerName = checkerName;
        return this;
    }
    public String getCheckerName() {
        return this.checkerName;
    }

    public WhitelistOrderListItem setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public String getSubmitTime() {
        return this.submitTime;
    }

    public WhitelistOrderListItem setAuditPassTime(String auditPassTime) {
        this.auditPassTime = auditPassTime;
        return this;
    }
    public String getAuditPassTime() {
        return this.auditPassTime;
    }

    public WhitelistOrderListItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public WhitelistOrderListItem setCheckerRemark(String checkerRemark) {
        this.checkerRemark = checkerRemark;
        return this;
    }
    public String getCheckerRemark() {
        return this.checkerRemark;
    }

}
