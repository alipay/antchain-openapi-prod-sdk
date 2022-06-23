// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeSearchContractResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 关联编号（授信/用信）
    @NameInMap("relation_no")
    public String relationNo;

    // 合同编号
    @NameInMap("contract_no")
    public String contractNo;

    // 合同名称
    @NameInMap("contract_name")
    public String contractName;

    // 合同类型：0:电子合同签署授权协议 1:借款合同 2:抵押合同 3:担保合同 4:用信合同 5:通用合同 6:征信授权书
    @NameInMap("contract_type")
    public String contractType;

    // 客户编号
    @NameInMap("custom_no")
    public String customNo;

    // 下载地址
    @NameInMap("save_path")
    public String savePath;

    // 合同金额
    @NameInMap("contract_amount")
    public Long contractAmount;

    public static QueryDubbridgeSearchContractResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeSearchContractResponse self = new QueryDubbridgeSearchContractResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeSearchContractResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeSearchContractResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeSearchContractResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeSearchContractResponse setRelationNo(String relationNo) {
        this.relationNo = relationNo;
        return this;
    }
    public String getRelationNo() {
        return this.relationNo;
    }

    public QueryDubbridgeSearchContractResponse setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public QueryDubbridgeSearchContractResponse setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public QueryDubbridgeSearchContractResponse setContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }
    public String getContractType() {
        return this.contractType;
    }

    public QueryDubbridgeSearchContractResponse setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public QueryDubbridgeSearchContractResponse setSavePath(String savePath) {
        this.savePath = savePath;
        return this;
    }
    public String getSavePath() {
        return this.savePath;
    }

    public QueryDubbridgeSearchContractResponse setContractAmount(Long contractAmount) {
        this.contractAmount = contractAmount;
        return this;
    }
    public Long getContractAmount() {
        return this.contractAmount;
    }

}
