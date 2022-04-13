<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class GrayLabelApplyRule extends Model
{
    // 多个指定条件的计算方式，目前支持AND和OR
    /**
     * @example AND, OR
     *
     * @var string
     */
    public $operator;

    // 入口流量的多个规则，将根据operator进行与、或运算
    /**
     * @example [{}]
     *
     * @var GrayLabelDownstreamRule[]
     */
    public $downstreamRules;
    protected $_name = [
        'operator'        => 'operator',
        'downstreamRules' => 'downstream_rules',
    ];

    public function validate()
    {
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('downstreamRules', $this->downstreamRules, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->downstreamRules) {
            $res['downstream_rules'] = [];
            if (null !== $this->downstreamRules && \is_array($this->downstreamRules)) {
                $n = 0;
                foreach ($this->downstreamRules as $item) {
                    $res['downstream_rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GrayLabelApplyRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['downstream_rules'])) {
            if (!empty($map['downstream_rules'])) {
                $model->downstreamRules = [];
                $n                      = 0;
                foreach ($map['downstream_rules'] as $item) {
                    $model->downstreamRules[$n++] = null !== $item ? GrayLabelDownstreamRule::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
