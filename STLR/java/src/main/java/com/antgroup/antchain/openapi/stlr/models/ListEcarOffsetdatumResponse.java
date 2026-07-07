// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class ListEcarOffsetdatumResponse extends TeaModel {
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

    // 碳普惠减碳数据明细
    @NameInMap("list")
    public java.util.List<CarbonOffsetAcquisitionItem> list;

    public static ListEcarOffsetdatumResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEcarOffsetdatumResponse self = new ListEcarOffsetdatumResponse();
        return TeaModel.build(map, self);
    }

    public ListEcarOffsetdatumResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListEcarOffsetdatumResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListEcarOffsetdatumResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListEcarOffsetdatumResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ListEcarOffsetdatumResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListEcarOffsetdatumResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListEcarOffsetdatumResponse setList(java.util.List<CarbonOffsetAcquisitionItem> list) {
        this.list = list;
        return this;
    }
    public java.util.List<CarbonOffsetAcquisitionItem> getList() {
        return this.list;
    }

}
