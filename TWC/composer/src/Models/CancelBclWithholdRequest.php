<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CancelBclWithholdRequest extends Model
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

    // 解约申请单号
    /**
     * @var string
     */
    public $cancelApplyNo;

    // 是否允许解除代扣
    /**
     * @var bool
     */
    public $allowCancelWithhold;

    // 拒绝解约的原因,拒绝解约时必传
    /**
     * @var string
     */
    public $rejectReason;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'cancelApplyNo'       => 'cancel_apply_no',
        'allowCancelWithhold' => 'allow_cancel_withhold',
        'rejectReason'        => 'reject_reason',
    ];

    public function validate()
    {
        Model::validateRequired('cancelApplyNo', $this->cancelApplyNo, true);
        Model::validateRequired('allowCancelWithhold', $this->allowCancelWithhold, true);
        Model::validateMaxLength('rejectReason', $this->rejectReason, 128);
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
        if (null !== $this->cancelApplyNo) {
            $res['cancel_apply_no'] = $this->cancelApplyNo;
        }
        if (null !== $this->allowCancelWithhold) {
            $res['allow_cancel_withhold'] = $this->allowCancelWithhold;
        }
        if (null !== $this->rejectReason) {
            $res['reject_reason'] = $this->rejectReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelBclWithholdRequest
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
        if (isset($map['cancel_apply_no'])) {
            $model->cancelApplyNo = $map['cancel_apply_no'];
        }
        if (isset($map['allow_cancel_withhold'])) {
            $model->allowCancelWithhold = $map['allow_cancel_withhold'];
        }
        if (isset($map['reject_reason'])) {
            $model->rejectReason = $map['reject_reason'];
        }

        return $model;
    }
}
