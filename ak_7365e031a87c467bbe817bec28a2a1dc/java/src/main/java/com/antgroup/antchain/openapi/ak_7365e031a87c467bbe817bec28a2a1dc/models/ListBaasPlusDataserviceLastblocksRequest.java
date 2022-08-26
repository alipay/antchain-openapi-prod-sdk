// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_7365e031a87c467bbe817bec28a2a1dc.models;

import com.aliyun.tea.*;

public class ListBaasPlusDataserviceLastblocksRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链唯一性标识
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 区块个数
    @NameInMap("size")
    @Validation(required = true)
    public Long size;

    public static ListBaasPlusDataserviceLastblocksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBaasPlusDataserviceLastblocksRequest self = new ListBaasPlusDataserviceLastblocksRequest();
        return TeaModel.build(map, self);
    }

    public ListBaasPlusDataserviceLastblocksRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListBaasPlusDataserviceLastblocksRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListBaasPlusDataserviceLastblocksRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ListBaasPlusDataserviceLastblocksRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
