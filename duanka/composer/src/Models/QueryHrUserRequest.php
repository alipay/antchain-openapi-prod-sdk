<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class QueryHrUserRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 花名列表
    /**
     * @var string[]
     */
    public $nickNameList;

    // 域账户列表
    /**
     * @var string[]
     */
    public $loginAccountList;
    protected $_name = [
        'authToken'        => 'auth_token',
        'nickNameList'     => 'nick_name_list',
        'loginAccountList' => 'login_account_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->nickNameList) {
            $res['nick_name_list'] = $this->nickNameList;
        }
        if (null !== $this->loginAccountList) {
            $res['login_account_list'] = $this->loginAccountList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryHrUserRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['nick_name_list'])) {
            if (!empty($map['nick_name_list'])) {
                $model->nickNameList = $map['nick_name_list'];
            }
        }
        if (isset($map['login_account_list'])) {
            if (!empty($map['login_account_list'])) {
                $model->loginAccountList = $map['login_account_list'];
            }
        }

        return $model;
    }
}
