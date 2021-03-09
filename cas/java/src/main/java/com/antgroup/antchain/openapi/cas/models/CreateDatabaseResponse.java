// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateDatabaseResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // database 实例 ids
    @NameInMap("database_sequences")
    public java.util.List<String> databaseSequences;

    public static CreateDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseResponse self = new CreateDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDatabaseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDatabaseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDatabaseResponse setDatabaseSequences(java.util.List<String> databaseSequences) {
        this.databaseSequences = databaseSequences;
        return this;
    }
    public java.util.List<String> getDatabaseSequences() {
        return this.databaseSequences;
    }

}
