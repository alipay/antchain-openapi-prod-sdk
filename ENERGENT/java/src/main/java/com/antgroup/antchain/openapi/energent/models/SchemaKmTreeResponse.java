// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class SchemaKmTreeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 知识库ID
    @NameInMap("kb_id")
    public String kbId;

    // 图谱本体Schema JSON文本
    @NameInMap("schema_json")
    public String schemaJson;

    public static SchemaKmTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        SchemaKmTreeResponse self = new SchemaKmTreeResponse();
        return TeaModel.build(map, self);
    }

    public SchemaKmTreeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SchemaKmTreeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SchemaKmTreeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SchemaKmTreeResponse setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public SchemaKmTreeResponse setSchemaJson(String schemaJson) {
        this.schemaJson = schemaJson;
        return this;
    }
    public String getSchemaJson() {
        return this.schemaJson;
    }

}
