// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ListBlockchainBotIotsuccessProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("page_index")
    public Long pageIndex;

    @NameInMap("page_size")
    public Long pageSize;

    @NameInMap("name")
    public String name;

    @NameInMap("external_id")
    public String externalId;

    // 枚举:LICENSE,INSTANCE
    @NameInMap("authorization_mode")
    public String authorizationMode;

    @NameInMap("from")
    public String from;

    @NameInMap("to")
    public String to;

    public static ListBlockchainBotIotsuccessProductRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBlockchainBotIotsuccessProductRequest self = new ListBlockchainBotIotsuccessProductRequest();
        return TeaModel.build(map, self);
    }

    public ListBlockchainBotIotsuccessProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListBlockchainBotIotsuccessProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListBlockchainBotIotsuccessProductRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListBlockchainBotIotsuccessProductRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListBlockchainBotIotsuccessProductRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListBlockchainBotIotsuccessProductRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public ListBlockchainBotIotsuccessProductRequest setAuthorizationMode(String authorizationMode) {
        this.authorizationMode = authorizationMode;
        return this;
    }
    public String getAuthorizationMode() {
        return this.authorizationMode;
    }

    public ListBlockchainBotIotsuccessProductRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public ListBlockchainBotIotsuccessProductRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

}
