// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class PushAntchainDasKyaLtworeportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 不可变的上报报告 ID
    @NameInMap("report_id")
    @Validation(required = true)
    public String reportId;

    // 报告结构版本，固定 l2-report-v1
    @NameInMap("schema_version")
    @Validation(required = true)
    public String schemaVersion;

    // 报告所属 Agent DID
    @NameInMap("agent_did")
    @Validation(required = true)
    public String agentDid;

    // 报告观测起始时间，UTC RFC3339
    @NameInMap("observed_from")
    @Validation(required = true)
    public String observedFrom;

    // 报告观测结束时间，UTC RFC3339
    @NameInMap("observed_to")
    @Validation(required = true)
    public String observedTo;

    // 报告结束时的 Agent 运行环境快照
    @NameInMap("machine")
    @Validation(required = true)
    public MachineObservation machine;

    // 工作目录列表；缺失表示未取得
    @NameInMap("workspaces")
    public java.util.List<WorkspaceObservation> workspaces;

    // Agent 当前配置快照，与实际调用记录分开
    @NameInMap("configuration")
    @Validation(required = true)
    public AgentConfiguration configuration;

    // 本报告中已协作 Session 的 Turn 列表
    @NameInMap("turns")
    @Validation(required = true)
    public java.util.List<ReportTurn> turns;

    public static PushAntchainDasKyaLtworeportRequest build(java.util.Map<String, ?> map) throws Exception {
        PushAntchainDasKyaLtworeportRequest self = new PushAntchainDasKyaLtworeportRequest();
        return TeaModel.build(map, self);
    }

    public PushAntchainDasKyaLtworeportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushAntchainDasKyaLtworeportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushAntchainDasKyaLtworeportRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public PushAntchainDasKyaLtworeportRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public PushAntchainDasKyaLtworeportRequest setAgentDid(String agentDid) {
        this.agentDid = agentDid;
        return this;
    }
    public String getAgentDid() {
        return this.agentDid;
    }

    public PushAntchainDasKyaLtworeportRequest setObservedFrom(String observedFrom) {
        this.observedFrom = observedFrom;
        return this;
    }
    public String getObservedFrom() {
        return this.observedFrom;
    }

    public PushAntchainDasKyaLtworeportRequest setObservedTo(String observedTo) {
        this.observedTo = observedTo;
        return this;
    }
    public String getObservedTo() {
        return this.observedTo;
    }

    public PushAntchainDasKyaLtworeportRequest setMachine(MachineObservation machine) {
        this.machine = machine;
        return this;
    }
    public MachineObservation getMachine() {
        return this.machine;
    }

    public PushAntchainDasKyaLtworeportRequest setWorkspaces(java.util.List<WorkspaceObservation> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<WorkspaceObservation> getWorkspaces() {
        return this.workspaces;
    }

    public PushAntchainDasKyaLtworeportRequest setConfiguration(AgentConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public AgentConfiguration getConfiguration() {
        return this.configuration;
    }

    public PushAntchainDasKyaLtworeportRequest setTurns(java.util.List<ReportTurn> turns) {
        this.turns = turns;
        return this;
    }
    public java.util.List<ReportTurn> getTurns() {
        return this.turns;
    }

}
