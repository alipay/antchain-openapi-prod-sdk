// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class MarriageCheckEvaluationFacade extends TeaModel {
    // 婚姻状况查验结果
    @NameInMap("check_result")
    @Validation(required = true)
    public String checkResult;

    public static MarriageCheckEvaluationFacade build(java.util.Map<String, ?> map) throws Exception {
        MarriageCheckEvaluationFacade self = new MarriageCheckEvaluationFacade();
        return TeaModel.build(map, self);
    }

    public MarriageCheckEvaluationFacade setCheckResult(String checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public String getCheckResult() {
        return this.checkResult;
    }

}
