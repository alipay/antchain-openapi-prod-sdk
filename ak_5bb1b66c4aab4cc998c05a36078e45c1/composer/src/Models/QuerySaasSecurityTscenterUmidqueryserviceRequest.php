<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class QuerySaasSecurityTscenterUmidqueryserviceRequest extends Model
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

    // 用户token id
    /**
     * @var string
     */
    public $tokenId;

    // 服务版本
    /**
     * @var string
     */
    public $serviceVersion;

    // 返回的umid
    /**
     * @var string
     */
    public $data;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tokenId'           => 'token_id',
        'serviceVersion'    => 'service_version',
        'data'              => 'data',
    ];

    public function validate()
    {
        Model::validateRequired('tokenId', $this->tokenId, true);
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
        if (null !== $this->tokenId) {
            $res['token_id'] = $this->tokenId;
        }
        if (null !== $this->serviceVersion) {
            $res['service_version'] = $this->serviceVersion;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySaasSecurityTscenterUmidqueryserviceRequest
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
        if (isset($map['token_id'])) {
            $model->tokenId = $map['token_id'];
        }
        if (isset($map['service_version'])) {
            $model->serviceVersion = $map['service_version'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }

        return $model;
    }
}
