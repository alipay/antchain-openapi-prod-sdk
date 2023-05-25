<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class DeleteImageReposcanstrategyRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 策略ID
    /**
     * @var string
     */
    public $strategyId;
    protected $_name = [
        'authToken'  => 'auth_token',
        'strategyId' => 'strategy_id',
    ];

    public function validate()
    {
        Model::validateRequired('strategyId', $this->strategyId, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteImageReposcanstrategyRequest
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

        return $model;
    }
}
