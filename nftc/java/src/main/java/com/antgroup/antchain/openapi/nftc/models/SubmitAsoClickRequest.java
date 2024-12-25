// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class SubmitAsoClickRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // App ID
    @NameInMap("appid")
    @Validation(required = true)
    public String appid;

    // 苹果设备的 IDFA
    @NameInMap("idfa")
    @Validation(required = true)
    public String idfa;

    // 用户终端的公网IP地址
    @NameInMap("ip")
    @Validation(required = true)
    public String ip;

    // 用户代理(User Agent)
    @NameInMap("ua")
    @Validation(required = true)
    public String ua;

    // 渠道标识(默认 qimai )
    @NameInMap("source")
    public String source;

    // urlencode后的回调地址
    @NameInMap("callback")
    @Validation(required = true)
    public String callback;

    // 手机型号 iphone10,3
    @NameInMap("model")
    public String model;

    public static SubmitAsoClickRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAsoClickRequest self = new SubmitAsoClickRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAsoClickRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAsoClickRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAsoClickRequest setAppid(String appid) {
        this.appid = appid;
        return this;
    }
    public String getAppid() {
        return this.appid;
    }

    public SubmitAsoClickRequest setIdfa(String idfa) {
        this.idfa = idfa;
        return this;
    }
    public String getIdfa() {
        return this.idfa;
    }

    public SubmitAsoClickRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public SubmitAsoClickRequest setUa(String ua) {
        this.ua = ua;
        return this;
    }
    public String getUa() {
        return this.ua;
    }

    public SubmitAsoClickRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SubmitAsoClickRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public SubmitAsoClickRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

}
