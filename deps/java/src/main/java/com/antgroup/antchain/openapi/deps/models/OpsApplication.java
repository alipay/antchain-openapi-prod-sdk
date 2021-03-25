// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class OpsApplication extends TeaModel {
    // 应用（服务）名称
    @NameInMap("name")
    public String name;

    // 应用（服务）当前运维状态。取值列表：
    //                     INITING：初始化中；
    //                     INIT_FAILED：初始化失败；
    //                     INITED：初始化完成；
    //                     EXECUTING：执行中；
    //                     SUCCESS：执行成功；
    //                     FAILED：执行失败；
    //                     ROLLBACKED：已回滚；
    //                     CANCELED：已取消
    //                 
    @NameInMap("status")
    public String status;

    // APPLICATION和APP_SERVICE。设置为APPLICATION表示该实例描述对象为应用; APP_SERVICE表示该实例描述对象为应用服务。
    @NameInMap("type")
    @Validation(required = true)
    public String type;

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

    public OpsApplication setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OpsApplication setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
