<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class AccountInChannels extends Model
{
    // 天猫渠道
    /**
     * @example IPMart
     *
     * @var string
     */
    public $channelName;

    // 是否入驻
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isSettled;

    // WAIT_CHECK:渠道已申请开通但未审核，SUCCESS:渠道开通审核成功，渠道开通
    /**
     * @example 渠道开通状态
     *
     * @var string
     */
    public $settledStatus;
    protected $_name = [
        'channelName'   => 'channel_name',
        'isSettled'     => 'is_settled',
        'settledStatus' => 'settled_status',
    ];

    public function validate()
    {
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validateRequired('isSettled', $this->isSettled, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }
        if (null !== $this->isSettled) {
            $res['is_settled'] = $this->isSettled;
        }
        if (null !== $this->settledStatus) {
            $res['settled_status'] = $this->settledStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AccountInChannels
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }
        if (isset($map['is_settled'])) {
            $model->isSettled = $map['is_settled'];
        }
        if (isset($map['settled_status'])) {
            $model->settledStatus = $map['settled_status'];
        }

        return $model;
    }
}
