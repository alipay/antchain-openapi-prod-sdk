// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class EnterpriseCaseInfo extends TeaModel {
    // 立案信息
    /**
     * <strong>example:</strong>
     * <p>立案信息</p>
     */
    @NameInMap("case_info")
    public String caseInfo;

    // 案件号
    /**
     * <strong>example:</strong>
     * <p>案件号</p>
     */
    @NameInMap("case_code")
    public String caseCode;

    // 立案时间
    /**
     * <strong>example:</strong>
     * <p>2021-12-09</p>
     */
    @NameInMap("case_create_time")
    public String caseCreateTime;

    // 案件状态
    /**
     * <strong>example:</strong>
     * <p>案件状态</p>
     */
    @NameInMap("case_status")
    public String caseStatus;

    // 公示状态
    /**
     * <strong>example:</strong>
     * <p>公示状态</p>
     */
    @NameInMap("publish_status")
    public String publishStatus;

    // 被执行人姓名
    /**
     * <strong>example:</strong>
     * <p>被执行人姓名</p>
     */
    @NameInMap("exec_name")
    public String execName;

    // 执行法院
    /**
     * <strong>example:</strong>
     * <p>执行法院</p>
     */
    @NameInMap("exec_court_name")
    public String execCourtName;

    // 执行标的(元)
    /**
     * <strong>example:</strong>
     * <p>执行标的(元)</p>
     */
    @NameInMap("exec_money")
    public String execMoney;

    // 关联裁判文书
    /**
     * <strong>example:</strong>
     * <p>关联裁判文书</p>
     */
    @NameInMap("gist_id")
    public String gistId;

    // 案由
    /**
     * <strong>example:</strong>
     * <p>案由</p>
     */
    @NameInMap("case_type")
    public String caseType;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2021-12-09</p>
     */
    @NameInMap("create_time")
    public String createTime;

    public static EnterpriseCaseInfo build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseCaseInfo self = new EnterpriseCaseInfo();
        return TeaModel.build(map, self);
    }

    public EnterpriseCaseInfo setCaseInfo(String caseInfo) {
        this.caseInfo = caseInfo;
        return this;
    }
    public String getCaseInfo() {
        return this.caseInfo;
    }

    public EnterpriseCaseInfo setCaseCode(String caseCode) {
        this.caseCode = caseCode;
        return this;
    }
    public String getCaseCode() {
        return this.caseCode;
    }

    public EnterpriseCaseInfo setCaseCreateTime(String caseCreateTime) {
        this.caseCreateTime = caseCreateTime;
        return this;
    }
    public String getCaseCreateTime() {
        return this.caseCreateTime;
    }

    public EnterpriseCaseInfo setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
        return this;
    }
    public String getCaseStatus() {
        return this.caseStatus;
    }

    public EnterpriseCaseInfo setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }
    public String getPublishStatus() {
        return this.publishStatus;
    }

    public EnterpriseCaseInfo setExecName(String execName) {
        this.execName = execName;
        return this;
    }
    public String getExecName() {
        return this.execName;
    }

    public EnterpriseCaseInfo setExecCourtName(String execCourtName) {
        this.execCourtName = execCourtName;
        return this;
    }
    public String getExecCourtName() {
        return this.execCourtName;
    }

    public EnterpriseCaseInfo setExecMoney(String execMoney) {
        this.execMoney = execMoney;
        return this;
    }
    public String getExecMoney() {
        return this.execMoney;
    }

    public EnterpriseCaseInfo setGistId(String gistId) {
        this.gistId = gistId;
        return this;
    }
    public String getGistId() {
        return this.gistId;
    }

    public EnterpriseCaseInfo setCaseType(String caseType) {
        this.caseType = caseType;
        return this;
    }
    public String getCaseType() {
        return this.caseType;
    }

    public EnterpriseCaseInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

}
