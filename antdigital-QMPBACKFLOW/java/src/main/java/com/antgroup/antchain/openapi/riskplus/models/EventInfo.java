// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class EventInfo extends TeaModel {
    // 事件编码
    /**
     * <strong>example:</strong>
     * <p>face_attack_strategy</p>
     */
    @NameInMap("event_code")
    @Validation(required = true)
    public String eventCode;

    // 事件产生时间
    /**
     * <strong>example:</strong>
     * <p>1686215967914</p>
     */
    @NameInMap("gmt_occur")
    @Validation(required = true)
    public String gmtOccur;

    public static EventInfo build(java.util.Map<String, ?> map) throws Exception {
        EventInfo self = new EventInfo();
        return TeaModel.build(map, self);
    }

    public EventInfo setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public EventInfo setGmtOccur(String gmtOccur) {
        this.gmtOccur = gmtOccur;
        return this;
    }
    public String getGmtOccur() {
        return this.gmtOccur;
    }

}
