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

    // 租金归还状态，
    // 1.足额归还
    // 2.部分归还
    // 3.未归还，
    // 4退租,
    // 5该订单整个生命周期已完结
    /**
     * @var int
     */
    public $rentalReturnState;

    // 租金归还金额,精确到分，即1234表示12.34元
    /**
     * @var int
     */
    public $rentalMoney;

    // 归还时间，格式为"2019-07-31 12:00:00"
    /**
     * @var string
     */
    public $returnTime;

    // 归还方式，
    // 1.预授权代扣
    // 2.支付宝代扣
    // 3.主动还款
    // 4.其他
    // 5.网商直付通
    // 6.网商委托代扣
    /**
     * @var int
     */
    public $returnWay;

    // 还款凭证类型，
    // 1.支付宝
    // 2.平台代收（客户主动还款）
    // 3.其他
    // 6.网商银行
    /**
     * @var int
     */
    public $returnVoucherType;

    // 还款凭证编号，不超过128字符，1.支付宝流水号
    /**
     * @var string
     */
    public $returnVoucherSerial;

    // 手续费，如通过预授权、代扣的方式规划，必填，单位为分
    // 1234代表12.34元
    /**
     * @var int
     */
    public $charge;

    // 剩余归还期数
    /**
     * @var int
     */
    public $remainTerm;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'merchantTenantId'    => 'merchant_tenant_id',
        'orderId'             => 'order_id',
        'leaseTermIndex'      => 'lease_term_index',
        'rentalReturnState'   => 'rental_return_state',
        'rentalMoney'         => 'rental_money',
        'returnTime'          => 'return_time',
        'returnWay'           => 'return_way',
        'returnVoucherType'   => 'return_voucher_type',
        'returnVoucherSerial' => 'return_voucher_serial',
        'charge'              => 'charge',
        'remainTerm'          => 'remain_term',
    ];

    public function validate()
    {
        Model::validateRequired('merchantTenantId', $this->merchantTenantId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('leaseTermIndex', $this->leaseTermIndex, true);
        Model::validateRequired('rentalReturnState', $this->rentalReturnState, true);
        Model::validateRequired('rentalMoney', $this->rentalMoney, true);
        Model::validateRequired('returnTime', $this->returnTime, true);
        Model::validateRequired('returnWay', $this->returnWay, true);
        Model::validateRequired('returnVoucherType', $this->returnVoucherType, true);
        Model::validateRequired('returnVoucherSerial', $this->returnVoucherSerial, true);
        Model::validateRequired('charge', $this->charge, true);
        Model::validateRequired('remainTerm', $this->remainTerm, true);
        Model::validateMaxLength('merchantTenantId', $this->merchantTenantId, 50);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('returnVoucherSerial', $this->returnVoucherSerial, 128);
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
        if (null !== $this->rentalReturnState) {
            $res['rental_return_state'] = $this->rentalReturnState;
        }
        if (null !== $this->rentalMoney) {
            $res['rental_money'] = $this->rentalMoney;
        }
        if (null !== $this->returnTime) {
            $res['return_time'] = $this->returnTime;
        }
        if (null !== $this->returnWay) {
            $res['return_way'] = $this->returnWay;
        }
        if (null !== $this->returnVoucherType) {
            $res['return_voucher_type'] = $this->returnVoucherType;
        }
        if (null !== $this->returnVoucherSerial) {
            $res['return_voucher_serial'] = $this->returnVoucherSerial;
        }
        if (null !== $this->charge) {
            $res['charge'] = $this->charge;
        }
        if (null !== $this->remainTerm) {
            $res['remain_term'] = $this->remainTerm;
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
        if (isset($map['rental_return_state'])) {
            $model->rentalReturnState = $map['rental_return_state'];
        }
        if (isset($map['rental_money'])) {
            $model->rentalMoney = $map['rental_money'];
        }
        if (isset($map['return_time'])) {
            $model->returnTime = $map['return_time'];
        }
        if (isset($map['return_way'])) {
            $model->returnWay = $map['return_way'];
        }
        if (isset($map['return_voucher_type'])) {
            $model->returnVoucherType = $map['return_voucher_type'];
        }
        if (isset($map['return_voucher_serial'])) {
            $model->returnVoucherSerial = $map['return_voucher_serial'];
        }
        if (isset($map['charge'])) {
            $model->charge = $map['charge'];
        }
        if (isset($map['remain_term'])) {
            $model->remainTerm = $map['remain_term'];
        }

        return $model;
    }
}
