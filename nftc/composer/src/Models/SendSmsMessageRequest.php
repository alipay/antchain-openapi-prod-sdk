<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class SendSmsMessageRequest extends Model
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

    // 短信模版Id
    /**
     * @var string
     */
    public $templateId;

    // 手机号
    /**
     * @var string
     */
    public $phone;

    // 参数键值对
    /**
     * @var string
     */
    public $templateArgs;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'templateId'        => 'template_id',
        'phone'             => 'phone',
        'templateArgs'      => 'template_args',
    ];

    public function validate()
    {
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('phone', $this->phone, true);
        Model::validateRequired('templateArgs', $this->templateArgs, true);
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
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->templateArgs) {
            $res['template_args'] = $this->templateArgs;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendSmsMessageRequest
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
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['template_args'])) {
            $model->templateArgs = $map['template_args'];
        }

        return $model;
    }
}
