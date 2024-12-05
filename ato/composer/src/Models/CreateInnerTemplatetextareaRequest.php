<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CreateInnerTemplatetextareaRequest extends Model
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

    // 商户对应租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 模板编码
    /**
     * @var string
     */
    public $templateCode;

    // 模板版本号
    /**
     * @var string
     */
    public $templateVersion;

    // 组件类型，INPUT:单行文本 TEXTAREA:多行文本
    /**
     * @var string
     */
    public $componentType;

    // 组件名称（占位符）
    /**
     * @var string
     */
    public $componentName;

    // 是否必填
    /**
     * @var bool
     */
    public $required;

    // 预估文本行数
    /**
     * @var int
     */
    public $line;

    // 多行文本域名称
    /**
     * @var string
     */
    public $multiName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'templateCode'      => 'template_code',
        'templateVersion'   => 'template_version',
        'componentType'     => 'component_type',
        'componentName'     => 'component_name',
        'required'          => 'required',
        'line'              => 'line',
        'multiName'         => 'multi_name',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('templateCode', $this->templateCode, true);
        Model::validateRequired('templateVersion', $this->templateVersion, true);
        Model::validateRequired('componentType', $this->componentType, true);
        Model::validateRequired('componentName', $this->componentName, true);
        Model::validateRequired('required', $this->required, true);
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
        if (null !== $this->templateCode) {
            $res['template_code'] = $this->templateCode;
        }
        if (null !== $this->templateVersion) {
            $res['template_version'] = $this->templateVersion;
        }
        if (null !== $this->componentType) {
            $res['component_type'] = $this->componentType;
        }
        if (null !== $this->componentName) {
            $res['component_name'] = $this->componentName;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }
        if (null !== $this->line) {
            $res['line'] = $this->line;
        }
        if (null !== $this->multiName) {
            $res['multi_name'] = $this->multiName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateInnerTemplatetextareaRequest
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
        if (isset($map['template_code'])) {
            $model->templateCode = $map['template_code'];
        }
        if (isset($map['template_version'])) {
            $model->templateVersion = $map['template_version'];
        }
        if (isset($map['component_type'])) {
            $model->componentType = $map['component_type'];
        }
        if (isset($map['component_name'])) {
            $model->componentName = $map['component_name'];
        }
        if (isset($map['required'])) {
            $model->required = $map['required'];
        }
        if (isset($map['line'])) {
            $model->line = $map['line'];
        }
        if (isset($map['multi_name'])) {
            $model->multiName = $map['multi_name'];
        }

        return $model;
    }
}
