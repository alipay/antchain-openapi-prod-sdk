// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class CustodyMasterLimitItem extends TeaModel {
    // 代币
    /**
     * <strong>example:</strong>
     * <p>USDC</p>
     */
    @NameInMap("token_symbol")
    @Validation(required = true)
    public String tokenSymbol;

    // 网络标识
    /**
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("network")
    @Validation(required = true)
    public String network;

    // 已使用额度
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("used_quota")
    @Validation(required = true)
    public String usedQuota;

    // 额度变更业务ID
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 额度变更状态
    /**
     * <strong>example:</strong>
     * <p>ChangeFinished</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 在途额度
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("pending_quota")
    @Validation(required = true)
    public String pendingQuota;

    // 123
    /**
     * <strong>example:</strong>
     * <p>(最大)限额</p>
     */
    @NameInMap("quota")
    @Validation(required = true)
    public String quota;

    public static CustodyMasterLimitItem build(java.util.Map<String, ?> map) throws Exception {
        CustodyMasterLimitItem self = new CustodyMasterLimitItem();
        return TeaModel.build(map, self);
    }

    public CustodyMasterLimitItem setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

    public CustodyMasterLimitItem setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public CustodyMasterLimitItem setUsedQuota(String usedQuota) {
        this.usedQuota = usedQuota;
        return this;
    }
    public String getUsedQuota() {
        return this.usedQuota;
    }

    public CustodyMasterLimitItem setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CustodyMasterLimitItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CustodyMasterLimitItem setPendingQuota(String pendingQuota) {
        this.pendingQuota = pendingQuota;
        return this;
    }
    public String getPendingQuota() {
        return this.pendingQuota;
    }

    public CustodyMasterLimitItem setQuota(String quota) {
        this.quota = quota;
        return this;
    }
    public String getQuota() {
        return this.quota;
    }

}
