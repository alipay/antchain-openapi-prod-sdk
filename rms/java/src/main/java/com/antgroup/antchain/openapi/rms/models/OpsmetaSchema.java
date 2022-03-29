// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class OpsmetaSchema extends TeaModel {
    // envs
    @NameInMap("envs")
    @Validation(required = true)
    public java.util.List<String> envs;

    // idc
    @NameInMap("idc")
    @Validation(required = true)
    public OpsFilter idc;

    // ldc
    @NameInMap("ldc")
    @Validation(required = true)
    public OpsFilter ldc;

    // server
    @NameInMap("server")
    @Validation(required = true)
    public OpsFilter server;

    public static OpsmetaSchema build(java.util.Map<String, ?> map) throws Exception {
        OpsmetaSchema self = new OpsmetaSchema();
        return TeaModel.build(map, self);
    }

    public OpsmetaSchema setEnvs(java.util.List<String> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.List<String> getEnvs() {
        return this.envs;
    }

    public OpsmetaSchema setIdc(OpsFilter idc) {
        this.idc = idc;
        return this;
    }
    public OpsFilter getIdc() {
        return this.idc;
    }

    public OpsmetaSchema setLdc(OpsFilter ldc) {
        this.ldc = ldc;
        return this;
    }
    public OpsFilter getLdc() {
        return this.ldc;
    }

    public OpsmetaSchema setServer(OpsFilter server) {
        this.server = server;
        return this;
    }
    public OpsFilter getServer() {
        return this.server;
    }

}
