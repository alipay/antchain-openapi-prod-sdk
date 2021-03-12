// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateLogisticFinanceDisvcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 指定可验证声明颁发对象的分布式数字身份id
    @NameInMap("dest_did")
    @Validation(required = true)
    public String destDid;

    // 可验证声明有效期 (时间戳) ， 到达该时间戳表示的时间时过期， 默认一天
    @NameInMap("expire")
    public String expire;

    // vc颁发者分布式数字身份，缺省时为调用者的默认分布式数字身份
    @NameInMap("src_did")
    public String srcDid;

    public static CreateLogisticFinanceDisvcRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogisticFinanceDisvcRequest self = new CreateLogisticFinanceDisvcRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogisticFinanceDisvcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLogisticFinanceDisvcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLogisticFinanceDisvcRequest setDestDid(String destDid) {
        this.destDid = destDid;
        return this;
    }
    public String getDestDid() {
        return this.destDid;
    }

    public CreateLogisticFinanceDisvcRequest setExpire(String expire) {
        this.expire = expire;
        return this;
    }
    public String getExpire() {
        return this.expire;
    }

    public CreateLogisticFinanceDisvcRequest setSrcDid(String srcDid) {
        this.srcDid = srcDid;
        return this;
    }
    public String getSrcDid() {
        return this.srcDid;
    }

}
