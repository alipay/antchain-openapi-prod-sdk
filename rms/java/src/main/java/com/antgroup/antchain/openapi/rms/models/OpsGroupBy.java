// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class OpsGroupBy extends TeaModel {
    // 是否按环境分组
    @NameInMap("env")
    public Boolean env;

    // 是否按部署单元分组
    @NameInMap("deploy_unit")
    public Boolean deployUnit;

    // 是否按应用分组
    @NameInMap("app")
    public Boolean app;

    // 是否按idc分组
    @NameInMap("idc")
    public Boolean idc;

    // 是否按ldc分组
    @NameInMap("ldc")
    public Boolean ldc;

    // 是否按server分组
    @NameInMap("server")
    public Boolean server;

    // 附加信息
    @NameInMap("extra")
    public String extra;

    public static OpsGroupBy build(java.util.Map<String, ?> map) throws Exception {
        OpsGroupBy self = new OpsGroupBy();
        return TeaModel.build(map, self);
    }

    public OpsGroupBy setEnv(Boolean env) {
        this.env = env;
        return this;
    }
    public Boolean getEnv() {
        return this.env;
    }

    public OpsGroupBy setDeployUnit(Boolean deployUnit) {
        this.deployUnit = deployUnit;
        return this;
    }
    public Boolean getDeployUnit() {
        return this.deployUnit;
    }

    public OpsGroupBy setApp(Boolean app) {
        this.app = app;
        return this;
    }
    public Boolean getApp() {
        return this.app;
    }

    public OpsGroupBy setIdc(Boolean idc) {
        this.idc = idc;
        return this;
    }
    public Boolean getIdc() {
        return this.idc;
    }

    public OpsGroupBy setLdc(Boolean ldc) {
        this.ldc = ldc;
        return this;
    }
    public Boolean getLdc() {
        return this.ldc;
    }

    public OpsGroupBy setServer(Boolean server) {
        this.server = server;
        return this;
    }
    public Boolean getServer() {
        return this.server;
    }

    public OpsGroupBy setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

}
