// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateSgFaulttoleranceruleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // app名称
    @NameInMap("app_name")
    public String appName;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 规则名称
    @NameInMap("name")
    public String name;

    // 具体规则项 {"appName":"testApp","name":"test23","ruleItemList":[{"conditions":[{"type":"system","field":"targetApp","operation":"IN","value":["A"]}],"configs":{"timeWindow":10,"leastWindowCount":100,"maxIpCount":3,"exceptionRateMultiple":3,"leastExceptionRate":10,"exceptionTypes":["500"]},"actions":[{"type":"DOWNGRADE"}]}]}
    @NameInMap("rule_item_list")
    @Validation(required = true)
    public String ruleItemList;

    // 取值client,server二选1，默认是client
    @NameInMap("direction")
    public String direction;

    public static UpdateSgFaulttoleranceruleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSgFaulttoleranceruleRequest self = new UpdateSgFaulttoleranceruleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSgFaulttoleranceruleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSgFaulttoleranceruleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSgFaulttoleranceruleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSgFaulttoleranceruleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateSgFaulttoleranceruleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSgFaulttoleranceruleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSgFaulttoleranceruleRequest setRuleItemList(String ruleItemList) {
        this.ruleItemList = ruleItemList;
        return this;
    }
    public String getRuleItemList() {
        return this.ruleItemList;
    }

    public UpdateSgFaulttoleranceruleRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

}
