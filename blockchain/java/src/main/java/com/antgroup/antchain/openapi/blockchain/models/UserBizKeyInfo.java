// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UserBizKeyInfo extends TeaModel {
    // 拥有该密钥的用户列表
    /**
     * <strong>example:</strong>
     * <p>CZKZJVCN</p>
     */
    @NameInMap("granted_user")
    @Validation(required = true)
    public java.util.List<String> grantedUser;

    // 密钥名称
    /**
     * <strong>example:</strong>
     * <p>subunion_a_key</p>
     */
    @NameInMap("key_name")
    @Validation(required = true)
    public String keyName;

    public static UserBizKeyInfo build(java.util.Map<String, ?> map) throws Exception {
        UserBizKeyInfo self = new UserBizKeyInfo();
        return TeaModel.build(map, self);
    }

    public UserBizKeyInfo setGrantedUser(java.util.List<String> grantedUser) {
        this.grantedUser = grantedUser;
        return this;
    }
    public java.util.List<String> getGrantedUser() {
        return this.grantedUser;
    }

    public UserBizKeyInfo setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

}
