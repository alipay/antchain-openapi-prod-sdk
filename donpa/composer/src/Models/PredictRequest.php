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
     * @example 2
     *
     * @var string
     */
    public $overdueMonth;

    // 身份证号
    /**
     * @example 131124111111110111
     *
     * @var string
     */
    public $certNo;
    protected $_name = [
        'assetDetailId' => 'asset_detail_id',
        'certNoMd5'     => 'cert_no_md5',
        'paybackAmount' => 'payback_amount',
        'paybackNum'    => 'payback_num',
        'overdueMonth'  => 'overdue_month',
        'certNo'        => 'cert_no',
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
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
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
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }

        return $model;
    }
}
