// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class Spm extends TeaModel {
    // resultDim
    @NameInMap("result_dim")
    public UniqueDim resultDim;

    // costDim
    @NameInMap("cost_dim")
    public UniqueDim costDim;

    // countDim
    @NameInMap("count_dim")
    public UniqueDim countDim;

    public static Spm build(java.util.Map<String, ?> map) throws Exception {
        Spm self = new Spm();
        return TeaModel.build(map, self);
    }

    public Spm setResultDim(UniqueDim resultDim) {
        this.resultDim = resultDim;
        return this;
    }
    public UniqueDim getResultDim() {
        return this.resultDim;
    }

    public Spm setCostDim(UniqueDim costDim) {
        this.costDim = costDim;
        return this;
    }
    public UniqueDim getCostDim() {
        return this.costDim;
    }

    public Spm setCountDim(UniqueDim countDim) {
        this.countDim = countDim;
        return this;
    }
    public UniqueDim getCountDim() {
        return this.countDim;
    }

}
