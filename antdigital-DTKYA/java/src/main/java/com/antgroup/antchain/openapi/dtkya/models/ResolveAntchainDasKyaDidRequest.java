// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class ResolveAntchainDasKyaDidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // did标识
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 版本号
    @NameInMap("version_id")
    public String versionId;

    public static ResolveAntchainDasKyaDidRequest build(java.util.Map<String, ?> map) throws Exception {
        ResolveAntchainDasKyaDidRequest self = new ResolveAntchainDasKyaDidRequest();
        return TeaModel.build(map, self);
    }

    public ResolveAntchainDasKyaDidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResolveAntchainDasKyaDidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ResolveAntchainDasKyaDidRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public ResolveAntchainDasKyaDidRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
