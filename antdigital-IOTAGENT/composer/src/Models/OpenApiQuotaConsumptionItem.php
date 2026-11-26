<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class OpenApiQuotaConsumptionItem extends Model {
    protected $_name = [
        'periodStart' => 'period_start',
        'periodEnd' => 'period_end',
        'countedFrom' => 'counted_from',
        'countedTo' => 'counted_to',
        'complete' => 'complete',
        'used' => 'used',
        'unit' => 'unit',
    ];
    public function validate() {
        Model::validateRequired('periodStart', $this->periodStart, true);
        Model::validateRequired('periodEnd', $this->periodEnd, true);
        Model::validateRequired('countedFrom', $this->countedFrom, true);
        Model::validateRequired('countedTo', $this->countedTo, true);
        Model::validateRequired('complete', $this->complete, true);
        Model::validateRequired('used', $this->used, true);
        Model::validateRequired('unit', $this->unit, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->periodStart) {
            $res['period_start'] = $this->periodStart;
        }
        if (null !== $this->periodEnd) {
            $res['period_end'] = $this->periodEnd;
        }
        if (null !== $this->countedFrom) {
            $res['counted_from'] = $this->countedFrom;
        }
        if (null !== $this->countedTo) {
            $res['counted_to'] = $this->countedTo;
        }
        if (null !== $this->complete) {
            $res['complete'] = $this->complete;
        }
        if (null !== $this->used) {
            $res['used'] = $this->used;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpenApiQuotaConsumptionItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['period_start'])){
            $model->periodStart = $map['period_start'];
        }
        if(isset($map['period_end'])){
            $model->periodEnd = $map['period_end'];
        }
        if(isset($map['counted_from'])){
            $model->countedFrom = $map['counted_from'];
        }
        if(isset($map['counted_to'])){
            $model->countedTo = $map['counted_to'];
        }
        if(isset($map['complete'])){
            $model->complete = $map['complete'];
        }
        if(isset($map['used'])){
            $model->used = $map['used'];
        }
        if(isset($map['unit'])){
            $model->unit = $map['unit'];
        }
        return $model;
    }
    /**
     * @example 2026-11-17T00:00:00+08:00
     * @var string
     */
    public $periodStart;

    /**
     * @example 2026-11-17T00:00:00+08:00
     * @var string
     */
    public $periodEnd;

    // 实际可靠统计区间起点；未覆盖为null
    /**
     * @example undefined
     * @var string
     */
    public $countedFrom;

    // 实际可靠统计区间终点，不晚于asOf；未覆盖为null
    /**
     * @example undefined
     * @var string
     */
    public $countedTo;

    // 整个周期的已提交扣款流水有可靠覆盖；不代表所有运行消费已发送结算
    /**
     * @example undefined
     * @var bool
     */
    public $complete;

    // CONSUME毛消费；部分覆盖仅统计countedFrom/to，无可靠覆盖为null，不补0
    /**
     * @example undefined
     * @var int
     */
    public $used;

    // 枚举:QUOTA_POINT
    /**
     * @example undefined
     * @var string
     */
    public $unit;

}
