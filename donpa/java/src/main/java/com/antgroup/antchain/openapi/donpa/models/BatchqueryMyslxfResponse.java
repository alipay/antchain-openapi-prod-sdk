// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class BatchqueryMyslxfResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 修复结果列表
    @NameInMap("detail_info_list")
    public java.util.List<DetailInfo> detailInfoList;

    public static BatchqueryMyslxfResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryMyslxfResponse self = new BatchqueryMyslxfResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryMyslxfResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryMyslxfResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryMyslxfResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryMyslxfResponse setDetailInfoList(java.util.List<DetailInfo> detailInfoList) {
        this.detailInfoList = detailInfoList;
        return this;
    }
    public java.util.List<DetailInfo> getDetailInfoList() {
        return this.detailInfoList;
    }

}
