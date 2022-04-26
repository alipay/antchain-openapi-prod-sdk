// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class StubExtraInfo extends TeaModel {
    // C端用户的支付宝id
    @NameInMap("customer_id")
    @Validation(required = true)
    public String customerId;

    // 票面视觉
    @NameInMap("ticket_vision")
    public String ticketVision;

    public static StubExtraInfo build(java.util.Map<String, ?> map) throws Exception {
        StubExtraInfo self = new StubExtraInfo();
        return TeaModel.build(map, self);
    }

    public StubExtraInfo setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public StubExtraInfo setTicketVision(String ticketVision) {
        this.ticketVision = ticketVision;
        return this;
    }
    public String getTicketVision() {
        return this.ticketVision;
    }

}
