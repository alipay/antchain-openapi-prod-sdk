// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class OpsApplication extends TeaModel {
    // 应用名称
    @NameInMap("name")
    public String name;

    // 应用发布版本（部分运维操作可能不包含版本信息，为null）
    @NameInMap("version")
    public String version;

    // 应用（服务）当前运维状态。取值列表： INITING：初始化中； INIT_FAILED：初始化失败； INITED：初始化完成； EXECUTING：执行中； SUCCESS：执行成功； FAILED：执行失败； ROLLBACKED：已回滚； CANCELED：已取消
    @NameInMap("status")
    public String status;

    public static OpsApplication build(java.util.Map<String, ?> map) throws Exception {
        OpsApplication self = new OpsApplication();
        return TeaModel.build(map, self);
    }

    public OpsApplication setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpsApplication setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public OpsApplication setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
