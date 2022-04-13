<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class HPAScalePolicy extends Model
{
    // 枚举型：
    // - pods：按pod个数扩缩容；
    // - percent：基于当前副本数的百分比扩缩容。
    /**
     * @example pods
     *
     * @var string
     */
    public $type;

    // 当type为percent时，value值为增长副本数的百分比，900%表示在原先副本数的基础上增加9倍（单位：%）；当type为pods时，value值为增加的副本数目（单位：个）。
    /**
     * @example 900
     *
     * @var int
     */
    public $value;

    // 每次扩缩容动作间隔时间：600表示每10分钟操作一次
    /**
     * @example 600
     *
     * @var int
     */
    public $periodSeconds;
    protected $_name = [
        'type'          => 'type',
        'value'         => 'value',
        'periodSeconds' => 'period_seconds',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->periodSeconds) {
            $res['period_seconds'] = $this->periodSeconds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HPAScalePolicy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['period_seconds'])) {
            $model->periodSeconds = $map['period_seconds'];
        }

        return $model;
    }
}
