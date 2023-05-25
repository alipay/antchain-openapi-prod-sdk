<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class BindStrategyRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 策略id
    /**
     * @var string
     */
    public $strategyId;

    // 集群id
    /**
     * @var string
     */
    public $clusterId;
    protected $_name = [
        'authToken'  => 'auth_token',
        'strategyId' => 'strategy_id',
        'clusterId'  => 'cluster_id',
    ];

    public function validate()
    {
        Model::validateRequired('strategyId', $this->strategyId, true);
        Model::validateRequired('clusterId', $this->clusterId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->strategyId) {
            $res['strategy_id'] = $this->strategyId;
        }
        if (null !== $this->clusterId) {
            $res['cluster_id'] = $this->clusterId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindStrategyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['strategy_id'])) {
            $model->strategyId = $map['strategy_id'];
        }
        if (isset($map['cluster_id'])) {
            $model->clusterId = $map['cluster_id'];
        }

        return $model;
    }
}
