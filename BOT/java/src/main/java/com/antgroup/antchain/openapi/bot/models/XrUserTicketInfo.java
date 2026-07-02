// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class XrUserTicketInfo extends TeaModel {
    // xr通行证资源池名称
    /**
     * <strong>example:</strong>
     * <p>资源池001</p>
     */
    @NameInMap("xr_ticket_pool_name")
    @Validation(required = true)
    public String xrTicketPoolName;

    // 购买数量
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    public static XrUserTicketInfo build(java.util.Map<String, ?> map) throws Exception {
        XrUserTicketInfo self = new XrUserTicketInfo();
        return TeaModel.build(map, self);
    }

    public XrUserTicketInfo setXrTicketPoolName(String xrTicketPoolName) {
        this.xrTicketPoolName = xrTicketPoolName;
        return this;
    }
    public String getXrTicketPoolName() {
        return this.xrTicketPoolName;
    }

    public XrUserTicketInfo setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

}
