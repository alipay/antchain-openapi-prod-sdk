// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryBaiOcrRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用业务方身份标识，指明调用来源
    @NameInMap("app_key")
    @Validation(required = true)
    public String appKey;

    // OCR服务的业务类型，目前支持：
    // businessLicense，营业执照识别
    // idCard，身份证识别
    // bankCard，银行卡识别
    // VATInvoice，增值税发票识别
    @NameInMap("ocr_type")
    @Validation(required = true)
    public String ocrType;

    // 请求的资源类型，目前支持：
    // image，图片
    // pdf，PDF复印件
    @NameInMap("source_type")
    @Validation(required = true)
    public String sourceType;

    // 图片或PDF等内容的base64内容字符串
    @NameInMap("source_base64")
    @Validation(required = true)
    public String sourceBase64;

    // 资源的附加属性
    // 如针对身份证识别，需要指定face(人像面)或back(国徽面)
    @NameInMap("source_config_side")
    public String sourceConfigSide;

    public static QueryBaiOcrRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBaiOcrRequest self = new QueryBaiOcrRequest();
        return TeaModel.build(map, self);
    }

    public QueryBaiOcrRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBaiOcrRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBaiOcrRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public QueryBaiOcrRequest setOcrType(String ocrType) {
        this.ocrType = ocrType;
        return this;
    }
    public String getOcrType() {
        return this.ocrType;
    }

    public QueryBaiOcrRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public QueryBaiOcrRequest setSourceBase64(String sourceBase64) {
        this.sourceBase64 = sourceBase64;
        return this;
    }
    public String getSourceBase64() {
        return this.sourceBase64;
    }

    public QueryBaiOcrRequest setSourceConfigSide(String sourceConfigSide) {
        this.sourceConfigSide = sourceConfigSide;
        return this;
    }
    public String getSourceConfigSide() {
        return this.sourceConfigSide;
    }

}
