// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryInvoicesocrVatinvoiceRequest extends TeaModel {
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
    public String source;

    // 单次调用唯一标示，用于异常问题排查，调用方需要负责生成并且记录在调用日志里
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 目前只支持pdf、jpg两种file_type的识别能力，根据具体传入的发票的格式传入正确的值
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    public static QueryInvoicesocrVatinvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInvoicesocrVatinvoiceRequest self = new QueryInvoicesocrVatinvoiceRequest();
        return TeaModel.build(map, self);
    }

    public QueryInvoicesocrVatinvoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInvoicesocrVatinvoiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInvoicesocrVatinvoiceRequest setImageRaw(String imageRaw) {
        this.imageRaw = imageRaw;
        return this;
    }
    public String getImageRaw() {
        return this.imageRaw;
    }

    public QueryInvoicesocrVatinvoiceRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public QueryInvoicesocrVatinvoiceRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryInvoicesocrVatinvoiceRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryInvoicesocrVatinvoiceRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
