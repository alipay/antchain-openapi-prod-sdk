// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractSignFieldDetail extends TeaModel {
    // 签约主体类别，0-个人，1-机构，默认0,2 是不限
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("actor_indentity_type")
    public Long actorIndentityType;

    // 添加时间
    /**
     * <strong>example:</strong>
     * <p>1561473111450</p>
     */
    @NameInMap("add_time")
    public Long addTime;

    // 是否指定位置，TRUE表示不允许更新位置，配置项，无默认值
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("assigned_posbean")
    public Boolean assignedPosbean;

    // 是否指定印章数据，TRUE表示不允许更新印章，配置项，无默认值
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("assigned_seal")
    public Boolean assignedSeal;

    // 签约主体账号标识，将使用该主体账号对应的数字证书完成本次签署，如：当存在签署操作人代某机构签署时，需要传入该机构的账号id
    /**
     * <strong>example:</strong>
     * <p>2c7de24aff3340f5b944ebac49545b8e</p>
     */
    @NameInMap("authorized_account_id")
    public String authorizedAccountId;

    // 是否自动执行，TRUE需要静默授权，配置项，无默认值
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("auto_execute")
    public Boolean autoExecute;

    // 执行失败原因
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("execute_failed_reason")
    public String executeFailedReason;

    // 文件file id
    /**
     * <strong>example:</strong>
     * <p>fe7df2f477d649c18ebcfdfffeba253d</p>
     */
    @NameInMap("file_id")
    public String fileId;

    // 流程id
    /**
     * <strong>example:</strong>
     * <p>b2cb74258a634179b0df3cc54791c8b6</p>
     */
    @NameInMap("flow_id")
    public String flowId;

    // 签署区顺序，默认1,且不小于1，顺序越小越先处理
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("order")
    public Long order;

    // 页码信息，可以_,_或_-_分割
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pos_page")
    public String posPage;

    // x坐标
    /**
     * <strong>example:</strong>
     * <p>158.72531</p>
     */
    @NameInMap("pos_x")
    public String posX;

    // y坐标
    /**
     * <strong>example:</strong>
     * <p>431.05658</p>
     */
    @NameInMap("pos_y")
    public String posY;

    // 印章文件file key
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("seal_file_key")
    public String sealFileKey;

    // 印章id
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("seal_id")
    public String sealId;

    // 印章类型，支持多种类型时逗号分割，0-手绘印章，1-模版印章，为空不限制
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("seal_type")
    public String sealType;

    // 签署操作人个人账号标识，即操作本次签署的个人，如需e签宝通知用户签署，则系统向该账号下绑定的手机、邮箱发送签署链接
    /**
     * <strong>example:</strong>
     * <p>faea8237c61a4fdea864ee8d7621e14f</p>
     */
    @NameInMap("signer_account_id")
    public String signerAccountId;

    // 签署区Id
    /**
     * <strong>example:</strong>
     * <p>b76b69d5b48d4f689cae997e42809ac4</p>
     */
    @NameInMap("signfield_id")
    public String signfieldId;

    // 签署类型，0-不限，1-单页签署，2-骑缝签署,4-关键字签署，默认1
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("sign_type")
    public Long signType;

    // 签署区状态（0："等待执行，1："执行中"，2："执行失败"，3："审批中"，4： "执行完成"）
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Long status;

    // 状态描述
    /**
     * <strong>example:</strong>
     * <p>执行中</p>
     */
    @NameInMap("status_description")
    public String statusDescription;

    // 签署区宽
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("width")
    public String width;

    public static ContractSignFieldDetail build(java.util.Map<String, ?> map) throws Exception {
        ContractSignFieldDetail self = new ContractSignFieldDetail();
        return TeaModel.build(map, self);
    }

    public ContractSignFieldDetail setActorIndentityType(Long actorIndentityType) {
        this.actorIndentityType = actorIndentityType;
        return this;
    }
    public Long getActorIndentityType() {
        return this.actorIndentityType;
    }

    public ContractSignFieldDetail setAddTime(Long addTime) {
        this.addTime = addTime;
        return this;
    }
    public Long getAddTime() {
        return this.addTime;
    }

    public ContractSignFieldDetail setAssignedPosbean(Boolean assignedPosbean) {
        this.assignedPosbean = assignedPosbean;
        return this;
    }
    public Boolean getAssignedPosbean() {
        return this.assignedPosbean;
    }

    public ContractSignFieldDetail setAssignedSeal(Boolean assignedSeal) {
        this.assignedSeal = assignedSeal;
        return this;
    }
    public Boolean getAssignedSeal() {
        return this.assignedSeal;
    }

    public ContractSignFieldDetail setAuthorizedAccountId(String authorizedAccountId) {
        this.authorizedAccountId = authorizedAccountId;
        return this;
    }
    public String getAuthorizedAccountId() {
        return this.authorizedAccountId;
    }

    public ContractSignFieldDetail setAutoExecute(Boolean autoExecute) {
        this.autoExecute = autoExecute;
        return this;
    }
    public Boolean getAutoExecute() {
        return this.autoExecute;
    }

    public ContractSignFieldDetail setExecuteFailedReason(String executeFailedReason) {
        this.executeFailedReason = executeFailedReason;
        return this;
    }
    public String getExecuteFailedReason() {
        return this.executeFailedReason;
    }

    public ContractSignFieldDetail setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ContractSignFieldDetail setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ContractSignFieldDetail setOrder(Long order) {
        this.order = order;
        return this;
    }
    public Long getOrder() {
        return this.order;
    }

    public ContractSignFieldDetail setPosPage(String posPage) {
        this.posPage = posPage;
        return this;
    }
    public String getPosPage() {
        return this.posPage;
    }

    public ContractSignFieldDetail setPosX(String posX) {
        this.posX = posX;
        return this;
    }
    public String getPosX() {
        return this.posX;
    }

    public ContractSignFieldDetail setPosY(String posY) {
        this.posY = posY;
        return this;
    }
    public String getPosY() {
        return this.posY;
    }

    public ContractSignFieldDetail setSealFileKey(String sealFileKey) {
        this.sealFileKey = sealFileKey;
        return this;
    }
    public String getSealFileKey() {
        return this.sealFileKey;
    }

    public ContractSignFieldDetail setSealId(String sealId) {
        this.sealId = sealId;
        return this;
    }
    public String getSealId() {
        return this.sealId;
    }

    public ContractSignFieldDetail setSealType(String sealType) {
        this.sealType = sealType;
        return this;
    }
    public String getSealType() {
        return this.sealType;
    }

    public ContractSignFieldDetail setSignerAccountId(String signerAccountId) {
        this.signerAccountId = signerAccountId;
        return this;
    }
    public String getSignerAccountId() {
        return this.signerAccountId;
    }

    public ContractSignFieldDetail setSignfieldId(String signfieldId) {
        this.signfieldId = signfieldId;
        return this;
    }
    public String getSignfieldId() {
        return this.signfieldId;
    }

    public ContractSignFieldDetail setSignType(Long signType) {
        this.signType = signType;
        return this;
    }
    public Long getSignType() {
        return this.signType;
    }

    public ContractSignFieldDetail setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public ContractSignFieldDetail setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
        return this;
    }
    public String getStatusDescription() {
        return this.statusDescription;
    }

    public ContractSignFieldDetail setWidth(String width) {
        this.width = width;
        return this;
    }
    public String getWidth() {
        return this.width;
    }

}
