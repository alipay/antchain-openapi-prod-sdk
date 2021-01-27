// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class StsActorBinding extends TeaModel {
    // 虚拟身份ID
    @NameInMap("actor_id")
    public String actorId;

    // 受信对象ID
    @NameInMap("bind_id")
    public String bindId;

    // 虚拟身份受信类型，可以为TENANT或者ALIYUN_SERVICE
    @NameInMap("bind_type")
    public String bindType;

    public static StsActorBinding build(java.util.Map<String, ?> map) throws Exception {
        StsActorBinding self = new StsActorBinding();
        return TeaModel.build(map, self);
    }

    public StsActorBinding setActorId(String actorId) {
        this.actorId = actorId;
        return this;
    }
    public String getActorId() {
        return this.actorId;
    }

    public StsActorBinding setBindId(String bindId) {
        this.bindId = bindId;
        return this;
    }
    public String getBindId() {
        return this.bindId;
    }

    public StsActorBinding setBindType(String bindType) {
        this.bindType = bindType;
        return this;
    }
    public String getBindType() {
        return this.bindType;
    }

}
