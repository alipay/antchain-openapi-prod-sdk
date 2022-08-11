<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest extends Model
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

    // 123
    /**
     * @var SecurityUniformRequest
     */
    public $securityUniformRequest;

    // 123
    /**
     * @var string
     */
    public $serviceVersion;

    // 返回结果
    /**
     * @var SecurityUniformResponse
     */
    public $data;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'securityUniformRequest' => 'security_uniform_request',
        'serviceVersion'         => 'service_version',
        'data'                   => 'data',
    ];

    public function validate()
    {
        Model::validateRequired('securityUniformRequest', $this->securityUniformRequest, true);
        Model::validateRequired('serviceVersion', $this->serviceVersion, true);
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
        if (null !== $this->securityUniformRequest) {
            $res['security_uniform_request'] = null !== $this->securityUniformRequest ? $this->securityUniformRequest->toMap() : null;
        }
        if (null !== $this->serviceVersion) {
            $res['service_version'] = $this->serviceVersion;
        }
        if (null !== $this->data) {
            $res['data'] = null !== $this->data ? $this->data->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest
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
        if (isset($map['security_uniform_request'])) {
            $model->securityUniformRequest = SecurityUniformRequest::fromMap($map['security_uniform_request']);
        }
        if (isset($map['service_version'])) {
            $model->serviceVersion = $map['service_version'];
        }
        if (isset($map['data'])) {
            $model->data = SecurityUniformResponse::fromMap($map['data']);
        }

        return $model;
    }
}
