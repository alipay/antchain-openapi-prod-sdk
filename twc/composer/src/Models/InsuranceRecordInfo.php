<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class InsuranceRecordInfo extends Model
{
    // bcl订单id
    /**
     * @example PROD12312312311232
     *
     * @var string
     */
    public $orderId;

    // 保险单号
    /**
     * @example 1231234343423423
     *
     * @var string
     */
    public $bclInsuranceRecordId;

    // 投保人信息
    /**
     * @example
     *
     * @var BclInsuranceUserInfo
     */
    public $holder;

    // 被保人信息
    /**
     * @example
     *
     * @var BclInsuranceUserInfo
     */
    public $insured;

    // 保司信息
    /**
     * @example
     *
     * @var BclInsuranceUserInfo
     */
    public $insurancer;

    // 保单状态
    // RECORD_INSURE_INIT: 投保流程初始化
    // RECORD_INSURE_TOBE: 待投保
    // RECORD_INSURE_EXCHANGE_SUCC: 投保申请成功
    // RECORD_INSURE_EXCHANGE_FAIL: 投保申请失败
    // RECORD_INSURE_SUCC: 投保成功
    // RECORD_INSURE_FAIL: 投保失败
    // RECORD_CANCEL_INIT: 退保初始
    // RECORD_CANCEL_SUCC: 退保成功
    // RECORD_CANCEL_FAIL: 退保失败
    /**
     * @example RECORD_INSURE_SUCC
     *
     * @var string
     */
    public $insuranceStatus;

    // 起保时间
    // 格式: yyyy-MM-dd HH:mm:ss
    /**
     * @example 2023-04-05 12:12:23
     *
     * @var string
     */
    public $insuranceStartTime;

    // 终保时间
    // 格式: yyyy-MM-dd HH:mm:ss
    /**
     * @example 2023-04-05 12:12:23
     *
     * @var string
     */
    public $insuranceEndTime;

    // 保额 单位分
    /**
     * @example 1232
     *
     * @var int
     */
    public $insuranceAmount;

    // 保费 单位分
    /**
     * @example 12312
     *
     * @var int
     */
    public $premium;

    // riskGo分数
    /**
     * @example 60
     *
     * @var int
     */
    public $riskgoScore;

    // 保险详情地址
    /**
     * @example http://xxasd.com
     *
     * @var string
     */
    public $insuranceUrl;

    // 投保失败的具体原因, 投保失败时返回
    /**
     * @example 缴费失败, 费用不足
     *
     * @var string
     */
    public $remark;

    // 退保详情
    /**
     * @example
     *
     * @var InsuranceCancelRecordInfo[]
     */
    public $insuranceCancelRecordInfoList;
    protected $_name = [
        'orderId'                       => 'order_id',
        'bclInsuranceRecordId'          => 'bcl_insurance_record_id',
        'holder'                        => 'holder',
        'insured'                       => 'insured',
        'insurancer'                    => 'insurancer',
        'insuranceStatus'               => 'insurance_status',
        'insuranceStartTime'            => 'insurance_start_time',
        'insuranceEndTime'              => 'insurance_end_time',
        'insuranceAmount'               => 'insurance_amount',
        'premium'                       => 'premium',
        'riskgoScore'                   => 'riskgo_score',
        'insuranceUrl'                  => 'insurance_url',
        'remark'                        => 'remark',
        'insuranceCancelRecordInfoList' => 'insurance_cancel_record_info_list',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('bclInsuranceRecordId', $this->bclInsuranceRecordId, true);
        Model::validateRequired('holder', $this->holder, true);
        Model::validateRequired('insured', $this->insured, true);
        Model::validateRequired('insurancer', $this->insurancer, true);
        Model::validateRequired('insuranceStatus', $this->insuranceStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->bclInsuranceRecordId) {
            $res['bcl_insurance_record_id'] = $this->bclInsuranceRecordId;
        }
        if (null !== $this->holder) {
            $res['holder'] = null !== $this->holder ? $this->holder->toMap() : null;
        }
        if (null !== $this->insured) {
            $res['insured'] = null !== $this->insured ? $this->insured->toMap() : null;
        }
        if (null !== $this->insurancer) {
            $res['insurancer'] = null !== $this->insurancer ? $this->insurancer->toMap() : null;
        }
        if (null !== $this->insuranceStatus) {
            $res['insurance_status'] = $this->insuranceStatus;
        }
        if (null !== $this->insuranceStartTime) {
            $res['insurance_start_time'] = $this->insuranceStartTime;
        }
        if (null !== $this->insuranceEndTime) {
            $res['insurance_end_time'] = $this->insuranceEndTime;
        }
        if (null !== $this->insuranceAmount) {
            $res['insurance_amount'] = $this->insuranceAmount;
        }
        if (null !== $this->premium) {
            $res['premium'] = $this->premium;
        }
        if (null !== $this->riskgoScore) {
            $res['riskgo_score'] = $this->riskgoScore;
        }
        if (null !== $this->insuranceUrl) {
            $res['insurance_url'] = $this->insuranceUrl;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->insuranceCancelRecordInfoList) {
            $res['insurance_cancel_record_info_list'] = [];
            if (null !== $this->insuranceCancelRecordInfoList && \is_array($this->insuranceCancelRecordInfoList)) {
                $n = 0;
                foreach ($this->insuranceCancelRecordInfoList as $item) {
                    $res['insurance_cancel_record_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InsuranceRecordInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['bcl_insurance_record_id'])) {
            $model->bclInsuranceRecordId = $map['bcl_insurance_record_id'];
        }
        if (isset($map['holder'])) {
            $model->holder = BclInsuranceUserInfo::fromMap($map['holder']);
        }
        if (isset($map['insured'])) {
            $model->insured = BclInsuranceUserInfo::fromMap($map['insured']);
        }
        if (isset($map['insurancer'])) {
            $model->insurancer = BclInsuranceUserInfo::fromMap($map['insurancer']);
        }
        if (isset($map['insurance_status'])) {
            $model->insuranceStatus = $map['insurance_status'];
        }
        if (isset($map['insurance_start_time'])) {
            $model->insuranceStartTime = $map['insurance_start_time'];
        }
        if (isset($map['insurance_end_time'])) {
            $model->insuranceEndTime = $map['insurance_end_time'];
        }
        if (isset($map['insurance_amount'])) {
            $model->insuranceAmount = $map['insurance_amount'];
        }
        if (isset($map['premium'])) {
            $model->premium = $map['premium'];
        }
        if (isset($map['riskgo_score'])) {
            $model->riskgoScore = $map['riskgo_score'];
        }
        if (isset($map['insurance_url'])) {
            $model->insuranceUrl = $map['insurance_url'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['insurance_cancel_record_info_list'])) {
            if (!empty($map['insurance_cancel_record_info_list'])) {
                $model->insuranceCancelRecordInfoList = [];
                $n                                    = 0;
                foreach ($map['insurance_cancel_record_info_list'] as $item) {
                    $model->insuranceCancelRecordInfoList[$n++] = null !== $item ? InsuranceCancelRecordInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
