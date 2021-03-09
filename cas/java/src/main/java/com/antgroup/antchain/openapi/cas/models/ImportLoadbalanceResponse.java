// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ImportLoadbalanceResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 导入的 loadbalance 序列号
    @NameInMap("loadbalance_id_mapping")
    public String loadbalanceIdMapping;

    public static ImportLoadbalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportLoadbalanceResponse self = new ImportLoadbalanceResponse();
        return TeaModel.build(map, self);
    }

    public ImportLoadbalanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportLoadbalanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportLoadbalanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportLoadbalanceResponse setLoadbalanceIdMapping(String loadbalanceIdMapping) {
        this.loadbalanceIdMapping = loadbalanceIdMapping;
        return this;
    }
    public String getLoadbalanceIdMapping() {
        return this.loadbalanceIdMapping;
    }

}
