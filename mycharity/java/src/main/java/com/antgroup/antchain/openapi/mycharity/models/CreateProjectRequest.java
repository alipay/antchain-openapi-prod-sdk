// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 50字符，单平台幂等
    @NameInMap("id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String id;

    // 50字符 机构id
    @NameInMap("org_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String orgId;

    // 100字符 项目名称
    @NameInMap("pj_name")
    @Validation(required = true, maxLength = 100, minLength = 1)
    public String pjName;

    // 64字符  公益领域（系统判断是否维护公益领域字典表，数据库存id）
    @NameInMap("public_welfare_direction")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String publicWelfareDirection;

    // 测试项目说明:0正式项目(默认),1测试项目
    @NameInMap("test_flag")
    public Long testFlag;

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateProjectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateProjectRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateProjectRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreateProjectRequest setPjName(String pjName) {
        this.pjName = pjName;
        return this;
    }
    public String getPjName() {
        return this.pjName;
    }

    public CreateProjectRequest setPublicWelfareDirection(String publicWelfareDirection) {
        this.publicWelfareDirection = publicWelfareDirection;
        return this;
    }
    public String getPublicWelfareDirection() {
        return this.publicWelfareDirection;
    }

    public CreateProjectRequest setTestFlag(Long testFlag) {
        this.testFlag = testFlag;
        return this;
    }
    public Long getTestFlag() {
        return this.testFlag;
    }

}
