// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class CreateAutotestopsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 环境id
    @NameInMap("env_id")
    public String envId;

    // 测试单名字
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 需要测试的产品
    @NameInMap("products")
    @Validation(required = true)
    public java.util.List<AutoTestProduct> products;

    // 单元的id
    @NameInMap("cell_id")
    @Validation(required = true)
    public String cellId;

    // 如果未设置，默认返回NORMAL_JOB，NORMAL_JOB：通用一次任务；HAS_JOB：巡检一次任务
    // 
    // 
    @NameInMap("auto_test_type")
    public String autoTestType;

    public static CreateAutotestopsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutotestopsRequest self = new CreateAutotestopsRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutotestopsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAutotestopsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAutotestopsRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public CreateAutotestopsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAutotestopsRequest setProducts(java.util.List<AutoTestProduct> products) {
        this.products = products;
        return this;
    }
    public java.util.List<AutoTestProduct> getProducts() {
        return this.products;
    }

    public CreateAutotestopsRequest setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

    public CreateAutotestopsRequest setAutoTestType(String autoTestType) {
        this.autoTestType = autoTestType;
        return this;
    }
    public String getAutoTestType() {
        return this.autoTestType;
    }

}
