// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class OpsPlan extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 环境Id
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    // 解决方案Id
    @NameInMap("solution_id")
    @Validation(required = true)
    public String solutionId;

    // 发布单类型
    @NameInMap("ops_type")
    @Validation(required = true)
    public String opsType;

    // 发布单类型
    @NameInMap("plan_type")
    @Validation(required = true)
    public String planType;

    // 创建人id
    @NameInMap("creator")
    @Validation(required = true)
    public String creator;

    // 创建人名称
    @NameInMap("creator_name")
    @Validation(required = true)
    public String creatorName;

    // 发布单状态
    @NameInMap("ops_plan_status")
    @Validation(required = true)
    public String opsPlanStatus;

    // 创建时间
    @NameInMap("utc_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // 修改时间
    @NameInMap("utc_modified")
    @Validation(required = true)
    public String utcModified;

    public static OpsPlan build(java.util.Map<String, ?> map) throws Exception {
        OpsPlan self = new OpsPlan();
        return TeaModel.build(map, self);
    }

    public OpsPlan setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OpsPlan setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpsPlan setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public OpsPlan setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

    public OpsPlan setOpsType(String opsType) {
        this.opsType = opsType;
        return this;
    }
    public String getOpsType() {
        return this.opsType;
    }

    public OpsPlan setPlanType(String planType) {
        this.planType = planType;
        return this;
    }
    public String getPlanType() {
        return this.planType;
    }

    public OpsPlan setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public OpsPlan setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public OpsPlan setOpsPlanStatus(String opsPlanStatus) {
        this.opsPlanStatus = opsPlanStatus;
        return this;
    }
    public String getOpsPlanStatus() {
        return this.opsPlanStatus;
    }

    public OpsPlan setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public OpsPlan setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

}
