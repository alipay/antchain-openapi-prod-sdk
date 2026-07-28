// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mscene.models;

import com.aliyun.tea.*;

public class MpaasSaveOrderRelationResponse extends TeaModel {
    // 是否成功
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static MpaasSaveOrderRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        MpaasSaveOrderRelationResponse self = new MpaasSaveOrderRelationResponse();
        return TeaModel.build(map, self);
    }

    public MpaasSaveOrderRelationResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
