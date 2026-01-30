<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models;

use AlibabaCloud\Tea\Model;

class SyncAntchainAtoFundSplittingRequest extends Model
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

    // 资方订单号
    /**
     * @var string
     */
    public $fundNo;

    // 商户的订单号
    /**
     * @var string
     */
    public $orderId;

    // 商户的数科租户ID
    /**
     * @var string
     */
    public $merchantTenantId;

    // 第几期，例如：2表示第二期
    /**
     * @var int
     */
    public $termNum;

    // 扣款时间， yyyy-MM-dd HH:mm:ss 格式
    /**
     * @var string
     */
    public $deductionTime;

    // 扣款金额，单位精确到分， 例如：12462300为124623.00元
    /**
     * @var int
     */
    public $deductionAmount;

    // 商户分账金额，单位精确到分，比如：666601 = 6666.01元
    /**
     * @var int
     */
    public $merchantSplitAmount;

    // 资方分账金额，单位精确到分。比如：666610 = 6666.10元
    /**
     * @var int
     */
    public $fundSplitAmount;

    // 其他参与方分账信息，JSON格式的数组，样例：
    // [{"participants":"参与方A","amount":666600,"accountNo":"777223","accountType":"ICBC"}]
    /**
     * @var string
     */
    public $otherSplitInfo;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'fundNo'              => 'fund_no',
        'orderId'             => 'order_id',
        'merchantTenantId'    => 'merchant_tenant_id',
        'termNum'             => 'term_num',
        'deductionTime'       => 'deduction_time',
        'deductionAmount'     => 'deduction_amount',
        'merchantSplitAmount' => 'merchant_split_amount',
        'fundSplitAmount'     => 'fund_split_amount',
        'otherSplitInfo'      => 'other_split_info',
    ];

    public function validate()
    {
        Model::validateRequired('fundNo', $this->fundNo, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantTenantId', $this->merchantTenantId, true);
        Model::validateRequired('termNum', $this->termNum, true);
        Model::validateRequired('deductionTime', $this->deductionTime, true);
        Model::validateRequired('deductionAmount', $this->deductionAmount, true);
        Model::validateRequired('merchantSplitAmount', $this->merchantSplitAmount, true);
        Model::validateRequired('fundSplitAmount', $this->fundSplitAmount, true);
        Model::validateMaxLength('fundNo', $this->fundNo, 50);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('merchantTenantId', $this->merchantTenantId, 50);
        Model::validateMinLength('fundNo', $this->fundNo, 1);
        Model::validateMinLength('orderId', $this->orderId, 1);
        Model::validateMinLength('merchantTenantId', $this->merchantTenantId, 1);
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
        if (null !== $this->fundNo) {
            $res['fund_no'] = $this->fundNo;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->merchantTenantId) {
            $res['merchant_tenant_id'] = $this->merchantTenantId;
        }
        if (null !== $this->termNum) {
            $res['term_num'] = $this->termNum;
        }
        if (null !== $this->deductionTime) {
            $res['deduction_time'] = $this->deductionTime;
        }
        if (null !== $this->deductionAmount) {
            $res['deduction_amount'] = $this->deductionAmount;
        }
        if (null !== $this->merchantSplitAmount) {
            $res['merchant_split_amount'] = $this->merchantSplitAmount;
        }
        if (null !== $this->fundSplitAmount) {
            $res['fund_split_amount'] = $this->fundSplitAmount;
        }
        if (null !== $this->otherSplitInfo) {
            $res['other_split_info'] = $this->otherSplitInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncAntchainAtoFundSplittingRequest
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
        if (isset($map['fund_no'])) {
            $model->fundNo = $map['fund_no'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['merchant_tenant_id'])) {
            $model->merchantTenantId = $map['merchant_tenant_id'];
        }
        if (isset($map['term_num'])) {
            $model->termNum = $map['term_num'];
        }
        if (isset($map['deduction_time'])) {
            $model->deductionTime = $map['deduction_time'];
        }
        if (isset($map['deduction_amount'])) {
            $model->deductionAmount = $map['deduction_amount'];
        }
        if (isset($map['merchant_split_amount'])) {
            $model->merchantSplitAmount = $map['merchant_split_amount'];
        }
        if (isset($map['fund_split_amount'])) {
            $model->fundSplitAmount = $map['fund_split_amount'];
        }
        if (isset($map['other_split_info'])) {
            $model->otherSplitInfo = $map['other_split_info'];
        }

        return $model;
    }
}
