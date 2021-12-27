<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class WithdrawRpgwUserCommissionRequest extends Model
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

    // 提现业务单号
    /**
     * @var string
     */
    public $orderNumber;

    // 任务单号
    /**
     * @var string
     */
    public $userOrderNumbers;

    // 提现人id
    /**
     * @var string
     */
    public $withdrawerId;

    // 提现人支付宝id
    /**
     * @var string
     */
    public $withdrawerAlipayId;

    // 提现人姓名
    /**
     * @var string
     */
    public $withdrawerName;

    // 提现人手机
    /**
     * @var string
     */
    public $withdrawerPhoneNumber;

    // 提现人身份证
    /**
     * @var string
     */
    public $withdrawerIdNumber;

    // 提现金额
    /**
     * @var string
     */
    public $withdrawAmount;

    // 提现附言
    /**
     * @var string
     */
    public $orderTitle;

    // 业务备注
    /**
     * @var string
     */
    public $remark;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'orderNumber'           => 'order_number',
        'userOrderNumbers'      => 'user_order_numbers',
        'withdrawerId'          => 'withdrawer_id',
        'withdrawerAlipayId'    => 'withdrawer_alipay_id',
        'withdrawerName'        => 'withdrawer_name',
        'withdrawerPhoneNumber' => 'withdrawer_phone_number',
        'withdrawerIdNumber'    => 'withdrawer_id_number',
        'withdrawAmount'        => 'withdraw_amount',
        'orderTitle'            => 'order_title',
        'remark'                => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('orderNumber', $this->orderNumber, true);
        Model::validateRequired('userOrderNumbers', $this->userOrderNumbers, true);
        Model::validateRequired('withdrawerId', $this->withdrawerId, true);
        Model::validateRequired('withdrawerAlipayId', $this->withdrawerAlipayId, true);
        Model::validateRequired('withdrawerName', $this->withdrawerName, true);
        Model::validateRequired('withdrawerIdNumber', $this->withdrawerIdNumber, true);
        Model::validateRequired('withdrawAmount', $this->withdrawAmount, true);
        Model::validateRequired('orderTitle', $this->orderTitle, true);
        Model::validateRequired('remark', $this->remark, true);
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
        if (null !== $this->orderNumber) {
            $res['order_number'] = $this->orderNumber;
        }
        if (null !== $this->userOrderNumbers) {
            $res['user_order_numbers'] = $this->userOrderNumbers;
        }
        if (null !== $this->withdrawerId) {
            $res['withdrawer_id'] = $this->withdrawerId;
        }
        if (null !== $this->withdrawerAlipayId) {
            $res['withdrawer_alipay_id'] = $this->withdrawerAlipayId;
        }
        if (null !== $this->withdrawerName) {
            $res['withdrawer_name'] = $this->withdrawerName;
        }
        if (null !== $this->withdrawerPhoneNumber) {
            $res['withdrawer_phone_number'] = $this->withdrawerPhoneNumber;
        }
        if (null !== $this->withdrawerIdNumber) {
            $res['withdrawer_id_number'] = $this->withdrawerIdNumber;
        }
        if (null !== $this->withdrawAmount) {
            $res['withdraw_amount'] = $this->withdrawAmount;
        }
        if (null !== $this->orderTitle) {
            $res['order_title'] = $this->orderTitle;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WithdrawRpgwUserCommissionRequest
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
        if (isset($map['order_number'])) {
            $model->orderNumber = $map['order_number'];
        }
        if (isset($map['user_order_numbers'])) {
            $model->userOrderNumbers = $map['user_order_numbers'];
        }
        if (isset($map['withdrawer_id'])) {
            $model->withdrawerId = $map['withdrawer_id'];
        }
        if (isset($map['withdrawer_alipay_id'])) {
            $model->withdrawerAlipayId = $map['withdrawer_alipay_id'];
        }
        if (isset($map['withdrawer_name'])) {
            $model->withdrawerName = $map['withdrawer_name'];
        }
        if (isset($map['withdrawer_phone_number'])) {
            $model->withdrawerPhoneNumber = $map['withdrawer_phone_number'];
        }
        if (isset($map['withdrawer_id_number'])) {
            $model->withdrawerIdNumber = $map['withdrawer_id_number'];
        }
        if (isset($map['withdraw_amount'])) {
            $model->withdrawAmount = $map['withdraw_amount'];
        }
        if (isset($map['order_title'])) {
            $model->orderTitle = $map['order_title'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}
