// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ListTraasmetaEntityfieldResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // fields
    @NameInMap("fields")
    public java.util.List<TraasEntityFieldDto> fields;

    public static ListTraasmetaEntityfieldResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTraasmetaEntityfieldResponse self = new ListTraasmetaEntityfieldResponse();
        return TeaModel.build(map, self);
    }

    public ListTraasmetaEntityfieldResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListTraasmetaEntityfieldResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListTraasmetaEntityfieldResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListTraasmetaEntityfieldResponse setFields(java.util.List<TraasEntityFieldDto> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<TraasEntityFieldDto> getFields() {
        return this.fields;
    }

}
