// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class NotaryMetaParam extends TeaModel {
    // 描述本条存证在存证事务中的阶段，用户可自行维护
    @NameInMap("phase")
    @Validation(required = true)
    public String phase;

    // 扩展字段
    @NameInMap("properties")
    public String properties;

    // 全局唯一的存证事务ID
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    public static NotaryMetaParam build(java.util.Map<String, ?> map) throws Exception {
        NotaryMetaParam self = new NotaryMetaParam();
        return TeaModel.build(map, self);
    }

    public NotaryMetaParam setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public NotaryMetaParam setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public NotaryMetaParam setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
