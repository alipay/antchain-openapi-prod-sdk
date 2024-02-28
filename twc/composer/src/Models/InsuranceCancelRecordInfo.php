<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class InsuranceCancelRecordInfo extends Model
{
    // 保单单号
    /**
     * @example 123123123123213
     *
     * @var string
     */
    public $bclInsuranceRecordId;

    // 退保id
    /**
     * @example 12312312312123
     *
     * @var string
     */
    public $cancelInsuranceId;

    // 退还保费 单位分, 退保成功时返回
    /**
     * @example 12312
     *
     * @var int
     */
    public $cancelAmount;

    // 申请退保时间
    // 格式: yyyy-MM-dd HH:mm:ss
    /**
     * @example 2023-04-05 12:12:23
     *
     * @var string
     */
    public $cancelApplyTime;

    // 退保状态
    // RECORD_CANCEL_INIT: 退保初始
    // RECORD_CANCEL_SUCC: 退保成功
    // RECORD_CANCEL_FAIL: 退保失败
    /**
     * @example RECORD_CANCEL_SUCC
     *
     * @var string
     */
    public $cancelStatus;

    // 退保失败原, 退保失败时返回
    /**
     * @example 退保失败, 保单已失效
     *
     * @var string
     */
    public $remark;
    protected $_name = [
        'bclInsuranceRecordId' => 'bcl_insurance_record_id',
        'cancelInsuranceId'    => 'cancel_insurance_id',
        'cancelAmount'         => 'cancel_amount',
        'cancelApplyTime'      => 'cancel_apply_time',
        'cancelStatus'         => 'cancel_status',
        'remark'               => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('bclInsuranceRecordId', $this->bclInsuranceRecordId, true);
        Model::validateRequired('cancelInsuranceId', $this->cancelInsuranceId, true);
        Model::validateRequired('cancelApplyTime', $this->cancelApplyTime, true);
        Model::validateRequired('cancelStatus', $this->cancelStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bclInsuranceRecordId) {
            $res['bcl_insurance_record_id'] = $this->bclInsuranceRecordId;
        }
        if (null !== $this->cancelInsuranceId) {
            $res['cancel_insurance_id'] = $this->cancelInsuranceId;
        }
        if (null !== $this->cancelAmount) {
            $res['cancel_amount'] = $this->cancelAmount;
        }
        if (null !== $this->cancelApplyTime) {
            $res['cancel_apply_time'] = $this->cancelApplyTime;
        }
        if (null !== $this->cancelStatus) {
            $res['cancel_status'] = $this->cancelStatus;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InsuranceCancelRecordInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bcl_insurance_record_id'])) {
            $model->bclInsuranceRecordId = $map['bcl_insurance_record_id'];
        }
        if (isset($map['cancel_insurance_id'])) {
            $model->cancelInsuranceId = $map['cancel_insurance_id'];
        }
        if (isset($map['cancel_amount'])) {
            $model->cancelAmount = $map['cancel_amount'];
        }
        if (isset($map['cancel_apply_time'])) {
            $model->cancelApplyTime = $map['cancel_apply_time'];
        }
        if (isset($map['cancel_status'])) {
            $model->cancelStatus = $map['cancel_status'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}
