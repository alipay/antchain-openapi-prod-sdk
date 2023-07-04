// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class AutoTestAvailableProdOption extends TeaModel {
    // 是否可执行测试用例	
    @NameInMap("is_runnable")
    @Validation(required = true)
    public Boolean isRunnable;

    // 不能执行自动化测试用例的原因	
    // 
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // 部署单元唯一标识（元数据）	
    // 
    @NameInMap("deployment_unit_identity")
    @Validation(required = true)
    public String deploymentUnitIdentity;

    // 部署单元实例唯一标识	
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    public static AutoTestAvailableProdOption build(java.util.Map<String, ?> map) throws Exception {
        AutoTestAvailableProdOption self = new AutoTestAvailableProdOption();
        return TeaModel.build(map, self);
    }

    public AutoTestAvailableProdOption setIsRunnable(Boolean isRunnable) {
        this.isRunnable = isRunnable;
        return this;
    }
    public Boolean getIsRunnable() {
        return this.isRunnable;
    }

    public AutoTestAvailableProdOption setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AutoTestAvailableProdOption setDeploymentUnitIdentity(String deploymentUnitIdentity) {
        this.deploymentUnitIdentity = deploymentUnitIdentity;
        return this;
    }
    public String getDeploymentUnitIdentity() {
        return this.deploymentUnitIdentity;
    }

    public AutoTestAvailableProdOption setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public AutoTestAvailableProdOption setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

}
