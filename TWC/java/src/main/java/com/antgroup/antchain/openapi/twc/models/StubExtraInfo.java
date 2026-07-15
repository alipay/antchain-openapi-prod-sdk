// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class StubExtraInfo extends TeaModel {
    // 票面视觉
    /**
     * <strong>example:</strong>
     * <p><a href="https://www.xx.com">https://www.xx.com</a></p>
     */
    @NameInMap("ticket_vision")
    public String ticketVision;

    public static StubExtraInfo build(java.util.Map<String, ?> map) throws Exception {
        StubExtraInfo self = new StubExtraInfo();
        return TeaModel.build(map, self);
    }

    public StubExtraInfo setTicketVision(String ticketVision) {
        this.ticketVision = ticketVision;
        return this;
    }
    public String getTicketVision() {
        return this.ticketVision;
    }

}
