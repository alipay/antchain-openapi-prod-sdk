// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mpaasfaceverify.models;

import com.aliyun.tea.*;

public class UploadOcrServermodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 操作类型
    @NameInMap("operation_type")
    public String operationType;

    // 预留扩展业务参数
    @NameInMap("extern_param")
    public String externParam;

    // 对称密钥加密的ocr内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 非对称密钥加密后的对称密钥
    @NameInMap("content_sig")
    @Validation(required = true)
    public String contentSig;

    public static UploadOcrServermodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadOcrServermodeRequest self = new UploadOcrServermodeRequest();
        return TeaModel.build(map, self);
    }

    public UploadOcrServermodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadOcrServermodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadOcrServermodeRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UploadOcrServermodeRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public UploadOcrServermodeRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

    public UploadOcrServermodeRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UploadOcrServermodeRequest setContentSig(String contentSig) {
        this.contentSig = contentSig;
        return this;
    }
    public String getContentSig() {
        return this.contentSig;
    }

}
