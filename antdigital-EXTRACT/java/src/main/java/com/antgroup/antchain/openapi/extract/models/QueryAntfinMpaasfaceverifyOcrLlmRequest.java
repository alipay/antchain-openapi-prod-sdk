// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.extract.models;

import com.aliyun.tea.*;

public class QueryAntfinMpaasfaceverifyOcrLlmRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部订单号，必填且不能为空，长度不超过128个字符，用于业务链路关联。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 图片加密信封的JSON字符串。image为AES加密图片的Base64，sign为MD5(Base64(AES密钥)+image)，type为可选材料类型；须与content_sig配套。解密后图片大小默认不超过10MiB。
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 使用约定RSA公钥加密本次随机AES密钥后得到的Base64字符串，与content配套；复用通用OCR图片加密协议。
    @NameInMap("content_sig")
    @Validation(required = true)
    public String contentSig;

    // 材料英文编码，忽略大小写及首尾空白。不传或未知编码走通用OCR。支持ID_CARD_FRONT、ID_CARD_BACK、DRIVER_LICENSE_OCR、DRIVER_LICENSE_BACK_OCR、VEHICLE_LICENSE_OCR、VEHICLE_LICENSE_BACK_OCR、PASSPORT_OCR、BANK_CARD_OCR、HOUSEHOLD_REGISTER_HOME_OCR、HOUSEHOLD_REGISTER_INNER_OCR、HK_MC_PASS_OCR、INLAND_HK_MC_PASS_OCR、TAX_PAYMENT_CERTIFICATE_OCR、OTHER。
    @NameInMap("ocr_type")
    public String ocrType;

    // 指定抽取字段的JSON数组字符串，元素必须为非空白字符串，与ocr_type互不约束。未传或传空数组时，采用材料默认字段或通用抽取模式。
    @NameInMap("extract_fields")
    public String extractFields;

    // 由已授权可信服务端构造的商户上下文JSON字符串，包含merchantId、merchantName、platform、appId。用于落单计费，不允许从终端客户参数直接透传。
    @NameInMap("extern_info")
    @Validation(required = true)
    public String externInfo;

    public static QueryAntfinMpaasfaceverifyOcrLlmRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntfinMpaasfaceverifyOcrLlmRequest self = new QueryAntfinMpaasfaceverifyOcrLlmRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntfinMpaasfaceverifyOcrLlmRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntfinMpaasfaceverifyOcrLlmRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntfinMpaasfaceverifyOcrLlmRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryAntfinMpaasfaceverifyOcrLlmRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryAntfinMpaasfaceverifyOcrLlmRequest setContentSig(String contentSig) {
        this.contentSig = contentSig;
        return this;
    }
    public String getContentSig() {
        return this.contentSig;
    }

    public QueryAntfinMpaasfaceverifyOcrLlmRequest setOcrType(String ocrType) {
        this.ocrType = ocrType;
        return this;
    }
    public String getOcrType() {
        return this.ocrType;
    }

    public QueryAntfinMpaasfaceverifyOcrLlmRequest setExtractFields(String extractFields) {
        this.extractFields = extractFields;
        return this;
    }
    public String getExtractFields() {
        return this.extractFields;
    }

    public QueryAntfinMpaasfaceverifyOcrLlmRequest setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
