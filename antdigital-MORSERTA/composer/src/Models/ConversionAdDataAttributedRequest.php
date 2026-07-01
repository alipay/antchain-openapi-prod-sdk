<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MORSERTA\Models;

use AlibabaCloud\Tea\Model;

class ConversionAdDataAttributedRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 广告账户id，如9471147
    /**
     * @var string
     */
    public $accountId;

    // 转化归因到的媒体渠道
    /**
     * @var string
     */
    public $mediaType;

    // 转化发生的unix事件戳，单位秒
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

    // json字段，包含转化归因到的点击的完整必要信息，如用户设备信息等
    /**
     * @var string
     */
    public $clickData;

    // 投放项目
    /**
     * @var string
     */
    public $project;
    protected $_name = [
        'authToken' => 'auth_token',
        'accountId' => 'account_id',
        'mediaType' => 'media_type',
        'eventTime' => 'event_time',
        'eventCode' => 'event_code',
        'userId'    => 'user_id',
        'productId' => 'product_id',
        'eventId'   => 'event_id',
        'clickData' => 'click_data',
        'project'   => 'project',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('mediaType', $this->mediaType, true);
        Model::validateRequired('eventTime', $this->eventTime, true);
        Model::validateRequired('eventCode', $this->eventCode, true);
        Model::validateRequired('clickData', $this->clickData, true);
        Model::validateRequired('project', $this->project, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->mediaType) {
            $res['media_type'] = $this->mediaType;
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
        if (null !== $this->clickData) {
            $res['click_data'] = $this->clickData;
        }
        if (null !== $this->project) {
            $res['project'] = $this->project;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConversionAdDataAttributedRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['media_type'])) {
            $model->mediaType = $map['media_type'];
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
        if (isset($map['click_data'])) {
            $model->clickData = $map['click_data'];
        }
        if (isset($map['project'])) {
            $model->project = $map['project'];
        }

        return $model;
    }
}
