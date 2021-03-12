// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryTraceabilityBlockchainInfosResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 异常的节点数
    @NameInMap("abnormal_nodes")
    public Long abnormalNodes;

    // 区块链id
    @NameInMap("bizid")
    public String bizid;

    // 区块高度
    @NameInMap("block_height")
    public Long blockHeight;

    // 创建时间
    @NameInMap("create_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createTime;

    // 链的状态，是否正常
    @NameInMap("is_normal")
    public Boolean isNormal;

    // 是否为管理员权限
    @NameInMap("is_role")
    public Boolean isRole;

    // 链的名字
    @NameInMap("name")
    public String name;

    // 节点信息
    @NameInMap("node_info_list")
    public java.util.List<NodeInfo> nodeInfoList;

    // 节点数
    @NameInMap("node_number")
    public Long nodeNumber;

    // 链上交易数
    @NameInMap("transaction_sum")
    public Long transactionSum;

    // 链的版本
    @NameInMap("version")
    public String version;

    public static QueryTraceabilityBlockchainInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceabilityBlockchainInfosResponse self = new QueryTraceabilityBlockchainInfosResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceabilityBlockchainInfosResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTraceabilityBlockchainInfosResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTraceabilityBlockchainInfosResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTraceabilityBlockchainInfosResponse setAbnormalNodes(Long abnormalNodes) {
        this.abnormalNodes = abnormalNodes;
        return this;
    }
    public Long getAbnormalNodes() {
        return this.abnormalNodes;
    }

    public QueryTraceabilityBlockchainInfosResponse setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public QueryTraceabilityBlockchainInfosResponse setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public Long getBlockHeight() {
        return this.blockHeight;
    }

    public QueryTraceabilityBlockchainInfosResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public QueryTraceabilityBlockchainInfosResponse setIsNormal(Boolean isNormal) {
        this.isNormal = isNormal;
        return this;
    }
    public Boolean getIsNormal() {
        return this.isNormal;
    }

    public QueryTraceabilityBlockchainInfosResponse setIsRole(Boolean isRole) {
        this.isRole = isRole;
        return this;
    }
    public Boolean getIsRole() {
        return this.isRole;
    }

    public QueryTraceabilityBlockchainInfosResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryTraceabilityBlockchainInfosResponse setNodeInfoList(java.util.List<NodeInfo> nodeInfoList) {
        this.nodeInfoList = nodeInfoList;
        return this;
    }
    public java.util.List<NodeInfo> getNodeInfoList() {
        return this.nodeInfoList;
    }

    public QueryTraceabilityBlockchainInfosResponse setNodeNumber(Long nodeNumber) {
        this.nodeNumber = nodeNumber;
        return this;
    }
    public Long getNodeNumber() {
        return this.nodeNumber;
    }

    public QueryTraceabilityBlockchainInfosResponse setTransactionSum(Long transactionSum) {
        this.transactionSum = transactionSum;
        return this;
    }
    public Long getTransactionSum() {
        return this.transactionSum;
    }

    public QueryTraceabilityBlockchainInfosResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
