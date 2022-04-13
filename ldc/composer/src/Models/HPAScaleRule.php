<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class HPAScaleRule extends Model
{
    // 冷却窗口时间
    /**
     * @example 600
     *
     * @var int
     */
    public $stabilizationWindowSeconds;

    // 扩缩容策略
    /**
     * @example [{}]
     *
     * @var HPAScalePolicy[]
     */
    public $policies;
    protected $_name = [
        'stabilizationWindowSeconds' => 'stabilization_window_seconds',
        'policies'                   => 'policies',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->stabilizationWindowSeconds) {
            $res['stabilization_window_seconds'] = $this->stabilizationWindowSeconds;
        }
        if (null !== $this->policies) {
            $res['policies'] = [];
            if (null !== $this->policies && \is_array($this->policies)) {
                $n = 0;
                foreach ($this->policies as $item) {
                    $res['policies'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HPAScaleRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['stabilization_window_seconds'])) {
            $model->stabilizationWindowSeconds = $map['stabilization_window_seconds'];
        }
        if (isset($map['policies'])) {
            if (!empty($map['policies'])) {
                $model->policies = [];
                $n               = 0;
                foreach ($map['policies'] as $item) {
                    $model->policies[$n++] = null !== $item ? HPAScalePolicy::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
