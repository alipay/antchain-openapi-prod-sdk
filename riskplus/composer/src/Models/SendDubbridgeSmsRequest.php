<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class SendDubbridgeSmsRequest extends Model
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

    // 接收短信的手机号码。支持对多个手机号码发送短信，手机号码之间以英文逗号（,）分隔。上限为1000个手机号码。批量调用相对于单条调用及时性稍有延迟。
    /**
     * @var string
     */
    public $phoneNumbers;

    // 短信签名
    /**
     * @var string
     */
    public $signName;

    // 短信模板CODE
    /**
     * @var string
     */
    public $templateCode;

    // 短信模板变量对应的值，JSON格式
    /**
     * @var string
     */
    public $templateParam;

    // 上行短信扩展码
    /**
     * @var string
     */
    public $smsUpExtendCode;

    // 外部流水扩展
    /**
     * @var string
     */
    public $outId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'phoneNumbers'      => 'phone_numbers',
        'signName'          => 'sign_name',
        'templateCode'      => 'template_code',
        'templateParam'     => 'template_param',
        'smsUpExtendCode'   => 'sms_up_extend_code',
        'outId'             => 'out_id',
    ];

    public function validate()
    {
        Model::validateRequired('phoneNumbers', $this->phoneNumbers, true);
        Model::validateRequired('signName', $this->signName, true);
        Model::validateRequired('templateCode', $this->templateCode, true);
        Model::validateRequired('outId', $this->outId, true);
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
        if (null !== $this->phoneNumbers) {
            $res['phone_numbers'] = $this->phoneNumbers;
        }
        if (null !== $this->signName) {
            $res['sign_name'] = $this->signName;
        }
        if (null !== $this->templateCode) {
            $res['template_code'] = $this->templateCode;
        }
        if (null !== $this->templateParam) {
            $res['template_param'] = $this->templateParam;
        }
        if (null !== $this->smsUpExtendCode) {
            $res['sms_up_extend_code'] = $this->smsUpExtendCode;
        }
        if (null !== $this->outId) {
            $res['out_id'] = $this->outId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendDubbridgeSmsRequest
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
        if (isset($map['phone_numbers'])) {
            $model->phoneNumbers = $map['phone_numbers'];
        }
        if (isset($map['sign_name'])) {
            $model->signName = $map['sign_name'];
        }
        if (isset($map['template_code'])) {
            $model->templateCode = $map['template_code'];
        }
        if (isset($map['template_param'])) {
            $model->templateParam = $map['template_param'];
        }
        if (isset($map['sms_up_extend_code'])) {
            $model->smsUpExtendCode = $map['sms_up_extend_code'];
        }
        if (isset($map['out_id'])) {
            $model->outId = $map['out_id'];
        }

        return $model;
    }
}
