<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class SendUmktTextsmsBatchRequest extends Model
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

    // 手机号json
    /**
     * @var string
     */
    public $phoneNumberJson;

    // 签名信息
    /**
     * @var string
     */
    public $signNameJson;

    // 文本短信模板code
    /**
     * @var string
     */
    public $templateCode;

    // 文本短信模板参数
    /**
     * @var string
     */
    public $templateParamJson;

    // 上行短信扩展码
    /**
     * @var string
     */
    public $smsUpExtendCodeJson;

    // 透传字段
    /**
     * @var string
     */
    public $outId;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'cpassAk'             => 'cpass_ak',
        'industryTag'         => 'industry_tag',
        'phoneNumberJson'     => 'phone_number_json',
        'signNameJson'        => 'sign_name_json',
        'templateCode'        => 'template_code',
        'templateParamJson'   => 'template_param_json',
        'smsUpExtendCodeJson' => 'sms_up_extend_code_json',
        'outId'               => 'out_id',
    ];

    public function validate()
    {
        Model::validateRequired('industryTag', $this->industryTag, true);
        Model::validateRequired('phoneNumberJson', $this->phoneNumberJson, true);
        Model::validateRequired('signNameJson', $this->signNameJson, true);
        Model::validateRequired('templateCode', $this->templateCode, true);
        Model::validateRequired('templateParamJson', $this->templateParamJson, true);
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
        if (null !== $this->phoneNumberJson) {
            $res['phone_number_json'] = $this->phoneNumberJson;
        }
        if (null !== $this->signNameJson) {
            $res['sign_name_json'] = $this->signNameJson;
        }
        if (null !== $this->templateCode) {
            $res['template_code'] = $this->templateCode;
        }
        if (null !== $this->templateParamJson) {
            $res['template_param_json'] = $this->templateParamJson;
        }
        if (null !== $this->smsUpExtendCodeJson) {
            $res['sms_up_extend_code_json'] = $this->smsUpExtendCodeJson;
        }
        if (null !== $this->outId) {
            $res['out_id'] = $this->outId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendUmktTextsmsBatchRequest
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
        if (isset($map['phone_number_json'])) {
            $model->phoneNumberJson = $map['phone_number_json'];
        }
        if (isset($map['sign_name_json'])) {
            $model->signNameJson = $map['sign_name_json'];
        }
        if (isset($map['template_code'])) {
            $model->templateCode = $map['template_code'];
        }
        if (isset($map['template_param_json'])) {
            $model->templateParamJson = $map['template_param_json'];
        }
        if (isset($map['sms_up_extend_code_json'])) {
            $model->smsUpExtendCodeJson = $map['sms_up_extend_code_json'];
        }
        if (isset($map['out_id'])) {
            $model->outId = $map['out_id'];
        }

        return $model;
    }
}
