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

    // service id
    /**
     * @var string
     */
    public $serviceId;

    // 流量权重列表
    /**
     * @var ServiceWeight[]
     */
    public $serviceWeights;

    // 流量权重列表蓝绿发布v2
    /**
     * @var CellWeight[]
     */
    public $cellWeights;
    protected $_name = [
        'authToken'      => 'auth_token',
        'serviceId'      => 'service_id',
        'serviceWeights' => 'service_weights',
        'cellWeights'    => 'cell_weights',
    ];

    public function validate()
    {
        Model::validateRequired('serviceId', $this->serviceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
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
        if (null !== $this->cellWeights) {
            $res['cell_weights'] = [];
            if (null !== $this->cellWeights && \is_array($this->cellWeights)) {
                $n = 0;
                foreach ($this->cellWeights as $item) {
                    $res['cell_weights'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
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
        if (isset($map['cell_weights'])) {
            if (!empty($map['cell_weights'])) {
                $model->cellWeights = [];
                $n                  = 0;
                foreach ($map['cell_weights'] as $item) {
                    $model->cellWeights[$n++] = null !== $item ? CellWeight::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
