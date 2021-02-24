// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopRiskGeneNode extends TeaModel {
    // 主企业唯一ID
    @NameInMap("main_company_id")
    public String mainCompanyId;

    // 主企业名称
    @NameInMap("main_company_name")
    public String mainCompanyName;

    // 节点证件号码
    @NameInMap("node_cert_no")
    public String nodeCertNo;

    // 节点扩展信息
    @NameInMap("node_ext_json")
    public String nodeExtJson;

    // 节点唯一ID
    @NameInMap("node_id")
    public String nodeId;

    // 节点名称
    @NameInMap("node_name")
    public String nodeName;

    // 节点类型，枚举值
    @NameInMap("node_type")
    public String nodeType;

    // 基因模式
    @NameInMap("risk_label")
    public String riskLabel;

    // 基因模式
    @NameInMap("risk_mode")
    public String riskMode;

    public static RtopRiskGeneNode build(java.util.Map<String, ?> map) throws Exception {
        RtopRiskGeneNode self = new RtopRiskGeneNode();
        return TeaModel.build(map, self);
    }

    public RtopRiskGeneNode setMainCompanyId(String mainCompanyId) {
        this.mainCompanyId = mainCompanyId;
        return this;
    }
    public String getMainCompanyId() {
        return this.mainCompanyId;
    }

    public RtopRiskGeneNode setMainCompanyName(String mainCompanyName) {
        this.mainCompanyName = mainCompanyName;
        return this;
    }
    public String getMainCompanyName() {
        return this.mainCompanyName;
    }

    public RtopRiskGeneNode setNodeCertNo(String nodeCertNo) {
        this.nodeCertNo = nodeCertNo;
        return this;
    }
    public String getNodeCertNo() {
        return this.nodeCertNo;
    }

    public RtopRiskGeneNode setNodeExtJson(String nodeExtJson) {
        this.nodeExtJson = nodeExtJson;
        return this;
    }
    public String getNodeExtJson() {
        return this.nodeExtJson;
    }

    public RtopRiskGeneNode setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public RtopRiskGeneNode setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public RtopRiskGeneNode setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public RtopRiskGeneNode setRiskLabel(String riskLabel) {
        this.riskLabel = riskLabel;
        return this;
    }
    public String getRiskLabel() {
        return this.riskLabel;
    }

    public RtopRiskGeneNode setRiskMode(String riskMode) {
        this.riskMode = riskMode;
        return this;
    }
    public String getRiskMode() {
        return this.riskMode;
    }

}
