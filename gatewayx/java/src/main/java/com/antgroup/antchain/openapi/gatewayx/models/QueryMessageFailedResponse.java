// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gatewayx.models;

import com.aliyun.tea.*;

public class QueryMessageFailedResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 每页条数
    @NameInMap("page_size")
    public String pageSize;

    // 第几页
    @NameInMap("page_num")
    public String pageNum;

    // 总条数
    @NameInMap("total_num")
    public String totalNum;

    // 最终失败的消息列表
    @NameInMap("msg_list")
    public java.util.List<XMessageInfo> msgList;

    public static QueryMessageFailedResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageFailedResponse self = new QueryMessageFailedResponse();
        return TeaModel.build(map, self);
    }

    public QueryMessageFailedResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMessageFailedResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMessageFailedResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMessageFailedResponse setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryMessageFailedResponse setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public QueryMessageFailedResponse setTotalNum(String totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public String getTotalNum() {
        return this.totalNum;
    }

    public QueryMessageFailedResponse setMsgList(java.util.List<XMessageInfo> msgList) {
        this.msgList = msgList;
        return this;
    }
    public java.util.List<XMessageInfo> getMsgList() {
        return this.msgList;
    }

}
