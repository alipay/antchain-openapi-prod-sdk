// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SumbitInnerMermngcontractauditResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 状态
    @NameInMap("status")
    public String status;

    // 审核id
    @NameInMap("audit_id")
    public String auditId;

    // 审核后合同文件
    @NameInMap("contract_audit_final_file")
    public FileInfo contractAuditFinalFile;

    public static SumbitInnerMermngcontractauditResponse build(java.util.Map<String, ?> map) throws Exception {
        SumbitInnerMermngcontractauditResponse self = new SumbitInnerMermngcontractauditResponse();
        return TeaModel.build(map, self);
    }

    public SumbitInnerMermngcontractauditResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SumbitInnerMermngcontractauditResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SumbitInnerMermngcontractauditResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SumbitInnerMermngcontractauditResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SumbitInnerMermngcontractauditResponse setAuditId(String auditId) {
        this.auditId = auditId;
        return this;
    }
    public String getAuditId() {
        return this.auditId;
    }

    public SumbitInnerMermngcontractauditResponse setContractAuditFinalFile(FileInfo contractAuditFinalFile) {
        this.contractAuditFinalFile = contractAuditFinalFile;
        return this;
    }
    public FileInfo getContractAuditFinalFile() {
        return this.contractAuditFinalFile;
    }

}
