<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MREACH\Models;

use AlibabaCloud\Tea\Model;

class PushSmsDomesticRequest extends Model
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

    // 业务流水号，最长64字符
    /**
     * @var string
     */
    public $bizId;

    // 接收手机号列表
    /**
     * @var string[]
     */
    public $phoneNumbers;

    // 模板ID
    /**
     * @var string
     */
    public $templateId;

    // 短信签名
    /**
     * @var string
     */
    public $signName;

    // 模板参数
    /**
     * @var string
     */
    public $templateParams;

    // 扩展参数
    /**
     * @var string
     */
    public $extraParams;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'phoneNumbers'      => 'phone_numbers',
        'templateId'        => 'template_id',
        'signName'          => 'sign_name',
        'templateParams'    => 'template_params',
        'extraParams'       => 'extra_params',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('phoneNumbers', $this->phoneNumbers, true);
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('signName', $this->signName, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->phoneNumbers) {
            $res['phone_numbers'] = $this->phoneNumbers;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->signName) {
            $res['sign_name'] = $this->signName;
        }
        if (null !== $this->templateParams) {
            $res['template_params'] = $this->templateParams;
        }
        if (null !== $this->extraParams) {
            $res['extra_params'] = $this->extraParams;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushSmsDomesticRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['phone_numbers'])) {
            if (!empty($map['phone_numbers'])) {
                $model->phoneNumbers = $map['phone_numbers'];
            }
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['sign_name'])) {
            $model->signName = $map['sign_name'];
        }
        if (isset($map['template_params'])) {
            $model->templateParams = $map['template_params'];
        }
        if (isset($map['extra_params'])) {
            $model->extraParams = $map['extra_params'];
        }

        return $model;
    }
}
