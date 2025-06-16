<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CarOwnerUserInfo extends Model
{
    // 用户id
    /**
     * @example XX
     *
     * @var string
     */
    public $userId;

    // 手机号
    /**
     * @example XXX
     *
     * @var string
     */
    public $phoneNum;
    protected $_name = [
        'userId'   => 'user_id',
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
        if (null !== $this->phoneNum) {
            $res['phone_num'] = $this->phoneNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CarOwnerUserInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['phone_num'])) {
            $model->phoneNum = $map['phone_num'];
        }

        return $model;
    }
}
