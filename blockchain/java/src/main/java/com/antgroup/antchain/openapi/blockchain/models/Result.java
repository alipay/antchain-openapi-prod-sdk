// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class Result extends TeaModel {
    // 联盟id
    /**
     * <strong>example:</strong>
     * <p>00001</p>
     */
    @NameInMap("consortium_id")
    @Validation(required = true)
    public String consortiumId;

    public static Result build(java.util.Map<String, ?> map) throws Exception {
        Result self = new Result();
        return TeaModel.build(map, self);
    }

    public Result setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

}
