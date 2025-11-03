<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MORSERTA\Models;

use AlibabaCloud\Tea\Model;

class ConversionAdDataRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 投放项目
    /**
     * @var string
     */
    public $project;

    // 转化发生的unix事件戳,单位秒
    /**
     * @var int
     */
    public $eventTime;

    // 事件类型编码
    /**
     * @var string
     */
    public $eventCode;

    // 转化所属用户在客户系统中的用户id
    /**
     * @var string
     */
    public $userId;

    // 转化对应的产品id，如用户购买保险对应的保险产品id，没有可不填
    /**
     * @var string
     */
    public $productId;

    // 唯一标识当前转化事件的一个业务id，如保险下单的订单id，没有可不填
    /**
     * @var string
     */
    public $eventId;

    // json字段， {"xxx": xxx, "yyyy":"yyyy"}， 包含转化对应的媒体侧信息，如click_id, gdt_vid，跳转链接等，数科侧会依据该id与自行收集到的点击进行匹配归因
    /**
     * @var string
     */
    public $trackInfo;

    // json扩展字段
    /**
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'authToken' => 'auth_token',
        'project'   => 'project',
        'eventTime' => 'event_time',
        'eventCode' => 'event_code',
        'userId'    => 'user_id',
        'productId' => 'product_id',
        'eventId'   => 'event_id',
        'trackInfo' => 'track_info',
        'extInfo'   => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('project', $this->project, true);
        Model::validateRequired('eventTime', $this->eventTime, true);
        Model::validateRequired('eventCode', $this->eventCode, true);
        Model::validateRequired('trackInfo', $this->trackInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->project) {
            $res['project'] = $this->project;
        }
        if (null !== $this->eventTime) {
            $res['event_time'] = $this->eventTime;
        }
        if (null !== $this->eventCode) {
            $res['event_code'] = $this->eventCode;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->eventId) {
            $res['event_id'] = $this->eventId;
        }
        if (null !== $this->trackInfo) {
            $res['track_info'] = $this->trackInfo;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConversionAdDataRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['project'])) {
            $model->project = $map['project'];
        }
        if (isset($map['event_time'])) {
            $model->eventTime = $map['event_time'];
        }
        if (isset($map['event_code'])) {
            $model->eventCode = $map['event_code'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['event_id'])) {
            $model->eventId = $map['event_id'];
        }
        if (isset($map['track_info'])) {
            $model->trackInfo = $map['track_info'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
