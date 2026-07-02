// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PagequeryXrUserticketResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // 用户通行证列表
    @NameInMap("xr_user_ticket_list")
    public java.util.List<XrUserTicketPageInfo> xrUserTicketList;

    // 当前页码
    @NameInMap("current")
    public Long current;

    // 每页条数
    @NameInMap("page_size")
    public Long pageSize;

    // 总数量
    @NameInMap("total")
    public Long total;

    public static PagequeryXrUserticketResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryXrUserticketResponse self = new PagequeryXrUserticketResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryXrUserticketResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryXrUserticketResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryXrUserticketResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryXrUserticketResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PagequeryXrUserticketResponse setXrUserTicketList(java.util.List<XrUserTicketPageInfo> xrUserTicketList) {
        this.xrUserTicketList = xrUserTicketList;
        return this;
    }
    public java.util.List<XrUserTicketPageInfo> getXrUserTicketList() {
        return this.xrUserTicketList;
    }

    public PagequeryXrUserticketResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryXrUserticketResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryXrUserticketResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
