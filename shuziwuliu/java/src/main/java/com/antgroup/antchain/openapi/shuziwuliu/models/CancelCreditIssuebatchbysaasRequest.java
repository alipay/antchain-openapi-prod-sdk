// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CancelCreditIssuebatchbysaasRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 批次号
    @NameInMap("batch_id")
    @Validation(required = true)
    public String batchId;

    // 集团平台did
    @NameInMap("group_platform_did")
    @Validation(required = true)
    public String groupPlatformDid;

    // 凭证发行方did
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 产品id
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    public static CancelCreditIssuebatchbysaasRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCreditIssuebatchbysaasRequest self = new CancelCreditIssuebatchbysaasRequest();
        return TeaModel.build(map, self);
    }

    public CancelCreditIssuebatchbysaasRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelCreditIssuebatchbysaasRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelCreditIssuebatchbysaasRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public CancelCreditIssuebatchbysaasRequest setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public CancelCreditIssuebatchbysaasRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public CancelCreditIssuebatchbysaasRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
