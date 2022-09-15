// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class UpdateProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 50字符，单平台幂等
    @NameInMap("id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String id;

    // 100字符 项目名称
    @NameInMap("pj_name")
    @Validation(required = true, maxLength = 100, minLength = 1)
    public String pjName;

    // 64字符 公益领域（系统判断是否维护公益领域字典表，数据库存id）
    @NameInMap("public_welfare_direction")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String publicWelfareDirection;

    // 测试项目说明:0正式项目(默认),1测试项目
    @NameInMap("test_flag")
    @Validation(required = true, maximum = 1)
    public Long testFlag;

    public static UpdateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectRequest self = new UpdateProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateProjectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateProjectRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateProjectRequest setPjName(String pjName) {
        this.pjName = pjName;
        return this;
    }
    public String getPjName() {
        return this.pjName;
    }

    public UpdateProjectRequest setPublicWelfareDirection(String publicWelfareDirection) {
        this.publicWelfareDirection = publicWelfareDirection;
        return this;
    }
    public String getPublicWelfareDirection() {
        return this.publicWelfareDirection;
    }

    public UpdateProjectRequest setTestFlag(Long testFlag) {
        this.testFlag = testFlag;
        return this;
    }
    public Long getTestFlag() {
        return this.testFlag;
    }

}
