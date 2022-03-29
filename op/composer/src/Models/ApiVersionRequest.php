<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ApiVersionRequest extends Model
{
    // 产品名称
    /**
     * @example ABC
     *
     * @var string
     */
    public $providerName;

    // 套件版本
    /**
     * @example 1.0.0
     *
     * @var string
     */
    public $suiteVersion;

    // API名称
    /**
     * @example test
     *
     * @var string
     */
    public $apiName;

    // api版本名称
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

    // api转发方式
    /**
     * @example HTTP
     *
     * @var string
     */
    public $dispatchType;

    // unique id
    /**
     * @example 0000000015
     *
     * @var string
     */
    public $uniquId;

    // 测试url
    /**
     * @example http://123
     *
     * @var string
     */
    public $testUrl;

    // 转发路径
    /**
     * @example /test/demo
     *
     * @var string
     */
    public $path;

    // api状态
    /**
     * @example
     *
     * @var StatusEnum
     */
    public $status;

    // 1000
    /**
     * @example
     *
     * @var int
     */
    public $timeout;

    // 请求uri模式
    /**
     * @example NULL
     *
     * @var string
     */
    public $requestUriPattern;

    // 请求路径参数
    /**
     * @example NULL
     *
     * @var string
     */
    public $requestPathParams;

    // 方法名称
    /**
     * @example test
     *
     * @var string
     */
    public $requestMethod;

    // 支持特性
    /**
     * @example file_transfer
     *
     * @var string
     */
    public $feature;
    protected $_name = [
        'providerName'      => 'provider_name',
        'suiteVersion'      => 'suite_version',
        'apiName'           => 'api_name',
        'name'              => 'name',
        'description'       => 'description',
        'dispatchType'      => 'dispatch_type',
        'uniquId'           => 'uniqu_id',
        'testUrl'           => 'test_url',
        'path'              => 'path',
        'status'            => 'status',
        'timeout'           => 'timeout',
        'requestUriPattern' => 'request_uri_pattern',
        'requestPathParams' => 'request_path_params',
        'requestMethod'     => 'request_method',
        'feature'           => 'feature',
    ];

    public function validate()
    {
        Model::validateRequired('providerName', $this->providerName, true);
        Model::validateRequired('suiteVersion', $this->suiteVersion, true);
        Model::validateRequired('apiName', $this->apiName, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('dispatchType', $this->dispatchType, true);
        Model::validateRequired('uniquId', $this->uniquId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('timeout', $this->timeout, true);
        Model::validateRequired('requestMethod', $this->requestMethod, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->providerName) {
            $res['provider_name'] = $this->providerName;
        }
        if (null !== $this->suiteVersion) {
            $res['suite_version'] = $this->suiteVersion;
        }
        if (null !== $this->apiName) {
            $res['api_name'] = $this->apiName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->dispatchType) {
            $res['dispatch_type'] = $this->dispatchType;
        }
        if (null !== $this->uniquId) {
            $res['uniqu_id'] = $this->uniquId;
        }
        if (null !== $this->testUrl) {
            $res['test_url'] = $this->testUrl;
        }
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->status) {
            $res['status'] = null !== $this->status ? $this->status->toMap() : null;
        }
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
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
        if (null !== $this->feature) {
            $res['feature'] = $this->feature;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiVersionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['provider_name'])) {
            $model->providerName = $map['provider_name'];
        }
        if (isset($map['suite_version'])) {
            $model->suiteVersion = $map['suite_version'];
        }
        if (isset($map['api_name'])) {
            $model->apiName = $map['api_name'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['dispatch_type'])) {
            $model->dispatchType = $map['dispatch_type'];
        }
        if (isset($map['uniqu_id'])) {
            $model->uniquId = $map['uniqu_id'];
        }
        if (isset($map['test_url'])) {
            $model->testUrl = $map['test_url'];
        }
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['status'])) {
            $model->status = StatusEnum::fromMap($map['status']);
        }
        if (isset($map['timeout'])) {
            $model->timeout = $map['timeout'];
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
        if (isset($map['feature'])) {
            $model->feature = $map['feature'];
        }

        return $model;
    }
}
