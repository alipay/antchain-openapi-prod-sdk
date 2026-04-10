<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class BatteryReportResult extends Model
{
    // 订单号 (可使用该 ID 将报告转图片)
    /**
     * @example -
     *
     * @var string
     */
    public $orderId;

    // 保障码，VIN 在 7 天内首次检测时生成，每轮保障采用同一保障码
    /**
     * @example -
     *
     * @var string
     */
    public $guaranteeCode;

    // 当前充电单号
    /**
     * @example -
     *
     * @var string
     */
    public $currentStartChargeSeq;

    // 是否计费
    /**
     * @example true, false
     *
     * @var bool
     */
    public $charge;

    // 检测类型 6601：首检 6602：复核
    /**
     * @example 6601
     *
     * @var int
     */
    public $checkType;

    // 报告数据
    /**
     * @example
     *
     * @var BatteryReportData
     */
    public $reportData;
    protected $_name = [
        'orderId'               => 'order_id',
        'guaranteeCode'         => 'guarantee_code',
        'currentStartChargeSeq' => 'current_start_charge_seq',
        'charge'                => 'charge',
        'checkType'             => 'check_type',
        'reportData'            => 'report_data',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('guaranteeCode', $this->guaranteeCode, true);
        Model::validateRequired('currentStartChargeSeq', $this->currentStartChargeSeq, true);
        Model::validateRequired('charge', $this->charge, true);
        Model::validateRequired('checkType', $this->checkType, true);
        Model::validateRequired('reportData', $this->reportData, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->guaranteeCode) {
            $res['guarantee_code'] = $this->guaranteeCode;
        }
        if (null !== $this->currentStartChargeSeq) {
            $res['current_start_charge_seq'] = $this->currentStartChargeSeq;
        }
        if (null !== $this->charge) {
            $res['charge'] = $this->charge;
        }
        if (null !== $this->checkType) {
            $res['check_type'] = $this->checkType;
        }
        if (null !== $this->reportData) {
            $res['report_data'] = null !== $this->reportData ? $this->reportData->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatteryReportResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['guarantee_code'])) {
            $model->guaranteeCode = $map['guarantee_code'];
        }
        if (isset($map['current_start_charge_seq'])) {
            $model->currentStartChargeSeq = $map['current_start_charge_seq'];
        }
        if (isset($map['charge'])) {
            $model->charge = $map['charge'];
        }
        if (isset($map['check_type'])) {
            $model->checkType = $map['check_type'];
        }
        if (isset($map['report_data'])) {
            $model->reportData = BatteryReportData::fromMap($map['report_data']);
        }

        return $model;
    }
}
