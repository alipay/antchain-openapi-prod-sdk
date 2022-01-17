<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiParamVO extends Model
{
    // API标识
    /**
     * @example api_id1
     *
     * @var string
     */
    public $apiId;

    // default_value
    /**
     * @example value1
     *
     * @var string
     */
    public $defaultValue;

    // description
    /**
     * @example description1
     *
     * @var string
     */
    public $description;

    // failure_demo
    /**
     * @example failure_demo
     *
     * @var string
     */
    public $failureDemo;

    // location
    /**
     * @example Query / Path / Header / ...
     *
     * @var string
     */
    public $location;

    // name
    /**
     * @example name1
     *
     * @var string
     */
    public $name;

    // 引用的模型类型
    /**
     * @example String
     *
     * @var string
     */
    public $refType;

    // 是否必填
    /**
     * @example
     *
     * @var bool
     */
    public $required;

    // rsp_code_list
    /**
     * @example
     *
     * @var ApiRspCodeVO[]
     */
    public $rspCodeList;

    // success_demo
    /**
     * @example success_demo
     *
     * @var string
     */
    public $successDemo;

    // 数据类型
    /**
     * @example String / Int / Long / Float / Double / Boolean / ...
     *
     * @var string
     */
    public $type;

    // upstreamLocation
    /**
     * @example Query / Path / Header / ...
     *
     * @var string
     */
    public $upstreamLocation;

    // upstream_name
    /**
     * @example upstream_name1
     *
     * @var string
     */
    public $upstreamName;

    // 工作空间标识
    /**
     * @example default
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
    protected $_name = [
        'apiId'            => 'api_id',
        'defaultValue'     => 'default_value',
        'description'      => 'description',
        'failureDemo'      => 'failure_demo',
        'location'         => 'location',
        'name'             => 'name',
        'refType'          => 'ref_type',
        'required'         => 'required',
        'rspCodeList'      => 'rsp_code_list',
        'successDemo'      => 'success_demo',
        'type'             => 'type',
        'upstreamLocation' => 'upstream_location',
        'upstreamName'     => 'upstream_name',
        'workspaceId'      => 'workspace_id',
        'tenantId'         => 'tenant_id',
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
        if (null !== $this->defaultValue) {
            $res['default_value'] = $this->defaultValue;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->failureDemo) {
            $res['failure_demo'] = $this->failureDemo;
        }
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->refType) {
            $res['ref_type'] = $this->refType;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }
        if (null !== $this->rspCodeList) {
            $res['rsp_code_list'] = [];
            if (null !== $this->rspCodeList && \is_array($this->rspCodeList)) {
                $n = 0;
                foreach ($this->rspCodeList as $item) {
                    $res['rsp_code_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->successDemo) {
            $res['success_demo'] = $this->successDemo;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->upstreamLocation) {
            $res['upstream_location'] = $this->upstreamLocation;
        }
        if (null !== $this->upstreamName) {
            $res['upstream_name'] = $this->upstreamName;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiParamVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_id'])) {
            $model->apiId = $map['api_id'];
        }
        if (isset($map['default_value'])) {
            $model->defaultValue = $map['default_value'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['failure_demo'])) {
            $model->failureDemo = $map['failure_demo'];
        }
        if (isset($map['location'])) {
            $model->location = $map['location'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['ref_type'])) {
            $model->refType = $map['ref_type'];
        }
        if (isset($map['required'])) {
            $model->required = $map['required'];
        }
        if (isset($map['rsp_code_list'])) {
            if (!empty($map['rsp_code_list'])) {
                $model->rspCodeList = [];
                $n                  = 0;
                foreach ($map['rsp_code_list'] as $item) {
                    $model->rspCodeList[$n++] = null !== $item ? ApiRspCodeVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['success_demo'])) {
            $model->successDemo = $map['success_demo'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['upstream_location'])) {
            $model->upstreamLocation = $map['upstream_location'];
        }
        if (isset($map['upstream_name'])) {
            $model->upstreamName = $map['upstream_name'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
