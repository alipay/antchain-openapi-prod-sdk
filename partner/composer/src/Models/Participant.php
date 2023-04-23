<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class Participant extends Model
{
    // 参与人角色
    /**
     * @example BD
     *
     * @var string
     */
    public $role;

    // 参与人工号
    /**
     * @example 001
     *
     * @var string
     */
    public $workNo;
    protected $_name = [
        'role'   => 'role',
        'workNo' => 'work_no',
    ];

    public function validate()
    {
        Model::validateRequired('role', $this->role, true);
        Model::validateRequired('workNo', $this->workNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->workNo) {
            $res['work_no'] = $this->workNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Participant
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['role'])) {
            $model->role = $map['role'];
        }
        if (isset($map['work_no'])) {
            $model->workNo = $map['work_no'];
        }

        return $model;
    }
}
