// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class JudgeAliyunAuthorityRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 阿里云POP API名称
    @NameInMap("action")
    @Validation(required = true)
    public String action;

    // 阿里云资源描述数组
    @NameInMap("aliyun_resources")
    @Validation(required = true)
    public java.util.List<AliyunResource> aliyunResources;

    // 自定义条件
    @NameInMap("conditions")
    public java.util.List<Condition> conditions;

    // regionId
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // 阿里云POP透传参数
    @NameInMap("request_info")
    @Validation(required = true)
    public AliyunPopRequestInfo requestInfo;

    // 阿里云服务名称
    @NameInMap("service_name")
    @Validation(required = true)
    public String serviceName;

    // 0000000001
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static JudgeAliyunAuthorityRequest build(java.util.Map<String, ?> map) throws Exception {
        JudgeAliyunAuthorityRequest self = new JudgeAliyunAuthorityRequest();
        return TeaModel.build(map, self);
    }

    public JudgeAliyunAuthorityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public JudgeAliyunAuthorityRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public JudgeAliyunAuthorityRequest setAliyunResources(java.util.List<AliyunResource> aliyunResources) {
        this.aliyunResources = aliyunResources;
        return this;
    }
    public java.util.List<AliyunResource> getAliyunResources() {
        return this.aliyunResources;
    }

    public JudgeAliyunAuthorityRequest setConditions(java.util.List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<Condition> getConditions() {
        return this.conditions;
    }

    public JudgeAliyunAuthorityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public JudgeAliyunAuthorityRequest setRequestInfo(AliyunPopRequestInfo requestInfo) {
        this.requestInfo = requestInfo;
        return this;
    }
    public AliyunPopRequestInfo getRequestInfo() {
        return this.requestInfo;
    }

    public JudgeAliyunAuthorityRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public JudgeAliyunAuthorityRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
