<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\Component;

class Renewal extends Model {
    protected $_name = [
        'components' => 'components',
        'endTime' => 'end_time',
        'instanceId' => 'instance_id',
        'startTime' => 'start_time',
    ];
    public function validate() {
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->components) {
            $res['components'] = [];
            if(null !== $this->components && is_array($this->components)){
                $n = 0;
                foreach($this->components as $item){
                    $res['components'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Renewal
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['components'])){
            if(!empty($map['components'])){
                $model->components = [];
                $n = 0;
                foreach($map['components'] as $item) {
                    $model->components[$n++] = null !== $item ? Component::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['end_time'])){
            $model->endTime = $map['end_time'];
        }
        if(isset($map['instance_id'])){
            $model->instanceId = $map['instance_id'];
        }
        if(isset($map['start_time'])){
            $model->startTime = $map['start_time'];
        }
        return $model;
    }
    // 实例当前配置
    /**
     * @example 
     * @var Component[]
     */
    public $components;

    // 续费订单截止时间
    /**
     * @example 格式为ISO 8601格式，精确到秒，带时区信息，格式为YYYY-MM-DDThh:mm:ssZ
     * @var string
     */
    public $endTime;

    // 实例Id
    /**
     * @example A0CSCMAYIBANKPWBATNA4F
     * @var string
     */
    public $instanceId;

    // 续费订单开始时间
    /**
     * @example 格式为ISO 8601格式，精确到秒，带时区信息，格式为YYYY-MM-DDThh:mm:ssZ
     * @var string
     */
    public $startTime;

}
