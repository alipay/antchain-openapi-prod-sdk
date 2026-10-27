<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryHealthDataRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'channelId' => 'channel_id',
        'tuid' => 'tuid',
        'metricType' => 'metric_type',
        'startTime' => 'start_time',
        'endTime' => 'end_time',
        'extraInfo' => 'extra_info',
    ];
    public function validate() {
        Model::validateRequired('channelId', $this->channelId, true);
        Model::validateRequired('tuid', $this->tuid, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->channelId) {
            $res['channel_id'] = $this->channelId;
        }
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->metricType) {
            $res['metric_type'] = $this->metricType;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryHealthDataRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['channel_id'])){
            $model->channelId = $map['channel_id'];
        }
        if(isset($map['tuid'])){
            $model->tuid = $map['tuid'];
        }
        if(isset($map['metric_type'])){
            $model->metricType = $map['metric_type'];
        }
        if(isset($map['start_time'])){
            $model->startTime = $map['start_time'];
        }
        if(isset($map['end_time'])){
            $model->endTime = $map['end_time'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // channel_id
    /**
     * @var string
     */
    public $channelId;

    // 设备唯一id
    /**
     * @var string
     */
    public $tuid;

    // 指标类型 心率:HEART_RATE/血氧:BLOOD_OXYGEN/体温:BODY_TEMP/步数:STEPS/睡眠:SLEEP/呼吸率:RESP_RATE/压力:STRESS/疲劳:FATIGUE/情绪:EMOTION
    /**
     * @var string
     */
    public $metricType;

    // 查询开始时间(毫秒级时间戳)
    /**
     * @var int
     */
    public $startTime;

    // 查询结束时间（毫秒级时间戳）
    /**
     * @var int
     */
    public $endTime;

    // 预留可扩展字段json
    /**
     * @var string
     */
    public $extraInfo;

}
