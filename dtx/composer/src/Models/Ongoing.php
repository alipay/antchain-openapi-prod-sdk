<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class Ongoing extends Model
{
    // 进行中分支事务数
    /**
     * @example 2
     *
     * @var int
     */
    public $actionNum;

    // 进行中事务数
    /**
     * @example 100
     *
     * @var int
     */
    public $activityNum;
    protected $_name = [
        'actionNum'   => 'action_num',
        'activityNum' => 'activity_num',
    ];

    public function validate()
    {
        Model::validateRequired('actionNum', $this->actionNum, true);
        Model::validateRequired('activityNum', $this->activityNum, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->actionNum) {
            $res['action_num'] = $this->actionNum;
        }
        if (null !== $this->activityNum) {
            $res['activity_num'] = $this->activityNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Ongoing
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action_num'])) {
            $model->actionNum = $map['action_num'];
        }
        if (isset($map['activity_num'])) {
            $model->activityNum = $map['activity_num'];
        }

        return $model;
    }
}
