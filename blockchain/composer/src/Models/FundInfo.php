<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class FundInfo extends Model
{
    // 可提现余额
    /**
     * @example 10.8
     *
     * @var string
     */
    public $balance;

    // 待结算额度
    /**
     * @example 11.4
     *
     * @var string
     */
    public $settleQuota;

    // 商户id
    /**
     * @example tset id
     *
     * @var string
     */
    public $shopId;
    protected $_name = [
        'balance'     => 'balance',
        'settleQuota' => 'settle_quota',
        'shopId'      => 'shop_id',
    ];

    public function validate()
    {
        Model::validateRequired('balance', $this->balance, true);
        Model::validateRequired('settleQuota', $this->settleQuota, true);
        Model::validateRequired('shopId', $this->shopId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->balance) {
            $res['balance'] = $this->balance;
        }
        if (null !== $this->settleQuota) {
            $res['settle_quota'] = $this->settleQuota;
        }
        if (null !== $this->shopId) {
            $res['shop_id'] = $this->shopId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FundInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['balance'])) {
            $model->balance = $map['balance'];
        }
        if (isset($map['settle_quota'])) {
            $model->settleQuota = $map['settle_quota'];
        }
        if (isset($map['shop_id'])) {
            $model->shopId = $map['shop_id'];
        }

        return $model;
    }
}
