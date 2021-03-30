<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryBusinessInstancestatusRequest extends Model
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

    // 实例id
    /**
     * @var string
     */
    public $instanceId;

    // 实例对应的租户id
    /**
     * @var string
     */
    public $instanceTenant;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'instanceTenant'    => 'instance_tenant',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('instanceTenant', $this->instanceTenant, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->instanceTenant) {
            $res['instance_tenant'] = $this->instanceTenant;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBusinessInstancestatusRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['instance_tenant'])) {
            $model->instanceTenant = $map['instance_tenant'];
        }

        return $model;
    }
}
