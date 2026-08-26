<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class DomainSls extends Model {
    protected $_name = [
        'sql' => 'sql',
        'interval' => 'interval',
        'memo' => 'memo',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->sql) {
            $res['sql'] = $this->sql;
        }
        if (null !== $this->interval) {
            $res['interval'] = $this->interval;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DomainSls
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['sql'])){
            $model->sql = $map['sql'];
        }
        if(isset($map['interval'])){
            $model->interval = $map['interval'];
        }
        if(isset($map['memo'])){
            $model->memo = $map['memo'];
        }
        return $model;
    }
    // 拉取sql
    /**
     * @example select from
     * @var string
     */
    public $sql;

    // 拉取SLS间隔
    /**
     * @example 1_h
     * @var string
     */
    public $interval;

    // 属性项
    /**
     * @example {"code":"code"}
     * @var string
     */
    public $memo;

}
