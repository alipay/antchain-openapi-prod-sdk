// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RdaasTaxDecsionServiceIndicator extends TeaModel {
    // 决策指标id
    /**
     * <strong>example:</strong>
     * <p>决策指标id</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 决策服务id
    /**
     * <strong>example:</strong>
     * <p>700002</p>
     */
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 属性名
    /**
     * <strong>example:</strong>
     * <p>weight</p>
     */
    @NameInMap("property_name")
    @Validation(required = true)
    public String propertyName;

    // 属性值或指标值
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("property_value")
    public String propertyValue;

    // 决策租户
    /**
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("decision_tenant")
    public String decisionTenant;

    // 创建时间，格式:yyyy-MM-dd HH:mm:ss
    /**
     * <strong>example:</strong>
     * <p>创建时间，格式:yyyy-MM-dd HH:mm:ss</p>
     */
    @NameInMap("create_time")
    public String createTime;

    public static RdaasTaxDecsionServiceIndicator build(java.util.Map<String, ?> map) throws Exception {
        RdaasTaxDecsionServiceIndicator self = new RdaasTaxDecsionServiceIndicator();
        return TeaModel.build(map, self);
    }

    public RdaasTaxDecsionServiceIndicator setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RdaasTaxDecsionServiceIndicator setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public RdaasTaxDecsionServiceIndicator setPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }
    public String getPropertyName() {
        return this.propertyName;
    }

    public RdaasTaxDecsionServiceIndicator setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
        return this;
    }
    public String getPropertyValue() {
        return this.propertyValue;
    }

    public RdaasTaxDecsionServiceIndicator setDecisionTenant(String decisionTenant) {
        this.decisionTenant = decisionTenant;
        return this;
    }
    public String getDecisionTenant() {
        return this.decisionTenant;
    }

    public RdaasTaxDecsionServiceIndicator setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

}
