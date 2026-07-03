<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class SendDubbridgeSmsBatchRequest extends Model
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

    // 短信模板code
    /**
     * @var string
     */
    public $templateCode;

    // 接收短信的手机号码，JSON数组格式
    /**
     * @var string
     */
    public $phoneNumberJson;

    // 短信签名名称，JSON数组格式
    /**
     * @var string
     */
    public $signNameJson;

    // 短信模板变量对应的实际值，JSON数组格式
    /**
     * @var string
     */
    public $templateParamJson;

    // 上行短信扩展码，JSON数组格式。无特殊需要此字段的用户请忽略此字段
    /**
     * @var string
     */
    public $smsUpExtendCodeJson;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'templateCode'        => 'template_code',
        'phoneNumberJson'     => 'phone_number_json',
        'signNameJson'        => 'sign_name_json',
        'templateParamJson'   => 'template_param_json',
        'smsUpExtendCodeJson' => 'sms_up_extend_code_json',
    ];

    public function validate()
    {
        Model::validateRequired('templateCode', $this->templateCode, true);
        Model::validateRequired('phoneNumberJson', $this->phoneNumberJson, true);
        Model::validateRequired('signNameJson', $this->signNameJson, true);
        Model::validateRequired('templateParamJson', $this->templateParamJson, true);
        Model::validateRequired('smsUpExtendCodeJson', $this->smsUpExtendCodeJson, true);
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
        if (null !== $this->templateCode) {
            $res['template_code'] = $this->templateCode;
        }
        if (null !== $this->phoneNumberJson) {
            $res['phone_number_json'] = $this->phoneNumberJson;
        }
        if (null !== $this->signNameJson) {
            $res['sign_name_json'] = $this->signNameJson;
        }
        if (null !== $this->templateParamJson) {
            $res['template_param_json'] = $this->templateParamJson;
        }
        if (null !== $this->smsUpExtendCodeJson) {
            $res['sms_up_extend_code_json'] = $this->smsUpExtendCodeJson;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendDubbridgeSmsBatchRequest
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
        if (isset($map['template_code'])) {
            $model->templateCode = $map['template_code'];
        }
        if (isset($map['phone_number_json'])) {
            $model->phoneNumberJson = $map['phone_number_json'];
        }
        if (isset($map['sign_name_json'])) {
            $model->signNameJson = $map['sign_name_json'];
        }
        if (isset($map['template_param_json'])) {
            $model->templateParamJson = $map['template_param_json'];
        }
        if (isset($map['sms_up_extend_code_json'])) {
            $model->smsUpExtendCodeJson = $map['sms_up_extend_code_json'];
        }

        return $model;
    }
}
