<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class GetApimodelJsonRequest extends Model
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

    // api_model_id
    /**
     * @var string
     */
    public $apiModelId;

    // tenant_id
    /**
     * @var string
     */
    public $tenantId;

    // workspace_id
    /**
     * @var string
     */
    public $workspaceId;

    // model_type
    /**
     * @var string
     */
    public $modelType;

    // 是否使用默认值
    /**
     * @var bool
     */
    public $useDefault;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'apiModelId'        => 'api_model_id',
        'tenantId'          => 'tenant_id',
        'workspaceId'       => 'workspace_id',
        'modelType'         => 'model_type',
        'useDefault'        => 'use_default',
    ];

    public function validate()
    {
        Model::validateRequired('apiModelId', $this->apiModelId, true);
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
        if (null !== $this->apiModelId) {
            $res['api_model_id'] = $this->apiModelId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->modelType) {
            $res['model_type'] = $this->modelType;
        }
        if (null !== $this->useDefault) {
            $res['use_default'] = $this->useDefault;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetApimodelJsonRequest
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
        if (isset($map['api_model_id'])) {
            $model->apiModelId = $map['api_model_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['model_type'])) {
            $model->modelType = $map['model_type'];
        }
        if (isset($map['use_default'])) {
            $model->useDefault = $map['use_default'];
        }

        return $model;
    }
}
