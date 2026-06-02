<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MREACH\Models;

use AlibabaCloud\Tea\Model;

class PushCardsmsDomesticRequest extends Model
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

    // 卡片短信模版ID
    /**
     * @var string
     */
    public $templateId;

    // 卡片短信签名
    /**
     * @var string
     */
    public $signName;

    // 卡片动参
    /**
     * @var string
     */
    public $cardParams;

    // 回落类型: SMS-回落为普通短信, NONE-不回落。
    /**
     * @var string
     */
    public $fallbackType;

    // 回落普通短信的平台模板编码。
    /**
     * @var string
     */
    public $fallbackTemplateId;

    // 回落普通短信的模板参数，键值对形式Str
    /**
     * @var string
     */
    public $fallbackParams;

    // 卡片短信渲染失败后跳转链接
    /**
     * @var string
     */
    public $customUrl;

    // 扩展参数
    /**
     * @var string
     */
    public $extraParams;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'bizId'              => 'biz_id',
        'phoneNumbers'       => 'phone_numbers',
        'templateId'         => 'template_id',
        'signName'           => 'sign_name',
        'cardParams'         => 'card_params',
        'fallbackType'       => 'fallback_type',
        'fallbackTemplateId' => 'fallback_template_id',
        'fallbackParams'     => 'fallback_params',
        'customUrl'          => 'custom_url',
        'extraParams'        => 'extra_params',
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
        if (null !== $this->cardParams) {
            $res['card_params'] = $this->cardParams;
        }
        if (null !== $this->fallbackType) {
            $res['fallback_type'] = $this->fallbackType;
        }
        if (null !== $this->fallbackTemplateId) {
            $res['fallback_template_id'] = $this->fallbackTemplateId;
        }
        if (null !== $this->fallbackParams) {
            $res['fallback_params'] = $this->fallbackParams;
        }
        if (null !== $this->customUrl) {
            $res['custom_url'] = $this->customUrl;
        }
        if (null !== $this->extraParams) {
            $res['extra_params'] = $this->extraParams;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushCardsmsDomesticRequest
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
        if (isset($map['card_params'])) {
            $model->cardParams = $map['card_params'];
        }
        if (isset($map['fallback_type'])) {
            $model->fallbackType = $map['fallback_type'];
        }
        if (isset($map['fallback_template_id'])) {
            $model->fallbackTemplateId = $map['fallback_template_id'];
        }
        if (isset($map['fallback_params'])) {
            $model->fallbackParams = $map['fallback_params'];
        }
        if (isset($map['custom_url'])) {
            $model->customUrl = $map['custom_url'];
        }
        if (isset($map['extra_params'])) {
            $model->extraParams = $map['extra_params'];
        }

        return $model;
    }
}
