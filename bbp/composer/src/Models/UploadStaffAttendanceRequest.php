<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BBP\Models;

use AlibabaCloud\Tea\Model;

class UploadStaffAttendanceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 考勤信息
    /**
     * @var Attendance
     */
    public $attendance;

    // uuid就行
    /**
     * @var string
     */
    public $bizId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'attendance'        => 'attendance',
        'bizId'             => 'biz_id',
    ];

    public function validate()
    {
        Model::validateRequired('attendance', $this->attendance, true);
        Model::validateRequired('bizId', $this->bizId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->attendance) {
            $res['attendance'] = null !== $this->attendance ? $this->attendance->toMap() : null;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadStaffAttendanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['attendance'])) {
            $model->attendance = Attendance::fromMap($map['attendance']);
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }

        return $model;
    }
}
