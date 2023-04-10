// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class CreateSpaceInput extends TeaModel {
    //  
    @NameInMap("network_id")
    @Validation(required = true)
    public String networkId;

    //  
    @NameInMap("space_id")
    @Validation(required = true)
    public String spaceId;

    public static CreateSpaceInput build(java.util.Map<String, ?> map) throws Exception {
        CreateSpaceInput self = new CreateSpaceInput();
        return TeaModel.build(map, self);
    }

    public CreateSpaceInput setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public CreateSpaceInput setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
