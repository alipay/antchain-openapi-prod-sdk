<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2fdfc04b2afb4da9ac403531af8942a9\Models;

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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tokenId'           => 'token_id',
        'serviceVersion'    => 'service_version',
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

        return $model;
    }
}
