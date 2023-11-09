<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models;

use AlibabaCloud\Tea\Model;

class SyncAntchainAtoFundOrderfulfillmentRequest extends Model
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

    // 商户id
    /**
     * @var string
     */
    public $merchantTenantId;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 租期编号
    /**
     * @var int
     */
    public $leaseTermIndex;

    // 剩余归还期数
    /**
     * @var int
     */
    public $remainTerm;

    // 总期数
    /**
     * @var int
     */
    public $totalTerm;

    // 租金归还状态，
    // RETURN_FULL : 足额归还 【终态】
    // NOT_RETURN : 未归还
    // CANCEL : 取消 【终态】
    /**
     * @var string
     */
    public $rentalReturnState;

    // 租金归还金额,精确到分，即1234表示12.34元
    /**
     * @var int
     */
    public $rentalMoney;

    // 罚息金额，分，1234表示12.34元
    /**
     * @var int
     */
    public $penaltyFeeMoney;

    // 总金额，单位分
    /**
     * @var int
     */
    public $totalMoney;

    // 归还时间，格式为"2019-07-31 12:00:00"
    /**
     * @var string
     */
    public $returnTime;

    // 归还方式，
    // ANTDIGITAL： 数科代扣
    // FUND : 资方代扣
    // BANK : 银行转账
    // WECHAT : 微信支付
    /**
     * @var string
     */
    public $returnWay;

    // 还款凭证编号
    /**
     * @var string
     */
    public $returnVoucherSerial;

    // 银行名字
    /**
     * @var string
     */
    public $bankName;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'merchantTenantId'    => 'merchant_tenant_id',
        'orderId'             => 'order_id',
        'leaseTermIndex'      => 'lease_term_index',
        'remainTerm'          => 'remain_term',
        'totalTerm'           => 'total_term',
        'rentalReturnState'   => 'rental_return_state',
        'rentalMoney'         => 'rental_money',
        'penaltyFeeMoney'     => 'penalty_fee_money',
        'totalMoney'          => 'total_money',
        'returnTime'          => 'return_time',
        'returnWay'           => 'return_way',
        'returnVoucherSerial' => 'return_voucher_serial',
        'bankName'            => 'bank_name',
    ];

    public function validate()
    {
        Model::validateRequired('merchantTenantId', $this->merchantTenantId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('leaseTermIndex', $this->leaseTermIndex, true);
        Model::validateRequired('remainTerm', $this->remainTerm, true);
        Model::validateRequired('totalTerm', $this->totalTerm, true);
        Model::validateRequired('rentalReturnState', $this->rentalReturnState, true);
        Model::validateRequired('rentalMoney', $this->rentalMoney, true);
        Model::validateRequired('penaltyFeeMoney', $this->penaltyFeeMoney, true);
        Model::validateRequired('totalMoney', $this->totalMoney, true);
        Model::validateMaxLength('merchantTenantId', $this->merchantTenantId, 49);
        Model::validateMaxLength('orderId', $this->orderId, 49);
        Model::validateMaxLength('returnVoucherSerial', $this->returnVoucherSerial, 127);
        Model::validateMaxLength('bankName', $this->bankName, 127);
        Model::validateMinLength('merchantTenantId', $this->merchantTenantId, 1);
        Model::validateMinLength('orderId', $this->orderId, 1);
        Model::validateMinLength('returnVoucherSerial', $this->returnVoucherSerial, 1);
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
        if (null !== $this->merchantTenantId) {
            $res['merchant_tenant_id'] = $this->merchantTenantId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->leaseTermIndex) {
            $res['lease_term_index'] = $this->leaseTermIndex;
        }
        if (null !== $this->remainTerm) {
            $res['remain_term'] = $this->remainTerm;
        }
        if (null !== $this->totalTerm) {
            $res['total_term'] = $this->totalTerm;
        }
        if (null !== $this->rentalReturnState) {
            $res['rental_return_state'] = $this->rentalReturnState;
        }
        if (null !== $this->rentalMoney) {
            $res['rental_money'] = $this->rentalMoney;
        }
        if (null !== $this->penaltyFeeMoney) {
            $res['penalty_fee_money'] = $this->penaltyFeeMoney;
        }
        if (null !== $this->totalMoney) {
            $res['total_money'] = $this->totalMoney;
        }
        if (null !== $this->returnTime) {
            $res['return_time'] = $this->returnTime;
        }
        if (null !== $this->returnWay) {
            $res['return_way'] = $this->returnWay;
        }
        if (null !== $this->returnVoucherSerial) {
            $res['return_voucher_serial'] = $this->returnVoucherSerial;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncAntchainAtoFundOrderfulfillmentRequest
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
        if (isset($map['merchant_tenant_id'])) {
            $model->merchantTenantId = $map['merchant_tenant_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['lease_term_index'])) {
            $model->leaseTermIndex = $map['lease_term_index'];
        }
        if (isset($map['remain_term'])) {
            $model->remainTerm = $map['remain_term'];
        }
        if (isset($map['total_term'])) {
            $model->totalTerm = $map['total_term'];
        }
        if (isset($map['rental_return_state'])) {
            $model->rentalReturnState = $map['rental_return_state'];
        }
        if (isset($map['rental_money'])) {
            $model->rentalMoney = $map['rental_money'];
        }
        if (isset($map['penalty_fee_money'])) {
            $model->penaltyFeeMoney = $map['penalty_fee_money'];
        }
        if (isset($map['total_money'])) {
            $model->totalMoney = $map['total_money'];
        }
        if (isset($map['return_time'])) {
            $model->returnTime = $map['return_time'];
        }
        if (isset($map['return_way'])) {
            $model->returnWay = $map['return_way'];
        }
        if (isset($map['return_voucher_serial'])) {
            $model->returnVoucherSerial = $map['return_voucher_serial'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }

        return $model;
    }
}
