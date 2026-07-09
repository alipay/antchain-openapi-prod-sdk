<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class RentContractInfo extends Model
{
    // 租赁合同ID
    /**
     * @example 2c952456827828cdedad06afccef75a9f2c2840cbb6b0b659f653da1e5916cb2
     *
     * @var string
     */
    public $contractId;

    // 租约时间
    /**
     * @example 6个月 或 1年
     *
     * @var string
     */
    public $leaseTime;

    // 入住时间
    /**
     * @example 2006-01-02 15:04:05
     *
     * @var string
     */
    public $checkinDate;

    // 退租时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $checkoutDate;
    protected $_name = [
        'contractId'   => 'contract_id',
        'leaseTime'    => 'lease_time',
        'checkinDate'  => 'checkin_date',
        'checkoutDate' => 'checkout_date',
    ];

    public function validate()
    {
        Model::validateRequired('contractId', $this->contractId, true);
        Model::validateRequired('leaseTime', $this->leaseTime, true);
        Model::validateRequired('checkinDate', $this->checkinDate, true);
        Model::validateRequired('checkoutDate', $this->checkoutDate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contractId) {
            $res['contract_id'] = $this->contractId;
        }
        if (null !== $this->leaseTime) {
            $res['lease_time'] = $this->leaseTime;
        }
        if (null !== $this->checkinDate) {
            $res['checkin_date'] = $this->checkinDate;
        }
        if (null !== $this->checkoutDate) {
            $res['checkout_date'] = $this->checkoutDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RentContractInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['contract_id'])) {
            $model->contractId = $map['contract_id'];
        }
        if (isset($map['lease_time'])) {
            $model->leaseTime = $map['lease_time'];
        }
        if (isset($map['checkin_date'])) {
            $model->checkinDate = $map['checkin_date'];
        }
        if (isset($map['checkout_date'])) {
            $model->checkoutDate = $map['checkout_date'];
        }

        return $model;
    }
}
