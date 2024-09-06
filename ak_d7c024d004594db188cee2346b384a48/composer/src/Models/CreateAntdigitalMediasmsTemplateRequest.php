<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_d7c024d004594db188cee2346b384a48\Models;

use AlibabaCloud\Tea\Model;

class CreateAntdigitalMediasmsTemplateRequest extends Model
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

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 请求唯一id
    /**
     * @var string
     */
    public $requestUniqueId;

    // 是否变量模版
    /**
     * @var bool
     */
    public $variableTemplate;

    // 彩信标题，不超过50个长度，收件人可感知
    /**
     * @var string
     */
    public $smsTitle;

    // 签名名称
    /**
     * @var string
     */
    public $signName;

    // 扩展字段
    /**
     * @var string
     */
    public $extInfo;

    // 素材内容
    /**
     * @var SmsMaterial[]
     */
    public $material;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'requestUniqueId'   => 'request_unique_id',
        'variableTemplate'  => 'variable_template',
        'smsTitle'          => 'sms_title',
        'signName'          => 'sign_name',
        'extInfo'           => 'ext_info',
        'material'          => 'material',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('requestUniqueId', $this->requestUniqueId, true);
        Model::validateRequired('variableTemplate', $this->variableTemplate, true);
        Model::validateRequired('smsTitle', $this->smsTitle, true);
        Model::validateRequired('signName', $this->signName, true);
        Model::validateRequired('material', $this->material, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->requestUniqueId) {
            $res['request_unique_id'] = $this->requestUniqueId;
        }
        if (null !== $this->variableTemplate) {
            $res['variable_template'] = $this->variableTemplate;
        }
        if (null !== $this->smsTitle) {
            $res['sms_title'] = $this->smsTitle;
        }
        if (null !== $this->signName) {
            $res['sign_name'] = $this->signName;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->material) {
            $res['material'] = [];
            if (null !== $this->material && \is_array($this->material)) {
                $n = 0;
                foreach ($this->material as $item) {
                    $res['material'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAntdigitalMediasmsTemplateRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['request_unique_id'])) {
            $model->requestUniqueId = $map['request_unique_id'];
        }
        if (isset($map['variable_template'])) {
            $model->variableTemplate = $map['variable_template'];
        }
        if (isset($map['sms_title'])) {
            $model->smsTitle = $map['sms_title'];
        }
        if (isset($map['sign_name'])) {
            $model->signName = $map['sign_name'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }
        if (isset($map['material'])) {
            if (!empty($map['material'])) {
                $model->material = [];
                $n               = 0;
                foreach ($map['material'] as $item) {
                    $model->material[$n++] = null !== $item ? SmsMaterial::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
