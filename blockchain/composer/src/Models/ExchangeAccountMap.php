<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ExchangeAccountMap extends Model
{
    // 用户联系方式
    /**
     * @example 13473121212
     *
     * @var string
     */
    public $phone;

    // 用户账户
    /**
     * @example testAccount
     *
     * @var string
     */
    public $userAccount;

    // 用户名称
    /**
     * @example 小明
     *
     * @var string
     */
    public $userName;
    protected $_name = [
        'phone'       => 'phone',
        'userAccount' => 'user_account',
        'userName'    => 'user_name',
    ];

    public function validate()
    {
        Model::validateRequired('phone', $this->phone, true);
        Model::validateRequired('userAccount', $this->userAccount, true);
        Model::validateRequired('userName', $this->userName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->userAccount) {
            $res['user_account'] = $this->userAccount;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExchangeAccountMap
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['user_account'])) {
            $model->userAccount = $map['user_account'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }

        return $model;
    }
}
