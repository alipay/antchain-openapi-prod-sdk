<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class NotifyInsuranceOspireportRequest extends Model
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

    // 案件同步唯一码，调用方生成的唯一编码； 格式为 yyyyMMdd_身份标识_其他编码，yyyyMMdd请传递当前时间。
    // 系统会根据该流水号做防重、幂等判断逻辑。
    /**
     * @var string
     */
    public $tradeNo;

    // 报案号，关联的报案案件号
    /**
     * @var string
     */
    public $reportNo;

    // 订单号
    /**
     * @var string
     */
    public $relaOrderNo;

    // 理赔金额(元)，实际的理赔金额，最多支持2位小数，超2位小数拒绝请求
    /**
     * @var string
     */
    public $claimAmount;

    // 支付时间，实际的保司打款时间，格式：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $paymentTime;

    // 银行流水，打款的银行流水号
    /**
     * @var string
     */
    public $bankSerialNum;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tradeNo'           => 'trade_no',
        'reportNo'          => 'report_no',
        'relaOrderNo'       => 'rela_order_no',
        'claimAmount'       => 'claim_amount',
        'paymentTime'       => 'payment_time',
        'bankSerialNum'     => 'bank_serial_num',
    ];

    public function validate()
    {
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('reportNo', $this->reportNo, true);
        Model::validateRequired('relaOrderNo', $this->relaOrderNo, true);
        Model::validateRequired('claimAmount', $this->claimAmount, true);
        Model::validateRequired('paymentTime', $this->paymentTime, true);
        Model::validateRequired('bankSerialNum', $this->bankSerialNum, true);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 50);
        Model::validateMaxLength('reportNo', $this->reportNo, 100);
        Model::validateMaxLength('relaOrderNo', $this->relaOrderNo, 100);
        Model::validateMaxLength('bankSerialNum', $this->bankSerialNum, 200);
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
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->reportNo) {
            $res['report_no'] = $this->reportNo;
        }
        if (null !== $this->relaOrderNo) {
            $res['rela_order_no'] = $this->relaOrderNo;
        }
        if (null !== $this->claimAmount) {
            $res['claim_amount'] = $this->claimAmount;
        }
        if (null !== $this->paymentTime) {
            $res['payment_time'] = $this->paymentTime;
        }
        if (null !== $this->bankSerialNum) {
            $res['bank_serial_num'] = $this->bankSerialNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyInsuranceOspireportRequest
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
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['report_no'])) {
            $model->reportNo = $map['report_no'];
        }
        if (isset($map['rela_order_no'])) {
            $model->relaOrderNo = $map['rela_order_no'];
        }
        if (isset($map['claim_amount'])) {
            $model->claimAmount = $map['claim_amount'];
        }
        if (isset($map['payment_time'])) {
            $model->paymentTime = $map['payment_time'];
        }
        if (isset($map['bank_serial_num'])) {
            $model->bankSerialNum = $map['bank_serial_num'];
        }

        return $model;
    }
}
