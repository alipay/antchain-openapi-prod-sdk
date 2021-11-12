// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class System extends TeaModel {
    // 系统的代码commit
    @NameInMap("commit_id")
    @Validation(required = true)
    public String commitId;

    // 管理的环境列表
    @NameInMap("envs")
    @Validation(required = true)
    public java.util.List<Env> envs;

    // 支持的OpenAPI列表
    @NameInMap("open_apis")
    @Validation(required = true)
    public java.util.List<OpenAPI> openApis;

    // 云游的产品版本号, 该值可能为空
    @NameInMap("version")
    public String version;

    public static System build(java.util.Map<String, ?> map) throws Exception {
        System self = new System();
        return TeaModel.build(map, self);
    }

    public System setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public System setEnvs(java.util.List<Env> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.List<Env> getEnvs() {
        return this.envs;
    }

    public System setOpenApis(java.util.List<OpenAPI> openApis) {
        this.openApis = openApis;
        return this;
    }
    public java.util.List<OpenAPI> getOpenApis() {
        return this.openApis;
    }

    public System setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
