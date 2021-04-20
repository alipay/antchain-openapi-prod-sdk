<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class User extends Model
{
    // 用户账户，手机号格式为： +区号-手机号，分享码：6位字母，支付宝登录账号：手机号/邮箱
    /**
     * @example +86-13000000000 |  AAAAAA | 13000000000 | user@test.com
     *
     * @var string
     */
    public $userIdNo;

    // 用户账号类型，当前仅支持手机号和分享码，PHONE：手机号，SHARE_CODE：分享码，
    // ALIPAY_LOGON_ID：支付宝登录账号
    /**
     * @example PHONE | SHARE_CODE | ALIPAY_LOGON_ID
     *
     * @var string
     */
    public $userIdType;
    protected $_name = [
        'userIdNo'   => 'user_id_no',
        'userIdType' => 'user_id_type',
    ];

    public function validate()
    {
        Model::validateRequired('userIdNo', $this->userIdNo, true);
        Model::validateRequired('userIdType', $this->userIdType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userIdNo) {
            $res['user_id_no'] = $this->userIdNo;
        }
        if (null !== $this->userIdType) {
            $res['user_id_type'] = $this->userIdType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return User
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id_no'])) {
            $model->userIdNo = $map['user_id_no'];
        }
        if (isset($map['user_id_type'])) {
            $model->userIdType = $map['user_id_type'];
        }

        return $model;
    }
}
