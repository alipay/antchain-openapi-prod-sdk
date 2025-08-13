// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class XrUserTicketDetail extends TeaModel {
    // 业务类型
    /**
     * <strong>example:</strong>
     * <p>XR_LEASE</p>
     */
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 所属客户
    /**
     * <strong>example:</strong>
     * <p>QWERTYUI</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 用户通行证编码
    /**
     * <strong>example:</strong>
     * <p>8613356</p>
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

    // 用户id
    /**
     * <strong>example:</strong>
     * <p>2088**</p>
     */
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 资源id
    /**
     * <strong>example:</strong>
     * <p>xsadds</p>
     */
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

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
     * <p>待核销</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 有效期
    /**
     * <strong>example:</strong>
     * <p>2023-03-28</p>
     */
    @NameInMap("valid_time")
    @Validation(required = true)
    public String validTime;

    // 实例id
    /**
     * <strong>example:</strong>
     * <p>86871</p>
     */
    @NameInMap("instance_id")
    public String instanceId;

    // 核销时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10 10:10:00</p>
     */
    @NameInMap("xr_verification_time")
    public String xrVerificationTime;

    // 体验开始时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10 10:10:00</p>
     */
    @NameInMap("sample_start_time")
    public String sampleStartTime;

    // 体验结束时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10 10:10:00</p>
     */
    @NameInMap("sample_end_time")
    public String sampleEndTime;

    // 核销类型
    /**
     * <strong>example:</strong>
     * <p>XR_DEVICE</p>
     */
    @NameInMap("xr_verification_type")
    @Validation(required = true)
    public String xrVerificationType;

    // 实例名称
    /**
     * <strong>example:</strong>
     * <p>实例001</p>
     */
    @NameInMap("instance_name")
    public String instanceName;

    // 体验时长，分
    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("test_time")
    @Validation(required = true)
    public Long testTime;

    // vr应用集合
    /**
     * <strong>example:</strong>
     * <p>vr应用集合</p>
     */
    @NameInMap("xr_apps")
    public String xrApps;

    public static XrUserTicketDetail build(java.util.Map<String, ?> map) throws Exception {
        XrUserTicketDetail self = new XrUserTicketDetail();
        return TeaModel.build(map, self);
    }

    public XrUserTicketDetail setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public XrUserTicketDetail setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public XrUserTicketDetail setXrTicketCode(String xrTicketCode) {
        this.xrTicketCode = xrTicketCode;
        return this;
    }
    public String getXrTicketCode() {
        return this.xrTicketCode;
    }

    public XrUserTicketDetail setXrTicketPoolName(String xrTicketPoolName) {
        this.xrTicketPoolName = xrTicketPoolName;
        return this;
    }
    public String getXrTicketPoolName() {
        return this.xrTicketPoolName;
    }

    public XrUserTicketDetail setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public XrUserTicketDetail setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public XrUserTicketDetail setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public XrUserTicketDetail setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public XrUserTicketDetail setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

    public XrUserTicketDetail setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public XrUserTicketDetail setXrVerificationTime(String xrVerificationTime) {
        this.xrVerificationTime = xrVerificationTime;
        return this;
    }
    public String getXrVerificationTime() {
        return this.xrVerificationTime;
    }

    public XrUserTicketDetail setSampleStartTime(String sampleStartTime) {
        this.sampleStartTime = sampleStartTime;
        return this;
    }
    public String getSampleStartTime() {
        return this.sampleStartTime;
    }

    public XrUserTicketDetail setSampleEndTime(String sampleEndTime) {
        this.sampleEndTime = sampleEndTime;
        return this;
    }
    public String getSampleEndTime() {
        return this.sampleEndTime;
    }

    public XrUserTicketDetail setXrVerificationType(String xrVerificationType) {
        this.xrVerificationType = xrVerificationType;
        return this;
    }
    public String getXrVerificationType() {
        return this.xrVerificationType;
    }

    public XrUserTicketDetail setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public XrUserTicketDetail setTestTime(Long testTime) {
        this.testTime = testTime;
        return this;
    }
    public Long getTestTime() {
        return this.testTime;
    }

    public XrUserTicketDetail setXrApps(String xrApps) {
        this.xrApps = xrApps;
        return this;
    }
    public String getXrApps() {
        return this.xrApps;
    }

}
