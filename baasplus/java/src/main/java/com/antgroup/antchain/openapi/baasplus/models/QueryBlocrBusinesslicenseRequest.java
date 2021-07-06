// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryBlocrBusinesslicenseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件二进制内容 + base64
    @NameInMap("image_raw")
    public String imageRaw;

    // 图片下载url
    @NameInMap("image_url")
    public String imageUrl;

    // 服务调用来源(需要咨询服务提供方)
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 单次调用唯一标示，用于异常问题排查，调用方需要负责生成并且记录在调用日志里
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static QueryBlocrBusinesslicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlocrBusinesslicenseRequest self = new QueryBlocrBusinesslicenseRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlocrBusinesslicenseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlocrBusinesslicenseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlocrBusinesslicenseRequest setImageRaw(String imageRaw) {
        this.imageRaw = imageRaw;
        return this;
    }
    public String getImageRaw() {
        return this.imageRaw;
    }

    public QueryBlocrBusinesslicenseRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public QueryBlocrBusinesslicenseRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryBlocrBusinesslicenseRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
