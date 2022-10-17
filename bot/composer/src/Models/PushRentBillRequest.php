<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PushRentBillRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 业主房屋账单ID(
    /**
     * @var string
     */
    public $leaseBillId;

    // 房源ID
    /**
     * @var string
     */
    public $houseId;

    // 总账单开始日期
    /**
     * @var string
     */
    public $billBeginDate;

    // 总账单结束日期
    /**
     * @var string
     */
    public $billEndDate;

    // 总账单金额
    /**
     * @var string
     */
    public $billMoney;

    // 提醒缴租日期范围(天数)
    /**
     * @var string
     */
    public $remindRange;

    // 逾期未缴租警告日期范围(天数)
    /**
     * @var string
     */
    public $warnRange;

    // 风险干预日期天数
    /**
     * @var string
     */
    public $riskRange;

    // 账单租期集合
    /**
     * @var string
     */
    public $billItemList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'leaseBillId'       => 'lease_bill_id',
        'houseId'           => 'house_id',
        'billBeginDate'     => 'bill_begin_date',
        'billEndDate'       => 'bill_end_date',
        'billMoney'         => 'bill_money',
        'remindRange'       => 'remind_range',
        'warnRange'         => 'warn_range',
        'riskRange'         => 'risk_range',
        'billItemList'      => 'bill_item_list',
    ];

    public function validate()
    {
        Model::validateRequired('leaseBillId', $this->leaseBillId, true);
        Model::validateRequired('houseId', $this->houseId, true);
        Model::validateRequired('billBeginDate', $this->billBeginDate, true);
        Model::validateRequired('billEndDate', $this->billEndDate, true);
        Model::validateRequired('billMoney', $this->billMoney, true);
        Model::validateRequired('remindRange', $this->remindRange, true);
        Model::validateRequired('warnRange', $this->warnRange, true);
        Model::validateRequired('riskRange', $this->riskRange, true);
        Model::validateRequired('billItemList', $this->billItemList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->leaseBillId) {
            $res['lease_bill_id'] = $this->leaseBillId;
        }
        if (null !== $this->houseId) {
            $res['house_id'] = $this->houseId;
        }
        if (null !== $this->billBeginDate) {
            $res['bill_begin_date'] = $this->billBeginDate;
        }
        if (null !== $this->billEndDate) {
            $res['bill_end_date'] = $this->billEndDate;
        }
        if (null !== $this->billMoney) {
            $res['bill_money'] = $this->billMoney;
        }
        if (null !== $this->remindRange) {
            $res['remind_range'] = $this->remindRange;
        }
        if (null !== $this->warnRange) {
            $res['warn_range'] = $this->warnRange;
        }
        if (null !== $this->riskRange) {
            $res['risk_range'] = $this->riskRange;
        }
        if (null !== $this->billItemList) {
            $res['bill_item_list'] = $this->billItemList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushRentBillRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['lease_bill_id'])) {
            $model->leaseBillId = $map['lease_bill_id'];
        }
        if (isset($map['house_id'])) {
            $model->houseId = $map['house_id'];
        }
        if (isset($map['bill_begin_date'])) {
            $model->billBeginDate = $map['bill_begin_date'];
        }
        if (isset($map['bill_end_date'])) {
            $model->billEndDate = $map['bill_end_date'];
        }
        if (isset($map['bill_money'])) {
            $model->billMoney = $map['bill_money'];
        }
        if (isset($map['remind_range'])) {
            $model->remindRange = $map['remind_range'];
        }
        if (isset($map['warn_range'])) {
            $model->warnRange = $map['warn_range'];
        }
        if (isset($map['risk_range'])) {
            $model->riskRange = $map['risk_range'];
        }
        if (isset($map['bill_item_list'])) {
            $model->billItemList = $map['bill_item_list'];
        }

        return $model;
    }
}
