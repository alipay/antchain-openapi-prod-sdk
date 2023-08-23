<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

/**
 * @internal
 * @coversNothing
 */
class NumberTest extends Model
{
    // 1
    /**
     * @example 1
     *
     * @var int
     */
    public $parameter1;

    // 2
    /**
     * @example 2
     *
     * @var int
     */
    public $parameter2;

    // 3
    /**
     * @example 3
     *
     * @var int
     */
    public $parameter3;

    // 4
    /**
     * @example 4
     *
     * @var int
     */
    public $parameter4;

    // 5
    /**
     * @example 5
     *
     * @var DemoClass
     */
    public $parameter5;
    protected $_name = [
        'parameter1' => 'parameter_1',
        'parameter2' => 'parameter_2',
        'parameter3' => 'parameter_3',
        'parameter4' => 'parameter_4',
        'parameter5' => 'parameter_5',
    ];

    public function validate()
    {
        Model::validateRequired('parameter1', $this->parameter1, true);
        Model::validateRequired('parameter2', $this->parameter2, true);
        Model::validateRequired('parameter3', $this->parameter3, true);
        Model::validateRequired('parameter4', $this->parameter4, true);
        Model::validateRequired('parameter5', $this->parameter5, true);
        Model::validateMaximum('parameter1', $this->parameter1, 5);
        Model::validateMaximum('parameter2', $this->parameter2, 5);
        Model::validateMaximum('parameter3', $this->parameter3, 5);
        Model::validateMaximum('parameter4', $this->parameter4, 5);
        Model::validateMinimum('parameter1', $this->parameter1, 1);
        Model::validateMinimum('parameter2', $this->parameter2, 1);
        Model::validateMinimum('parameter3', $this->parameter3, 1);
        Model::validateMinimum('parameter4', $this->parameter4, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->parameter1) {
            $res['parameter_1'] = $this->parameter1;
        }
        if (null !== $this->parameter2) {
            $res['parameter_2'] = $this->parameter2;
        }
        if (null !== $this->parameter3) {
            $res['parameter_3'] = $this->parameter3;
        }
        if (null !== $this->parameter4) {
            $res['parameter_4'] = $this->parameter4;
        }
        if (null !== $this->parameter5) {
            $res['parameter_5'] = null !== $this->parameter5 ? $this->parameter5->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NumberTest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['parameter_1'])) {
            $model->parameter1 = $map['parameter_1'];
        }
        if (isset($map['parameter_2'])) {
            $model->parameter2 = $map['parameter_2'];
        }
        if (isset($map['parameter_3'])) {
            $model->parameter3 = $map['parameter_3'];
        }
        if (isset($map['parameter_4'])) {
            $model->parameter4 = $map['parameter_4'];
        }
        if (isset($map['parameter_5'])) {
            $model->parameter5 = DemoClass::fromMap($map['parameter_5']);
        }

        return $model;
    }
}
