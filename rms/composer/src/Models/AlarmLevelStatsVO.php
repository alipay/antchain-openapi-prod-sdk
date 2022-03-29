<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AlarmLevelStatsVO extends Model
{
    // l0
    /**
     * @example l0
     *
     * @var int
     */
    public $l0;

    // l1
    /**
     * @example l1
     *
     * @var int
     */
    public $l1;

    // l2
    /**
     * @example l2
     *
     * @var int
     */
    public $l2;
    protected $_name = [
        'l0' => 'l0',
        'l1' => 'l1',
        'l2' => 'l2',
    ];

    public function validate()
    {
        Model::validateRequired('l0', $this->l0, true);
        Model::validateRequired('l1', $this->l1, true);
        Model::validateRequired('l2', $this->l2, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->l0) {
            $res['l0'] = $this->l0;
        }
        if (null !== $this->l1) {
            $res['l1'] = $this->l1;
        }
        if (null !== $this->l2) {
            $res['l2'] = $this->l2;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AlarmLevelStatsVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['l0'])) {
            $model->l0 = $map['l0'];
        }
        if (isset($map['l1'])) {
            $model->l1 = $map['l1'];
        }
        if (isset($map['l2'])) {
            $model->l2 = $map['l2'];
        }

        return $model;
    }
}
