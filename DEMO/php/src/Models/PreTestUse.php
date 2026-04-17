<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class PreTestUse extends Model
{
    // 1
    /**
     * @example 1
     *
     * @var string
     */
    public $param1;

    // 11
    /**
     * @example 11
     *
     * @var int
     */
    public $param2;

    // boolean
    /**
     * @example true, false
     *
     * @var bool
     */
    public $param3;
    protected $_name = [
        'param1' => 'param_1',
        'param2' => 'param_2',
        'param3' => 'param_3',
    ];

    public function validate()
    {
        Model::validateRequired('param1', $this->param1, true);
        Model::validateRequired('param2', $this->param2, true);
        Model::validateRequired('param3', $this->param3, true);
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
        if (null !== $this->param3) {
            $res['param_3'] = $this->param3;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PreTestUse
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
        if (isset($map['param_3'])) {
            $model->param3 = $map['param_3'];
        }

        return $model;
    }
}
