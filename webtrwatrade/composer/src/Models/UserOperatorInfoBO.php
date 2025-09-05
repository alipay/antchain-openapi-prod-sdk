<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class UserOperatorInfoBO extends Model
{
    // userId
    /**
     * @example 1
     *
     * @var string
     */
    public $userId;

    // 别名
    /**
     * @example 1
     *
     * @var string
     */
    public $alias;

    // 钱包地址
    /**
     * @example 1
     *
     * @var string
     */
    public $address;

    // 登录账号类型列表
    /**
     * @example 1
     *
     * @var LoginAccountTypeBO[]
     */
    public $loginAccountTypeList;
    protected $_name = [
        'userId'               => 'user_id',
        'alias'                => 'alias',
        'address'              => 'address',
        'loginAccountTypeList' => 'login_account_type_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->alias) {
            $res['alias'] = $this->alias;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->loginAccountTypeList) {
            $res['login_account_type_list'] = [];
            if (null !== $this->loginAccountTypeList && \is_array($this->loginAccountTypeList)) {
                $n = 0;
                foreach ($this->loginAccountTypeList as $item) {
                    $res['login_account_type_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserOperatorInfoBO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['alias'])) {
            $model->alias = $map['alias'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['login_account_type_list'])) {
            if (!empty($map['login_account_type_list'])) {
                $model->loginAccountTypeList = [];
                $n                           = 0;
                foreach ($map['login_account_type_list'] as $item) {
                    $model->loginAccountTypeList[$n++] = null !== $item ? LoginAccountTypeBO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
