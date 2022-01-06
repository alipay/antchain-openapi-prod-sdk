// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddDdcsGraydataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 属性自增长 ID，可以通过查询属性接口获取 ID
    @NameInMap("attribute_id")
    @Validation(required = true)
    public Long attributeId;

    // 属性推送值
    @NameInMap("data")
    public String data;

    // 灰度推送的机器列表，多个 IP 之间英文逗号隔开
    @NameInMap("hosts")
    @Validation(required = true)
    public String hosts;

    // 系统字段：环境实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 操作人
    @NameInMap("operator")
    public String operator;

    public static AddDdcsGraydataRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDdcsGraydataRequest self = new AddDdcsGraydataRequest();
        return TeaModel.build(map, self);
    }

    public AddDdcsGraydataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDdcsGraydataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDdcsGraydataRequest setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
        return this;
    }
    public Long getAttributeId() {
        return this.attributeId;
    }

    public AddDdcsGraydataRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AddDdcsGraydataRequest setHosts(String hosts) {
        this.hosts = hosts;
        return this;
    }
    public String getHosts() {
        return this.hosts;
    }

    public AddDdcsGraydataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDdcsGraydataRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
