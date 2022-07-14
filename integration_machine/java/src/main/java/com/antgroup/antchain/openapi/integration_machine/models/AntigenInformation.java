// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class AntigenInformation extends TeaModel {
    // 抗原结果
    @NameInMap("antigen_result")
    @Validation(required = true)
    public String antigenResult;

    // 抗原时间
    @NameInMap("antigen_time")
    @Validation(required = true)
    public String antigenTime;

    public static AntigenInformation build(java.util.Map<String, ?> map) throws Exception {
        AntigenInformation self = new AntigenInformation();
        return TeaModel.build(map, self);
    }

    public AntigenInformation setAntigenResult(String antigenResult) {
        this.antigenResult = antigenResult;
        return this;
    }
    public String getAntigenResult() {
        return this.antigenResult;
    }

    public AntigenInformation setAntigenTime(String antigenTime) {
        this.antigenTime = antigenTime;
        return this;
    }
    public String getAntigenTime() {
        return this.antigenTime;
    }

}
