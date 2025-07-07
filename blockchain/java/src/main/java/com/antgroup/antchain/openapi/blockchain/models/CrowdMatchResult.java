// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CrowdMatchResult extends TeaModel {
    // 人群匹配结果
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("match")
    @Validation(required = true)
    public Boolean match;

    public static CrowdMatchResult build(java.util.Map<String, ?> map) throws Exception {
        CrowdMatchResult self = new CrowdMatchResult();
        return TeaModel.build(map, self);
    }

    public CrowdMatchResult setMatch(Boolean match) {
        this.match = match;
        return this;
    }
    public Boolean getMatch() {
        return this.match;
    }

}
