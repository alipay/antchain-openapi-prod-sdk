// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class ImportDataphinFileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // success
    @NameInMap("success")
    public Boolean success;

    // errorCode
    @NameInMap("error_code")
    public String errorCode;

    // errorMsg
    @NameInMap("error_msg")
    public String errorMsg;

    // resultObj
    @NameInMap("result_obj")
    public ProduceFeatureResultObj resultObj;

    public static ImportDataphinFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDataphinFileResponse self = new ImportDataphinFileResponse();
        return TeaModel.build(map, self);
    }

    public ImportDataphinFileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportDataphinFileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportDataphinFileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportDataphinFileResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ImportDataphinFileResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ImportDataphinFileResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ImportDataphinFileResponse setResultObj(ProduceFeatureResultObj resultObj) {
        this.resultObj = resultObj;
        return this;
    }
    public ProduceFeatureResultObj getResultObj() {
        return this.resultObj;
    }

}
