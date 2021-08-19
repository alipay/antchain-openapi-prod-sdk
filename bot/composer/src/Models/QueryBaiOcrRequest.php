<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryBaiOcrRequest extends Model
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

    // 调用业务方身份标识，指明调用来源
    /**
     * @var string
     */
    public $appKey;

    // OCR服务的业务类型，目前支持：
    // businessLicense，营业执照识别
    // idCard，身份证识别
    // bankCard，银行卡识别
    // VATInvoice，增值税发票识别
    /**
     * @var string
     */
    public $ocrType;

    // 请求的资源类型，目前支持：
    // image，图片
    // pdf，PDF复印件
    /**
     * @var string
     */
    public $sourceType;

    // 图片或PDF等内容的base64内容字符串
    /**
     * @var string
     */
    public $sourceBase64;

    // 资源的附加属性
    // 如针对身份证识别，需要指定face(人像面)或back(国徽面)
    /**
     * @var string
     */
    public $sourceConfigSide;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appKey'            => 'app_key',
        'ocrType'           => 'ocr_type',
        'sourceType'        => 'source_type',
        'sourceBase64'      => 'source_base64',
        'sourceConfigSide'  => 'source_config_side',
    ];

    public function validate()
    {
        Model::validateRequired('appKey', $this->appKey, true);
        Model::validateRequired('ocrType', $this->ocrType, true);
        Model::validateRequired('sourceType', $this->sourceType, true);
        Model::validateRequired('sourceBase64', $this->sourceBase64, true);
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
        if (null !== $this->appKey) {
            $res['app_key'] = $this->appKey;
        }
        if (null !== $this->ocrType) {
            $res['ocr_type'] = $this->ocrType;
        }
        if (null !== $this->sourceType) {
            $res['source_type'] = $this->sourceType;
        }
        if (null !== $this->sourceBase64) {
            $res['source_base64'] = $this->sourceBase64;
        }
        if (null !== $this->sourceConfigSide) {
            $res['source_config_side'] = $this->sourceConfigSide;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBaiOcrRequest
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
        if (isset($map['app_key'])) {
            $model->appKey = $map['app_key'];
        }
        if (isset($map['ocr_type'])) {
            $model->ocrType = $map['ocr_type'];
        }
        if (isset($map['source_type'])) {
            $model->sourceType = $map['source_type'];
        }
        if (isset($map['source_base64'])) {
            $model->sourceBase64 = $map['source_base64'];
        }
        if (isset($map['source_config_side'])) {
            $model->sourceConfigSide = $map['source_config_side'];
        }

        return $model;
    }
}
