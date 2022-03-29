<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ApiVersion extends Model
{
    // 版本名称
    /**
     * @example 1.0
     *
     * @var string
     */
    public $name;

    // api版本描述
    /**
     * @example test
     *
     * @var string
     */
    public $description;

    // apimeta数据id
    /**
     * @example 0000000643
     *
     * @var string
     */
    public $apiMetaId;

    // api状态
    /**
     * @example INIT
     *
     * @var string
     */
    public $status;

    // api请求参数
    /**
     * @example
     *
     * @var ParamModal[]
     */
    public $requestParams;

    // api响应参数
    /**
     * @example
     *
     * @var ParamModal[]
     */
    public $responseParams;

    // api uri模式
    /**
     * @example /sofa/mq/msgtype
     *
     * @var string
     */
    public $requestUriPattern;

    // 请求参数路径
    /**
     * @example instance_id
     *
     * @var string
     */
    public $requestPathParams;

    // 请求方法
    /**
     * @example test
     *
     * @var string
     */
    public $requestMethod;

    // 具体API请求时，解析出来的路径参数与其对应的值
    // eg. /sofa/mq/msgtype/{id}，如果实际请求为/sofa/mq/msgtype/1，那么返回的map就是 id => 1
    /**
     * @example
     *
     * @var KeyValuePair[]
     */
    public $requestPathValues;

    // 请求分发方法
    /**
     * @example HTTP
     *
     * @var string
     */
    public $dispatchType;

    // 分发内容
    /**
     * @example HTTP
     *
     * @var string
     */
    public $dispatchContext;

    // 接口特性
    /**
     * @example file_transfer
     *
     * @var string
     */
    public $feature;
    protected $_name = [
        'name'              => 'name',
        'description'       => 'description',
        'apiMetaId'         => 'api_meta_id',
        'status'            => 'status',
        'requestParams'     => 'request_params',
        'responseParams'    => 'response_params',
        'requestUriPattern' => 'request_uri_pattern',
        'requestPathParams' => 'request_path_params',
        'requestMethod'     => 'request_method',
        'requestPathValues' => 'request_path_values',
        'dispatchType'      => 'dispatch_type',
        'dispatchContext'   => 'dispatch_context',
        'feature'           => 'feature',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('apiMetaId', $this->apiMetaId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('responseParams', $this->responseParams, true);
        Model::validateRequired('requestMethod', $this->requestMethod, true);
        Model::validateRequired('requestPathValues', $this->requestPathValues, true);
        Model::validateRequired('dispatchType', $this->dispatchType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->apiMetaId) {
            $res['api_meta_id'] = $this->apiMetaId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->requestParams) {
            $res['request_params'] = [];
            if (null !== $this->requestParams && \is_array($this->requestParams)) {
                $n = 0;
                foreach ($this->requestParams as $item) {
                    $res['request_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->responseParams) {
            $res['response_params'] = [];
            if (null !== $this->responseParams && \is_array($this->responseParams)) {
                $n = 0;
                foreach ($this->responseParams as $item) {
                    $res['response_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->requestUriPattern) {
            $res['request_uri_pattern'] = $this->requestUriPattern;
        }
        if (null !== $this->requestPathParams) {
            $res['request_path_params'] = $this->requestPathParams;
        }
        if (null !== $this->requestMethod) {
            $res['request_method'] = $this->requestMethod;
        }
        if (null !== $this->requestPathValues) {
            $res['request_path_values'] = [];
            if (null !== $this->requestPathValues && \is_array($this->requestPathValues)) {
                $n = 0;
                foreach ($this->requestPathValues as $item) {
                    $res['request_path_values'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->dispatchType) {
            $res['dispatch_type'] = $this->dispatchType;
        }
        if (null !== $this->dispatchContext) {
            $res['dispatch_context'] = $this->dispatchContext;
        }
        if (null !== $this->feature) {
            $res['feature'] = $this->feature;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiVersion
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['api_meta_id'])) {
            $model->apiMetaId = $map['api_meta_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['request_params'])) {
            if (!empty($map['request_params'])) {
                $model->requestParams = [];
                $n                    = 0;
                foreach ($map['request_params'] as $item) {
                    $model->requestParams[$n++] = null !== $item ? ParamModal::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['response_params'])) {
            if (!empty($map['response_params'])) {
                $model->responseParams = [];
                $n                     = 0;
                foreach ($map['response_params'] as $item) {
                    $model->responseParams[$n++] = null !== $item ? ParamModal::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['request_uri_pattern'])) {
            $model->requestUriPattern = $map['request_uri_pattern'];
        }
        if (isset($map['request_path_params'])) {
            $model->requestPathParams = $map['request_path_params'];
        }
        if (isset($map['request_method'])) {
            $model->requestMethod = $map['request_method'];
        }
        if (isset($map['request_path_values'])) {
            if (!empty($map['request_path_values'])) {
                $model->requestPathValues = [];
                $n                        = 0;
                foreach ($map['request_path_values'] as $item) {
                    $model->requestPathValues[$n++] = null !== $item ? KeyValuePair::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['dispatch_type'])) {
            $model->dispatchType = $map['dispatch_type'];
        }
        if (isset($map['dispatch_context'])) {
            $model->dispatchContext = $map['dispatch_context'];
        }
        if (isset($map['feature'])) {
            $model->feature = $map['feature'];
        }

        return $model;
    }
}
