// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class OnestepFlowNotaryInfo extends TeaModel {
    // 全流程模板id，需要提前创建好模板才能获取
    /**
     * <strong>example:</strong>
     * <p>TP_4a605f04-ae9f-48d3-88ba-05c073ad5484</p>
     */
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 流程名称，同一个租户下同一个模板，建议唯一不重复
    /**
     * <strong>example:</strong>
     * <p>员工入职流程_员工xxxxx</p>
     */
    @NameInMap("flow_name")
    @Validation(required = true)
    public String flowName;

    // 存证关联实体（个人/企业）的身份识别信息
    @NameInMap("notary_user")
    @Validation(required = true)
    public NotaryUser notaryUser;

    // 阶段存证内容列表，根据模板定义传入
    @NameInMap("phase_notary_list")
    @Validation(required = true)
    public java.util.List<PhaseNotary> phaseNotaryList;

    // 扩展属性
    /**
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("properties")
    public String properties;

    public static OnestepFlowNotaryInfo build(java.util.Map<String, ?> map) throws Exception {
        OnestepFlowNotaryInfo self = new OnestepFlowNotaryInfo();
        return TeaModel.build(map, self);
    }

    public OnestepFlowNotaryInfo setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public OnestepFlowNotaryInfo setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public OnestepFlowNotaryInfo setNotaryUser(NotaryUser notaryUser) {
        this.notaryUser = notaryUser;
        return this;
    }
    public NotaryUser getNotaryUser() {
        return this.notaryUser;
    }

    public OnestepFlowNotaryInfo setPhaseNotaryList(java.util.List<PhaseNotary> phaseNotaryList) {
        this.phaseNotaryList = phaseNotaryList;
        return this;
    }
    public java.util.List<PhaseNotary> getPhaseNotaryList() {
        return this.phaseNotaryList;
    }

    public OnestepFlowNotaryInfo setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
