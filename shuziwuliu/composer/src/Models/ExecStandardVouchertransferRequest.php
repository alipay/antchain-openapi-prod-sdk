<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ExecStandardVouchertransferRequest extends Model
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

    // 所属账户
    /**
     * @var string
     */
    public $voucherOwner;

    // 数据标识
    /**
     * @var string
     */
    public $businessCode;

    // 余额
    /**
     * @var string
     */
    public $balanceSenderTransfer;

    // 余额
    /**
     * @var string
     */
    public $balanceProof;

    // 余额
    /**
     * @var string
     */
    public $balanceReceiverAccount;

    // 余额
    /**
     * @var string
     */
    public $balanceReceiverBusinessCode;

    // 余额
    /**
     * @var string
     */
    public $balanceReceiverTransfer;
    protected $_name = [
        'authToken'                   => 'auth_token',
        'productInstanceId'           => 'product_instance_id',
        'voucherOwner'                => 'voucher_owner',
        'businessCode'                => 'business_code',
        'balanceSenderTransfer'       => 'balance_sender_transfer',
        'balanceProof'                => 'balance_proof',
        'balanceReceiverAccount'      => 'balance_receiver_account',
        'balanceReceiverBusinessCode' => 'balance_receiver_business_code',
        'balanceReceiverTransfer'     => 'balance_receiver_transfer',
    ];

    public function validate()
    {
        Model::validateRequired('voucherOwner', $this->voucherOwner, true);
        Model::validateRequired('businessCode', $this->businessCode, true);
        Model::validateRequired('balanceSenderTransfer', $this->balanceSenderTransfer, true);
        Model::validateRequired('balanceProof', $this->balanceProof, true);
        Model::validateRequired('balanceReceiverAccount', $this->balanceReceiverAccount, true);
        Model::validateRequired('balanceReceiverBusinessCode', $this->balanceReceiverBusinessCode, true);
        Model::validateRequired('balanceReceiverTransfer', $this->balanceReceiverTransfer, true);
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
        if (null !== $this->voucherOwner) {
            $res['voucher_owner'] = $this->voucherOwner;
        }
        if (null !== $this->businessCode) {
            $res['business_code'] = $this->businessCode;
        }
        if (null !== $this->balanceSenderTransfer) {
            $res['balance_sender_transfer'] = $this->balanceSenderTransfer;
        }
        if (null !== $this->balanceProof) {
            $res['balance_proof'] = $this->balanceProof;
        }
        if (null !== $this->balanceReceiverAccount) {
            $res['balance_receiver_account'] = $this->balanceReceiverAccount;
        }
        if (null !== $this->balanceReceiverBusinessCode) {
            $res['balance_receiver_business_code'] = $this->balanceReceiverBusinessCode;
        }
        if (null !== $this->balanceReceiverTransfer) {
            $res['balance_receiver_transfer'] = $this->balanceReceiverTransfer;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecStandardVouchertransferRequest
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
        if (isset($map['voucher_owner'])) {
            $model->voucherOwner = $map['voucher_owner'];
        }
        if (isset($map['business_code'])) {
            $model->businessCode = $map['business_code'];
        }
        if (isset($map['balance_sender_transfer'])) {
            $model->balanceSenderTransfer = $map['balance_sender_transfer'];
        }
        if (isset($map['balance_proof'])) {
            $model->balanceProof = $map['balance_proof'];
        }
        if (isset($map['balance_receiver_account'])) {
            $model->balanceReceiverAccount = $map['balance_receiver_account'];
        }
        if (isset($map['balance_receiver_business_code'])) {
            $model->balanceReceiverBusinessCode = $map['balance_receiver_business_code'];
        }
        if (isset($map['balance_receiver_transfer'])) {
            $model->balanceReceiverTransfer = $map['balance_receiver_transfer'];
        }

        return $model;
    }
}
