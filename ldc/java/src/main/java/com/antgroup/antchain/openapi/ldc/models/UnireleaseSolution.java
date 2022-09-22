// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UnireleaseSolution extends TeaModel {
    // 发布单ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 发布单标题
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 解决方案平台源
    @NameInMap("source_system")
    @Validation(required = true)
    public String sourceSystem;

    // 发布类型，容器/经典
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 需求人/操作者
    @NameInMap("submitter")
    @Validation(required = true)
    public String submitter;

    // 解决方案状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 解决方案提出时间
    @NameInMap("create_time_stamp")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createTimeStamp;

    // 是否自动执行
    @NameInMap("auto_execute")
    @Validation(required = true)
    public Boolean autoExecute;

    // 环境信息
    @NameInMap("env")
    @Validation(required = true)
    public String env;

    // 变更人员
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 解决方案拓展信息
    @NameInMap("ext_info")
    @Validation(required = true)
    public UnireleaseSolutionExtInfo extInfo;

    // 解决方案包含的应用配置信息
    @NameInMap("apps")
    @Validation(required = true)
    public java.util.List<UnireleaseSolutionApp> apps;

    // 租户列表
    @NameInMap("tenants")
    @Validation(required = true)
    public java.util.List<String> tenants;

    // 错误信息
    @NameInMap("message")
    public String message;

    // AC ID
    @NameInMap("ac_id")
    public String acId;

    // 是否是紧急发布
    @NameInMap("emergent")
    public Boolean emergent;

    public static UnireleaseSolution build(java.util.Map<String, ?> map) throws Exception {
        UnireleaseSolution self = new UnireleaseSolution();
        return TeaModel.build(map, self);
    }

    public UnireleaseSolution setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UnireleaseSolution setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UnireleaseSolution setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
        return this;
    }
    public String getSourceSystem() {
        return this.sourceSystem;
    }

    public UnireleaseSolution setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UnireleaseSolution setSubmitter(String submitter) {
        this.submitter = submitter;
        return this;
    }
    public String getSubmitter() {
        return this.submitter;
    }

    public UnireleaseSolution setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public UnireleaseSolution setCreateTimeStamp(String createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }
    public String getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    public UnireleaseSolution setAutoExecute(Boolean autoExecute) {
        this.autoExecute = autoExecute;
        return this;
    }
    public Boolean getAutoExecute() {
        return this.autoExecute;
    }

    public UnireleaseSolution setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public UnireleaseSolution setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UnireleaseSolution setExtInfo(UnireleaseSolutionExtInfo extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public UnireleaseSolutionExtInfo getExtInfo() {
        return this.extInfo;
    }

    public UnireleaseSolution setApps(java.util.List<UnireleaseSolutionApp> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<UnireleaseSolutionApp> getApps() {
        return this.apps;
    }

    public UnireleaseSolution setTenants(java.util.List<String> tenants) {
        this.tenants = tenants;
        return this;
    }
    public java.util.List<String> getTenants() {
        return this.tenants;
    }

    public UnireleaseSolution setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnireleaseSolution setAcId(String acId) {
        this.acId = acId;
        return this;
    }
    public String getAcId() {
        return this.acId;
    }

    public UnireleaseSolution setEmergent(Boolean emergent) {
        this.emergent = emergent;
        return this;
    }
    public Boolean getEmergent() {
        return this.emergent;
    }

}
