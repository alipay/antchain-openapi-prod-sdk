// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class TransactionChartInfo extends TeaModel {
    // a
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // biz_type
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // cost
    @NameInMap("cost")
    @Validation(required = true)
    public Long cost;

    // edges
    @NameInMap("edges")
    @Validation(required = true)
    public java.util.List<TransactionEdge> edges;

    // end_time
    @NameInMap("end_time")
    public String endTime;

    // last_handle_time
    @NameInMap("last_handle_time")
    public String lastHandleTime;

    // lowerLineCount
    @NameInMap("lower_line_count")
    @Validation(required = true)
    public Long lowerLineCount;

    // nodes
    @NameInMap("nodes")
    @Validation(required = true)
    public java.util.List<TransactionNode> nodes;

    // participatorNum
    @NameInMap("participator_num")
    @Validation(required = true)
    public Long participatorNum;

    // starter_ip
    @NameInMap("starter_ip")
    @Validation(required = true)
    public String starterIp;

    // starterName
    @NameInMap("starter_name")
    @Validation(required = true)
    public String starterName;

    // start_time
    @NameInMap("start_time")
    @Validation(required = true)
    public String startTime;

    // state
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // txid
    @NameInMap("tx_id")
    @Validation(required = true)
    public String txId;

    // upper_line_count
    @NameInMap("upper_line_count")
    @Validation(required = true)
    public Long upperLineCount;

    // action_mode
    @NameInMap("action_mode")
    public Long actionMode;

    public static TransactionChartInfo build(java.util.Map<String, ?> map) throws Exception {
        TransactionChartInfo self = new TransactionChartInfo();
        return TeaModel.build(map, self);
    }

    public TransactionChartInfo setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public TransactionChartInfo setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public TransactionChartInfo setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public TransactionChartInfo setEdges(java.util.List<TransactionEdge> edges) {
        this.edges = edges;
        return this;
    }
    public java.util.List<TransactionEdge> getEdges() {
        return this.edges;
    }

    public TransactionChartInfo setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public TransactionChartInfo setLastHandleTime(String lastHandleTime) {
        this.lastHandleTime = lastHandleTime;
        return this;
    }
    public String getLastHandleTime() {
        return this.lastHandleTime;
    }

    public TransactionChartInfo setLowerLineCount(Long lowerLineCount) {
        this.lowerLineCount = lowerLineCount;
        return this;
    }
    public Long getLowerLineCount() {
        return this.lowerLineCount;
    }

    public TransactionChartInfo setNodes(java.util.List<TransactionNode> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<TransactionNode> getNodes() {
        return this.nodes;
    }

    public TransactionChartInfo setParticipatorNum(Long participatorNum) {
        this.participatorNum = participatorNum;
        return this;
    }
    public Long getParticipatorNum() {
        return this.participatorNum;
    }

    public TransactionChartInfo setStarterIp(String starterIp) {
        this.starterIp = starterIp;
        return this;
    }
    public String getStarterIp() {
        return this.starterIp;
    }

    public TransactionChartInfo setStarterName(String starterName) {
        this.starterName = starterName;
        return this;
    }
    public String getStarterName() {
        return this.starterName;
    }

    public TransactionChartInfo setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public TransactionChartInfo setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public TransactionChartInfo setTxId(String txId) {
        this.txId = txId;
        return this;
    }
    public String getTxId() {
        return this.txId;
    }

    public TransactionChartInfo setUpperLineCount(Long upperLineCount) {
        this.upperLineCount = upperLineCount;
        return this;
    }
    public Long getUpperLineCount() {
        return this.upperLineCount;
    }

    public TransactionChartInfo setActionMode(Long actionMode) {
        this.actionMode = actionMode;
        return this;
    }
    public Long getActionMode() {
        return this.actionMode;
    }

}
