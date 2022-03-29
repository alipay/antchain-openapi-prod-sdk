<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ImportApiParamsRequest extends Model
{
    // 请求参数
    /**
     * @example
     *
     * @var ApiParamRequest[]
     */
    public $requestParams;

    // 响应参数
    /**
     * @example
     *
     * @var ApiParamRequest[]
     */
    public $responseParams;

    // 返回结果码
    /**
     * @example
     *
     * @var ResultCodeRequest[]
     */
    public $resultCodes;

    // api名称
    /**
     * @example test
     *
     * @var string
     */
    public $apiName;

    // api版本
    /**
     * @example 1.0
     *
     * @var string
     */
    public $apiVersion;
    protected $_name = [
        'requestParams'  => 'request_params',
        'responseParams' => 'response_params',
        'resultCodes'    => 'result_codes',
        'apiName'        => 'api_name',
        'apiVersion'     => 'api_version',
    ];

    public function validate()
    {
        Model::validateRequired('apiName', $this->apiName, true);
        Model::validateRequired('apiVersion', $this->apiVersion, true);
    }

    public function toMap()
    {
        $res = [];
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
        if (null !== $this->resultCodes) {
            $res['result_codes'] = [];
            if (null !== $this->resultCodes && \is_array($this->resultCodes)) {
                $n = 0;
                foreach ($this->resultCodes as $item) {
                    $res['result_codes'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->apiName) {
            $res['api_name'] = $this->apiName;
        }
        if (null !== $this->apiVersion) {
            $res['api_version'] = $this->apiVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportApiParamsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['request_params'])) {
            if (!empty($map['request_params'])) {
                $model->requestParams = [];
                $n                    = 0;
                foreach ($map['request_params'] as $item) {
                    $model->requestParams[$n++] = null !== $item ? ApiParamRequest::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['response_params'])) {
            if (!empty($map['response_params'])) {
                $model->responseParams = [];
                $n                     = 0;
                foreach ($map['response_params'] as $item) {
                    $model->responseParams[$n++] = null !== $item ? ApiParamRequest::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['result_codes'])) {
            if (!empty($map['result_codes'])) {
                $model->resultCodes = [];
                $n                  = 0;
                foreach ($map['result_codes'] as $item) {
                    $model->resultCodes[$n++] = null !== $item ? ResultCodeRequest::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['api_name'])) {
            $model->apiName = $map['api_name'];
        }
        if (isset($map['api_version'])) {
            $model->apiVersion = $map['api_version'];
        }

        return $model;
    }
}
