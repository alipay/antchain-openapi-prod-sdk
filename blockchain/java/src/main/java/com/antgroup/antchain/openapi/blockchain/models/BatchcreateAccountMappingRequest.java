// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BatchcreateAccountMappingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待映射处理的账户信息列表
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<AccountMap> data;

    public static BatchcreateAccountMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateAccountMappingRequest self = new BatchcreateAccountMappingRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateAccountMappingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateAccountMappingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateAccountMappingRequest setData(java.util.List<AccountMap> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AccountMap> getData() {
        return this.data;
    }

}
