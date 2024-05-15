// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryEcarLcacalcResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前查询页码
    @NameInMap("current")
    public Long current;

    // 每页记录条数
    @NameInMap("page_size")
    public Long pageSize;

    // 记录总条数
    @NameInMap("total")
    public Long total;

    // 开始日期
    @NameInMap("start_date")
    public String startDate;

    // 结束日期
    @NameInMap("end_date")
    public String endDate;

    // Lca速算记录列表
    @NameInMap("list")
    public java.util.List<LcaCalcResult> list;

    public static QueryEcarLcacalcResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEcarLcacalcResponse self = new QueryEcarLcacalcResponse();
        return TeaModel.build(map, self);
    }

    public QueryEcarLcacalcResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEcarLcacalcResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEcarLcacalcResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEcarLcacalcResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public QueryEcarLcacalcResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryEcarLcacalcResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryEcarLcacalcResponse setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryEcarLcacalcResponse setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryEcarLcacalcResponse setList(java.util.List<LcaCalcResult> list) {
        this.list = list;
        return this;
    }
    public java.util.List<LcaCalcResult> getList() {
        return this.list;
    }

}
