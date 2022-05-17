// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListAppportraitActiontrailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回数据
    @NameInMap("data")
    public java.util.List<AppPortraitActionTrailQuery> data;

    // 页数
    @NameInMap("page_num")
    public Long pageNum;

    // 每页大小，默认10
    @NameInMap("page_size")
    public Long pageSize;

    // 总数
    @NameInMap("total")
    public String total;

    public static ListAppportraitActiontrailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppportraitActiontrailResponse self = new ListAppportraitActiontrailResponse();
        return TeaModel.build(map, self);
    }

    public ListAppportraitActiontrailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAppportraitActiontrailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAppportraitActiontrailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAppportraitActiontrailResponse setData(java.util.List<AppPortraitActionTrailQuery> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AppPortraitActionTrailQuery> getData() {
        return this.data;
    }

    public ListAppportraitActiontrailResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListAppportraitActiontrailResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAppportraitActiontrailResponse setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

}
