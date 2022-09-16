// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class ProjectVO extends TeaModel {
    // 公益项目ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    // 公益项目名称
    @NameInMap("pj_name")
    @Validation(required = true)
    public String pjName;

    // 机构ID
    @NameInMap("org_id")
    @Validation(required = true)
    public String orgId;

    // 公益方向
    @NameInMap("public_welfare_direction")
    @Validation(required = true)
    public String publicWelfareDirection;

    // 测试项目:0正式项目(默认),1测试项目
    @NameInMap("test_flag")
    public Long testFlag;

    public static ProjectVO build(java.util.Map<String, ?> map) throws Exception {
        ProjectVO self = new ProjectVO();
        return TeaModel.build(map, self);
    }

    public ProjectVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ProjectVO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public ProjectVO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public ProjectVO setPjName(String pjName) {
        this.pjName = pjName;
        return this;
    }
    public String getPjName() {
        return this.pjName;
    }

    public ProjectVO setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ProjectVO setPublicWelfareDirection(String publicWelfareDirection) {
        this.publicWelfareDirection = publicWelfareDirection;
        return this;
    }
    public String getPublicWelfareDirection() {
        return this.publicWelfareDirection;
    }

    public ProjectVO setTestFlag(Long testFlag) {
        this.testFlag = testFlag;
        return this;
    }
    public Long getTestFlag() {
        return this.testFlag;
    }

}
