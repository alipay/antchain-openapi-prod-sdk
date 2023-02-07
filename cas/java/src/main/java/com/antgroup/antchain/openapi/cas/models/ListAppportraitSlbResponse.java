// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListAppportraitSlbResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 1
    @NameInMap("data")
    public java.util.List<AppPortraitAppNodeEcsList> data;

    // 1
    @NameInMap("page_num")
    public Long pageNum;

    // 10
    @NameInMap("page_size")
    public Long pageSize;

    // 100
    @NameInMap("total")
    public Long total;

    public static ListAppportraitSlbResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppportraitSlbResponse self = new ListAppportraitSlbResponse();
        return TeaModel.build(map, self);
    }

    public ListAppportraitSlbResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAppportraitSlbResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAppportraitSlbResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAppportraitSlbResponse setData(java.util.List<AppPortraitAppNodeEcsList> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AppPortraitAppNodeEcsList> getData() {
        return this.data;
    }

    public ListAppportraitSlbResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListAppportraitSlbResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAppportraitSlbResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
