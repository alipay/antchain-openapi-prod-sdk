// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BatchQueryResult extends TeaModel {
    // 查询主体
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("query_key")
    @Validation(required = true)
    public String queryKey;

    // 单用户决策结果
    /**
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("decision")
    @Validation(required = true)
    public String decision;

    // 输出变量信息
    @NameInMap("output_info")
    @Validation(required = true)
    public BatchQueryOutputModelInfo outputInfo;

    public static BatchQueryResult build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryResult self = new BatchQueryResult();
        return TeaModel.build(map, self);
    }

    public BatchQueryResult setQueryKey(String queryKey) {
        this.queryKey = queryKey;
        return this;
    }
    public String getQueryKey() {
        return this.queryKey;
    }

    public BatchQueryResult setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

    public BatchQueryResult setOutputInfo(BatchQueryOutputModelInfo outputInfo) {
        this.outputInfo = outputInfo;
        return this;
    }
    public BatchQueryOutputModelInfo getOutputInfo() {
        return this.outputInfo;
    }

}
