// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PullAuthWebpageUrlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实人认证使用的biz_id，长度不超过64字符的业务唯一id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 实人认证使用的biz_type，通常为业务方自己在阿里云实人认证控制台创建。
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 业务方C端用户身份证信息，会进入可验证声明claim内容中。
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 业务方可以传递的附加信息，通常跟可验证声明的claim有关，目前是可选项，将来业务复杂后，需要指定claim类型，或者附加信息内容说明.
    @NameInMap("extension")
    public String extension;

    // 业务方C端用户姓名信息，会进入可验证声明claim内容中。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 业务方B类身份标识id，与创建的业务方B类DID（颁发可验证声明的subject目标）时baas.auth.corporate.did.create接口的入参owner_uid相同。
    @NameInMap("pk_id")
    @Validation(required = true)
    public String pkId;

    public static PullAuthWebpageUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        PullAuthWebpageUrlRequest self = new PullAuthWebpageUrlRequest();
        return TeaModel.build(map, self);
    }

    public PullAuthWebpageUrlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PullAuthWebpageUrlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PullAuthWebpageUrlRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PullAuthWebpageUrlRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public PullAuthWebpageUrlRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public PullAuthWebpageUrlRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public PullAuthWebpageUrlRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PullAuthWebpageUrlRequest setPkId(String pkId) {
        this.pkId = pkId;
        return this;
    }
    public String getPkId() {
        return this.pkId;
    }

}
