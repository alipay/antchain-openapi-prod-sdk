<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class OCUserData extends Model
{
    // 创建时间
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $createTime;

    // 手机号
    /**
     * @example 186xxxxx
     *
     * @var string
     */
    public $phoneNumber;

    // 用户姓名
    /**
     * @example xxxxxxx
     *
     * @var string
     */
    public $userName;
    protected $_name = [
        'createTime'  => 'create_time',
        'phoneNumber' => 'phone_number',
        'userName'    => 'user_name',
    ];

    public function validate()
    {
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('phoneNumber', $this->phoneNumber, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validatePattern('createTime', $this->createTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OCUserData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }

        return $model;
    }
}
