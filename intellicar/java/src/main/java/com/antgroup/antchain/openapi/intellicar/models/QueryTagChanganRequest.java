// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryTagChanganRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 请求唯一ID（UUID生成即可）
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 系统
    @NameInMap("os")
    public String os;

    // 1表示定制标签查询
    // 2表示标准标签查询
    // 3表示全量标签查询
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 设备信息
    @NameInMap("device_info_list")
    @Validation(required = true)
    public DeviceBean deviceInfoList;

    public static QueryTagChanganRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTagChanganRequest self = new QueryTagChanganRequest();
        return TeaModel.build(map, self);
    }

    public QueryTagChanganRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTagChanganRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTagChanganRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryTagChanganRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTagChanganRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public QueryTagChanganRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public QueryTagChanganRequest setDeviceInfoList(DeviceBean deviceInfoList) {
        this.deviceInfoList = deviceInfoList;
        return this;
    }
    public DeviceBean getDeviceInfoList() {
        return this.deviceInfoList;
    }

}
