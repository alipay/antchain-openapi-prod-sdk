// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryMydidcommunAgencyTaskresultfileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件在数据隐私服务中标示
    @NameInMap("file_mark")
    @Validation(required = true)
    public String fileMark;

    // 结果文件拥有者did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    public static QueryMydidcommunAgencyTaskresultfileRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMydidcommunAgencyTaskresultfileRequest self = new QueryMydidcommunAgencyTaskresultfileRequest();
        return TeaModel.build(map, self);
    }

    public QueryMydidcommunAgencyTaskresultfileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMydidcommunAgencyTaskresultfileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMydidcommunAgencyTaskresultfileRequest setFileMark(String fileMark) {
        this.fileMark = fileMark;
        return this;
    }
    public String getFileMark() {
        return this.fileMark;
    }

    public QueryMydidcommunAgencyTaskresultfileRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
