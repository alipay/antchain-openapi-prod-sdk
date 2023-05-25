<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class Strategy extends Model
{
    // 策略id
    /**
     * @example mystrategy
     *
     * @var string
     */
    public $strategyId;

    // 策略名
    /**
     * @example mystrategy
     *
     * @var string
     */
    public $strategyName;

    // 镜像相关策略内容
    /**
     * @example
     *
     * @var ImageStrategy
     */
    public $image;

    // 基线相关策略
    /**
     * @example
     *
     * @var BaselineStrategy
     */
    public $baseline;

    // 运行时策略
    /**
     * @example
     *
     * @var RuntimeStrategy
     */
    public $runtime;
    protected $_name = [
        'strategyId'   => 'strategy_id',
        'strategyName' => 'strategy_name',
        'image'        => 'image',
        'baseline'     => 'baseline',
        'runtime'      => 'runtime',
    ];

    public function validate()
    {
        Model::validateRequired('strategyId', $this->strategyId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->strategyId) {
            $res['strategy_id'] = $this->strategyId;
        }
        if (null !== $this->strategyName) {
            $res['strategy_name'] = $this->strategyName;
        }
        if (null !== $this->image) {
            $res['image'] = null !== $this->image ? $this->image->toMap() : null;
        }
        if (null !== $this->baseline) {
            $res['baseline'] = null !== $this->baseline ? $this->baseline->toMap() : null;
        }
        if (null !== $this->runtime) {
            $res['runtime'] = null !== $this->runtime ? $this->runtime->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Strategy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['strategy_id'])) {
            $model->strategyId = $map['strategy_id'];
        }
        if (isset($map['strategy_name'])) {
            $model->strategyName = $map['strategy_name'];
        }
        if (isset($map['image'])) {
            $model->image = ImageStrategy::fromMap($map['image']);
        }
        if (isset($map['baseline'])) {
            $model->baseline = BaselineStrategy::fromMap($map['baseline']);
        }
        if (isset($map['runtime'])) {
            $model->runtime = RuntimeStrategy::fromMap($map['runtime']);
        }

        return $model;
    }
}
