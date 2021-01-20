// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryServiceRollbackversionResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 版本
    @NameInMap("versions")
    public java.util.List<Pair> versions;

    public static QueryServiceRollbackversionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryServiceRollbackversionResponse self = new QueryServiceRollbackversionResponse();
        return TeaModel.build(map, self);
    }

    public QueryServiceRollbackversionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryServiceRollbackversionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryServiceRollbackversionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryServiceRollbackversionResponse setVersions(java.util.List<Pair> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<Pair> getVersions() {
        return this.versions;
    }

}
