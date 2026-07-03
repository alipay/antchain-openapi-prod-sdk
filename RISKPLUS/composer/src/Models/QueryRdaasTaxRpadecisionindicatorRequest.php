<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRdaasTaxRpadecisionindicatorRequest extends Model
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

    // 决策服务id
    /**
     * @var string
     */
    public $serviceId;

    // 决策属性名称，目前一种属性: 比重-weight
    /**
     * @var string
     */
    public $propertyName;

    // 决策租户
    /**
     * @var string
     */
    public $decisionTenant;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'serviceId'         => 'service_id',
        'propertyName'      => 'property_name',
        'decisionTenant'    => 'decision_tenant',
    ];

    public function validate()
    {
        Model::validateRequired('serviceId', $this->serviceId, true);
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
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->propertyName) {
            $res['property_name'] = $this->propertyName;
        }
        if (null !== $this->decisionTenant) {
            $res['decision_tenant'] = $this->decisionTenant;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRdaasTaxRpadecisionindicatorRequest
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
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['property_name'])) {
            $model->propertyName = $map['property_name'];
        }
        if (isset($map['decision_tenant'])) {
            $model->decisionTenant = $map['decision_tenant'];
        }

        return $model;
    }
}
