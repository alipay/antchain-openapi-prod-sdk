// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class FailChangeFactor extends TeaModel {
    // 失败的路径值
    /**
     * <strong>example:</strong>
     * <p>base.domainCode</p>
     */
    @NameInMap("fail_key")
    @Validation(required = true)
    public String failKey;

    // 失败原因
    /**
     * <strong>example:</strong>
     * <p>失败原因</p>
     */
    @NameInMap("fail_reason")
    @Validation(required = true)
    public String failReason;

    public static FailChangeFactor build(java.util.Map<String, ?> map) throws Exception {
        FailChangeFactor self = new FailChangeFactor();
        return TeaModel.build(map, self);
    }

    public FailChangeFactor setFailKey(String failKey) {
        this.failKey = failKey;
        return this;
    }
    public String getFailKey() {
        return this.failKey;
    }

    public FailChangeFactor setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

}
