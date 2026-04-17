<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class TestA extends Model
{
    // 1
    /**
     * @example 1
     *
     * @var string
     */
    public $parameter1;

    // 2
    /**
     * @example 2
     *
     * @var string
     */
    public $parameter2;

    // 3
    /**
     * @example 3
     *
     * @var string
     */
    public $parameter3;

    // 4
    /**
     * @example 4
     *
     * @var string
     */
    public $parameter4;

    // 5
    /**
     * @example 5
     *
     * @var string
     */
    public $parameter5;

    // 6
    /**
     * @example 6
     *
     * @var string
     */
    public $parameter6;

    // 7
    /**
     * @example 7
     *
     * @var string
     */
    public $parameter7;

    // 8
    /**
     * @example 8
     *
     * @var string
     */
    public $parameter8;

    // 9
    /**
     * @example 9
     *
     * @var string
     */
    public $parameter9;

    // 10
    /**
     * @example 10
     *
     * @var string
     */
    public $parameter10;
    protected $_name = [
        'parameter1'  => 'parameter_1',
        'parameter2'  => 'parameter_2',
        'parameter3'  => 'parameter_3',
        'parameter4'  => 'parameter_4',
        'parameter5'  => 'parameter_5',
        'parameter6'  => 'parameter_6',
        'parameter7'  => 'parameter_7',
        'parameter8'  => 'parameter_8',
        'parameter9'  => 'parameter_9',
        'parameter10' => 'parameter_10',
    ];

    public function validate()
    {
        Model::validateRequired('parameter1', $this->parameter1, true);
        Model::validateRequired('parameter2', $this->parameter2, true);
        Model::validateRequired('parameter3', $this->parameter3, true);
        Model::validateRequired('parameter4', $this->parameter4, true);
        Model::validateRequired('parameter5', $this->parameter5, true);
        Model::validateRequired('parameter6', $this->parameter6, true);
        Model::validateRequired('parameter7', $this->parameter7, true);
        Model::validateRequired('parameter8', $this->parameter8, true);
        Model::validateRequired('parameter9', $this->parameter9, true);
        Model::validateRequired('parameter10', $this->parameter10, true);
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
            $res['parameter_5'] = $this->parameter5;
        }
        if (null !== $this->parameter6) {
            $res['parameter_6'] = $this->parameter6;
        }
        if (null !== $this->parameter7) {
            $res['parameter_7'] = $this->parameter7;
        }
        if (null !== $this->parameter8) {
            $res['parameter_8'] = $this->parameter8;
        }
        if (null !== $this->parameter9) {
            $res['parameter_9'] = $this->parameter9;
        }
        if (null !== $this->parameter10) {
            $res['parameter_10'] = $this->parameter10;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TestA
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
            $model->parameter5 = $map['parameter_5'];
        }
        if (isset($map['parameter_6'])) {
            $model->parameter6 = $map['parameter_6'];
        }
        if (isset($map['parameter_7'])) {
            $model->parameter7 = $map['parameter_7'];
        }
        if (isset($map['parameter_8'])) {
            $model->parameter8 = $map['parameter_8'];
        }
        if (isset($map['parameter_9'])) {
            $model->parameter9 = $map['parameter_9'];
        }
        if (isset($map['parameter_10'])) {
            $model->parameter10 = $map['parameter_10'];
        }

        return $model;
    }
}
