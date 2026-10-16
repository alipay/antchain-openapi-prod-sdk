// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.resolveagent.models;

import com.aliyun.tea.*;

public class ImportCommonCustomerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批次号
    @NameInMap("batch_id")
    @Validation(required = true)
    public String batchId;

    // 导入名单
    @NameInMap("list")
    @Validation(required = true)
    public java.util.List<String> list;

    public static ImportCommonCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportCommonCustomerRequest self = new ImportCommonCustomerRequest();
        return TeaModel.build(map, self);
    }

    public ImportCommonCustomerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportCommonCustomerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportCommonCustomerRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public ImportCommonCustomerRequest setList(java.util.List<String> list) {
        this.list = list;
        return this;
    }
    public java.util.List<String> getList() {
        return this.list;
    }

}
