// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiotdatalink.models;

import com.aliyun.tea.*;

public class OpenApiLicenseItem extends TeaModel {
    // 仅认证租户可见，不记日志
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("license_code")
    @Validation(required = true)
    public String licenseCode;

    // 枚举:INACTIVE,ACTIVE,EXPIRED
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("activation_state")
    @Validation(required = true)
    public String activationState;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 枚举:AGENT_REQUEST
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // 枚举:QUOTA_POINT
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("unit")
    @Validation(required = true)
    public String unit;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("used")
    @Validation(required = true)
    public Long used;

    // total-used，保留负值
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("remaining")
    @Validation(required = true)
    public Long remaining;

    public static OpenApiLicenseItem build(java.util.Map<String, ?> map) throws Exception {
        OpenApiLicenseItem self = new OpenApiLicenseItem();
        return TeaModel.build(map, self);
    }

    public OpenApiLicenseItem setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
        return this;
    }
    public String getLicenseCode() {
        return this.licenseCode;
    }

    public OpenApiLicenseItem setActivationState(String activationState) {
        this.activationState = activationState;
        return this;
    }
    public String getActivationState() {
        return this.activationState;
    }

    public OpenApiLicenseItem setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public OpenApiLicenseItem setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public OpenApiLicenseItem setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public OpenApiLicenseItem setUsed(Long used) {
        this.used = used;
        return this;
    }
    public Long getUsed() {
        return this.used;
    }

    public OpenApiLicenseItem setRemaining(Long remaining) {
        this.remaining = remaining;
        return this;
    }
    public Long getRemaining() {
        return this.remaining;
    }

}
