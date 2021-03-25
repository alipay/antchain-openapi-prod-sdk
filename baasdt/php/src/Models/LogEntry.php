<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class LogEntry extends Model {
    protected $_name = [
        'from' => 'from',
        'logData' => 'log_data',
        'to' => 'to',
        'topics' => 'topics',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->from) {
            $res['from'] = $this->from;
        }
        if (null !== $this->logData) {
            $res['log_data'] = $this->logData;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        if (null !== $this->topics) {
            $res['topics'] = [];
            if(null !== $this->topics){
                $res['topics'] = $this->topics;
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return LogEntry
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['from'])){
            $model->from = $map['from'];
        }
        if(isset($map['log_data'])){
            $model->logData = $map['log_data'];
        }
        if(isset($map['to'])){
            $model->to = $map['to'];
        }
        if(isset($map['topics'])){
            if(!empty($map['topics'])){
                $model->topics = [];
                $model->topics = $map['topics'];
            }
        }
        return $model;
    }
    // 交易发起方
    /**
     * @example d3936015f0f4676a03a1bdea8b6fc24390f9f147853c5398e989dd30afae643b
     * @var string
     */
    public $from;

    // log信息
    /**
     * @example 82067b2254223a302c225622...//可通过蚂蚁提供的区块日志解析工具分析交易内容
     * @var string
     */
    public $logData;

    // 交易接受方
    /**
     * @example f76abaaa47c23bd27d0e77bc625773df9776d2f273b569d1074d89643fb73feb
     * @var string
     */
    public $to;

    // 交易topic
    /**
     * @example call_contract
     * @var array
     */
    public $topics;

}
