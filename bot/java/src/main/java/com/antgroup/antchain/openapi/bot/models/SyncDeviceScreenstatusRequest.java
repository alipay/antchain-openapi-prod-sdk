// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SyncDeviceScreenstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 所属业务
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 设备did
    @NameInMap("device_did")
    @Validation(required = true)
    public String deviceDid;

    // 设备屏幕状态
    @NameInMap("device_screen_status")
    @Validation(required = true)
    public String deviceScreenStatus;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 状态改变时间
    @NameInMap("status_change_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String statusChangeTime;

    public static SyncDeviceScreenstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncDeviceScreenstatusRequest self = new SyncDeviceScreenstatusRequest();
        return TeaModel.build(map, self);
    }

    public SyncDeviceScreenstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncDeviceScreenstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncDeviceScreenstatusRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public SyncDeviceScreenstatusRequest setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public SyncDeviceScreenstatusRequest setDeviceScreenStatus(String deviceScreenStatus) {
        this.deviceScreenStatus = deviceScreenStatus;
        return this;
    }
    public String getDeviceScreenStatus() {
        return this.deviceScreenStatus;
    }

    public SyncDeviceScreenstatusRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SyncDeviceScreenstatusRequest setStatusChangeTime(String statusChangeTime) {
        this.statusChangeTime = statusChangeTime;
        return this;
    }
    public String getStatusChangeTime() {
        return this.statusChangeTime;
    }

}
