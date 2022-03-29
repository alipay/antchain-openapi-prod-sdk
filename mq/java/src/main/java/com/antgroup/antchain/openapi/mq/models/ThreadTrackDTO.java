// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ThreadTrackDTO extends TeaModel {
    // 线程名称
    @NameInMap("thread")
    @Validation(required = true)
    public String thread;

    // Jstack 堆栈信息字符串
    @NameInMap("track_list")
    @Validation(required = true)
    public java.util.List<String> trackList;

    public static ThreadTrackDTO build(java.util.Map<String, ?> map) throws Exception {
        ThreadTrackDTO self = new ThreadTrackDTO();
        return TeaModel.build(map, self);
    }

    public ThreadTrackDTO setThread(String thread) {
        this.thread = thread;
        return this;
    }
    public String getThread() {
        return this.thread;
    }

    public ThreadTrackDTO setTrackList(java.util.List<String> trackList) {
        this.trackList = trackList;
        return this;
    }
    public java.util.List<String> getTrackList() {
        return this.trackList;
    }

}
