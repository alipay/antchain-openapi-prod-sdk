<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class MonthDataDetail extends Model {
    protected $_name = [
        'occurDate' => 'occur_date',
        'amount' => 'amount',
        'dosageUnit' => 'dosage_unit',
    ];
    public function validate() {
        Model::validateRequired('occurDate', $this->occurDate, true);
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('dosageUnit', $this->dosageUnit, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->occurDate) {
            $res['occur_date'] = $this->occurDate;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->dosageUnit) {
            $res['dosage_unit'] = $this->dosageUnit;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MonthDataDetail
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['occur_date'])){
            $model->occurDate = $map['occur_date'];
        }
        if(isset($map['amount'])){
            $model->amount = $map['amount'];
        }
        if(isset($map['dosage_unit'])){
            $model->dosageUnit = $map['dosage_unit'];
        }
        return $model;
    }
    // 发生月份，格式 yyyy-MM
    /**
     * @example xxxx
     * @var string
     */
    public $occurDate;

    // 产量数据
    /**
     * @example xxxx
     * @var string
     */
    public $amount;

    // 产量单位
    /**
     * @example xxxx
     * @var string
     */
    public $dosageUnit;

}
