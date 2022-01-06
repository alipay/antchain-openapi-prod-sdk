// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddSgFaulttoleranceruleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // id
    @NameInMap("id")
    public Long id;

    // app名称
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 规则名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 具体规则项
    // {"appName":"testApp","name":"test23","ruleItemList":[{"conditions":[{"type":"system","field":"targetApp","operation":"IN","value":["A"]}],"configs":{"timeWindow":10,"leastWindowCount":100,"maxIpCount":3,"exceptionRateMultiple":3,"leastExceptionRate":10,"exceptionTypes":["500"]},"actions":[{"type":"DOWNGRADE"}]}]}
    @NameInMap("rule_item_list")
    @Validation(required = true)
    public String ruleItemList;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 取值client,server二选1，默认是client
    @NameInMap("direction")
    public String direction;

    public static AddSgFaulttoleranceruleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSgFaulttoleranceruleRequest self = new AddSgFaulttoleranceruleRequest();
        return TeaModel.build(map, self);
    }

    public AddSgFaulttoleranceruleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddSgFaulttoleranceruleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddSgFaulttoleranceruleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AddSgFaulttoleranceruleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddSgFaulttoleranceruleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddSgFaulttoleranceruleRequest setRuleItemList(String ruleItemList) {
        this.ruleItemList = ruleItemList;
        return this;
    }
    public String getRuleItemList() {
        return this.ruleItemList;
    }

    public AddSgFaulttoleranceruleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddSgFaulttoleranceruleRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

}
