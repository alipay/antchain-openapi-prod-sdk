// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddSafeCommunicationruleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 	
    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 规则名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 取值(0-客户端,1-服务端)
    @NameInMap("direction")
    @Validation(required = true)
    public Long direction;

    // 模式(0-tls,1-mtls)
    @NameInMap("mode")
    @Validation(required = true)
    public Long mode;

    // 策略(0-普通,1-国密)
    @NameInMap("strategy")
    @Validation(required = true)
    public String strategy;

    // 分类(0-应用,1-标签)
    @NameInMap("scope")
    @Validation(required = true)
    public Long scope;

    // [{"key":"aa","value":"bb","type":1}]
    @NameInMap("labels")
    @Validation(required = true)
    public String labels;

    public static AddSafeCommunicationruleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSafeCommunicationruleRequest self = new AddSafeCommunicationruleRequest();
        return TeaModel.build(map, self);
    }

    public AddSafeCommunicationruleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddSafeCommunicationruleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddSafeCommunicationruleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddSafeCommunicationruleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddSafeCommunicationruleRequest setDirection(Long direction) {
        this.direction = direction;
        return this;
    }
    public Long getDirection() {
        return this.direction;
    }

    public AddSafeCommunicationruleRequest setMode(Long mode) {
        this.mode = mode;
        return this;
    }
    public Long getMode() {
        return this.mode;
    }

    public AddSafeCommunicationruleRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public AddSafeCommunicationruleRequest setScope(Long scope) {
        this.scope = scope;
        return this;
    }
    public Long getScope() {
        return this.scope;
    }

    public AddSafeCommunicationruleRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

}
