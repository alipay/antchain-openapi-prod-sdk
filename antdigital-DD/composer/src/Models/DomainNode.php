<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class DomainNode extends Model {
    protected $_name = [
        'code' => 'code',
        'englishName' => 'english_name',
        'chineseName' => 'chinese_name',
        'needCheck' => 'need_check',
        'timeOut' => 'time_out',
        'memo' => 'memo',
        'status' => 'status',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->englishName) {
            $res['english_name'] = $this->englishName;
        }
        if (null !== $this->chineseName) {
            $res['chinese_name'] = $this->chineseName;
        }
        if (null !== $this->needCheck) {
            $res['need_check'] = $this->needCheck;
        }
        if (null !== $this->timeOut) {
            $res['time_out'] = $this->timeOut;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DomainNode
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['english_name'])){
            $model->englishName = $map['english_name'];
        }
        if(isset($map['chinese_name'])){
            $model->chineseName = $map['chinese_name'];
        }
        if(isset($map['need_check'])){
            $model->needCheck = $map['need_check'];
        }
        if(isset($map['time_out'])){
            $model->timeOut = $map['time_out'];
        }
        if(isset($map['memo'])){
            $model->memo = $map['memo'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        return $model;
    }
    // node字段
    // 目前可选枚举：CENTER, ODPS, MANUAL, SLS;
    // 也可以自定义
    /**
     * @example CENTER
     * @var string
     */
    public $code;

    // node英文名称
    /**
     * @example node英文名称
     * @var string
     */
    public $englishName;

    // 中文名称
    /**
     * @example 中文名称
     * @var string
     */
    public $chineseName;

    // 默认需要check
    /**
     * @example true, false
     * @var bool
     */
    public $needCheck;

    // 默认超时时间,单位:m
    /**
     * @example 
     * @var int
     */
    public $timeOut;

    // 描述
    /**
     * @example 描述
     * @var string
     */
    public $memo;

    // 状态
    /**
     * @example VALID
     * @var string
     */
    public $status;

}
