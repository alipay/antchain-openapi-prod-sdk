// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 国家英文名称
    @NameInMap("keyword")
    public String keyword;

    public static QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest self = new QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}
