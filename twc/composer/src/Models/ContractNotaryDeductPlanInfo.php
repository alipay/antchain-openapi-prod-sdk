<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractNotaryDeductPlanInfo extends Model
{
    // PAYERIDNUMBER
    /**
     * @example 付款方ID
     *
     * @var string
     */
    public $payerId;

    // “总金额：”+总金额“+”“总期数：”+总期数，“+”每期金额时间（X期金额，时间）
    /**
     * @example 代扣计划说明
     *
     * @var string
     */
    public $deductPlanInfo;

    // AGREEMEND_ID_NUMBER
    /**
     * @example 代扣协议ID
     *
     * @var string
     */
    public $agreementNo;

    // 代扣计划发起时间
    /**
     * @example 1589198173000
     *
     * @var string
     */
    public $timestamp;
    protected $_name = [
        'payerId'        => 'payer_id',
        'deductPlanInfo' => 'deduct_plan_info',
        'agreementNo'    => 'agreement_no',
        'timestamp'      => 'timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('payerId', $this->payerId, true);
        Model::validateRequired('deductPlanInfo', $this->deductPlanInfo, true);
        Model::validateRequired('agreementNo', $this->agreementNo, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->payerId) {
            $res['payer_id'] = $this->payerId;
        }
        if (null !== $this->deductPlanInfo) {
            $res['deduct_plan_info'] = $this->deductPlanInfo;
        }
        if (null !== $this->agreementNo) {
            $res['agreement_no'] = $this->agreementNo;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractNotaryDeductPlanInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['payer_id'])) {
            $model->payerId = $map['payer_id'];
        }
        if (isset($map['deduct_plan_info'])) {
            $model->deductPlanInfo = $map['deduct_plan_info'];
        }
        if (isset($map['agreement_no'])) {
            $model->agreementNo = $map['agreement_no'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }

        return $model;
    }
}
