<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AccountWholesaleParam extends Model
{
    // 批发数量
    /**
     * @example 1000
     *
     * @var int
     */
    public $epAmount;

    // 用户账户
    /**
     * @example testAccount
     *
     * @var string
     */
    public $userAccount;
    protected $_name = [
        'epAmount'    => 'ep_amount',
        'userAccount' => 'user_account',
    ];

    public function validate()
    {
        Model::validateRequired('epAmount', $this->epAmount, true);
        Model::validateRequired('userAccount', $this->userAccount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->epAmount) {
            $res['ep_amount'] = $this->epAmount;
        }
        if (null !== $this->userAccount) {
            $res['user_account'] = $this->userAccount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AccountWholesaleParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ep_amount'])) {
            $model->epAmount = $map['ep_amount'];
        }
        if (isset($map['user_account'])) {
            $model->userAccount = $map['user_account'];
        }

        return $model;
    }
}
