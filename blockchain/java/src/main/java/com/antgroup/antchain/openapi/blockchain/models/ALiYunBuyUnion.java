// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunBuyUnion extends TeaModel {
    // consortium_name
    /**
     * <strong>example:</strong>
     * <p>consortium_name</p>
     */
    @NameInMap("consortium_name")
    public String consortiumName;

    // consortium_id
    /**
     * <strong>example:</strong>
     * <p>consortium_id</p>
     */
    @NameInMap("consortium_id")
    public String consortiumId;

    public static ALiYunBuyUnion build(java.util.Map<String, ?> map) throws Exception {
        ALiYunBuyUnion self = new ALiYunBuyUnion();
        return TeaModel.build(map, self);
    }

    public ALiYunBuyUnion setConsortiumName(String consortiumName) {
        this.consortiumName = consortiumName;
        return this;
    }
    public String getConsortiumName() {
        return this.consortiumName;
    }

    public ALiYunBuyUnion setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

}
