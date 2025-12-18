<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class CallbackMarketingEventRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 调用方生成的唯一编码
    /**
     * @var string
     */
    public $requestId;

    // 特征编码
    /**
     * @var string
     */
    public $clickId;

    // 点击时间
    /**
     * @var string
     */
    public $clickTime;

    // 事件类型，枚举：
    // RESERVATION_CHECK（留资）；
    // FIRST_PICK_FREE（领增）；
    // LOW_INSURANCE（低价险）；
    // HIGH_INSURANCE（高价险）；
    /**
     * @var string
     */
    public $eventCode;

    // 事件完成时间（yyyy-MM-dd  HH:mm:ss）
    /**
     * @var string
     */
    public $eventTime;

    // 固定式，蚂蚁数科
    /**
     * @var string
     */
    public $firstChannel;

    // 二级渠道编码
    /**
     * @var string
     */
    public $secondChannel;

    // 三级渠道/广告版位
    /**
     * @var string
     */
    public $advertisingPosition;

    // 业务字段，json格式
    /**
     * @var string
     */
    public $eventInfo;
    protected $_name = [
        'authToken'           => 'auth_token',
        'requestId'           => 'request_id',
        'clickId'             => 'click_id',
        'clickTime'           => 'click_time',
        'eventCode'           => 'event_code',
        'eventTime'           => 'event_time',
        'firstChannel'        => 'first_channel',
        'secondChannel'       => 'second_channel',
        'advertisingPosition' => 'advertising_position',
        'eventInfo'           => 'event_info',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('clickId', $this->clickId, true);
        Model::validateRequired('clickTime', $this->clickTime, true);
        Model::validateRequired('eventCode', $this->eventCode, true);
        Model::validateRequired('eventTime', $this->eventTime, true);
        Model::validateRequired('firstChannel', $this->firstChannel, true);
        Model::validateRequired('eventInfo', $this->eventInfo, true);
        Model::validateMaxLength('requestId', $this->requestId, 128);
        Model::validateMaxLength('clickId', $this->clickId, 64);
        Model::validateMaxLength('clickTime', $this->clickTime, 20);
        Model::validateMaxLength('eventCode', $this->eventCode, 20);
        Model::validateMaxLength('eventTime', $this->eventTime, 20);
        Model::validateMaxLength('firstChannel', $this->firstChannel, 64);
        Model::validateMaxLength('secondChannel', $this->secondChannel, 64);
        Model::validateMaxLength('advertisingPosition', $this->advertisingPosition, 64);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->clickId) {
            $res['click_id'] = $this->clickId;
        }
        if (null !== $this->clickTime) {
            $res['click_time'] = $this->clickTime;
        }
        if (null !== $this->eventCode) {
            $res['event_code'] = $this->eventCode;
        }
        if (null !== $this->eventTime) {
            $res['event_time'] = $this->eventTime;
        }
        if (null !== $this->firstChannel) {
            $res['first_channel'] = $this->firstChannel;
        }
        if (null !== $this->secondChannel) {
            $res['second_channel'] = $this->secondChannel;
        }
        if (null !== $this->advertisingPosition) {
            $res['advertising_position'] = $this->advertisingPosition;
        }
        if (null !== $this->eventInfo) {
            $res['event_info'] = $this->eventInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackMarketingEventRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['click_id'])) {
            $model->clickId = $map['click_id'];
        }
        if (isset($map['click_time'])) {
            $model->clickTime = $map['click_time'];
        }
        if (isset($map['event_code'])) {
            $model->eventCode = $map['event_code'];
        }
        if (isset($map['event_time'])) {
            $model->eventTime = $map['event_time'];
        }
        if (isset($map['first_channel'])) {
            $model->firstChannel = $map['first_channel'];
        }
        if (isset($map['second_channel'])) {
            $model->secondChannel = $map['second_channel'];
        }
        if (isset($map['advertising_position'])) {
            $model->advertisingPosition = $map['advertising_position'];
        }
        if (isset($map['event_info'])) {
            $model->eventInfo = $map['event_info'];
        }

        return $model;
    }
}
