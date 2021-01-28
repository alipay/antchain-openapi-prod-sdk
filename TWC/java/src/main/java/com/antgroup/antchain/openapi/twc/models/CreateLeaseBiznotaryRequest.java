// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseBiznotaryRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 要存证的文件哈希
    @NameInMap("hash")
    @Validation(required = true)
    public String hash;

    // 租赁机构社会统一信用码
    @NameInMap("lease_corp_id")
    @Validation(required = true)
    public String leaseCorpId;

    // 租赁机构公司名称
    @NameInMap("lease_corp_name")
    @Validation(required = true)
    public String leaseCorpName;

    // 租赁机构法人姓名
    @NameInMap("lease_corp_owner_name")
    @Validation(required = true)
    public String leaseCorpOwnerName;

    public static CreateLeaseBiznotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseBiznotaryRequest self = new CreateLeaseBiznotaryRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseBiznotaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseBiznotaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseBiznotaryRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public CreateLeaseBiznotaryRequest setLeaseCorpId(String leaseCorpId) {
        this.leaseCorpId = leaseCorpId;
        return this;
    }
    public String getLeaseCorpId() {
        return this.leaseCorpId;
    }

    public CreateLeaseBiznotaryRequest setLeaseCorpName(String leaseCorpName) {
        this.leaseCorpName = leaseCorpName;
        return this;
    }
    public String getLeaseCorpName() {
        return this.leaseCorpName;
    }

    public CreateLeaseBiznotaryRequest setLeaseCorpOwnerName(String leaseCorpOwnerName) {
        this.leaseCorpOwnerName = leaseCorpOwnerName;
        return this;
    }
    public String getLeaseCorpOwnerName() {
        return this.leaseCorpOwnerName;
    }

}
