// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class OpsDeployment extends TeaModel {
    // 此部署操作中所有被操作的应用（服务）详情，以操作链的形式体现
    @NameInMap("application_chains")
    @Validation(required = true)
    public java.util.List<OpsApplicationChain> applicationChains;

    // 部署操作执行者
    @NameInMap("executor")
    @Validation(required = true)
    public String executor;

    // 部署单id
    @NameInMap("operation_id")
    @Validation(required = true)
    public String operationId;

    // 
    //                     
    //     部署单状态。取值列表：
    //     INITING：初始化中；
    //     INIT_FAILED：初始化失败；
    //     INITED：初始化完成；
    //     EXECUTING：执行中；
    //     SUCCESS：执行成功；
    //     FAILED：执行失败；
    //     CANCELING：取消中；
    //     CANCELED：已取消
    //                     
    //                 
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 部署单标题。长度不超过50个UTF-8字符
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    public static OpsDeployment build(java.util.Map<String, ?> map) throws Exception {
        OpsDeployment self = new OpsDeployment();
        return TeaModel.build(map, self);
    }

    public OpsDeployment setApplicationChains(java.util.List<OpsApplicationChain> applicationChains) {
        this.applicationChains = applicationChains;
        return this;
    }
    public java.util.List<OpsApplicationChain> getApplicationChains() {
        return this.applicationChains;
    }

    public OpsDeployment setExecutor(String executor) {
        this.executor = executor;
        return this;
    }
    public String getExecutor() {
        return this.executor;
    }

    public OpsDeployment setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public OpsDeployment setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OpsDeployment setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
