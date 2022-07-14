// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class NucleicAcidInformation extends TeaModel {
    // 核酸结果
    @NameInMap("nucleic_acid_result")
    @Validation(required = true)
    public String nucleicAcidResult;

    // 核酸时间
    @NameInMap("nucleic_acid_time")
    @Validation(required = true)
    public String nucleicAcidTime;

    public static NucleicAcidInformation build(java.util.Map<String, ?> map) throws Exception {
        NucleicAcidInformation self = new NucleicAcidInformation();
        return TeaModel.build(map, self);
    }

    public NucleicAcidInformation setNucleicAcidResult(String nucleicAcidResult) {
        this.nucleicAcidResult = nucleicAcidResult;
        return this;
    }
    public String getNucleicAcidResult() {
        return this.nucleicAcidResult;
    }

    public NucleicAcidInformation setNucleicAcidTime(String nucleicAcidTime) {
        this.nucleicAcidTime = nucleicAcidTime;
        return this;
    }
    public String getNucleicAcidTime() {
        return this.nucleicAcidTime;
    }

}
