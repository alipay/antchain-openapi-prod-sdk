// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RdaasTaxDecsionService extends TeaModel {
    // 决策服务id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 产品编码
    /**
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("service_name")
    @Validation(required = true)
    public String serviceName;

    // 区域编码
    /**
     * <strong>example:</strong>
     * <p>SJ_ALL</p>
     */
    @NameInMap("service_zone")
    public String serviceZone;

    // 渠道
    /**
     * <strong>example:</strong>
     * <p>HZSZKJ</p>
     */
    @NameInMap("channel")
    public String channel;

    // 决策租户
    /**
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("decision_tenant")
    public String decisionTenant;

    // 是否启用
    /**
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("status")
    public String status;

    // 创建时间，格式:yyyy-MM-dd HH:mm:ss
    /**
     * <strong>example:</strong>
     * <p>创建时间，格式:yyyy-MM-dd HH:mm:ss</p>
     */
    @NameInMap("create_time")
    public String createTime;

    public static RdaasTaxDecsionService build(java.util.Map<String, ?> map) throws Exception {
        RdaasTaxDecsionService self = new RdaasTaxDecsionService();
        return TeaModel.build(map, self);
    }

    public RdaasTaxDecsionService setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RdaasTaxDecsionService setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public RdaasTaxDecsionService setServiceZone(String serviceZone) {
        this.serviceZone = serviceZone;
        return this;
    }
    public String getServiceZone() {
        return this.serviceZone;
    }

    public RdaasTaxDecsionService setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public RdaasTaxDecsionService setDecisionTenant(String decisionTenant) {
        this.decisionTenant = decisionTenant;
        return this;
    }
    public String getDecisionTenant() {
        return this.decisionTenant;
    }

    public RdaasTaxDecsionService setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RdaasTaxDecsionService setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

}
