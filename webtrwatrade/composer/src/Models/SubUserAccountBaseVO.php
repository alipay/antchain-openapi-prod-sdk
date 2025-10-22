<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class SubUserAccountBaseVO extends Model
{
    // 二级用户ID
    /**
     * @example b20167e21a8d4cc2b5f1022d24f43815
     *
     * @var string
     */
    public $subUserAccountId;

    // 用户地址
    /**
     * @example 0x9f18be920360500f216495cd589895d3917cd9f2
     *
     * @var string
     */
    public $userAddress;

    // 用户邮箱
    /**
     * @example test@gamil.com
     *
     * @var string
     */
    public $contact;

    // 用户昵称
    /**
     * @example Alice
     *
     * @var string
     */
    public $alias;
    protected $_name = [
        'subUserAccountId' => 'sub_user_account_id',
        'userAddress'      => 'user_address',
        'contact'          => 'contact',
        'alias'            => 'alias',
    ];

    public function validate()
    {
        Model::validateRequired('subUserAccountId', $this->subUserAccountId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->subUserAccountId) {
            $res['sub_user_account_id'] = $this->subUserAccountId;
        }
        if (null !== $this->userAddress) {
            $res['user_address'] = $this->userAddress;
        }
        if (null !== $this->contact) {
            $res['contact'] = $this->contact;
        }
        if (null !== $this->alias) {
            $res['alias'] = $this->alias;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubUserAccountBaseVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sub_user_account_id'])) {
            $model->subUserAccountId = $map['sub_user_account_id'];
        }
        if (isset($map['user_address'])) {
            $model->userAddress = $map['user_address'];
        }
        if (isset($map['contact'])) {
            $model->contact = $map['contact'];
        }
        if (isset($map['alias'])) {
            $model->alias = $map['alias'];
        }

        return $model;
    }
}
