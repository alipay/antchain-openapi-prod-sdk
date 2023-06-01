// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class ListEcarEnterprisememberResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前查询的页码
    @NameInMap("current")
    public Long current;

    // 每页记录条数
    @NameInMap("page_size")
    public Long pageSize;

    // 记录总条数
    @NameInMap("total")
    public Long total;

    // 会员资料列表
    @NameInMap("list")
    public java.util.List<EnterpriseMemberSummary> list;

    public static ListEcarEnterprisememberResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEcarEnterprisememberResponse self = new ListEcarEnterprisememberResponse();
        return TeaModel.build(map, self);
    }

    public ListEcarEnterprisememberResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListEcarEnterprisememberResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListEcarEnterprisememberResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListEcarEnterprisememberResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ListEcarEnterprisememberResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListEcarEnterprisememberResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListEcarEnterprisememberResponse setList(java.util.List<EnterpriseMemberSummary> list) {
        this.list = list;
        return this;
    }
    public java.util.List<EnterpriseMemberSummary> getList() {
        return this.list;
    }

}
