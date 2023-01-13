// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ListDataexportTriggerlogResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // -
    @NameInMap("page_size")
    public Long pageSize;

    // -
    @NameInMap("current")
    public Long current;

    // -
    @NameInMap("total")
    public Long total;

    // -
    @NameInMap("list")
    public java.util.List<TriggerLog> list;

    public static ListDataexportTriggerlogResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataexportTriggerlogResponse self = new ListDataexportTriggerlogResponse();
        return TeaModel.build(map, self);
    }

    public ListDataexportTriggerlogResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListDataexportTriggerlogResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDataexportTriggerlogResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListDataexportTriggerlogResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDataexportTriggerlogResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ListDataexportTriggerlogResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListDataexportTriggerlogResponse setList(java.util.List<TriggerLog> list) {
        this.list = list;
        return this;
    }
    public java.util.List<TriggerLog> getList() {
        return this.list;
    }

}
