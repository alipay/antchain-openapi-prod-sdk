// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ListBlockchainBotIotsuccessProductTemplateGlobalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("page_index")
    public Long pageIndex;

    @NameInMap("page_size")
    public Long pageSize;

    public static ListBlockchainBotIotsuccessProductTemplateGlobalRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBlockchainBotIotsuccessProductTemplateGlobalRequest self = new ListBlockchainBotIotsuccessProductTemplateGlobalRequest();
        return TeaModel.build(map, self);
    }

    public ListBlockchainBotIotsuccessProductTemplateGlobalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListBlockchainBotIotsuccessProductTemplateGlobalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListBlockchainBotIotsuccessProductTemplateGlobalRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListBlockchainBotIotsuccessProductTemplateGlobalRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
