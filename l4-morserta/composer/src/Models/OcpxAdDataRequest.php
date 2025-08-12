<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MORSERTA\Models;

use AlibabaCloud\Tea\Model;

class OcpxAdDataRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 见对接文档中【Industry行业枚举】部分
    /**
     * @var string
     */
    public $industry;

    // 归因渠道编码，见对接文档中的【渠道枚举】部分
    /**
     * @var string
     */
    public $channel;

    // 归因广告账号id
    /**
     * @var string
     */
    public $accountId;

    // 见对接文档中【转化事件event_code枚举】部分
    /**
     * @var string
     */
    public $eventCode;

    // unix时间戳
    /**
     * @var int
     */
    public $eventTime;

    // 转化用户/设备标识
    /**
     * @var UserInfo
     */
    public $userInfo;

    // 如有去重需求，可传递业务事件id， 唯一标识当前事件。如下单事件中的订单id
    /**
     * @var string
     */
    public $outEventId;

    // android/ios/web
    /**
     * @var string
     */
    public $osType;

    // 点击id和user_info二者至少传一个
    /**
     * @var string
     */
    public $clickId;

    // 媒体监测链接下发的callback原值
    /**
     * @var string
     */
    public $callback;
    protected $_name = [
        'authToken'  => 'auth_token',
        'industry'   => 'industry',
        'channel'    => 'channel',
        'accountId'  => 'account_id',
        'eventCode'  => 'event_code',
        'eventTime'  => 'event_time',
        'userInfo'   => 'user_info',
        'outEventId' => 'out_event_id',
        'osType'     => 'os_type',
        'clickId'    => 'click_id',
        'callback'   => 'callback',
    ];

    public function validate()
    {
        Model::validateRequired('industry', $this->industry, true);
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('eventCode', $this->eventCode, true);
        Model::validateRequired('eventTime', $this->eventTime, true);
        Model::validateRequired('osType', $this->osType, true);
        Model::validateRequired('callback', $this->callback, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->industry) {
            $res['industry'] = $this->industry;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->eventCode) {
            $res['event_code'] = $this->eventCode;
        }
        if (null !== $this->eventTime) {
            $res['event_time'] = $this->eventTime;
        }
        if (null !== $this->userInfo) {
            $res['user_info'] = null !== $this->userInfo ? $this->userInfo->toMap() : null;
        }
        if (null !== $this->outEventId) {
            $res['out_event_id'] = $this->outEventId;
        }
        if (null !== $this->osType) {
            $res['os_type'] = $this->osType;
        }
        if (null !== $this->clickId) {
            $res['click_id'] = $this->clickId;
        }
        if (null !== $this->callback) {
            $res['callback'] = $this->callback;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OcpxAdDataRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['industry'])) {
            $model->industry = $map['industry'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['event_code'])) {
            $model->eventCode = $map['event_code'];
        }
        if (isset($map['event_time'])) {
            $model->eventTime = $map['event_time'];
        }
        if (isset($map['user_info'])) {
            $model->userInfo = UserInfo::fromMap($map['user_info']);
        }
        if (isset($map['out_event_id'])) {
            $model->outEventId = $map['out_event_id'];
        }
        if (isset($map['os_type'])) {
            $model->osType = $map['os_type'];
        }
        if (isset($map['click_id'])) {
            $model->clickId = $map['click_id'];
        }
        if (isset($map['callback'])) {
            $model->callback = $map['callback'];
        }

        return $model;
    }
}
