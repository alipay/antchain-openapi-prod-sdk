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

    // 授权token
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    // 请求唯一ID（UUID生成即可）
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 系统
    @NameInMap("os")
    public String os;

    // 标签库组合：
    // 1表示基础标签
    // 2表示行业标签
    // 3表示基础标签+行业标签
    // 8表示自定义标签
    // 9表示基础标签+自定义标签
    // 10表示行业标签+自定义标签
    // 11表示基础标签+行业标签+自定义标签
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 设备信息
    @NameInMap("device_info_list")
    @Validation(required = true)
    public DeviceBean deviceInfoList;

    // 基础标签动态参数（对外编码）
    @NameInMap("base_tags")
    public java.util.List<String> baseTags;

    // 行业标签动态参数（对外编码）
    @NameInMap("industy_tags")
    public java.util.List<String> industyTags;

    // 规则标签动态参数（对外编码）
    @NameInMap("business_tags")
    public java.util.List<String> businessTags;

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

    public QueryTagChanganRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
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

    public QueryTagChanganRequest setBaseTags(java.util.List<String> baseTags) {
        this.baseTags = baseTags;
        return this;
    }
    public java.util.List<String> getBaseTags() {
        return this.baseTags;
    }

    public QueryTagChanganRequest setIndustyTags(java.util.List<String> industyTags) {
        this.industyTags = industyTags;
        return this;
    }
    public java.util.List<String> getIndustyTags() {
        return this.industyTags;
    }

    public QueryTagChanganRequest setBusinessTags(java.util.List<String> businessTags) {
        this.businessTags = businessTags;
        return this;
    }
    public java.util.List<String> getBusinessTags() {
        return this.businessTags;
    }

}
