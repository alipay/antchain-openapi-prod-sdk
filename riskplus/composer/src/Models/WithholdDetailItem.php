<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class WithholdDetailItem extends Model
{
    // 贷款申请编号
    /**
     * @example xxxx
     *
     * @var string
     */
    public $assetId;

    // 放款编号/借据号
    /**
     * @example xxxx
     *
     * @var string
     */
    public $capitalLoanNo;

    // 订单维度的实还总额,保留两位有效数字
    // 单笔订单代扣的总额(单位:分)
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $rpyTotalAmt;

    // 还款类型，0-待还、1-正常还款、2-部分提前还、 3-逾期还款 、4-全部提前还 、5-坏账代偿、 6-回购
    /**
     * @example 1
     *
     * @var int
     */
    public $rpyTpe;

    // 代扣日期，用户实还日，用户主动发起是当前日；定时扣款是应还日，格式=yyyy-MM-dd
    /**
     * @example yyyy-MM-dd
     *
     * @var string
     */
    public $rpyDate;

    // 还款账单明细,如果是提前结清,会有多条
    /**
     * @example [{}]
     *
     * @var BillDetail[]
     */
    public $billDetails;
    protected $_name = [
        'assetId'       => 'asset_id',
        'capitalLoanNo' => 'capital_loan_no',
        'rpyTotalAmt'   => 'rpy_total_amt',
        'rpyTpe'        => 'rpy_tpe',
        'rpyDate'       => 'rpy_date',
        'billDetails'   => 'bill_details',
    ];

    public function validate()
    {
        Model::validateRequired('assetId', $this->assetId, true);
        Model::validateRequired('capitalLoanNo', $this->capitalLoanNo, true);
        Model::validateRequired('rpyTotalAmt', $this->rpyTotalAmt, true);
        Model::validateRequired('rpyTpe', $this->rpyTpe, true);
        Model::validateRequired('rpyDate', $this->rpyDate, true);
        Model::validateRequired('billDetails', $this->billDetails, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->capitalLoanNo) {
            $res['capital_loan_no'] = $this->capitalLoanNo;
        }
        if (null !== $this->rpyTotalAmt) {
            $res['rpy_total_amt'] = $this->rpyTotalAmt;
        }
        if (null !== $this->rpyTpe) {
            $res['rpy_tpe'] = $this->rpyTpe;
        }
        if (null !== $this->rpyDate) {
            $res['rpy_date'] = $this->rpyDate;
        }
        if (null !== $this->billDetails) {
            $res['bill_details'] = [];
            if (null !== $this->billDetails && \is_array($this->billDetails)) {
                $n = 0;
                foreach ($this->billDetails as $item) {
                    $res['bill_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WithholdDetailItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['asset_id'])) {
            $model->assetId = $map['asset_id'];
        }
        if (isset($map['capital_loan_no'])) {
            $model->capitalLoanNo = $map['capital_loan_no'];
        }
        if (isset($map['rpy_total_amt'])) {
            $model->rpyTotalAmt = $map['rpy_total_amt'];
        }
        if (isset($map['rpy_tpe'])) {
            $model->rpyTpe = $map['rpy_tpe'];
        }
        if (isset($map['rpy_date'])) {
            $model->rpyDate = $map['rpy_date'];
        }
        if (isset($map['bill_details'])) {
            if (!empty($map['bill_details'])) {
                $model->billDetails = [];
                $n                  = 0;
                foreach ($map['bill_details'] as $item) {
                    $model->billDetails[$n++] = null !== $item ? BillDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
