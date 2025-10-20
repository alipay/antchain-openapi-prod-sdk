// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class BatchResult extends TeaModel {
    // 业务号
    /**
     * <strong>example:</strong>
     * <p>业务号</p>
     */
    @NameInMap("biz_no")
    @Validation(required = true, maxLength = 64)
    public String bizNo;

    // 业务号类型
    /**
     * <strong>example:</strong>
     * <p>PHONE_SHA1</p>
     */
    @NameInMap("biz_no_type")
    @Validation(required = true, maxLength = 32)
    public String bizNoType;

    // 结果
    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("result")
    @Validation(required = true)
    public String result;

    public static BatchResult build(java.util.Map<String, ?> map) throws Exception {
        BatchResult self = new BatchResult();
        return TeaModel.build(map, self);
    }

    public BatchResult setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public BatchResult setBizNoType(String bizNoType) {
        this.bizNoType = bizNoType;
        return this;
    }
    public String getBizNoType() {
        return this.bizNoType;
    }

    public BatchResult setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
