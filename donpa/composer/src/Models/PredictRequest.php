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
    public $assetDetailId;

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
     * @var int
     */
    public $paybackAmount;

    // 已还期数，默认0
    /**
     * @example 2
     *
     * @var int
     */
    public $paybackNum;

    // 逾期月数
    /**
     * @example 2
     *
     * @var int
     */
    public $overdueMonth;

    // 债务人信用分数，由系统计算得出，无须传入。
    /**
     * @example 0.012345
     *
     * @var string
     */
    public $predictionScore;

    // 手机号码MD5
    /**
     * @example 5a0a52d01fa9304e8dba7170
     *
     * @var string
     */
    public $mobileMd5;
    protected $_name = [
        'assetDetailId'   => 'asset_detail_id',
        'certNoMd5'       => 'cert_no_md5',
        'paybackAmount'   => 'payback_amount',
        'paybackNum'      => 'payback_num',
        'overdueMonth'    => 'overdue_month',
        'predictionScore' => 'prediction_score',
        'mobileMd5'       => 'mobile_md5',
    ];

    public function validate()
    {
        Model::validateRequired('certNoMd5', $this->certNoMd5, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->assetDetailId) {
            $res['asset_detail_id'] = $this->assetDetailId;
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
        if (null !== $this->overdueMonth) {
            $res['overdue_month'] = $this->overdueMonth;
        }
        if (null !== $this->predictionScore) {
            $res['prediction_score'] = $this->predictionScore;
        }
        if (null !== $this->mobileMd5) {
            $res['mobile_md5'] = $this->mobileMd5;
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
        if (isset($map['asset_detail_id'])) {
            $model->assetDetailId = $map['asset_detail_id'];
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
        if (isset($map['overdue_month'])) {
            $model->overdueMonth = $map['overdue_month'];
        }
        if (isset($map['prediction_score'])) {
            $model->predictionScore = $map['prediction_score'];
        }
        if (isset($map['mobile_md5'])) {
            $model->mobileMd5 = $map['mobile_md5'];
        }

        return $model;
    }
}
