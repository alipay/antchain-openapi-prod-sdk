<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class CpfUserAccountInfo extends Model
{
    // 账户状态
    /**
     * @example 正常 ：01   封存：02    欠缴：03   其他：04
     *
     * @var string
     */
    public $accountStatus;

    // 账户余额
    /**
     * @example "123.67"
     *
     * @var string
     */
    public $balance;

    // 缴纳单位名称
    /**
     * @example 网易
     *
     * @var string
     */
    public $instName;

    // 个人账户
    /**
     * @example 11410000005184
     *
     * @var string
     */
    public $accountId;
    protected $_name = [
        'accountStatus' => 'account_status',
        'balance'       => 'balance',
        'instName'      => 'inst_name',
        'accountId'     => 'account_id',
    ];

    public function validate()
    {
        Model::validateRequired('accountStatus', $this->accountStatus, true);
        Model::validateRequired('balance', $this->balance, true);
        Model::validateRequired('instName', $this->instName, true);
        Model::validateRequired('accountId', $this->accountId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountStatus) {
            $res['account_status'] = $this->accountStatus;
        }
        if (null !== $this->balance) {
            $res['balance'] = $this->balance;
        }
        if (null !== $this->instName) {
            $res['inst_name'] = $this->instName;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CpfUserAccountInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_status'])) {
            $model->accountStatus = $map['account_status'];
        }
        if (isset($map['balance'])) {
            $model->balance = $map['balance'];
        }
        if (isset($map['inst_name'])) {
            $model->instName = $map['inst_name'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }

        return $model;
    }
}
