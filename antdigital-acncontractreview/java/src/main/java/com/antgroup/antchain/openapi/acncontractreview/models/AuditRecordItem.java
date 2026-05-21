// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acncontractreview.models;

import com.aliyun.tea.*;

public class AuditRecordItem extends TeaModel {
    // 审核id
    /**
     * <strong>example:</strong>
     * <p>CAR00000000000000000000052</p>
     */
    @NameInMap("audit_id")
    @Validation(required = true)
    public String auditId;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>PROCESSING：合同审核任务已提交，正在异步处理中 SUCCESS：合同审核已完成，结果可查询;FAIL：合同审核过程中发生错误，审核失败;FINALIZED：合同已完成定稿操作，生成最终版本</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 合同名称
    /**
     * <strong>example:</strong>
     * <p>XXX.docx</p>
     */
    @NameInMap("contract_file_name")
    @Validation(required = true)
    public String contractFileName;

    // 创建人id
    /**
     * <strong>example:</strong>
     * <p>2088000000000001</p>
     */
    @NameInMap("creator_work_no")
    @Validation(required = true)
    public String creatorWorkNo;

    // 创建人名称
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("creator_name")
    @Validation(required = true)
    public String creatorName;

    // 基准线库名称
    /**
     * <strong>example:</strong>
     * <p>基准线库</p>
     */
    @NameInMap("baseline_library_name")
    @Validation(required = true)
    public String baselineLibraryName;

    // 基准线id
    /**
     * <strong>example:</strong>
     * <p>BUS00020250909000000038865</p>
     */
    @NameInMap("bu_id")
    @Validation(required = true)
    public String buId;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2026-03-26 17:02:05</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 修改时间
    /**
     * <strong>example:</strong>
     * <p>2026-03-26 17:04:18</p>
     */
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 原始文件
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("original_file")
    public ContractFile originalFile;

    // 当前编辑文件（定稿文件）
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("final_file")
    public ContractFile finalFile;

    public static AuditRecordItem build(java.util.Map<String, ?> map) throws Exception {
        AuditRecordItem self = new AuditRecordItem();
        return TeaModel.build(map, self);
    }

    public AuditRecordItem setAuditId(String auditId) {
        this.auditId = auditId;
        return this;
    }
    public String getAuditId() {
        return this.auditId;
    }

    public AuditRecordItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AuditRecordItem setContractFileName(String contractFileName) {
        this.contractFileName = contractFileName;
        return this;
    }
    public String getContractFileName() {
        return this.contractFileName;
    }

    public AuditRecordItem setCreatorWorkNo(String creatorWorkNo) {
        this.creatorWorkNo = creatorWorkNo;
        return this;
    }
    public String getCreatorWorkNo() {
        return this.creatorWorkNo;
    }

    public AuditRecordItem setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public AuditRecordItem setBaselineLibraryName(String baselineLibraryName) {
        this.baselineLibraryName = baselineLibraryName;
        return this;
    }
    public String getBaselineLibraryName() {
        return this.baselineLibraryName;
    }

    public AuditRecordItem setBuId(String buId) {
        this.buId = buId;
        return this;
    }
    public String getBuId() {
        return this.buId;
    }

    public AuditRecordItem setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AuditRecordItem setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public AuditRecordItem setOriginalFile(ContractFile originalFile) {
        this.originalFile = originalFile;
        return this;
    }
    public ContractFile getOriginalFile() {
        return this.originalFile;
    }

    public AuditRecordItem setFinalFile(ContractFile finalFile) {
        this.finalFile = finalFile;
        return this;
    }
    public ContractFile getFinalFile() {
        return this.finalFile;
    }

}
