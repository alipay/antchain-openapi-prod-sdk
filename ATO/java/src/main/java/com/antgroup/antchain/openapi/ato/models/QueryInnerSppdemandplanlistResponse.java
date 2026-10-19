// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerSppdemandplanlistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总记录数
    @NameInMap("total")
    public Long total;

    // 当前页
    @NameInMap("page_no")
    public Long pageNo;

    // 每页条数
    @NameInMap("page_size")
    public Long pageSize;

    // 总页数，空列表为0
    @NameInMap("pages")
    public Long pages;

    // 数据（JSON数组）
    @NameInMap("plans")
    public String plans;

    public static QueryInnerSppdemandplanlistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerSppdemandplanlistResponse self = new QueryInnerSppdemandplanlistResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerSppdemandplanlistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerSppdemandplanlistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerSppdemandplanlistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerSppdemandplanlistResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryInnerSppdemandplanlistResponse setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryInnerSppdemandplanlistResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryInnerSppdemandplanlistResponse setPages(Long pages) {
        this.pages = pages;
        return this;
    }
    public Long getPages() {
        return this.pages;
    }

    public QueryInnerSppdemandplanlistResponse setPlans(String plans) {
        this.plans = plans;
        return this;
    }
    public String getPlans() {
        return this.plans;
    }

}
