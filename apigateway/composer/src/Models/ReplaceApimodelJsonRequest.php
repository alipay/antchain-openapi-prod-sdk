<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ReplaceApimodelJsonRequest extends Model
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

    // workspace_id
    /**
     * @var string
     */
    public $workspaceId;

    // tenant_id
    /**
     * @var string
     */
    public $tenantId;

    // ApiTestParamVO
    /**
     * @var ApiTestParamVO[]
     */
    public $param;

    // json
    /**
     * @var string
     */
    public $json;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'workspaceId'       => 'workspace_id',
        'tenantId'          => 'tenant_id',
        'param'             => 'param',
        'json'              => 'json',
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
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->param) {
            $res['param'] = [];
            if (null !== $this->param && \is_array($this->param)) {
                $n = 0;
                foreach ($this->param as $item) {
                    $res['param'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->json) {
            $res['json'] = $this->json;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReplaceApimodelJsonRequest
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
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['param'])) {
            if (!empty($map['param'])) {
                $model->param = [];
                $n            = 0;
                foreach ($map['param'] as $item) {
                    $model->param[$n++] = null !== $item ? ApiTestParamVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['json'])) {
            $model->json = $map['json'];
        }

        return $model;
    }
}
