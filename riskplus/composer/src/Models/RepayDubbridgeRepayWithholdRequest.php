<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RepayDubbridgeRepayWithholdRequest extends Model
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

    // 还款类型1:当期结清，2：正常还款3：全部结清
    /**
     * @var string
     */
    public $repayType;

    // 订单号
    /**
     * @var string
     */
    public $orderNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'originalOrderNo'   => 'original_order_no',
        'repayType'         => 'repay_type',
        'orderNo'           => 'order_no',
    ];

    public function validate()
    {
        Model::validateRequired('originalOrderNo', $this->originalOrderNo, true);
        Model::validateRequired('repayType', $this->repayType, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
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
        if (null !== $this->repayType) {
            $res['repay_type'] = $this->repayType;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RepayDubbridgeRepayWithholdRequest
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
        if (isset($map['repay_type'])) {
            $model->repayType = $map['repay_type'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }

        return $model;
    }
}
