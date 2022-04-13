<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateIngressTrafficweightRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 流量权重列表
    /**
     * @var ServiceWeight[]
     */
    public $serviceWeights;

    // service id
    /**
     * @var string
     */
    public $serviceId;
    protected $_name = [
        'authToken'      => 'auth_token',
        'serviceWeights' => 'service_weights',
        'serviceId'      => 'service_id',
    ];

    public function validate()
    {
        Model::validateRequired('serviceWeights', $this->serviceWeights, true);
        Model::validateRequired('serviceId', $this->serviceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->serviceWeights) {
            $res['service_weights'] = [];
            if (null !== $this->serviceWeights && \is_array($this->serviceWeights)) {
                $n = 0;
                foreach ($this->serviceWeights as $item) {
                    $res['service_weights'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateIngressTrafficweightRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['service_weights'])) {
            if (!empty($map['service_weights'])) {
                $model->serviceWeights = [];
                $n                     = 0;
                foreach ($map['service_weights'] as $item) {
                    $model->serviceWeights[$n++] = null !== $item ? ServiceWeight::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }

        return $model;
    }
}
