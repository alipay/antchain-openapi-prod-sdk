// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class XrTicketPoolFailList extends TeaModel {
    // 券名称
    /**
     * <strong>example:</strong>
     * <p>券名称</p>
     */
    @NameInMap("xr_ticket_pool_name")
    @Validation(required = true)
    public String xrTicketPoolName;

    // 资源id
    /**
     * <strong>example:</strong>
     * <p>资源id</p>
     */
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // 错误码
    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("error_code")
    @Validation(required = true)
    public String errorCode;

    // 租户id
    /**
     * <strong>example:</strong>
     * <p>租户id</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 错误信息
    /**
     * <strong>example:</strong>
     * <p>错误信息</p>
     */
    @NameInMap("error_msg")
    @Validation(required = true)
    public String errorMsg;

    // 核销类型
    /**
     * <strong>example:</strong>
     * <p>XR_DEVICE</p>
     */
    @NameInMap("xr_verification_type")
    @Validation(required = true)
    public String xrVerificationType;

    public static XrTicketPoolFailList build(java.util.Map<String, ?> map) throws Exception {
        XrTicketPoolFailList self = new XrTicketPoolFailList();
        return TeaModel.build(map, self);
    }

    public XrTicketPoolFailList setXrTicketPoolName(String xrTicketPoolName) {
        this.xrTicketPoolName = xrTicketPoolName;
        return this;
    }
    public String getXrTicketPoolName() {
        return this.xrTicketPoolName;
    }

    public XrTicketPoolFailList setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public XrTicketPoolFailList setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public XrTicketPoolFailList setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public XrTicketPoolFailList setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public XrTicketPoolFailList setXrVerificationType(String xrVerificationType) {
        this.xrVerificationType = xrVerificationType;
        return this;
    }
    public String getXrVerificationType() {
        return this.xrVerificationType;
    }

}
