// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListDataauthorizationAuthorityCertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权凭证ID列表
    @NameInMap("authority_cert_ids")
    @Validation(required = true)
    public java.util.List<String> authorityCertIds;

    public static ListDataauthorizationAuthorityCertRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataauthorizationAuthorityCertRequest self = new ListDataauthorizationAuthorityCertRequest();
        return TeaModel.build(map, self);
    }

    public ListDataauthorizationAuthorityCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListDataauthorizationAuthorityCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListDataauthorizationAuthorityCertRequest setAuthorityCertIds(java.util.List<String> authorityCertIds) {
        this.authorityCertIds = authorityCertIds;
        return this;
    }
    public java.util.List<String> getAuthorityCertIds() {
        return this.authorityCertIds;
    }

}
