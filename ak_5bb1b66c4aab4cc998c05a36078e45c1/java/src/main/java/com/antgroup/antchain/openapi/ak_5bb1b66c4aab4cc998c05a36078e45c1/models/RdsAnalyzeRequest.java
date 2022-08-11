// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5bb1b66c4aab4cc998c05a36078e45c1.models;

import com.aliyun.tea.*;

public class RdsAnalyzeRequest extends TeaModel {
    // 123
    @NameInMap("appid")
    @Validation(required = true)
    public String appid;

    // 123
    @NameInMap("biz_no")
    public String bizNo;

    // 213
    @NameInMap("scene")
    public String scene;

    // 123
    @NameInMap("token")
    public String token;

    // 123
    @NameInMap("data")
    public String data;

    // 123
    @NameInMap("extra")
    public String extra;

    public static RdsAnalyzeRequest build(java.util.Map<String, ?> map) throws Exception {
        RdsAnalyzeRequest self = new RdsAnalyzeRequest();
        return TeaModel.build(map, self);
    }

    public RdsAnalyzeRequest setAppid(String appid) {
        this.appid = appid;
        return this;
    }
    public String getAppid() {
        return this.appid;
    }

    public RdsAnalyzeRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public RdsAnalyzeRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public RdsAnalyzeRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public RdsAnalyzeRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RdsAnalyzeRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

}
