<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeRepayListRequest extends Model
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

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 用信申请订单号
    /**
     * @var string
     */
    public $originalOrderNo;

    // 贴息比例
    /**
     * @var string
     */
    public $interestSubsidyRatio;

    // 参考定价
    /**
     * @var string
     */
    public $referenceRatio;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'orderNo'              => 'order_no',
        'originalOrderNo'      => 'original_order_no',
        'interestSubsidyRatio' => 'interest_subsidy_ratio',
        'referenceRatio'       => 'reference_ratio',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('originalOrderNo', $this->originalOrderNo, true);
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
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->originalOrderNo) {
            $res['original_order_no'] = $this->originalOrderNo;
        }
        if (null !== $this->interestSubsidyRatio) {
            $res['interest_subsidy_ratio'] = $this->interestSubsidyRatio;
        }
        if (null !== $this->referenceRatio) {
            $res['reference_ratio'] = $this->referenceRatio;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeRepayListRequest
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
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['original_order_no'])) {
            $model->originalOrderNo = $map['original_order_no'];
        }
        if (isset($map['interest_subsidy_ratio'])) {
            $model->interestSubsidyRatio = $map['interest_subsidy_ratio'];
        }
        if (isset($map['reference_ratio'])) {
            $model->referenceRatio = $map['reference_ratio'];
        }

        return $model;
    }
}
