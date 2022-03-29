// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ConsumerJstackDTO extends TeaModel {
    // 消费端 Client ID
    @NameInMap("client_id")
    @Validation(required = true)
    public String clientId;

    // Jstack 堆栈信息
    @NameInMap("jstack")
    @Validation(required = true)
    public java.util.List<ThreadTrackDTO> jstack;

    public static ConsumerJstackDTO build(java.util.Map<String, ?> map) throws Exception {
        ConsumerJstackDTO self = new ConsumerJstackDTO();
        return TeaModel.build(map, self);
    }

    public ConsumerJstackDTO setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public ConsumerJstackDTO setJstack(java.util.List<ThreadTrackDTO> jstack) {
        this.jstack = jstack;
        return this;
    }
    public java.util.List<ThreadTrackDTO> getJstack() {
        return this.jstack;
    }

}
