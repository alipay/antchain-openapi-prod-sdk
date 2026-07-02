// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateXrXrticketpoolRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 券池名称
    @NameInMap("xr_ticket_pool_name")
    @Validation(required = true)
    public String xrTicketPoolName;

    // 资源id
    @NameInMap("resource_id")
    public String resourceId;

    // 通行证有效期
    @NameInMap("valid_time")
    public String validTime;

    // 体验时长
    @NameInMap("test_time")
    public Long testTime;

    // vr设备集合
    @NameInMap("xr_apps")
    public String xrApps;

    // 券池剩余数量
    @NameInMap("surplus_count")
    public Long surplusCount;

    // 核销类型，资源id改变时必须有值
    @NameInMap("xr_verification_type")
    public String xrVerificationType;

    // 业务类型
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    public static UpdateXrXrticketpoolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateXrXrticketpoolRequest self = new UpdateXrXrticketpoolRequest();
        return TeaModel.build(map, self);
    }

    public UpdateXrXrticketpoolRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateXrXrticketpoolRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateXrXrticketpoolRequest setXrTicketPoolName(String xrTicketPoolName) {
        this.xrTicketPoolName = xrTicketPoolName;
        return this;
    }
    public String getXrTicketPoolName() {
        return this.xrTicketPoolName;
    }

    public UpdateXrXrticketpoolRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public UpdateXrXrticketpoolRequest setValidTime(String validTime) {
        this.validTime = validTime;
        return this;
    }
    public String getValidTime() {
        return this.validTime;
    }

    public UpdateXrXrticketpoolRequest setTestTime(Long testTime) {
        this.testTime = testTime;
        return this;
    }
    public Long getTestTime() {
        return this.testTime;
    }

    public UpdateXrXrticketpoolRequest setXrApps(String xrApps) {
        this.xrApps = xrApps;
        return this;
    }
    public String getXrApps() {
        return this.xrApps;
    }

    public UpdateXrXrticketpoolRequest setSurplusCount(Long surplusCount) {
        this.surplusCount = surplusCount;
        return this;
    }
    public Long getSurplusCount() {
        return this.surplusCount;
    }

    public UpdateXrXrticketpoolRequest setXrVerificationType(String xrVerificationType) {
        this.xrVerificationType = xrVerificationType;
        return this;
    }
    public String getXrVerificationType() {
        return this.xrVerificationType;
    }

    public UpdateXrXrticketpoolRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

}
