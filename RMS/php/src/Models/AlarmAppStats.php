<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AlarmAppStats extends Model {
    protected $_name = [
        'app' => 'app',
        'alarmLevel' => 'alarm_level',
        'count' => 'count',
        'stackUniversalTableId' => 'stack_universal_table_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->alarmLevel) {
            $res['alarm_level'] = $this->alarmLevel;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->stackUniversalTableId) {
            $res['stack_universal_table_id'] = $this->stackUniversalTableId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AlarmAppStats
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['app'])){
            $model->app = $map['app'];
        }
        if(isset($map['alarm_level'])){
            $model->alarmLevel = $map['alarm_level'];
        }
        if(isset($map['count'])){
            $model->count = $map['count'];
        }
        if(isset($map['stack_universal_table_id'])){
            $model->stackUniversalTableId = $map['stack_universal_table_id'];
        }
        return $model;
    }
    // app
    /**
     * @example app
     * @var string
     */
    public $app;

    // alarm_level
    /**
     * @example alarm_level
     * @var int
     */
    public $alarmLevel;

    // count
    /**
     * @example count
     * @var int
     */
    public $count;

    // stack_universal_table_id
    /**
     * @example stack_universal_table_id
     * @var string
     */
    public $stackUniversalTableId;

}
