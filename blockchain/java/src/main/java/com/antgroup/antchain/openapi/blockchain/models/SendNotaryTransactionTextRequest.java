// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SendNotaryTransactionTextRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 存证元数据
    @NameInMap("meta")
    @Validation(required = true)
    public NotaryMetaParam meta;

    // 存证内容
    @NameInMap("notary_content")
    @Validation(required = true)
    public String notaryContent;

    // 是否使用可信时间戳
    @NameInMap("tsr")
    public Boolean tsr;

    public static SendNotaryTransactionTextRequest build(java.util.Map<String, ?> map) throws Exception {
        SendNotaryTransactionTextRequest self = new SendNotaryTransactionTextRequest();
        return TeaModel.build(map, self);
    }

    public SendNotaryTransactionTextRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendNotaryTransactionTextRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendNotaryTransactionTextRequest setMeta(NotaryMetaParam meta) {
        this.meta = meta;
        return this;
    }
    public NotaryMetaParam getMeta() {
        return this.meta;
    }

    public SendNotaryTransactionTextRequest setNotaryContent(String notaryContent) {
        this.notaryContent = notaryContent;
        return this;
    }
    public String getNotaryContent() {
        return this.notaryContent;
    }

    public SendNotaryTransactionTextRequest setTsr(Boolean tsr) {
        this.tsr = tsr;
        return this;
    }
    public Boolean getTsr() {
        return this.tsr;
    }

}
