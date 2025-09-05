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
    public $userLoginAccountList;

    // 机构类型列表
    /**
     * @example 1
     *
     * @var string[]
     */
    public $userInstitutionTypeList;
    protected $_name = [
        'userId'                  => 'user_id',
        'alias'                   => 'alias',
        'address'                 => 'address',
        'userLoginAccountList'    => 'user_login_account_list',
        'userInstitutionTypeList' => 'user_institution_type_list',
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
        if (null !== $this->userLoginAccountList) {
            $res['user_login_account_list'] = [];
            if (null !== $this->userLoginAccountList && \is_array($this->userLoginAccountList)) {
                $n = 0;
                foreach ($this->userLoginAccountList as $item) {
                    $res['user_login_account_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->userInstitutionTypeList) {
            $res['user_institution_type_list'] = $this->userInstitutionTypeList;
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
        if (isset($map['user_login_account_list'])) {
            if (!empty($map['user_login_account_list'])) {
                $model->userLoginAccountList = [];
                $n                           = 0;
                foreach ($map['user_login_account_list'] as $item) {
                    $model->userLoginAccountList[$n++] = null !== $item ? LoginAccountTypeBO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['user_institution_type_list'])) {
            if (!empty($map['user_institution_type_list'])) {
                $model->userInstitutionTypeList = $map['user_institution_type_list'];
            }
        }

        return $model;
    }
}
