// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class DeleteHealthContactRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联系人业务id
    @NameInMap("contanct_id")
    @Validation(required = true)
    public String contanctId;

    // 品牌方渠道标识
    @NameInMap("channel_id")
    @Validation(required = true)
    public String channelId;

    public static DeleteHealthContactRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHealthContactRequest self = new DeleteHealthContactRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHealthContactRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteHealthContactRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteHealthContactRequest setContanctId(String contanctId) {
        this.contanctId = contanctId;
        return this;
    }
    public String getContanctId() {
        return this.contanctId;
    }

    public DeleteHealthContactRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

}
