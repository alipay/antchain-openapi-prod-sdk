// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ResetJobOffsetRequest extends TeaModel {
    // 时间戳(单位为s)
    @NameInMap("timestamp")
    public Long timestamp;

    public static ResetJobOffsetRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetJobOffsetRequest self = new ResetJobOffsetRequest();
        return TeaModel.build(map, self);
    }

    public ResetJobOffsetRequest setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
