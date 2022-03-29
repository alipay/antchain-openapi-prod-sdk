<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ImportApiserviceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // api基本信息
    /**
     * @var ApiMetaRequest
     */
    public $apiMetaRequest;

    // api版本
    /**
     * @var ApiVersionRequest
     */
    public $apiVersionRequest;

    // api请求参数
    /**
     * @var ImportApiParamsRequest
     */
    public $importApiParamsRequest;
    protected $_name = [
        'authToken'              => 'auth_token',
        'apiMetaRequest'         => 'api_meta_request',
        'apiVersionRequest'      => 'api_version_request',
        'importApiParamsRequest' => 'import_api_params_request',
    ];

    public function validate()
    {
        Model::validateRequired('apiMetaRequest', $this->apiMetaRequest, true);
        Model::validateRequired('apiVersionRequest', $this->apiVersionRequest, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->apiMetaRequest) {
            $res['api_meta_request'] = null !== $this->apiMetaRequest ? $this->apiMetaRequest->toMap() : null;
        }
        if (null !== $this->apiVersionRequest) {
            $res['api_version_request'] = null !== $this->apiVersionRequest ? $this->apiVersionRequest->toMap() : null;
        }
        if (null !== $this->importApiParamsRequest) {
            $res['import_api_params_request'] = null !== $this->importApiParamsRequest ? $this->importApiParamsRequest->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportApiserviceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['api_meta_request'])) {
            $model->apiMetaRequest = ApiMetaRequest::fromMap($map['api_meta_request']);
        }
        if (isset($map['api_version_request'])) {
            $model->apiVersionRequest = ApiVersionRequest::fromMap($map['api_version_request']);
        }
        if (isset($map['import_api_params_request'])) {
            $model->importApiParamsRequest = ImportApiParamsRequest::fromMap($map['import_api_params_request']);
        }

        return $model;
    }
}
