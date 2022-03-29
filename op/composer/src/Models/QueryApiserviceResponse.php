<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class QueryApiserviceResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 套件信息
    /**
     * @var ApiSuite
     */
    public $apiSuite;

    // api基本信息
    /**
     * @var ApiMeta
     */
    public $apiMeta;

    // api版本数据
    /**
     * @var ApiVersion
     */
    public $apiVersion;

    // api分组信息
    /**
     * @var ApiGroup
     */
    public $apiGroup;

    // api请求参数
    /**
     * @var ParamModal[]
     */
    public $requestParams;

    // api返回参数
    /**
     * @var ParamModal[]
     */
    public $responseParams;

    // 结果码
    /**
     * @var ResultCode[]
     */
    public $resultCodes;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'apiSuite'       => 'api_suite',
        'apiMeta'        => 'api_meta',
        'apiVersion'     => 'api_version',
        'apiGroup'       => 'api_group',
        'requestParams'  => 'request_params',
        'responseParams' => 'response_params',
        'resultCodes'    => 'result_codes',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->apiSuite) {
            $res['api_suite'] = null !== $this->apiSuite ? $this->apiSuite->toMap() : null;
        }
        if (null !== $this->apiMeta) {
            $res['api_meta'] = null !== $this->apiMeta ? $this->apiMeta->toMap() : null;
        }
        if (null !== $this->apiVersion) {
            $res['api_version'] = null !== $this->apiVersion ? $this->apiVersion->toMap() : null;
        }
        if (null !== $this->apiGroup) {
            $res['api_group'] = null !== $this->apiGroup ? $this->apiGroup->toMap() : null;
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
     * @return QueryApiserviceResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['api_suite'])) {
            $model->apiSuite = ApiSuite::fromMap($map['api_suite']);
        }
        if (isset($map['api_meta'])) {
            $model->apiMeta = ApiMeta::fromMap($map['api_meta']);
        }
        if (isset($map['api_version'])) {
            $model->apiVersion = ApiVersion::fromMap($map['api_version']);
        }
        if (isset($map['api_group'])) {
            $model->apiGroup = ApiGroup::fromMap($map['api_group']);
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
        if (isset($map['result_codes'])) {
            if (!empty($map['result_codes'])) {
                $model->resultCodes = [];
                $n                  = 0;
                foreach ($map['result_codes'] as $item) {
                    $model->resultCodes[$n++] = null !== $item ? ResultCode::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
