<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class NotifyEmbedoemautoinsuranceEventRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'requestNo' => 'request_no',
        'eventType' => 'event_type',
        'eventTime' => 'event_time',
        'data' => 'data',
    ];
    public function validate() {
        Model::validateRequired('requestNo', $this->requestNo, true);
        Model::validateRequired('eventType', $this->eventType, true);
        Model::validateRequired('eventTime', $this->eventTime, true);
        Model::validateRequired('data', $this->data, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestNo) {
            $res['request_no'] = $this->requestNo;
        }
        if (null !== $this->eventType) {
            $res['event_type'] = $this->eventType;
        }
        if (null !== $this->eventTime) {
            $res['event_time'] = $this->eventTime;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return NotifyEmbedoemautoinsuranceEventRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['request_no'])){
            $model->requestNo = $map['request_no'];
        }
        if(isset($map['event_type'])){
            $model->eventType = $map['event_type'];
        }
        if(isset($map['event_time'])){
            $model->eventTime = $map['event_time'];
        }
        if(isset($map['data'])){
            $model->data = $map['data'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求唯一标识
    /**
     * @var string
     */
    public $requestNo;

    // 事件类型
    /**
     * @var string
     */
    public $eventType;

    // 事件发生时间，格式：yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $eventTime;

    // 事件业务数据，JSON格式字符串
    /**
     * @var string
     */
    public $data;

}
