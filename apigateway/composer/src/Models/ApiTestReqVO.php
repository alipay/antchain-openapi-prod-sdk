<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiTestReqVO extends Model
{
    // API标识
    /**
     * @example api_id1
     *
     * @var string
     */
    public $apiId;

    // 应用标识
    /**
     * @example app_id1
     *
     * @var string
     */
    public $appId;

    // params
    /**
     * @example
     *
     * @var ApiTestParamVO[]
     */
    public $params;

    // payload
    /**
     * @example payload1
     *
     * @var string
     */
    public $payload;

    // tenant_id
    /**
     * @example tenant_id
     *
     * @var string
     */
    public $tenantId;

    // 工作空间标识
    /**
     * @example default
     *
     * @var string
     */
    public $workspaceId;
    protected $_name = [
        'apiId'       => 'api_id',
        'appId'       => 'app_id',
        'params'      => 'params',
        'payload'     => 'payload',
        'tenantId'    => 'tenant_id',
        'workspaceId' => 'workspace_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiId) {
            $res['api_id'] = $this->apiId;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->params) {
            $res['params'] = [];
            if (null !== $this->params && \is_array($this->params)) {
                $n = 0;
                foreach ($this->params as $item) {
                    $res['params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->payload) {
            $res['payload'] = $this->payload;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiTestReqVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_id'])) {
            $model->apiId = $map['api_id'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['params'])) {
            if (!empty($map['params'])) {
                $model->params = [];
                $n             = 0;
                foreach ($map['params'] as $item) {
                    $model->params[$n++] = null !== $item ? ApiTestParamVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['payload'])) {
            $model->payload = $map['payload'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }

        return $model;
    }
}
