<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class Commission extends Model {
    protected $_name = [
        'beginTime' => 'begin_time',
        'commission' => 'commission',
        'endTime' => 'end_time',
        'status' => 'status',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->beginTime) {
            $res['begin_time'] = $this->beginTime;
        }
        if (null !== $this->commission) {
            $res['commission'] = $this->commission;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Commission
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['begin_time'])){
            $model->beginTime = $map['begin_time'];
        }
        if(isset($map['commission'])){
            $model->commission = $map['commission'];
        }
        if(isset($map['end_time'])){
            $model->endTime = $map['end_time'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        return $model;
    }
    // 手续费生效时间（时间戳 ms）
    /**
     * @example 1588867200000
     * @var integer
     */
    public $beginTime;

    // 手续费
    /**
     * @example 0.01
     * @var string
     */
    public $commission;

    // 手续费结束时间
    /**
     * @example 1598867200000
     * @var integer
     */
    public $endTime;

    // 要更新的手续费状态
    /**
     * @example 0
     * @var integer
     */
    public $status;

}
