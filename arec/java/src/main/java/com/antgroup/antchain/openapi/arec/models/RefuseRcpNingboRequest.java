// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class RefuseRcpNingboRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求时间，是以long类型的字符串
    @NameInMap("timestamp")
    @Validation(required = true)
    public String timestamp;

    // 业务号
    @NameInMap("ywh")
    @Validation(required = true)
    public String ywh;

    // 状态：1—审核通过（开始受理），2—驳回
    // 
    @NameInMap("zt")
    @Validation(required = true)
    public String zt;

    // 备注，驳回原因
    @NameInMap("bz")
    @Validation(required = true)
    public String bz;

    // 操作人
    @NameInMap("czr")
    @Validation(required = true)
    public String czr;

    // 操作时间 yyyy-MM-dd HH:mm:ss
    @NameInMap("czsj")
    @Validation(required = true)
    public String czsj;

    public static RefuseRcpNingboRequest build(java.util.Map<String, ?> map) throws Exception {
        RefuseRcpNingboRequest self = new RefuseRcpNingboRequest();
        return TeaModel.build(map, self);
    }

    public RefuseRcpNingboRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RefuseRcpNingboRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RefuseRcpNingboRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public RefuseRcpNingboRequest setYwh(String ywh) {
        this.ywh = ywh;
        return this;
    }
    public String getYwh() {
        return this.ywh;
    }

    public RefuseRcpNingboRequest setZt(String zt) {
        this.zt = zt;
        return this;
    }
    public String getZt() {
        return this.zt;
    }

    public RefuseRcpNingboRequest setBz(String bz) {
        this.bz = bz;
        return this;
    }
    public String getBz() {
        return this.bz;
    }

    public RefuseRcpNingboRequest setCzr(String czr) {
        this.czr = czr;
        return this;
    }
    public String getCzr() {
        return this.czr;
    }

    public RefuseRcpNingboRequest setCzsj(String czsj) {
        this.czsj = czsj;
        return this;
    }
    public String getCzsj() {
        return this.czsj;
    }

}
