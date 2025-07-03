// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RtopRiskGeneNode extends TeaModel {
    // 主企业唯一ID
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("main_company_id")
    public String mainCompanyId;

    // 主企业名称
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("main_company_name")
    public String mainCompanyName;

    // 节点唯一ID
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("node_id")
    public String nodeId;

    // 节点名称
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("node_name")
    public String nodeName;

    // 节点证件号码
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("node_cert_no")
    public String nodeCertNo;

    // 节点类型，枚举值
    /**
     * <strong>example:</strong>
     * <p>company</p>
     */
    @NameInMap("node_type")
    public String nodeType;

    // 节点扩展信息
    /**
     * <strong>example:</strong>
     * <p>节点扩展信息</p>
     */
    @NameInMap("node_ext_json")
    public String nodeExtJson;

    // 基因模式
    /**
     * <strong>example:</strong>
     * <p>risk_label</p>
     */
    @NameInMap("risk_label")
    public String riskLabel;

    // 基因模式
    /**
     * <strong>example:</strong>
     * <p>基因模式</p>
     */
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

    public RtopRiskGeneNode setNodeCertNo(String nodeCertNo) {
        this.nodeCertNo = nodeCertNo;
        return this;
    }
    public String getNodeCertNo() {
        return this.nodeCertNo;
    }

    public RtopRiskGeneNode setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public RtopRiskGeneNode setNodeExtJson(String nodeExtJson) {
        this.nodeExtJson = nodeExtJson;
        return this;
    }
    public String getNodeExtJson() {
        return this.nodeExtJson;
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
