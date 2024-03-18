// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class Sentence extends TeaModel {
    // 字幕单句文本
    @NameInMap("text")
    @Validation(required = true)
    public String text;

    // 字幕单句开始时间
    @NameInMap("begin_time")
    @Validation(required = true)
    public Long beginTime;

    // 字幕单句结束时间
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    public static Sentence build(java.util.Map<String, ?> map) throws Exception {
        Sentence self = new Sentence();
        return TeaModel.build(map, self);
    }

    public Sentence setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public Sentence setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public Sentence setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
