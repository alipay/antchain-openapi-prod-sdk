// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RiskStormLabelResp extends TeaModel {
    // 标签次数
    @NameInMap("label_count")
    @Validation(required = true)
    public Integer labelCount;

    // 标签id
    @NameInMap("label_id")
    @Validation(required = true)
    public String labelId;

    // 标签名称
    @NameInMap("label_name")
    @Validation(required = true)
    public String labelName;

    public static RiskStormLabelResp build(java.util.Map<String, ?> map) throws Exception {
        RiskStormLabelResp self = new RiskStormLabelResp();
        return TeaModel.build(map, self);
    }

    public RiskStormLabelResp setLabelCount(Integer labelCount) {
        this.labelCount = labelCount;
        return this;
    }
    public Integer getLabelCount() {
        return this.labelCount;
    }

    public RiskStormLabelResp setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

    public RiskStormLabelResp setLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }
    public String getLabelName() {
        return this.labelName;
    }

}
