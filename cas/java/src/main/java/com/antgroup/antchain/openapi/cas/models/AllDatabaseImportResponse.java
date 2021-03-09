// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AllDatabaseImportResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // imports
    @NameInMap("imports")
    public java.util.List<DatabaseImportVO> imports;

    public static AllDatabaseImportResponse build(java.util.Map<String, ?> map) throws Exception {
        AllDatabaseImportResponse self = new AllDatabaseImportResponse();
        return TeaModel.build(map, self);
    }

    public AllDatabaseImportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllDatabaseImportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllDatabaseImportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllDatabaseImportResponse setImports(java.util.List<DatabaseImportVO> imports) {
        this.imports = imports;
        return this;
    }
    public java.util.List<DatabaseImportVO> getImports() {
        return this.imports;
    }

}
