<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class ReportHealthDataRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tuid' => 'tuid',
        'timestamp' => 'timestamp',
        'dataCategory' => 'data_category',
        'payload' => 'payload',
    ];
    public function validate() {
        Model::validateRequired('tuid', $this->tuid, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('dataCategory', $this->dataCategory, true);
        Model::validateRequired('payload', $this->payload, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->dataCategory) {
            $res['data_category'] = $this->dataCategory;
        }
        if (null !== $this->payload) {
            $res['payload'] = $this->payload;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ReportHealthDataRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['tuid'])){
            $model->tuid = $map['tuid'];
        }
        if(isset($map['timestamp'])){
            $model->timestamp = $map['timestamp'];
        }
        if(isset($map['data_category'])){
            $model->dataCategory = $map['data_category'];
        }
        if(isset($map['payload'])){
            $model->payload = $map['payload'];
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

    // 设备唯一id
    /**
     * @var string
     */
    public $tuid;

    // 上报时间时间戳
    /**
     * @var int
     */
    public $timestamp;

    // 数据类别 健康指标:HEALTH_METRIC/GPS定位:GPS_LOCATION/告警事件:ALERT_EVENT/设备信息:DEVICE_INFO
    /**
     * @var string
     */
    public $dataCategory;

    // 数据内容 json传输，与不同category一一映射
    /**
     * @var string
     */
    public $payload;

}
