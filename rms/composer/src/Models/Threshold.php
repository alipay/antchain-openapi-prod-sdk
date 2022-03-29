<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class Threshold extends Model
{
    // level1
    /**
     * @example level1
     *
     * @var string
     */
    public $level1;

    // level2
    /**
     * @example level2
     *
     * @var string
     */
    public $level2;

    // level3
    /**
     * @example level3
     *
     * @var string
     */
    public $level3;

    // im
    /**
     * @example im
     *
     * @var string
     */
    public $im;

    // sms
    /**
     * @example sms
     *
     * @var string
     */
    public $sms;

    // control_plan
    /**
     * @example control_plan
     *
     * @var string
     */
    public $controlPlan;
    protected $_name = [
        'level1'      => 'level1',
        'level2'      => 'level2',
        'level3'      => 'level3',
        'im'          => 'im',
        'sms'         => 'sms',
        'controlPlan' => 'control_plan',
    ];

    public function validate()
    {
        Model::validateRequired('level1', $this->level1, true);
        Model::validateRequired('level2', $this->level2, true);
        Model::validateRequired('level3', $this->level3, true);
        Model::validateRequired('im', $this->im, true);
        Model::validateRequired('sms', $this->sms, true);
        Model::validateRequired('controlPlan', $this->controlPlan, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->level1) {
            $res['level1'] = $this->level1;
        }
        if (null !== $this->level2) {
            $res['level2'] = $this->level2;
        }
        if (null !== $this->level3) {
            $res['level3'] = $this->level3;
        }
        if (null !== $this->im) {
            $res['im'] = $this->im;
        }
        if (null !== $this->sms) {
            $res['sms'] = $this->sms;
        }
        if (null !== $this->controlPlan) {
            $res['control_plan'] = $this->controlPlan;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Threshold
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['level1'])) {
            $model->level1 = $map['level1'];
        }
        if (isset($map['level2'])) {
            $model->level2 = $map['level2'];
        }
        if (isset($map['level3'])) {
            $model->level3 = $map['level3'];
        }
        if (isset($map['im'])) {
            $model->im = $map['im'];
        }
        if (isset($map['sms'])) {
            $model->sms = $map['sms'];
        }
        if (isset($map['control_plan'])) {
            $model->controlPlan = $map['control_plan'];
        }

        return $model;
    }
}
