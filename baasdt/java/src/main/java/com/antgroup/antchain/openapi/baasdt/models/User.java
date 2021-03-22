// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class User extends TeaModel {
    // 用户分布式身份ID
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 用户的链外身份ID
    @NameInMap("local_id")
    @Validation(required = true)
    public String localId;

    // 用户公钥
    @NameInMap("pk")
    @Validation(required = true)
    public String pk;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户VC
    @NameInMap("vc")
    @Validation(required = true)
    public String vc;

    public static User build(java.util.Map<String, ?> map) throws Exception {
        User self = new User();
        return TeaModel.build(map, self);
    }

    public User setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public User setLocalId(String localId) {
        this.localId = localId;
        return this;
    }
    public String getLocalId() {
        return this.localId;
    }

    public User setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public User setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public User setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public User setVc(String vc) {
        this.vc = vc;
        return this;
    }
    public String getVc() {
        return this.vc;
    }

}
