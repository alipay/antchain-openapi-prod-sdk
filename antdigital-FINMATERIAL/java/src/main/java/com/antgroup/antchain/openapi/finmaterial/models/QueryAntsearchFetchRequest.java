// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.finmaterial.models;

import com.aliyun.tea.*;

public class QueryAntsearchFetchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要读取的公开网页 URL。每次请求仅支持一个 URL，协议须为 http 或 https
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 正文输出格式：text 或 markdown
    @NameInMap("content_format")
    public String contentFormat;

    // 网页读取最大等待时间，单位为秒，取值范围 1～60；超时后返回 IsSuccess=false 和 ErrorCode=FETCH_TIMEOUT
    @NameInMap("timeout")
    public Long timeout;

    public static QueryAntsearchFetchRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntsearchFetchRequest self = new QueryAntsearchFetchRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntsearchFetchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntsearchFetchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntsearchFetchRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public QueryAntsearchFetchRequest setContentFormat(String contentFormat) {
        this.contentFormat = contentFormat;
        return this;
    }
    public String getContentFormat() {
        return this.contentFormat;
    }

    public QueryAntsearchFetchRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}
