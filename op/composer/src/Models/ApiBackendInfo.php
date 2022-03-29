<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ApiBackendInfo extends Model
{
    // 调用方法
    /**
     * @example HTTP
     *
     * @var string
     */
    public $dispatchType;

    // TR转发的uniqueid
    /**
     * @example test
     *
     * @var string
     */
    public $uniqueId;

    // TR转发的url
    /**
     * @example /test
     *
     * @var string
     */
    public $testUrl;

    // TR转发的路径
    /**
     * @example /test
     *
     * @var string
     */
    public $path;

    // 是否跳过鉴权
    /**
     * @example true, false
     *
     * @var bool
     */
    public $skipAuth;

    // 后端转发超时时间
    /**
     * @example
     *
     * @var int
     */
    public $timeout;

    // 后端返回参数
    /**
     * @example
     *
     * @var ApiParamInfo[]
     */
    public $responseParams;

    // 返回结果码
    /**
     * @example
     *
     * @var ApiResultCodeInfo[]
     */
    public $resultCodes;
    protected $_name = [
        'dispatchType'   => 'dispatch_type',
        'uniqueId'       => 'unique_id',
        'testUrl'        => 'test_url',
        'path'           => 'path',
        'skipAuth'       => 'skip_auth',
        'timeout'        => 'timeout',
        'responseParams' => 'response_params',
        'resultCodes'    => 'result_codes',
    ];

    public function validate()
    {
        Model::validateRequired('dispatchType', $this->dispatchType, true);
        Model::validateRequired('timeout', $this->timeout, true);
        Model::validateRequired('responseParams', $this->responseParams, true);
        Model::validateRequired('resultCodes', $this->resultCodes, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dispatchType) {
            $res['dispatch_type'] = $this->dispatchType;
        }
        if (null !== $this->uniqueId) {
            $res['unique_id'] = $this->uniqueId;
        }
        if (null !== $this->testUrl) {
            $res['test_url'] = $this->testUrl;
        }
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->skipAuth) {
            $res['skip_auth'] = $this->skipAuth;
        }
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
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
        if (null !== $this->resultCodes) {
            $res['result_codes'] = [];
            if (null !== $this->resultCodes && \is_array($this->resultCodes)) {
                $n = 0;
                foreach ($this->resultCodes as $item) {
                    $res['result_codes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiBackendInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dispatch_type'])) {
            $model->dispatchType = $map['dispatch_type'];
        }
        if (isset($map['unique_id'])) {
            $model->uniqueId = $map['unique_id'];
        }
        if (isset($map['test_url'])) {
            $model->testUrl = $map['test_url'];
        }
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['skip_auth'])) {
            $model->skipAuth = $map['skip_auth'];
        }
        if (isset($map['timeout'])) {
            $model->timeout = $map['timeout'];
        }
        if (isset($map['response_params'])) {
            if (!empty($map['response_params'])) {
                $model->responseParams = [];
                $n                     = 0;
                foreach ($map['response_params'] as $item) {
                    $model->responseParams[$n++] = null !== $item ? ApiParamInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['result_codes'])) {
            if (!empty($map['result_codes'])) {
                $model->resultCodes = [];
                $n                  = 0;
                foreach ($map['result_codes'] as $item) {
                    $model->resultCodes[$n++] = null !== $item ? ApiResultCodeInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
