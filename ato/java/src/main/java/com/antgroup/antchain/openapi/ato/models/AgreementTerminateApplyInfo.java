// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class AgreementTerminateApplyInfo extends TeaModel {
    // 订单ID
    /**
     * <strong>example:</strong>
     * <p>20240505151148001384</p>
     */
    @NameInMap("order_id")
    public String orderId;

    // 解约申请号
    /**
     * <strong>example:</strong>
     * <p>A123435454</p>
     */
    @NameInMap("terminate_apply_id")
    public String terminateApplyId;

    // 订单创建时间
    /**
     * <strong>example:</strong>
     * <p>2025-01-01 12:00:01</p>
     */
    @NameInMap("order_gmt_create")
    public String orderGmtCreate;

    // 解约申请时间
    /**
     * <strong>example:</strong>
     * <p>2025-01-01 11:12:00</p>
     */
    @NameInMap("gmt_terminate_apply")
    public String gmtTerminateApply;

    // 处理状态
    /**
     * <strong>example:</strong>
     * <p>INIT</p>
     */
    @NameInMap("handle_status")
    public String handleStatus;

    public static AgreementTerminateApplyInfo build(java.util.Map<String, ?> map) throws Exception {
        AgreementTerminateApplyInfo self = new AgreementTerminateApplyInfo();
        return TeaModel.build(map, self);
    }

    public AgreementTerminateApplyInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public AgreementTerminateApplyInfo setTerminateApplyId(String terminateApplyId) {
        this.terminateApplyId = terminateApplyId;
        return this;
    }
    public String getTerminateApplyId() {
        return this.terminateApplyId;
    }

    public AgreementTerminateApplyInfo setOrderGmtCreate(String orderGmtCreate) {
        this.orderGmtCreate = orderGmtCreate;
        return this;
    }
    public String getOrderGmtCreate() {
        return this.orderGmtCreate;
    }

    public AgreementTerminateApplyInfo setGmtTerminateApply(String gmtTerminateApply) {
        this.gmtTerminateApply = gmtTerminateApply;
        return this;
    }
    public String getGmtTerminateApply() {
        return this.gmtTerminateApply;
    }

    public AgreementTerminateApplyInfo setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }
    public String getHandleStatus() {
        return this.handleStatus;
    }

}
