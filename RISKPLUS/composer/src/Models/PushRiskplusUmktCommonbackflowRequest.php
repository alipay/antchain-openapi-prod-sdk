<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class PushRiskplusUmktCommonbackflowRequest extends Model
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
     * @var int
     */
    public $tenantId;

    // 回流模版ID
    /**
     * @var int
     */
    public $backFlowTemplateId;

    // 回流信息描述
    /**
     * @var string
     */
    public $backFlowDesc;

    // 回流属性
    /**
     * @var string
     */
    public $properties;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'tenantId'           => 'tenant_id',
        'backFlowTemplateId' => 'back_flow_template_id',
        'backFlowDesc'       => 'back_flow_desc',
        'properties'         => 'properties',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('backFlowTemplateId', $this->backFlowTemplateId, true);
        Model::validateRequired('backFlowDesc', $this->backFlowDesc, true);
        Model::validateRequired('properties', $this->properties, true);
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
        if (null !== $this->backFlowTemplateId) {
            $res['back_flow_template_id'] = $this->backFlowTemplateId;
        }
        if (null !== $this->backFlowDesc) {
            $res['back_flow_desc'] = $this->backFlowDesc;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushRiskplusUmktCommonbackflowRequest
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
        if (isset($map['back_flow_template_id'])) {
            $model->backFlowTemplateId = $map['back_flow_template_id'];
        }
        if (isset($map['back_flow_desc'])) {
            $model->backFlowDesc = $map['back_flow_desc'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }

        return $model;
    }
}
