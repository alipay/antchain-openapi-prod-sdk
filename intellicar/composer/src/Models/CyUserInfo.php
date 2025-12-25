<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class CyUserInfo extends Model
{
    // 用户id
    /**
     * @example xxx
     *
     * @var string
     */
    public $userId;

    // 用户名
    /**
     * @example xxxx
     *
     * @var string
     */
    public $userName;

    // 证件号
    /**
     * @example xxx
     *
     * @var string
     */
    public $idCard;

    // 手机号
    /**
     * @example xxx
     *
     * @var string
     */
    public $phoneNum;
    protected $_name = [
        'userId'   => 'user_id',
        'userName' => 'user_name',
        'idCard'   => 'id_card',
        'phoneNum' => 'phone_num',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('phoneNum', $this->phoneNum, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->idCard) {
            $res['id_card'] = $this->idCard;
        }
        if (null !== $this->phoneNum) {
            $res['phone_num'] = $this->phoneNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CyUserInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['id_card'])) {
            $model->idCard = $map['id_card'];
        }
        if (isset($map['phone_num'])) {
            $model->phoneNum = $map['phone_num'];
        }

        return $model;
    }
}
