// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class AntigenInfo extends TeaModel {
    // 抗原检测状态
    @NameInMap("antigen_result")
    public String antigenResult;

    // 抗原检测时间戳
    @NameInMap("antigen_timestamp")
    public Long antigenTimestamp;

    public static AntigenInfo build(java.util.Map<String, ?> map) throws Exception {
        AntigenInfo self = new AntigenInfo();
        return TeaModel.build(map, self);
    }

    public AntigenInfo setAntigenResult(String antigenResult) {
        this.antigenResult = antigenResult;
        return this;
    }
    public String getAntigenResult() {
        return this.antigenResult;
    }

    public AntigenInfo setAntigenTimestamp(Long antigenTimestamp) {
        this.antigenTimestamp = antigenTimestamp;
        return this;
    }
    public Long getAntigenTimestamp() {
        return this.antigenTimestamp;
    }

}
