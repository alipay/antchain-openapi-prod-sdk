// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class XrUserTicketResultInfo extends TeaModel {
    // xr通行证资源池名称
    /**
     * <strong>example:</strong>
     * <p>资源池001</p>
     */
    @NameInMap("xr_ticket_pool_name")
    @Validation(required = true)
    public String xrTicketPoolName;

    // 购买数量，失败列表有值
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("count")
    public Long count;

    // 失败原因，失败列表有值
    /**
     * <strong>example:</strong>
     * <p>参数错误</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    // 通行证编号，成功列表有值
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("xr_ticket_code")
    public String xrTicketCode;

    public static XrUserTicketResultInfo build(java.util.Map<String, ?> map) throws Exception {
        XrUserTicketResultInfo self = new XrUserTicketResultInfo();
        return TeaModel.build(map, self);
    }

    public XrUserTicketResultInfo setXrTicketPoolName(String xrTicketPoolName) {
        this.xrTicketPoolName = xrTicketPoolName;
        return this;
    }
    public String getXrTicketPoolName() {
        return this.xrTicketPoolName;
    }

    public XrUserTicketResultInfo setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public XrUserTicketResultInfo setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public XrUserTicketResultInfo setXrTicketCode(String xrTicketCode) {
        this.xrTicketCode = xrTicketCode;
        return this;
    }
    public String getXrTicketCode() {
        return this.xrTicketCode;
    }

}
