// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ComboDTO extends TeaModel {
    // 主键id
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("id")
    public Long id;

    // 套餐名称
    /**
     * <strong>example:</strong>
     * <p>套餐名称xxx</p>
     */
    @NameInMap("name")
    public String name;

    // 套餐描述
    /**
     * <strong>example:</strong>
     * <p>套餐描述</p>
     */
    @NameInMap("description")
    public String description;

    // 套餐状态 DRAFT("DRAFT", "草稿"), ONLINE("ONLINE", "已上架"),OFFLINE("OFFLINE", "已下架");
    /**
     * <strong>example:</strong>
     * <p>DRAFT</p>
     */
    @NameInMap("status")
    public String status;

    // 套餐编码
    /**
     * <strong>example:</strong>
     * <p>C00250884</p>
     */
    @NameInMap("code")
    public String code;

    // 套餐唯一版本号，模板变更时更新
    /**
     * <strong>example:</strong>
     * <p>CV00252581</p>
     */
    @NameInMap("vid")
    public String vid;

    // 父版本号
    /**
     * <strong>example:</strong>
     * <p>1232456</p>
     */
    @NameInMap("parent_vid")
    public String parentVid;

    // 扩展配置
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("extends_config")
    public String extendsConfig;

    // 创建人
    /**
     * <strong>example:</strong>
     * <p>012111</p>
     */
    @NameInMap("creator")
    public String creator;

    // 修改人
    /**
     * <strong>example:</strong>
     * <p>0121111</p>
     */
    @NameInMap("modify")
    public String modify;

    // 审批流程ID
    /**
     * <strong>example:</strong>
     * <p>123212312</p>
     */
    @NameInMap("audit_process_id")
    public String auditProcessId;

    // 审批状态
    /**
     * <strong>example:</strong>
     * <p>PASS</p>
     */
    @NameInMap("audit_status")
    public String auditStatus;

    // 合同ID
    /**
     * <strong>example:</strong>
     * <p>20883519xxxxxxxx</p>
     */
    @NameInMap("quotation_id")
    public String quotationId;

    // 项目ID
    /**
     * <strong>example:</strong>
     * <p>102876</p>
     */
    @NameInMap("project_id")
    public String projectId;

    // 其他扩展信息
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("extends_info")
    public String extendsInfo;

    public static ComboDTO build(java.util.Map<String, ?> map) throws Exception {
        ComboDTO self = new ComboDTO();
        return TeaModel.build(map, self);
    }

    public ComboDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ComboDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ComboDTO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ComboDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ComboDTO setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ComboDTO setVid(String vid) {
        this.vid = vid;
        return this;
    }
    public String getVid() {
        return this.vid;
    }

    public ComboDTO setParentVid(String parentVid) {
        this.parentVid = parentVid;
        return this;
    }
    public String getParentVid() {
        return this.parentVid;
    }

    public ComboDTO setExtendsConfig(String extendsConfig) {
        this.extendsConfig = extendsConfig;
        return this;
    }
    public String getExtendsConfig() {
        return this.extendsConfig;
    }

    public ComboDTO setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ComboDTO setModify(String modify) {
        this.modify = modify;
        return this;
    }
    public String getModify() {
        return this.modify;
    }

    public ComboDTO setAuditProcessId(String auditProcessId) {
        this.auditProcessId = auditProcessId;
        return this;
    }
    public String getAuditProcessId() {
        return this.auditProcessId;
    }

    public ComboDTO setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public ComboDTO setQuotationId(String quotationId) {
        this.quotationId = quotationId;
        return this;
    }
    public String getQuotationId() {
        return this.quotationId;
    }

    public ComboDTO setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ComboDTO setExtendsInfo(String extendsInfo) {
        this.extendsInfo = extendsInfo;
        return this;
    }
    public String getExtendsInfo() {
        return this.extendsInfo;
    }

}
