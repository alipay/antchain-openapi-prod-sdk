<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XCalculationParameter extends Model
{
    // x
    /**
     * @example x
     *
     * @var string
     */
    public $expression;

    // x
    /**
     * @example true, false
     *
     * @var bool
     */
    public $constant;
    protected $_name = [
        'expression' => 'expression',
        'constant'   => 'constant',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->expression) {
            $res['expression'] = $this->expression;
        }
        if (null !== $this->constant) {
            $res['constant'] = $this->constant;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XCalculationParameter
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['expression'])) {
            $model->expression = $map['expression'];
        }
        if (isset($map['constant'])) {
            $model->constant = $map['constant'];
        }

        return $model;
    }
}
