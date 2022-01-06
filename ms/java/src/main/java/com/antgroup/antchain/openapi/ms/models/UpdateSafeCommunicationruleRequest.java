// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class UpdateSafeCommunicationruleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 规则名称
    @NameInMap("name")
    public String name;

    // 取值(0-客户端,1-服务端)
    @NameInMap("direction")
    public Long direction;

    // 模式(0-tls,1-mtls)
    @NameInMap("mode")
    public Long mode;

    // 策略(0-普通,1-国密)
    @NameInMap("strategy")
    public String strategy;

    // 分类(0-应用,1-标签)
    @NameInMap("scope")
    public Long scope;

    // [{"key":"aa","value":"bb","type":1}]
    @NameInMap("labels")
    public String labels;

    public static UpdateSafeCommunicationruleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSafeCommunicationruleRequest self = new UpdateSafeCommunicationruleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSafeCommunicationruleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSafeCommunicationruleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSafeCommunicationruleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSafeCommunicationruleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSafeCommunicationruleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSafeCommunicationruleRequest setDirection(Long direction) {
        this.direction = direction;
        return this;
    }
    public Long getDirection() {
        return this.direction;
    }

    public UpdateSafeCommunicationruleRequest setMode(Long mode) {
        this.mode = mode;
        return this;
    }
    public Long getMode() {
        return this.mode;
    }

    public UpdateSafeCommunicationruleRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public UpdateSafeCommunicationruleRequest setScope(Long scope) {
        this.scope = scope;
        return this;
    }
    public Long getScope() {
        return this.scope;
    }

    public UpdateSafeCommunicationruleRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

}
