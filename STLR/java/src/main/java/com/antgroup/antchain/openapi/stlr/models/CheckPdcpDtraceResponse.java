// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class CheckPdcpDtraceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 存证操作内容
    @NameInMap("deposit_data")
    public DataDepositInfo depositData;

    // 区块链编号
    @NameInMap("block_number")
    public Long blockNumber;

    // 数据存证方式
    @NameInMap("deposit_type")
    public String depositType;

    // 链上数据
    @NameInMap("on_chain_data")
    public String onChainData;

    // 链下数据
    @NameInMap("off_chain_data")
    public String offChainData;

    // 链上-链下数据是否一致
    @NameInMap("consistent")
    public Boolean consistent;

    public static CheckPdcpDtraceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckPdcpDtraceResponse self = new CheckPdcpDtraceResponse();
        return TeaModel.build(map, self);
    }

    public CheckPdcpDtraceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckPdcpDtraceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckPdcpDtraceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckPdcpDtraceResponse setDepositData(DataDepositInfo depositData) {
        this.depositData = depositData;
        return this;
    }
    public DataDepositInfo getDepositData() {
        return this.depositData;
    }

    public CheckPdcpDtraceResponse setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

    public CheckPdcpDtraceResponse setDepositType(String depositType) {
        this.depositType = depositType;
        return this;
    }
    public String getDepositType() {
        return this.depositType;
    }

    public CheckPdcpDtraceResponse setOnChainData(String onChainData) {
        this.onChainData = onChainData;
        return this;
    }
    public String getOnChainData() {
        return this.onChainData;
    }

    public CheckPdcpDtraceResponse setOffChainData(String offChainData) {
        this.offChainData = offChainData;
        return this;
    }
    public String getOffChainData() {
        return this.offChainData;
    }

    public CheckPdcpDtraceResponse setConsistent(Boolean consistent) {
        this.consistent = consistent;
        return this;
    }
    public Boolean getConsistent() {
        return this.consistent;
    }

}
