// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class MatchResult extends TeaModel {
    // 是否匹配
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("match")
    @Validation(required = true)
    public Boolean match;

    public static MatchResult build(java.util.Map<String, ?> map) throws Exception {
        MatchResult self = new MatchResult();
        return TeaModel.build(map, self);
    }

    public MatchResult setMatch(Boolean match) {
        this.match = match;
        return this;
    }
    public Boolean getMatch() {
        return this.match;
    }

}
