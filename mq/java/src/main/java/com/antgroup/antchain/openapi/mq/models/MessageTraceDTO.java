// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class MessageTraceDTO extends TeaModel {
    // 查询结果
    @NameInMap("track_list")
    @Validation(required = true)
    public java.util.List<MessageTrackDTO> trackList;

    public static MessageTraceDTO build(java.util.Map<String, ?> map) throws Exception {
        MessageTraceDTO self = new MessageTraceDTO();
        return TeaModel.build(map, self);
    }

    public MessageTraceDTO setTrackList(java.util.List<MessageTrackDTO> trackList) {
        this.trackList = trackList;
        return this;
    }
    public java.util.List<MessageTrackDTO> getTrackList() {
        return this.trackList;
    }

}
