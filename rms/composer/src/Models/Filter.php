<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class Filter extends Model
{
    // 过滤列
    /**
     * @example
     *
     * @var UniqueDim
     */
    public $dim;

    // 过滤目标值列表
    /**
     * @example
     *
     * @var string[]
     */
    public $values;
    protected $_name = [
        'dim'    => 'dim',
        'values' => 'values',
    ];

    public function validate()
    {
        Model::validateRequired('dim', $this->dim, true);
        Model::validateRequired('values', $this->values, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dim) {
            $res['dim'] = null !== $this->dim ? $this->dim->toMap() : null;
        }
        if (null !== $this->values) {
            $res['values'] = $this->values;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Filter
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dim'])) {
            $model->dim = UniqueDim::fromMap($map['dim']);
        }
        if (isset($map['values'])) {
            if (!empty($map['values'])) {
                $model->values = $map['values'];
            }
        }

        return $model;
    }
}
