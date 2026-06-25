// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.caasplatform.models;

import com.aliyun.tea.*;

public class StepDetailInfo extends TeaModel {
    // 环节编号
    /**
     * <strong>example:</strong>
     * <p>STEP_1</p>
     */
    @NameInMap("step_no")
    @Validation(required = true)
    public String stepNo;

    // 存证时的原始信息明文
    /**
     * <strong>example:</strong>
     * <p>{&quot;asda&quot;:&quot;asa&quot;}</p>
     */
    @NameInMap("meta_content")
    @Validation(required = true)
    public String metaContent;

    public static StepDetailInfo build(java.util.Map<String, ?> map) throws Exception {
        StepDetailInfo self = new StepDetailInfo();
        return TeaModel.build(map, self);
    }

    public StepDetailInfo setStepNo(String stepNo) {
        this.stepNo = stepNo;
        return this;
    }
    public String getStepNo() {
        return this.stepNo;
    }

    public StepDetailInfo setMetaContent(String metaContent) {
        this.metaContent = metaContent;
        return this;
    }
    public String getMetaContent() {
        return this.metaContent;
    }

}
