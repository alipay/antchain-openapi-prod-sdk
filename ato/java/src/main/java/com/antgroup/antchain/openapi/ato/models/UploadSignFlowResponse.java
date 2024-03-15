// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class UploadSignFlowResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 文件编号
    @NameInMap("file_item_no")
    public String fileItemNo;

    public static UploadSignFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadSignFlowResponse self = new UploadSignFlowResponse();
        return TeaModel.build(map, self);
    }

    public UploadSignFlowResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadSignFlowResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadSignFlowResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadSignFlowResponse setFileItemNo(String fileItemNo) {
        this.fileItemNo = fileItemNo;
        return this;
    }
    public String getFileItemNo() {
        return this.fileItemNo;
    }

}
