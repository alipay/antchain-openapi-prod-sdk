<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryUmktCardsmsAnalysisRequest extends Model
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

    // 租户的卡片短信模板id
    /**
     * @var string
     */
    public $cardTemplateCode;

    // 手机号列表,最多10个手机号
    /**
     * @var string
     */
    public $phoneNumberJson;

    // 卡片短信模板参数
    /**
     * @var string
     */
    public $cardTemplateParamJson;

    // 短信签名。当前只支持填入一个签名。
    /**
     * @var string
     */
    public $signNameJson;

    // 外部流水扩展字段
    /**
     * @var string
     */
    public $outId;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'cardTemplateCode'      => 'card_template_code',
        'phoneNumberJson'       => 'phone_number_json',
        'cardTemplateParamJson' => 'card_template_param_json',
        'signNameJson'          => 'sign_name_json',
        'outId'                 => 'out_id',
    ];

    public function validate()
    {
        Model::validateRequired('cardTemplateCode', $this->cardTemplateCode, true);
        Model::validateRequired('phoneNumberJson', $this->phoneNumberJson, true);
        Model::validateRequired('cardTemplateParamJson', $this->cardTemplateParamJson, true);
        Model::validateRequired('signNameJson', $this->signNameJson, true);
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
        if (null !== $this->cardTemplateCode) {
            $res['card_template_code'] = $this->cardTemplateCode;
        }
        if (null !== $this->phoneNumberJson) {
            $res['phone_number_json'] = $this->phoneNumberJson;
        }
        if (null !== $this->cardTemplateParamJson) {
            $res['card_template_param_json'] = $this->cardTemplateParamJson;
        }
        if (null !== $this->signNameJson) {
            $res['sign_name_json'] = $this->signNameJson;
        }
        if (null !== $this->outId) {
            $res['out_id'] = $this->outId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUmktCardsmsAnalysisRequest
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
        if (isset($map['card_template_code'])) {
            $model->cardTemplateCode = $map['card_template_code'];
        }
        if (isset($map['phone_number_json'])) {
            $model->phoneNumberJson = $map['phone_number_json'];
        }
        if (isset($map['card_template_param_json'])) {
            $model->cardTemplateParamJson = $map['card_template_param_json'];
        }
        if (isset($map['sign_name_json'])) {
            $model->signNameJson = $map['sign_name_json'];
        }
        if (isset($map['out_id'])) {
            $model->outId = $map['out_id'];
        }

        return $model;
    }
}
