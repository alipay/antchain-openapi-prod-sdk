// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BatchcreateAccountMappingInfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批量上传的用户信息
    @NameInMap("list")
    @Validation(required = true)
    public java.util.List<AccountInfoWithBiz> list;

    public static BatchcreateAccountMappingInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateAccountMappingInfoRequest self = new BatchcreateAccountMappingInfoRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateAccountMappingInfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateAccountMappingInfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateAccountMappingInfoRequest setList(java.util.List<AccountInfoWithBiz> list) {
        this.list = list;
        return this;
    }
    public java.util.List<AccountInfoWithBiz> getList() {
        return this.list;
    }

}
