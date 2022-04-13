<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class HPAScaleBehavior extends Model
{
    // 扩容高级规则
    /**
     * @example
     *
     * @var HPAScaleRule
     */
    public $scaleUp;

    // 缩容高级规则
    /**
     * @example
     *
     * @var HPAScaleRule
     */
    public $scaleDown;
    protected $_name = [
        'scaleUp'   => 'scale_up',
        'scaleDown' => 'scale_down',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->scaleUp) {
            $res['scale_up'] = null !== $this->scaleUp ? $this->scaleUp->toMap() : null;
        }
        if (null !== $this->scaleDown) {
            $res['scale_down'] = null !== $this->scaleDown ? $this->scaleDown->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HPAScaleBehavior
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['scale_up'])) {
            $model->scaleUp = HPAScaleRule::fromMap($map['scale_up']);
        }
        if (isset($map['scale_down'])) {
            $model->scaleDown = HPAScaleRule::fromMap($map['scale_down']);
        }

        return $model;
    }
}
