// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class SubmitAntchainPdcpJobPsiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 任务名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 任务类型，目前仅支持一种
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 任务的描述信息
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 任务执行参数，构造方式参考Participant结构体定义
    @NameInMap("participant_list")
    @Validation(required = true)
    public java.util.List<PsiParticipantConfig> participantList;

    public static SubmitAntchainPdcpJobPsiRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAntchainPdcpJobPsiRequest self = new SubmitAntchainPdcpJobPsiRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAntchainPdcpJobPsiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAntchainPdcpJobPsiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAntchainPdcpJobPsiRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SubmitAntchainPdcpJobPsiRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitAntchainPdcpJobPsiRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SubmitAntchainPdcpJobPsiRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitAntchainPdcpJobPsiRequest setParticipantList(java.util.List<PsiParticipantConfig> participantList) {
        this.participantList = participantList;
        return this;
    }
    public java.util.List<PsiParticipantConfig> getParticipantList() {
        return this.participantList;
    }

}
