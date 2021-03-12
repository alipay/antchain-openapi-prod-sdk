<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AccountMappingInfo extends Model
{
    // 链上账户id
    /**
     * @example xxxxxxx
     *
     * @var string
     */
    public $bcAccount;

    // 账户绑定状态，1为未绑定，2为绑定成功
    /**
     * @example 1
     *
     * @var int
     */
    public $bindingStatus;

    // 1是激活状态，2是冻结状态
    /**
     * @example 1
     *
     * @var int
     */
    public $status;

    // 账户唯一标示
    /**
     * @example userid
     *
     * @var string
     */
    public $uid;
    protected $_name = [
        'bcAccount'     => 'bc_account',
        'bindingStatus' => 'binding_status',
        'status'        => 'status',
        'uid'           => 'uid',
    ];

    public function validate()
    {
        Model::validateRequired('bcAccount', $this->bcAccount, true);
        Model::validateRequired('bindingStatus', $this->bindingStatus, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('uid', $this->uid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bcAccount) {
            $res['bc_account'] = $this->bcAccount;
        }
        if (null !== $this->bindingStatus) {
            $res['binding_status'] = $this->bindingStatus;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AccountMappingInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bc_account'])) {
            $model->bcAccount = $map['bc_account'];
        }
        if (isset($map['binding_status'])) {
            $model->bindingStatus = $map['binding_status'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['uid'])) {
            $model->uid = $map['uid'];
        }

        return $model;
    }
}
