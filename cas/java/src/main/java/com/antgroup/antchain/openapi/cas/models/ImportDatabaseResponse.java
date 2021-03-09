// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ImportDatabaseResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 导入的 computer 序列号
    @NameInMap("database_id_mapping")
    public String databaseIdMapping;

    public static ImportDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDatabaseResponse self = new ImportDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public ImportDatabaseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportDatabaseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportDatabaseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportDatabaseResponse setDatabaseIdMapping(String databaseIdMapping) {
        this.databaseIdMapping = databaseIdMapping;
        return this;
    }
    public String getDatabaseIdMapping() {
        return this.databaseIdMapping;
    }

}
