<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateWorkersAttendanceRequest extends Model
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

    // 项目编号
    /**
     * @var string
     */
    public $projectCode;

    // 身份证号
    /**
     * @var string
     */
    public $idCard;

    // 农民工考勤信息
    /**
     * @var WorkersCheckAttendance[]
     */
    public $attendanceList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'projectCode'       => 'project_code',
        'idCard'            => 'id_card',
        'attendanceList'    => 'attendance_list',
    ];

    public function validate()
    {
        Model::validateRequired('projectCode', $this->projectCode, true);
        Model::validateRequired('idCard', $this->idCard, true);
        Model::validateRequired('attendanceList', $this->attendanceList, true);
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
        if (null !== $this->projectCode) {
            $res['project_code'] = $this->projectCode;
        }
        if (null !== $this->idCard) {
            $res['id_card'] = $this->idCard;
        }
        if (null !== $this->attendanceList) {
            $res['attendance_list'] = [];
            if (null !== $this->attendanceList && \is_array($this->attendanceList)) {
                $n = 0;
                foreach ($this->attendanceList as $item) {
                    $res['attendance_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateWorkersAttendanceRequest
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
        if (isset($map['project_code'])) {
            $model->projectCode = $map['project_code'];
        }
        if (isset($map['id_card'])) {
            $model->idCard = $map['id_card'];
        }
        if (isset($map['attendance_list'])) {
            if (!empty($map['attendance_list'])) {
                $model->attendanceList = [];
                $n                     = 0;
                foreach ($map['attendance_list'] as $item) {
                    $model->attendanceList[$n++] = null !== $item ? WorkersCheckAttendance::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
