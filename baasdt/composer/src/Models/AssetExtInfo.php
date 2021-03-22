<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class AssetExtInfo extends Model
{
    // 发放账户余额
    /**
     * @example 1000
     *
     * @var string
     */
    public $dispenseBalance;

    // 发放账户归属租户ID
    /**
     * @example tenantid
     *
     * @var string
     */
    public $dispenseTenantId;

    // 用户账户余额
    /**
     * @example 100
     *
     * @var string
     */
    public $userCreditBalance;

    // 用户ID
    /**
     * @example user001
     *
     * @var string
     */
    public $userId;
    protected $_name = [
        'dispenseBalance'   => 'dispense_balance',
        'dispenseTenantId'  => 'dispense_tenant_id',
        'userCreditBalance' => 'user_credit_balance',
        'userId'            => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('dispenseBalance', $this->dispenseBalance, true);
        Model::validateRequired('dispenseTenantId', $this->dispenseTenantId, true);
        Model::validateRequired('userCreditBalance', $this->userCreditBalance, true);
        Model::validateRequired('userId', $this->userId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dispenseBalance) {
            $res['dispense_balance'] = $this->dispenseBalance;
        }
        if (null !== $this->dispenseTenantId) {
            $res['dispense_tenant_id'] = $this->dispenseTenantId;
        }
        if (null !== $this->userCreditBalance) {
            $res['user_credit_balance'] = $this->userCreditBalance;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AssetExtInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dispense_balance'])) {
            $model->dispenseBalance = $map['dispense_balance'];
        }
        if (isset($map['dispense_tenant_id'])) {
            $model->dispenseTenantId = $map['dispense_tenant_id'];
        }
        if (isset($map['user_credit_balance'])) {
            $model->userCreditBalance = $map['user_credit_balance'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
