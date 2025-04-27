<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class RecognizeDocIndividualcardRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 长度不超过32位的0-9A-Za-z字符串。
    // 外部请求ID，由调用方自行生成并自行保证唯一，以便问题定位。
    /**
     * @var string
     */
    public $outOrderNo;

    // 待识别的卡类型。取值约束：ID_CARD（身份证）;EEP_TO_ML_CARD（港澳来往大陆通行证）;BANK_CARD（银行卡）
    /**
     * @var string
     */
    public $ocrType;

    // 传入的图片是base64编码的图片还是图片的URL。取值约束：BASE64（类型为base64）；URL（暂不支持）
    /**
     * @var string
     */
    public $dataType;

    // 传入的图片的具体内容，需要与data_type的选择保持一致。
    /**
     * @var string
     */
    public $dataContent;

    // 入参data_content是否经AES加密。不填默认不加密。取值约束：0（不加密）；1（加密）
    /**
     * @var string
     */
    public $reqEncType;

    // 出参ocr_info是否经AES加密。不填默认不加密。取值约束：0（不加密）；1（加密）
    /**
     * @var string
     */
    public $respEncType;

    // 经过公钥RSA加密的AES密钥，用于对出参ocr_info加密。当req_enc_type = 1或resp_enc_type = 1时必填。
    /**
     * @var string
     */
    public $encToken;

    // 是否启用防伪检测，如果启用，出参会输出riskInfo字段。不填默认不启用防伪。取值约束：0（不启用）；1（启用）
    /**
     * @var string
     */
    public $riskInfoType;

    // 是否返回身份证头像照片
    // 0：否
    // 1：是
    // 不填默认不返回。
    /**
     * @var string
     */
    public $returnPhoto;

    // 是否返回身份证图片
    // 0：否
    // 1：是
    // 不填默认不返回。
    /**
     * @var string
     */
    public $returnImage;

    // 扩展信息JSON串。
    /**
     * @var string
     */
    public $externParam;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outOrderNo'        => 'out_order_no',
        'ocrType'           => 'ocr_type',
        'dataType'          => 'data_type',
        'dataContent'       => 'data_content',
        'reqEncType'        => 'req_enc_type',
        'respEncType'       => 'resp_enc_type',
        'encToken'          => 'enc_token',
        'riskInfoType'      => 'risk_info_type',
        'returnPhoto'       => 'return_photo',
        'returnImage'       => 'return_image',
        'externParam'       => 'extern_param',
    ];

    public function validate()
    {
        Model::validateRequired('outOrderNo', $this->outOrderNo, true);
        Model::validateRequired('ocrType', $this->ocrType, true);
        Model::validateRequired('dataType', $this->dataType, true);
        Model::validateRequired('dataContent', $this->dataContent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->outOrderNo) {
            $res['out_order_no'] = $this->outOrderNo;
        }
        if (null !== $this->ocrType) {
            $res['ocr_type'] = $this->ocrType;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->dataContent) {
            $res['data_content'] = $this->dataContent;
        }
        if (null !== $this->reqEncType) {
            $res['req_enc_type'] = $this->reqEncType;
        }
        if (null !== $this->respEncType) {
            $res['resp_enc_type'] = $this->respEncType;
        }
        if (null !== $this->encToken) {
            $res['enc_token'] = $this->encToken;
        }
        if (null !== $this->riskInfoType) {
            $res['risk_info_type'] = $this->riskInfoType;
        }
        if (null !== $this->returnPhoto) {
            $res['return_photo'] = $this->returnPhoto;
        }
        if (null !== $this->returnImage) {
            $res['return_image'] = $this->returnImage;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RecognizeDocIndividualcardRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['out_order_no'])) {
            $model->outOrderNo = $map['out_order_no'];
        }
        if (isset($map['ocr_type'])) {
            $model->ocrType = $map['ocr_type'];
        }
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }
        if (isset($map['data_content'])) {
            $model->dataContent = $map['data_content'];
        }
        if (isset($map['req_enc_type'])) {
            $model->reqEncType = $map['req_enc_type'];
        }
        if (isset($map['resp_enc_type'])) {
            $model->respEncType = $map['resp_enc_type'];
        }
        if (isset($map['enc_token'])) {
            $model->encToken = $map['enc_token'];
        }
        if (isset($map['risk_info_type'])) {
            $model->riskInfoType = $map['risk_info_type'];
        }
        if (isset($map['return_photo'])) {
            $model->returnPhoto = $map['return_photo'];
        }
        if (isset($map['return_image'])) {
            $model->returnImage = $map['return_image'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }

        return $model;
    }
}
