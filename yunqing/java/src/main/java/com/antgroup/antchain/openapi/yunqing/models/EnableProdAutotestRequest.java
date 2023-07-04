// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class EnableProdAutotestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 环境id
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    // 产品码
    @NameInMap("prod_codes")
    public java.util.List<String> prodCodes;

    // READY("READY", "准备执行"), DEPLOYING("DEPLOYING", "部署中, 首次部署时的状态"),  UPGRADING("UPGRADING", "升级中, 首次部署时的状态"),      ROLL_BACKING("ROLL_BACKING", "回滚中, 包括产品回滚和应用回滚"),      ACTIVE("ACTIVE", "可用"),      FAILED("FAILED", "失败"),ROLLBACKED("ROLLBACKED", "已回滚"),APP_ROLLBACKED("APP_ROLLBACKED", "应用回滚")
    @NameInMap("prod_status")
    public java.util.List<String> prodStatus;

    public static EnableProdAutotestRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableProdAutotestRequest self = new EnableProdAutotestRequest();
        return TeaModel.build(map, self);
    }

    public EnableProdAutotestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EnableProdAutotestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public EnableProdAutotestRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public EnableProdAutotestRequest setProdCodes(java.util.List<String> prodCodes) {
        this.prodCodes = prodCodes;
        return this;
    }
    public java.util.List<String> getProdCodes() {
        return this.prodCodes;
    }

    public EnableProdAutotestRequest setProdStatus(java.util.List<String> prodStatus) {
        this.prodStatus = prodStatus;
        return this;
    }
    public java.util.List<String> getProdStatus() {
        return this.prodStatus;
    }

}
