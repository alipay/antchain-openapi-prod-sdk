<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DONPA\Models;

use AlibabaCloud\Tea\Model;

class PredictRequest extends Model
{
    // 资产明细ID
    /**
     * @example 111
     *
     * @var string
     */
    public $externalAssetDetailId;

    // 身份证号码MD5
    /**
     * @example 5a0a52d01fa9304e8dba7170
     *
     * @var string
     */
    public $certNoMd5;

    // 已还总额,默认0
    /**
     * @example 100.00
     *
     * @var string
     */
    public $paybackAmount;

    // 已还期数，默认0
    /**
     * @example 2
     *
     * @var string
     */
    public $paybackNum;

    // 逾期月数
    /**
     * @example 200
     *
     * @var int
     */
    public $overdueDay;

    // 身份证号
    /**
     * @example 131124111111110111
     *
     * @var string
     */
    public $certNo;

    // 支付宝内部预测分数
    /**
     * @example 0.333
     *
     * @var string
     */
    public $predictionScore;
    protected $_name = [
        'externalAssetDetailId' => 'external_asset_detail_id',
        'certNoMd5'             => 'cert_no_md5',
        'paybackAmount'         => 'payback_amount',
        'paybackNum'            => 'payback_num',
        'overdueDay'            => 'overdue_day',
        'certNo'                => 'cert_no',
        'predictionScore'       => 'prediction_score',
    ];

    public function validate()
    {
        Model::validateRequired('certNoMd5', $this->certNoMd5, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->externalAssetDetailId) {
            $res['external_asset_detail_id'] = $this->externalAssetDetailId;
        }
        if (null !== $this->certNoMd5) {
            $res['cert_no_md5'] = $this->certNoMd5;
        }
        if (null !== $this->paybackAmount) {
            $res['payback_amount'] = $this->paybackAmount;
        }
        if (null !== $this->paybackNum) {
            $res['payback_num'] = $this->paybackNum;
        }
        if (null !== $this->overdueDay) {
            $res['overdue_day'] = $this->overdueDay;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->predictionScore) {
            $res['prediction_score'] = $this->predictionScore;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PredictRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['external_asset_detail_id'])) {
            $model->externalAssetDetailId = $map['external_asset_detail_id'];
        }
        if (isset($map['cert_no_md5'])) {
            $model->certNoMd5 = $map['cert_no_md5'];
        }
        if (isset($map['payback_amount'])) {
            $model->paybackAmount = $map['payback_amount'];
        }
        if (isset($map['payback_num'])) {
            $model->paybackNum = $map['payback_num'];
        }
        if (isset($map['overdue_day'])) {
            $model->overdueDay = $map['overdue_day'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['prediction_score'])) {
            $model->predictionScore = $map['prediction_score'];
        }

        return $model;
    }
}
