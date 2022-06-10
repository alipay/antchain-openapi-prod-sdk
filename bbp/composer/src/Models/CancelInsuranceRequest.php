<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BBP\Models;

use AlibabaCloud\Tea\Model;

class CancelInsuranceRequest extends Model
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

    // 原保单号
    /**
     * @var string
     */
    public $policyNo;

    // 保单终止日期 毫秒值
    /**
     * @var int
     */
    public $policyEndTime;

    // 退保原因
    /**
     * @var string
     */
    public $reasonForQuit;

    // 退保保费金额，单位分
    /**
     * @var int
     */
    public $quitTotalAmount;

    // 扩展信息
    /**
     * @var string
     */
    public $extend;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'policyNo'          => 'policy_no',
        'policyEndTime'     => 'policy_end_time',
        'reasonForQuit'     => 'reason_for_quit',
        'quitTotalAmount'   => 'quit_total_amount',
        'extend'            => 'extend',
    ];

    public function validate()
    {
        Model::validateRequired('policyNo', $this->policyNo, true);
        Model::validateRequired('policyEndTime', $this->policyEndTime, true);
        Model::validateRequired('reasonForQuit', $this->reasonForQuit, true);
        Model::validateRequired('quitTotalAmount', $this->quitTotalAmount, true);
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
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->policyEndTime) {
            $res['policy_end_time'] = $this->policyEndTime;
        }
        if (null !== $this->reasonForQuit) {
            $res['reason_for_quit'] = $this->reasonForQuit;
        }
        if (null !== $this->quitTotalAmount) {
            $res['quit_total_amount'] = $this->quitTotalAmount;
        }
        if (null !== $this->extend) {
            $res['extend'] = $this->extend;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelInsuranceRequest
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
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['policy_end_time'])) {
            $model->policyEndTime = $map['policy_end_time'];
        }
        if (isset($map['reason_for_quit'])) {
            $model->reasonForQuit = $map['reason_for_quit'];
        }
        if (isset($map['quit_total_amount'])) {
            $model->quitTotalAmount = $map['quit_total_amount'];
        }
        if (isset($map['extend'])) {
            $model->extend = $map['extend'];
        }

        return $model;
    }
}
