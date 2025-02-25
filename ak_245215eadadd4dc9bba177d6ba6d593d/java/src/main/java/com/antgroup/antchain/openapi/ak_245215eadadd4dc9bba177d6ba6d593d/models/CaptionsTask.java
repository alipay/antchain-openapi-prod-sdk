// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class CaptionsTask extends TeaModel {
    // 任务状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 字幕对齐结果
    @NameInMap("result")
    @Validation(required = true)
    public CaptionsResult result;

    public static CaptionsTask build(java.util.Map<String, ?> map) throws Exception {
        CaptionsTask self = new CaptionsTask();
        return TeaModel.build(map, self);
    }

    public CaptionsTask setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CaptionsTask setResult(CaptionsResult result) {
        this.result = result;
        return this;
    }
    public CaptionsResult getResult() {
        return this.result;
    }

}
