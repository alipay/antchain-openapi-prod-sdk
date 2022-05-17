<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Osp\Models;

use AlibabaCloud\Tea\Model;

class GetInstancesRequest extends Model
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

    // 共享中间件实例id
    /**
     * @var string
     */
    public $instanceId;

    // 租户name
    /**
     * @var string
     */
    public $middlewareTenant;

    // workspace name
    /**
     * @var string
     */
    public $middlewareWorkspace;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'instanceId'          => 'instance_id',
        'middlewareTenant'    => 'middleware_tenant',
        'middlewareWorkspace' => 'middleware_workspace',
    ];

    public function validate()
    {
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
        if (null !== $this->middlewareTenant) {
            $res['middleware_tenant'] = $this->middlewareTenant;
        }
        if (null !== $this->middlewareWorkspace) {
            $res['middleware_workspace'] = $this->middlewareWorkspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetInstancesRequest
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
        if (isset($map['middleware_tenant'])) {
            $model->middlewareTenant = $map['middleware_tenant'];
        }
        if (isset($map['middleware_workspace'])) {
            $model->middlewareWorkspace = $map['middleware_workspace'];
        }

        return $model;
    }
}
