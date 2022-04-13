<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class NodeAffinityConfig extends Model
{
    // match_expressions
    /**
     * @example
     *
     * @var MatchExpression[]
     */
    public $matchExpressions;

    // requested
    /**
     * @example true, false
     *
     * @var bool
     */
    public $requested;

    // weight
    /**
     * @example
     *
     * @var int
     */
    public $weight;
    protected $_name = [
        'matchExpressions' => 'match_expressions',
        'requested'        => 'requested',
        'weight'           => 'weight',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->matchExpressions) {
            $res['match_expressions'] = [];
            if (null !== $this->matchExpressions && \is_array($this->matchExpressions)) {
                $n = 0;
                foreach ($this->matchExpressions as $item) {
                    $res['match_expressions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->requested) {
            $res['requested'] = $this->requested;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NodeAffinityConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['match_expressions'])) {
            if (!empty($map['match_expressions'])) {
                $model->matchExpressions = [];
                $n                       = 0;
                foreach ($map['match_expressions'] as $item) {
                    $model->matchExpressions[$n++] = null !== $item ? MatchExpression::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['requested'])) {
            $model->requested = $map['requested'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }

        return $model;
    }
}
