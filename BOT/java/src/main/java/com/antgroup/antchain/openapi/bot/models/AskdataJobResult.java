// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AskdataJobResult extends TeaModel {
    // 任务ID
    /**
     * <strong>example:</strong>
     * <p>97F385D2D8595AA4DC262C72965507</p>
     */
    @NameInMap("job_id")
    @Validation(required = true)
    public String jobId;

    // 唯一标识
    /**
     * <strong>example:</strong>
     * <p>97F385D2D8595AA4DC262C72965507</p>
     */
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    public static AskdataJobResult build(java.util.Map<String, ?> map) throws Exception {
        AskdataJobResult self = new AskdataJobResult();
        return TeaModel.build(map, self);
    }

    public AskdataJobResult setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public AskdataJobResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
