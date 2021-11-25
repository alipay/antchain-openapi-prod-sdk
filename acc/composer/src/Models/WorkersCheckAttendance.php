<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class WorkersCheckAttendance extends Model
{
    // 考勤类型  [1.入场 2.退场]
    /**
     * @example 1
     *
     * @var string
     */
    public $attendanceType;

    // 打卡时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $clockInTime;
    protected $_name = [
        'attendanceType' => 'attendance_type',
        'clockInTime'    => 'clock_in_time',
    ];

    public function validate()
    {
        Model::validateRequired('attendanceType', $this->attendanceType, true);
        Model::validateRequired('clockInTime', $this->clockInTime, true);
        Model::validatePattern('clockInTime', $this->clockInTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->attendanceType) {
            $res['attendance_type'] = $this->attendanceType;
        }
        if (null !== $this->clockInTime) {
            $res['clock_in_time'] = $this->clockInTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WorkersCheckAttendance
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['attendance_type'])) {
            $model->attendanceType = $map['attendance_type'];
        }
        if (isset($map['clock_in_time'])) {
            $model->clockInTime = $map['clock_in_time'];
        }

        return $model;
    }
}
