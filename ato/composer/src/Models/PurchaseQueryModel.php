<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PurchaseQueryModel extends Model
{
    // 支付宝外部交易号
    /**
     * @example 202304xxxxxxxxxx
     *
     * @var string
     */
    public $outOrderNo;

    // 支付宝内部生成的交易号
    /**
     * @example 20230426xxxxxxxxxx
     *
     * @var string
     */
    public $orderNo;

    // 银行卡号
    /**
     * @example 6228xxxxxxxxxxxxx13
     *
     * @var string
     */
    public $bankCardNo;

    // 公司名称
    /**
     * @example 杭州贸易有限公司
     *
     * @var string
     */
    public $companyName;

    // 金额，用户购买或使用服务时产生的具体金额，单位：分
    /**
     * @example 6657
     *
     * @var int
     */
    public $salesAmount;
    protected $_name = [
        'outOrderNo'  => 'out_order_no',
        'orderNo'     => 'order_no',
        'bankCardNo'  => 'bank_card_no',
        'companyName' => 'company_name',
        'salesAmount' => 'sales_amount',
    ];

    public function validate()
    {
        Model::validateMaxLength('outOrderNo', $this->outOrderNo, 128);
        Model::validateMaxLength('orderNo', $this->orderNo, 50);
        Model::validateMaxLength('bankCardNo', $this->bankCardNo, 52);
        Model::validateMaxLength('companyName', $this->companyName, 50);
        Model::validateMinLength('outOrderNo', $this->outOrderNo, 1);
        Model::validateMinLength('orderNo', $this->orderNo, 1);
        Model::validateMinLength('bankCardNo', $this->bankCardNo, 1);
        Model::validateMinLength('companyName', $this->companyName, 1);
        Model::validateMaximum('salesAmount', $this->salesAmount, 10000000);
        Model::validateMinimum('salesAmount', $this->salesAmount, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->outOrderNo) {
            $res['out_order_no'] = $this->outOrderNo;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->bankCardNo) {
            $res['bank_card_no'] = $this->bankCardNo;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->salesAmount) {
            $res['sales_amount'] = $this->salesAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PurchaseQueryModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['out_order_no'])) {
            $model->outOrderNo = $map['out_order_no'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['bank_card_no'])) {
            $model->bankCardNo = $map['bank_card_no'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['sales_amount'])) {
            $model->salesAmount = $map['sales_amount'];
        }

        return $model;
    }
}
