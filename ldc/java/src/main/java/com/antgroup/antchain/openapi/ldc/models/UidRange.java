// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UidRange extends TeaModel {
    // UID 起始值
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    // UID 终止值
    @NameInMap("end")
    @Validation(required = true)
    public Long end;

    // 弹性
    @NameInMap("elastic")
    public Boolean elastic;

    public static UidRange build(java.util.Map<String, ?> map) throws Exception {
        UidRange self = new UidRange();
        return TeaModel.build(map, self);
    }

    public UidRange setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public UidRange setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public UidRange setElastic(Boolean elastic) {
        this.elastic = elastic;
        return this;
    }
    public Boolean getElastic() {
        return this.elastic;
    }

}
