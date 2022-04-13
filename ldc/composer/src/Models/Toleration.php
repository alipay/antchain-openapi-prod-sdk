<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class Toleration extends Model
{
    // 取值：NoExecute、PreferNoSchedule、NoSchedule
    /**
     * @example PreferNoSchedule and NoExecute.
     *
     * @var string
     */
    public $effect;

    // Key is the taint key that the toleration applies to.
    /**
     * @example key
     *
     * @var string
     */
    public $key;

    // 取值：Equal、Exists
    /**
     * @example Equal
     *
     * @var string
     */
    public $operator;

    // TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint.
    /**
     * @example
     *
     * @var int
     */
    public $tolerationSeconds;

    // Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.
    /**
     * @example value
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'effect'            => 'effect',
        'key'               => 'key',
        'operator'          => 'operator',
        'tolerationSeconds' => 'toleration_seconds',
        'value'             => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('effect', $this->effect, true);
        Model::validateRequired('key', $this->key, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->effect) {
            $res['effect'] = $this->effect;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->tolerationSeconds) {
            $res['toleration_seconds'] = $this->tolerationSeconds;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Toleration
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['effect'])) {
            $model->effect = $map['effect'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['toleration_seconds'])) {
            $model->tolerationSeconds = $map['toleration_seconds'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
