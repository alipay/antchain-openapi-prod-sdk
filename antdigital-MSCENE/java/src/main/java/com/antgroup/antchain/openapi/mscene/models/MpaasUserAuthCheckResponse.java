// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mscene.models;

import com.aliyun.tea.*;

public class MpaasUserAuthCheckResponse extends TeaModel {
    // 用户身份是否匹配
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("matched")
    public Boolean matched;

    public static MpaasUserAuthCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        MpaasUserAuthCheckResponse self = new MpaasUserAuthCheckResponse();
        return TeaModel.build(map, self);
    }

    public MpaasUserAuthCheckResponse setMatched(Boolean matched) {
        this.matched = matched;
        return this;
    }
    public Boolean getMatched() {
        return this.matched;
    }

}
