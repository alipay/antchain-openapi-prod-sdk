// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class PagequeryDacDepositResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前第几页，为请求的参数值
    @NameInMap("current")
    public Long current;

    // 默认每页展示多少条，为请求的参数值
    @NameInMap("page_size")
    public Long pageSize;

    // 一共列表有多少条数据
    @NameInMap("total")
    public Long total;

    // deposit订单信息列表
    @NameInMap("list")
    public java.util.List<QueryDepositOrderInfoResponse> list;

    public static PagequeryDacDepositResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryDacDepositResponse self = new PagequeryDacDepositResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryDacDepositResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryDacDepositResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryDacDepositResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryDacDepositResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryDacDepositResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryDacDepositResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryDacDepositResponse setList(java.util.List<QueryDepositOrderInfoResponse> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryDepositOrderInfoResponse> getList() {
        return this.list;
    }

}
