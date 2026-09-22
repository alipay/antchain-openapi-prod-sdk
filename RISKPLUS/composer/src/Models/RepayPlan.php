<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RepayPlan extends Model {
    protected $_name = [
        'termNo' => 'term_no',
        'termStart' => 'term_start',
        'termEnd' => 'term_end',
        'termPrin' => 'term_prin',
        'termInt' => 'term_int',
    ];
    public function validate() {
        Model::validateRequired('termNo', $this->termNo, true);
        Model::validateRequired('termEnd', $this->termEnd, true);
        Model::validateRequired('termPrin', $this->termPrin, true);
        Model::validateRequired('termInt', $this->termInt, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->termNo) {
            $res['term_no'] = $this->termNo;
        }
        if (null !== $this->termStart) {
            $res['term_start'] = $this->termStart;
        }
        if (null !== $this->termEnd) {
            $res['term_end'] = $this->termEnd;
        }
        if (null !== $this->termPrin) {
            $res['term_prin'] = $this->termPrin;
        }
        if (null !== $this->termInt) {
            $res['term_int'] = $this->termInt;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RepayPlan
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['term_no'])){
            $model->termNo = $map['term_no'];
        }
        if(isset($map['term_start'])){
            $model->termStart = $map['term_start'];
        }
        if(isset($map['term_end'])){
            $model->termEnd = $map['term_end'];
        }
        if(isset($map['term_prin'])){
            $model->termPrin = $map['term_prin'];
        }
        if(isset($map['term_int'])){
            $model->termInt = $map['term_int'];
        }
        return $model;
    }
    // 期次号，还款期次序号
    /**
     * @example 2023343380112
     * @var string
     */
    public $termNo;

    // 本期开始时间，格式：yyyy-MM-dd
    /**
     * @example 2000-01-01
     * @var string
     */
    public $termStart;

    // 本期结束时间，格式：yyyy-MM-dd
    /**
     * @example 1999-01-01
     * @var string
     */
    public $termEnd;

    // 本期本金，单位：元，2 位小数
    /**
     * @example 1000.00
     * @var string
     */
    public $termPrin;

    // 本期利息，单位：元，2 位小数
    /**
     * @example 1000.00
     * @var string
     */
    public $termInt;

}
