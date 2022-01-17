<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiflowTestReqVO extends Model
{
    // api_id
    /**
     * @example api_id
     *
     * @var string
     */
    public $apiId;

    // workspace_id
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $workspaceId;

    // tenant_id
    /**
     * @example tenant_id
     *
     * @var string
     */
    public $tenantId;

    // machine_name
    /**
     * @example machine_name
     *
     * @var string
     */
    public $machineName;

    // params
    /**
     * @example
     *
     * @var ApiTestParamVO[]
     */
    public $inputParams;

    // output_params
    /**
     * @example
     *
     * @var ApiflowOutputVO[]
     */
    public $outputParams;
    protected $_name = [
        'apiId'        => 'api_id',
        'workspaceId'  => 'workspace_id',
        'tenantId'     => 'tenant_id',
        'machineName'  => 'machine_name',
        'inputParams'  => 'input_params',
        'outputParams' => 'output_params',
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
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->machineName) {
            $res['machine_name'] = $this->machineName;
        }
        if (null !== $this->inputParams) {
            $res['input_params'] = [];
            if (null !== $this->inputParams && \is_array($this->inputParams)) {
                $n = 0;
                foreach ($this->inputParams as $item) {
                    $res['input_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->outputParams) {
            $res['output_params'] = [];
            if (null !== $this->outputParams && \is_array($this->outputParams)) {
                $n = 0;
                foreach ($this->outputParams as $item) {
                    $res['output_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiflowTestReqVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_id'])) {
            $model->apiId = $map['api_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['machine_name'])) {
            $model->machineName = $map['machine_name'];
        }
        if (isset($map['input_params'])) {
            if (!empty($map['input_params'])) {
                $model->inputParams = [];
                $n                  = 0;
                foreach ($map['input_params'] as $item) {
                    $model->inputParams[$n++] = null !== $item ? ApiTestParamVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['output_params'])) {
            if (!empty($map['output_params'])) {
                $model->outputParams = [];
                $n                   = 0;
                foreach ($map['output_params'] as $item) {
                    $model->outputParams[$n++] = null !== $item ? ApiflowOutputVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
