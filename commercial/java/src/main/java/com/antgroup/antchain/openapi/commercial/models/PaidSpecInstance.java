// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class PaidSpecInstance extends TeaModel {
    // 规格实例id
    @NameInMap("spec_instance_id")
    @Validation(required = true)
    public String specInstanceId;

    // 规格名称
    @NameInMap("spec_name")
    @Validation(required = true)
    public String specName;

    // 规格配置(描述)
    @NameInMap("spec_conf")
    public String specConf;

    // 实例开始时间
    @NameInMap("start_time")
    public String startTime;

    // 实例到期时间
    @NameInMap("end_time")
    public String endTime;

    // 规格实例的运行状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static PaidSpecInstance build(java.util.Map<String, ?> map) throws Exception {
        PaidSpecInstance self = new PaidSpecInstance();
        return TeaModel.build(map, self);
    }

    public PaidSpecInstance setSpecInstanceId(String specInstanceId) {
        this.specInstanceId = specInstanceId;
        return this;
    }
    public String getSpecInstanceId() {
        return this.specInstanceId;
    }

    public PaidSpecInstance setSpecName(String specName) {
        this.specName = specName;
        return this;
    }
    public String getSpecName() {
        return this.specName;
    }

    public PaidSpecInstance setSpecConf(String specConf) {
        this.specConf = specConf;
        return this;
    }
    public String getSpecConf() {
        return this.specConf;
    }

    public PaidSpecInstance setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public PaidSpecInstance setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public PaidSpecInstance setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
