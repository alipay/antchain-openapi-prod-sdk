// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunDeleteResource extends TeaModel {
    // data
    /**
     * <strong>example:</strong>
     * <p>data</p>
     */
    @NameInMap("data")
    public Boolean data;

    // success
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ALiYunDeleteResource build(java.util.Map<String, ?> map) throws Exception {
        ALiYunDeleteResource self = new ALiYunDeleteResource();
        return TeaModel.build(map, self);
    }

    public ALiYunDeleteResource setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ALiYunDeleteResource setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
