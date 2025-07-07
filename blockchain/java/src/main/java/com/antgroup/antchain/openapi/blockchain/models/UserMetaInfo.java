// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UserMetaInfo extends TeaModel {
    // 用户身份信息类型
    /**
     * <strong>example:</strong>
     * <p>TwoMeta</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 用户身份信息
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<KeyValuePair> data;

    public static UserMetaInfo build(java.util.Map<String, ?> map) throws Exception {
        UserMetaInfo self = new UserMetaInfo();
        return TeaModel.build(map, self);
    }

    public UserMetaInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UserMetaInfo setData(java.util.List<KeyValuePair> data) {
        this.data = data;
        return this;
    }
    public java.util.List<KeyValuePair> getData() {
        return this.data;
    }

}
