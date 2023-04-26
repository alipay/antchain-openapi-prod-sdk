// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PagequeryXrXrticketpoolResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 通行证列表
    @NameInMap("xr_ticket_pool_list")
    public java.util.List<XrTicketPoolItem> xrTicketPoolList;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // 当前页
    @NameInMap("current")
    public Long current;

    // 每页数据条数
    @NameInMap("page_size")
    public Long pageSize;

    // 总数量
    @NameInMap("total")
    public Long total;

    // 总页数
    @NameInMap("total_page")
    public Long totalPage;

    public static PagequeryXrXrticketpoolResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryXrXrticketpoolResponse self = new PagequeryXrXrticketpoolResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryXrXrticketpoolResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryXrXrticketpoolResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryXrXrticketpoolResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryXrXrticketpoolResponse setXrTicketPoolList(java.util.List<XrTicketPoolItem> xrTicketPoolList) {
        this.xrTicketPoolList = xrTicketPoolList;
        return this;
    }
    public java.util.List<XrTicketPoolItem> getXrTicketPoolList() {
        return this.xrTicketPoolList;
    }

    public PagequeryXrXrticketpoolResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PagequeryXrXrticketpoolResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryXrXrticketpoolResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryXrXrticketpoolResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryXrXrticketpoolResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

}
