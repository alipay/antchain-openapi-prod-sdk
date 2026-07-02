// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class XrUserTicketPageInfo extends TeaModel {
    // 用户id
    /**
     * <strong>example:</strong>
     * <p>2088**</p>
     */
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户通行证编码
    /**
     * <strong>example:</strong>
     * <p>2739875205</p>
     */
    @NameInMap("xr_ticket_code")
    @Validation(required = true)
    public String xrTicketCode;

    // xr通行证资源池名称
    /**
     * <strong>example:</strong>
     * <p>资源池001</p>
     */
    @NameInMap("xr_ticket_pool_name")
    @Validation(required = true)
    public String xrTicketPoolName;

    // 资源名称
    /**
     * <strong>example:</strong>
     * <p>资源001</p>
     */
    @NameInMap("resource_name")
    @Validation(required = true)
    public String resourceName;

    // 用户通行证状态
    /**
     * <strong>example:</strong>
     * <p>VALID</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 有效期
    /**
     * <strong>example:</strong>
     * <p>2023-04-06</p>
     */
    @NameInMap("valid_time")
    @Validation(required = true)
    public String validTime;

    // 所属业务
    /**
     * <strong>example:</strong>
     * <p>XR_LEASE</p>
     */
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 租户id
    /**
     * <strong>example:</strong>
     * <p>QWERTYUI</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 核销类型
    /**
     * <strong>example:</strong>
     * <p>XR_DEVICE</p>
     */
    @NameInMap("xr_verification_type")
    @Validation(required = true)
    public String xrVerificationType;

    public static XrUserTicketPageInfo build(java.util.Map<String, ?> map) throws Exception {
        XrUserTicketPageInfo self = new XrUserTicketPageInfo();
        return TeaModel.build(map, self);
    }

    public XrUserTicketPageInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public XrUserTicketPageInfo setXrTicketCode(String xrTicketCode) {
        this.xrTicketCode = xrTicketCode;
        return this;
    }
    public String getXrTicketCode() {
        return this.xrTicketCode;
    }

    public XrUserTicketPageInfo setXrTicketPoolName(String xrTicketPoolName) {
        this.xrTicketPoolName = xrTicketPoolName;
        return this;
    }
    public String getXrTicketPoolName() {
        return this.xrTicketPoolName;
    }

    public XrUserTicketPageInfo setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public XrUserTicketPageInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public XrUserTicketPageInfo setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

    public XrUserTicketPageInfo setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public XrUserTicketPageInfo setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public XrUserTicketPageInfo setXrVerificationType(String xrVerificationType) {
        this.xrVerificationType = xrVerificationType;
        return this;
    }
    public String getXrVerificationType() {
        return this.xrVerificationType;
    }

}
