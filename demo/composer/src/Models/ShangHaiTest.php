<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

/**
 * @internal
 * @coversNothing
 */
class ShangHaiTest extends Model
{
    // string
    /**
     * @example test
     *
     * @var string
     */
    public $param1;

    // number
    /**
     * @example 1
     *
     * @var int
     */
    public $param2;
    protected $_name = [
        'param1' => 'param_1',
        'param2' => 'param_2',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->param1) {
            $res['param_1'] = $this->param1;
        }
        if (null !== $this->param2) {
            $res['param_2'] = $this->param2;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ShangHaiTest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['param_1'])) {
            $model->param1 = $map['param_1'];
        }
        if (isset($map['param_2'])) {
            $model->param2 = $map['param_2'];
        }

        return $model;
    }
}
