<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_6efc6591476e4813ac8f7c9b6359c0b7\Models;

use AlibabaCloud\Tea\Model;

class QuerySaasSecurityInfosecOpencheckservicequeryRequest extends Model
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

    // 查询参数
    /**
     * @var string
     */
    public $event;

    // 服务版本
    /**
     * @var string
     */
    public $serviceVersion;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'event'             => 'event',
        'serviceVersion'    => 'service_version',
    ];

    public function validate()
    {
        Model::validateRequired('event', $this->event, true);
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
        if (null !== $this->event) {
            $res['event'] = $this->event;
        }
        if (null !== $this->serviceVersion) {
            $res['service_version'] = $this->serviceVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySaasSecurityInfosecOpencheckservicequeryRequest
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
        if (isset($map['event'])) {
            $model->event = $map['event'];
        }
        if (isset($map['service_version'])) {
            $model->serviceVersion = $map['service_version'];
        }

        return $model;
    }
}
