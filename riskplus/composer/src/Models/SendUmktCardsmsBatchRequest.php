<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class SendUmktCardsmsBatchRequest extends Model
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

    // cpassAccessKey
    /**
     * @var string
     */
    public $cpassAk;

    // 行业标签
    /**
     * @var string
     */
    public $industryTag;

    // 卡片短信模板
    /**
     * @var string
     */
    public $cardTemplateCode;

    // {}
    /**
     * @var string
     */
    public $cardTemplateParamJson;

    // ["13455","76898"]
    /**
     * @var string
     */
    public $phoneNumberJson;

    // ["蚂蚁营销"]
    /**
     * @var string
     */
    public $signNameJson;

    // 上行短信扩展码
    /**
     * @var string
     */
    public $smsUpExtendCodeJson;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'cpassAk'               => 'cpass_ak',
        'industryTag'           => 'industry_tag',
        'cardTemplateCode'      => 'card_template_code',
        'cardTemplateParamJson' => 'card_template_param_json',
        'phoneNumberJson'       => 'phone_number_json',
        'signNameJson'          => 'sign_name_json',
        'smsUpExtendCodeJson'   => 'sms_up_extend_code_json',
    ];

    public function validate()
    {
        Model::validateRequired('industryTag', $this->industryTag, true);
        Model::validateRequired('cardTemplateCode', $this->cardTemplateCode, true);
        Model::validateRequired('cardTemplateParamJson', $this->cardTemplateParamJson, true);
        Model::validateRequired('phoneNumberJson', $this->phoneNumberJson, true);
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
        if (null !== $this->cpassAk) {
            $res['cpass_ak'] = $this->cpassAk;
        }
        if (null !== $this->industryTag) {
            $res['industry_tag'] = $this->industryTag;
        }
        if (null !== $this->cardTemplateCode) {
            $res['card_template_code'] = $this->cardTemplateCode;
        }
        if (null !== $this->cardTemplateParamJson) {
            $res['card_template_param_json'] = $this->cardTemplateParamJson;
        }
        if (null !== $this->phoneNumberJson) {
            $res['phone_number_json'] = $this->phoneNumberJson;
        }
        if (null !== $this->signNameJson) {
            $res['sign_name_json'] = $this->signNameJson;
        }
        if (null !== $this->smsUpExtendCodeJson) {
            $res['sms_up_extend_code_json'] = $this->smsUpExtendCodeJson;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendUmktCardsmsBatchRequest
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
        if (isset($map['cpass_ak'])) {
            $model->cpassAk = $map['cpass_ak'];
        }
        if (isset($map['industry_tag'])) {
            $model->industryTag = $map['industry_tag'];
        }
        if (isset($map['card_template_code'])) {
            $model->cardTemplateCode = $map['card_template_code'];
        }
        if (isset($map['card_template_param_json'])) {
            $model->cardTemplateParamJson = $map['card_template_param_json'];
        }
        if (isset($map['phone_number_json'])) {
            $model->phoneNumberJson = $map['phone_number_json'];
        }
        if (isset($map['sign_name_json'])) {
            $model->signNameJson = $map['sign_name_json'];
        }
        if (isset($map['sms_up_extend_code_json'])) {
            $model->smsUpExtendCodeJson = $map['sms_up_extend_code_json'];
        }

        return $model;
    }
}
