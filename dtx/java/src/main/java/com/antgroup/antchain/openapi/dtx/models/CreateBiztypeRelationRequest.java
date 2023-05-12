// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class CreateBiztypeRelationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 参与者名称数组
    @NameInMap("action_array")
    @Validation(required = true)
    public java.util.List<String> actionArray;

    // app
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // biztype
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 一句话描述
    @NameInMap("desc")
    @Validation(required = true)
    public String desc;

    // 00001
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // add  /  modify
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    public static CreateBiztypeRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBiztypeRelationRequest self = new CreateBiztypeRelationRequest();
        return TeaModel.build(map, self);
    }

    public CreateBiztypeRelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBiztypeRelationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBiztypeRelationRequest setActionArray(java.util.List<String> actionArray) {
        this.actionArray = actionArray;
        return this;
    }
    public java.util.List<String> getActionArray() {
        return this.actionArray;
    }

    public CreateBiztypeRelationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateBiztypeRelationRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateBiztypeRelationRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateBiztypeRelationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateBiztypeRelationRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
