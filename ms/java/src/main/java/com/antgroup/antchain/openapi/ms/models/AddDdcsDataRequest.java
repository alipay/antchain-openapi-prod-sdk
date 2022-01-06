// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddDdcsDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 属性自增长 ID
    @NameInMap("attribute_id")
    @Validation(required = true)
    public Long attributeId;

    // 需要发布的单元列表，英文逗号隔开，为空表示推送到所有单元
    @NameInMap("cells")
    public String cells;

    // 推送的属性值
    @NameInMap("data")
    public String data;

    // 系统字段：环境实例 ID
    // 
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 操作人
    @NameInMap("operator")
    public String operator;

    public static AddDdcsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDdcsDataRequest self = new AddDdcsDataRequest();
        return TeaModel.build(map, self);
    }

    public AddDdcsDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDdcsDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDdcsDataRequest setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
        return this;
    }
    public Long getAttributeId() {
        return this.attributeId;
    }

    public AddDdcsDataRequest setCells(String cells) {
        this.cells = cells;
        return this;
    }
    public String getCells() {
        return this.cells;
    }

    public AddDdcsDataRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AddDdcsDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDdcsDataRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
