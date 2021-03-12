// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateChainPublicCertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // bizid
    @NameInMap("bizid")
    public String bizid;

    // consortium_id
    @NameInMap("consortium_id")
    public String consortiumId;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    // upload_req
    @NameInMap("upload_req")
    public String uploadReq;

    public static CreateChainPublicCertRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChainPublicCertRequest self = new CreateChainPublicCertRequest();
        return TeaModel.build(map, self);
    }

    public CreateChainPublicCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateChainPublicCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateChainPublicCertRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public CreateChainPublicCertRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public CreateChainPublicCertRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateChainPublicCertRequest setUploadReq(String uploadReq) {
        this.uploadReq = uploadReq;
        return this;
    }
    public String getUploadReq() {
        return this.uploadReq;
    }

}
