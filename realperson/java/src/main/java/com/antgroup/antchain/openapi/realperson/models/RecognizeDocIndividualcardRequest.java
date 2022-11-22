// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class RecognizeDocIndividualcardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 长度不超过32位的0-9A-Za-z字符串。
    // 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
    @NameInMap("out_order_no")
    @Validation(required = true)
    public String outOrderNo;

    // 待识别的卡类型。取值约束：ID_CARD（身份证）;EEP_TO_ML_CARD（港澳来往大陆通行证）;BANK_CARD（银行卡）
    @NameInMap("card_type")
    @Validation(required = true)
    public String cardType;

    // 传入的图片是base64编码的图片还是图片的URL。取值约束：BASE64（类型为base64）；URL（类型为URL）
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // 传入的图片的具体内容，需要与data_type的选择保持一致。
    @NameInMap("data_content")
    @Validation(required = true)
    public String dataContent;

    // 入参data_content是否经公钥RSA加密。不填默认不加密。取值约束：0（不加密）；1（加密）
    @NameInMap("req_enc_type")
    public String reqEncType;

    // 出参ocr_info是否经AES加密。不填默认不加密。取值约束：0（不加密）；1（加密）
    @NameInMap("resp_enc_type")
    public String respEncType;

    // 经过公钥RSA加密的AES密钥，用于对出参ocr_info加密。当resp_enc_type =1时必填。
    @NameInMap("resp_enc_token")
    public String respEncToken;

    // 扩展信息JSON串。
    @NameInMap("extern_param")
    public String externParam;

    public static RecognizeDocIndividualcardRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeDocIndividualcardRequest self = new RecognizeDocIndividualcardRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeDocIndividualcardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RecognizeDocIndividualcardRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RecognizeDocIndividualcardRequest setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    public RecognizeDocIndividualcardRequest setCardType(String cardType) {
        this.cardType = cardType;
        return this;
    }
    public String getCardType() {
        return this.cardType;
    }

    public RecognizeDocIndividualcardRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public RecognizeDocIndividualcardRequest setDataContent(String dataContent) {
        this.dataContent = dataContent;
        return this;
    }
    public String getDataContent() {
        return this.dataContent;
    }

    public RecognizeDocIndividualcardRequest setReqEncType(String reqEncType) {
        this.reqEncType = reqEncType;
        return this;
    }
    public String getReqEncType() {
        return this.reqEncType;
    }

    public RecognizeDocIndividualcardRequest setRespEncType(String respEncType) {
        this.respEncType = respEncType;
        return this;
    }
    public String getRespEncType() {
        return this.respEncType;
    }

    public RecognizeDocIndividualcardRequest setRespEncToken(String respEncToken) {
        this.respEncToken = respEncToken;
        return this;
    }
    public String getRespEncToken() {
        return this.respEncToken;
    }

    public RecognizeDocIndividualcardRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
