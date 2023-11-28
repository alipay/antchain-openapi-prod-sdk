// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_34265723f40d4064802e0e2ffb558d46.models;

import com.aliyun.tea.*;

public class ListUniversalsaasDigitalhumanLiveVideoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // bUC_Weh3
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 蚂蚁数字人平台直播id
    @NameInMap("live_id")
    @Validation(required = true)
    public String liveId;

    // all全部、normal常规、temporary临时插播
    @NameInMap("video_type")
    @Validation(required = true)
    public String videoType;

    // 业务标识
    @NameInMap("biz_name")
    public String bizName;

    public static ListUniversalsaasDigitalhumanLiveVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUniversalsaasDigitalhumanLiveVideoRequest self = new ListUniversalsaasDigitalhumanLiveVideoRequest();
        return TeaModel.build(map, self);
    }

    public ListUniversalsaasDigitalhumanLiveVideoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListUniversalsaasDigitalhumanLiveVideoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListUniversalsaasDigitalhumanLiveVideoRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public ListUniversalsaasDigitalhumanLiveVideoRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public ListUniversalsaasDigitalhumanLiveVideoRequest setVideoType(String videoType) {
        this.videoType = videoType;
        return this;
    }
    public String getVideoType() {
        return this.videoType;
    }

    public ListUniversalsaasDigitalhumanLiveVideoRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

}
