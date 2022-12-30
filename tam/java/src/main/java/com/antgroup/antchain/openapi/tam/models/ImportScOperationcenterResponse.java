// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class ImportScOperationcenterResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // 保存的工单主键id（成功才有）
    @NameInMap("id")
    public String id;

    public static ImportScOperationcenterResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportScOperationcenterResponse self = new ImportScOperationcenterResponse();
        return TeaModel.build(map, self);
    }

    public ImportScOperationcenterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportScOperationcenterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportScOperationcenterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportScOperationcenterResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ImportScOperationcenterResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
