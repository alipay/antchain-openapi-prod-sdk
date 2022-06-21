<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ApplyDubbridgeUsecreditRequest extends Model
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

    // 授信申请订单号
    /**
     * @var string
     */
    public $originalOrderNo;

    // 用信金额
    /**
     * @var int
     */
    public $loanAmount;

    // 期数
    /**
     * @var int
     */
    public $period;

    // 资产方用户唯一标识
    /**
     * @var string
     */
    public $openId;

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 还款方式:1：等额本息，2：等额本金
    /**
     * @var string
     */
    public $repayType;

    // 1：手机数码 2：旅游 3：装修 4：教育 5：婚庆 6：租房 7：家具家居 8：健康医疗 9：其他消费 10：家用电器
    /**
     * @var string
     */
    public $loanWay;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'originalOrderNo'   => 'original_order_no',
        'loanAmount'        => 'loan_amount',
        'period'            => 'period',
        'openId'            => 'open_id',
        'orderNo'           => 'order_no',
        'repayType'         => 'repay_type',
        'loanWay'           => 'loan_way',
    ];

    public function validate()
    {
        Model::validateRequired('originalOrderNo', $this->originalOrderNo, true);
        Model::validateRequired('loanAmount', $this->loanAmount, true);
        Model::validateRequired('period', $this->period, true);
        Model::validateRequired('openId', $this->openId, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('repayType', $this->repayType, true);
        Model::validateRequired('loanWay', $this->loanWay, true);
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
        if (null !== $this->originalOrderNo) {
            $res['original_order_no'] = $this->originalOrderNo;
        }
        if (null !== $this->loanAmount) {
            $res['loan_amount'] = $this->loanAmount;
        }
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->repayType) {
            $res['repay_type'] = $this->repayType;
        }
        if (null !== $this->loanWay) {
            $res['loan_way'] = $this->loanWay;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyDubbridgeUsecreditRequest
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
        if (isset($map['original_order_no'])) {
            $model->originalOrderNo = $map['original_order_no'];
        }
        if (isset($map['loan_amount'])) {
            $model->loanAmount = $map['loan_amount'];
        }
        if (isset($map['period'])) {
            $model->period = $map['period'];
        }
        if (isset($map['open_id'])) {
            $model->openId = $map['open_id'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['repay_type'])) {
            $model->repayType = $map['repay_type'];
        }
        if (isset($map['loan_way'])) {
            $model->loanWay = $map['loan_way'];
        }

        return $model;
    }
}
