<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\Component;
use AntChain\DD\Models\Renewal;

class Instance extends Model {
    protected $_name = [
        'chargeType' => 'charge_type',
        'components' => 'components',
        'endTime' => 'end_time',
        'instanceId' => 'instance_id',
        'productCode' => 'product_code',
        'renewals' => 'renewals',
        'startTime' => 'start_time',
        'status' => 'status',
    ];
    public function validate() {
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->chargeType) {
            $res['charge_type'] = $this->chargeType;
        }
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
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->renewals) {
            $res['renewals'] = [];
            if(null !== $this->renewals && is_array($this->renewals)){
                $n = 0;
                foreach($this->renewals as $item){
                    $res['renewals'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Instance
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['charge_type'])){
            $model->chargeType = $map['charge_type'];
        }
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
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        if(isset($map['renewals'])){
            if(!empty($map['renewals'])){
                $model->renewals = [];
                $n = 0;
                foreach($map['renewals'] as $item) {
                    $model->renewals[$n++] = null !== $item ? Renewal::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['start_time'])){
            $model->startTime = $map['start_time'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        return $model;
    }
    // 付费方式 PREPAY_BY_MONTH _按月预付_; AFTER_PAY_BY_HOUR _按小时后收_
    /**
     * @example PREPAY_BY_MONTH
     * @var string
     */
    public $chargeType;

    // 实例当前配置
    /**
     * @example 
     * @var Component[]
     */
    public $components;

    // 合约截止时间
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

    // 产品code
    /**
     * @example ECS
     * @var string
     */
    public $productCode;

    // 续费信息
    /**
     * @example 
     * @var Renewal[]
     */
    public $renewals;

    // 合约生效时间
    /**
     * @example 格式为ISO 8601格式，精确到秒，带时区信息，格式为YYYY-MM-DDThh:mm:ssZ
     * @var string
     */
    public $startTime;

    // 实例状态 CREATING 创建中,FAILED 创建失败,STARTED 运行中,STOPPED 已停服,CHANGING 变配中,RELEASED 已释放
    /**
     * @example STARTED
     * @var string
     */
    public $status;

}
