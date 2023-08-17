<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class Admins extends Model
{
    // 管理员列表
    /**
     * @example "UserId":"1436266544664641536"
     *
     * @var User[]
     */
    public $users;

    // 组ID
    /**
     * @example "groupId":"1436266544664641536"
     *
     * @var Groups[]
     */
    public $groups;
    protected $_name = [
        'users'  => 'users',
        'groups' => 'groups',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->users) {
            $res['users'] = [];
            if (null !== $this->users && \is_array($this->users)) {
                $n = 0;
                foreach ($this->users as $item) {
                    $res['users'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->groups) {
            $res['groups'] = [];
            if (null !== $this->groups && \is_array($this->groups)) {
                $n = 0;
                foreach ($this->groups as $item) {
                    $res['groups'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Admins
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['users'])) {
            if (!empty($map['users'])) {
                $model->users = [];
                $n            = 0;
                foreach ($map['users'] as $item) {
                    $model->users[$n++] = null !== $item ? User::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['groups'])) {
            if (!empty($map['groups'])) {
                $model->groups = [];
                $n             = 0;
                foreach ($map['groups'] as $item) {
                    $model->groups[$n++] = null !== $item ? Groups::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
