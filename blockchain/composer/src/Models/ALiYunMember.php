<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunMember extends Model
{
    // 加入时间
    /**
     * @example 11231231231
     *
     * @var int
     */
    public $joinTime;

    // 成员id
    /**
     * @example 成员id
     *
     * @var string
     */
    public $memberId;

    // 成员名称
    /**
     * @example 成员名称
     *
     * @var string
     */
    public $memberName;

    // 角色
    /**
     * @example 角色
     *
     * @var string
     */
    public $role;

    // 状态
    /**
     * @example 状态
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'joinTime'   => 'join_time',
        'memberId'   => 'member_id',
        'memberName' => 'member_name',
        'role'       => 'role',
        'status'     => 'status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->joinTime) {
            $res['join_time'] = $this->joinTime;
        }
        if (null !== $this->memberId) {
            $res['member_id'] = $this->memberId;
        }
        if (null !== $this->memberName) {
            $res['member_name'] = $this->memberName;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunMember
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['join_time'])) {
            $model->joinTime = $map['join_time'];
        }
        if (isset($map['member_id'])) {
            $model->memberId = $map['member_id'];
        }
        if (isset($map['member_name'])) {
            $model->memberName = $map['member_name'];
        }
        if (isset($map['role'])) {
            $model->role = $map['role'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
