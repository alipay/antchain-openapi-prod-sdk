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
    @NameInMap("ocr_type")
    @Validation(required = true)
    public String ocrType;

    // 传入的图片是base64编码的图片还是图片的URL。取值约束：BASE64（类型为base64）；FILE(文件)、URL（暂不支持）
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // 传入的图片的具体内容，需要与data_type的选择保持一致。
    @NameInMap("data_content")
    public String dataContent;

    // 证件图片
    /**
     * <p>待上传文件</p>
     */
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    /**
     * <p>待上传文件名</p>
     */
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    public String fileId;

    // 入参data_content是否经AES加密。不填默认不加密。取值约束：0（不加密）；1（加密）
    @NameInMap("req_enc_type")
    public String reqEncType;

    // 出参ocr_info是否经AES加密。不填默认不加密。取值约束：0（不加密）；1（加密）
    @NameInMap("resp_enc_type")
    public String respEncType;

    // 经过公钥RSA加密的AES密钥，用于对出参ocr_info加密。当req_enc_type = 1或resp_enc_type = 1时必填。
    @NameInMap("enc_token")
    public String encToken;

    // 是否启用防伪检测，如果启用，出参会输出riskInfo字段。不填默认不启用防伪。取值约束：0（不启用）；1（启用）
    @NameInMap("risk_info_type")
    public String riskInfoType;

    // 是否返回身份证头像照片
    // 0：否
    // 1：是
    // 不填默认不返回。
    @NameInMap("return_photo")
    public String returnPhoto;

    // 是否返回身份证图片
    // 0：否
    // 1：是
    // 不填默认不返回。
    @NameInMap("return_image")
    public String returnImage;

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

    public RecognizeDocIndividualcardRequest setOcrType(String ocrType) {
        this.ocrType = ocrType;
        return this;
    }
    public String getOcrType() {
        return this.ocrType;
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

    public RecognizeDocIndividualcardRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public RecognizeDocIndividualcardRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public RecognizeDocIndividualcardRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
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

    public RecognizeDocIndividualcardRequest setEncToken(String encToken) {
        this.encToken = encToken;
        return this;
    }
    public String getEncToken() {
        return this.encToken;
    }

    public RecognizeDocIndividualcardRequest setRiskInfoType(String riskInfoType) {
        this.riskInfoType = riskInfoType;
        return this;
    }
    public String getRiskInfoType() {
        return this.riskInfoType;
    }

    public RecognizeDocIndividualcardRequest setReturnPhoto(String returnPhoto) {
        this.returnPhoto = returnPhoto;
        return this;
    }
    public String getReturnPhoto() {
        return this.returnPhoto;
    }

    public RecognizeDocIndividualcardRequest setReturnImage(String returnImage) {
        this.returnImage = returnImage;
        return this;
    }
    public String getReturnImage() {
        return this.returnImage;
    }

    public RecognizeDocIndividualcardRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
