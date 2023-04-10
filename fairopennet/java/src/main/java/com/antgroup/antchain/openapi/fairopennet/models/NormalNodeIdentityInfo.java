// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class NormalNodeIdentityInfo extends TeaModel {
    //  
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    //  
    @NameInMap("identity_info")
    @Validation(required = true)
    public String identityInfo;

    public static NormalNodeIdentityInfo build(java.util.Map<String, ?> map) throws Exception {
        NormalNodeIdentityInfo self = new NormalNodeIdentityInfo();
        return TeaModel.build(map, self);
    }

    public NormalNodeIdentityInfo setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public NormalNodeIdentityInfo setIdentityInfo(String identityInfo) {
        this.identityInfo = identityInfo;
        return this;
    }
    public String getIdentityInfo() {
        return this.identityInfo;
    }

}
