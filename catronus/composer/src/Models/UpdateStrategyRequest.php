<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class UpdateStrategyRequest extends Model
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

    // 策略内容
    /**
     * @var Strategy
     */
    public $content;
    protected $_name = [
        'authToken'  => 'auth_token',
        'strategyId' => 'strategy_id',
        'content'    => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('strategyId', $this->strategyId, true);
        Model::validateRequired('content', $this->content, true);
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
        if (null !== $this->content) {
            $res['content'] = null !== $this->content ? $this->content->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateStrategyRequest
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
        if (isset($map['content'])) {
            $model->content = Strategy::fromMap($map['content']);
        }

        return $model;
    }
}
