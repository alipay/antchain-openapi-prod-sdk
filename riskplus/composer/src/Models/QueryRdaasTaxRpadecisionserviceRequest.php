<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRdaasTaxRpadecisionserviceRequest extends Model
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

    // 决策服务
    /**
     * @var string
     */
    public $serviceName;

    // 决策租户
    /**
     * @var string
     */
    public $decisionTenant;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'serviceName'       => 'service_name',
        'decisionTenant'    => 'decision_tenant',
    ];

    public function validate()
    {
        Model::validateRequired('serviceName', $this->serviceName, true);
        Model::validateRequired('decisionTenant', $this->decisionTenant, true);
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
        if (null !== $this->serviceName) {
            $res['service_name'] = $this->serviceName;
        }
        if (null !== $this->decisionTenant) {
            $res['decision_tenant'] = $this->decisionTenant;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRdaasTaxRpadecisionserviceRequest
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
        if (isset($map['service_name'])) {
            $model->serviceName = $map['service_name'];
        }
        if (isset($map['decision_tenant'])) {
            $model->decisionTenant = $map['decision_tenant'];
        }

        return $model;
    }
}
