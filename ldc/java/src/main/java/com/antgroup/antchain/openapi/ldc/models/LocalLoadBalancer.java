// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class LocalLoadBalancer extends TeaModel {
    // local lb所在部署单元
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    // local lb实例对应的iaas id
    @NameInMap("iaas_id")
    public String iaasId;

    // local lb实例对应的vip
    @NameInMap("vip")
    public String vip;

    // 当前cell lb的phase
    @NameInMap("phase")
    public String phase;

    // 空代表无错误信息，非空时即报错信息
    @NameInMap("message")
    public String message;

    public static LocalLoadBalancer build(java.util.Map<String, ?> map) throws Exception {
        LocalLoadBalancer self = new LocalLoadBalancer();
        return TeaModel.build(map, self);
    }

    public LocalLoadBalancer setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public LocalLoadBalancer setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public LocalLoadBalancer setVip(String vip) {
        this.vip = vip;
        return this;
    }
    public String getVip() {
        return this.vip;
    }

    public LocalLoadBalancer setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public LocalLoadBalancer setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
