// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SyncFourwheelerCareventRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 注册到蚂蚁IoT返回的唯一ID
    // 注：deviceDid有值时，deviceSn 和 cordeviceCorp 可以为空
    @NameInMap("device_did")
    public String deviceDid;

    // 设备序列号
    // 注:当deviceSn 和 cordeviceCorp有值时，deviceDid 可以为空。
    @NameInMap("device_sn")
    public String deviceSn;

    // 设备厂商
    // 注:当deviceSn 和 cordeviceCorp有值时，deviceDid 可以为空。
    @NameInMap("device_corp")
    public String deviceCorp;

    // 车辆事件集合
    @NameInMap("items")
    @Validation(required = true)
    public java.util.List<FourWheelerCarEvent> items;

    public static SyncFourwheelerCareventRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncFourwheelerCareventRequest self = new SyncFourwheelerCareventRequest();
        return TeaModel.build(map, self);
    }

    public SyncFourwheelerCareventRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncFourwheelerCareventRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncFourwheelerCareventRequest setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public SyncFourwheelerCareventRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public SyncFourwheelerCareventRequest setDeviceCorp(String deviceCorp) {
        this.deviceCorp = deviceCorp;
        return this;
    }
    public String getDeviceCorp() {
        return this.deviceCorp;
    }

    public SyncFourwheelerCareventRequest setItems(java.util.List<FourWheelerCarEvent> items) {
        this.items = items;
        return this;
    }
    public java.util.List<FourWheelerCarEvent> getItems() {
        return this.items;
    }

}
