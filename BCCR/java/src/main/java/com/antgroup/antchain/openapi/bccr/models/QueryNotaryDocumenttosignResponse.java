// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryNotaryDocumenttosignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 需要用户签署的文件列表
    @NameInMap("sign_document_list")
    public java.util.List<SignDocument> signDocumentList;

    // 生成文件的时间，需要在提交申办接口传入
    @NameInMap("preview_time")
    public Long previewTime;

    public static QueryNotaryDocumenttosignResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNotaryDocumenttosignResponse self = new QueryNotaryDocumenttosignResponse();
        return TeaModel.build(map, self);
    }

    public QueryNotaryDocumenttosignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryNotaryDocumenttosignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryNotaryDocumenttosignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryNotaryDocumenttosignResponse setSignDocumentList(java.util.List<SignDocument> signDocumentList) {
        this.signDocumentList = signDocumentList;
        return this;
    }
    public java.util.List<SignDocument> getSignDocumentList() {
        return this.signDocumentList;
    }

    public QueryNotaryDocumenttosignResponse setPreviewTime(Long previewTime) {
        this.previewTime = previewTime;
        return this;
    }
    public Long getPreviewTime() {
        return this.previewTime;
    }

}
