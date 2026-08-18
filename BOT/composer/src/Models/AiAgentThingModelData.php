<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class AiAgentThingModelData extends Model {
    protected $_name = [
        'dataId' => 'data_id',
        'userId' => 'user_id',
        'deviceId' => 'device_id',
        'featureId' => 'feature_id',
        'reportTime' => 'report_time',
        'content' => 'content',
    ];
    public function validate() {
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('featureId', $this->featureId, true);
        Model::validateRequired('reportTime', $this->reportTime, true);
        Model::validateRequired('content', $this->content, true);
        Model::validatePattern('reportTime', $this->reportTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->featureId) {
            $res['feature_id'] = $this->featureId;
        }
        if (null !== $this->reportTime) {
            $res['report_time'] = $this->reportTime;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AiAgentThingModelData
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['data_id'])){
            $model->dataId = $map['data_id'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['device_id'])){
            $model->deviceId = $map['device_id'];
        }
        if(isset($map['feature_id'])){
            $model->featureId = $map['feature_id'];
        }
        if(isset($map['report_time'])){
            $model->reportTime = $map['report_time'];
        }
        if(isset($map['content'])){
            $model->content = $map['content'];
        }
        return $model;
    }
    /**
     * @example 
     * @var string
     */
    public $dataId;

    /**
     * @example 
     * @var string
     */
    public $userId;

    /**
     * @example 
     * @var string
     */
    public $deviceId;

    /**
     * @example 
     * @var string
     */
    public $featureId;

    /**
     * @example 
     * @var string
     */
    public $reportTime;

    /**
     * @example 
     * @var string
     */
    public $content;

}
