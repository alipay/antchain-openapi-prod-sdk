// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryEsgListrolesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 页码
    @NameInMap("current")
    public Long current;

    // 页数
    @NameInMap("page_size")
    public Long pageSize;

    // 符合条件的角色总数
    @NameInMap("total")
    public Long total;

    // 当前页角色列表
    @NameInMap("list")
    public java.util.List<RoleList> list;

    public static QueryEsgListrolesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEsgListrolesResponse self = new QueryEsgListrolesResponse();
        return TeaModel.build(map, self);
    }

    public QueryEsgListrolesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEsgListrolesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEsgListrolesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEsgListrolesResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public QueryEsgListrolesResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryEsgListrolesResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryEsgListrolesResponse setList(java.util.List<RoleList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<RoleList> getList() {
        return this.list;
    }

}
