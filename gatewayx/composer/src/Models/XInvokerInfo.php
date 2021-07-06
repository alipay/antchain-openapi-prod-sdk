<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GATEWAYX\Models;

use AlibabaCloud\Tea\Model;

class XInvokerInfo extends Model
{
    // 调用渠道
    /**
     * @example ALIYUN_POP
     *
     * @var string
     */
    public $invokeChannel;

    // 渠道的用户id
    /**
     * @example 1322233232
     *
     * @var string
     */
    public $invokeChannelUid;

    // 8位金融云租户ID
    /**
     * @example SHKWHXDJ
     *
     * @var string
     */
    public $invokeTenant;

    // 调用者用户金融云id
    /**
     * @example 2088123213123
     *
     * @var string
     */
    public $invokeUserId;
    protected $_name = [
        'invokeChannel'    => 'invoke_channel',
        'invokeChannelUid' => 'invoke_channel_uid',
        'invokeTenant'     => 'invoke_tenant',
        'invokeUserId'     => 'invoke_user_id',
    ];

    public function validate()
    {
        Model::validateRequired('invokeChannel', $this->invokeChannel, true);
        Model::validateRequired('invokeChannelUid', $this->invokeChannelUid, true);
        Model::validateRequired('invokeTenant', $this->invokeTenant, true);
        Model::validateRequired('invokeUserId', $this->invokeUserId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->invokeChannel) {
            $res['invoke_channel'] = $this->invokeChannel;
        }
        if (null !== $this->invokeChannelUid) {
            $res['invoke_channel_uid'] = $this->invokeChannelUid;
        }
        if (null !== $this->invokeTenant) {
            $res['invoke_tenant'] = $this->invokeTenant;
        }
        if (null !== $this->invokeUserId) {
            $res['invoke_user_id'] = $this->invokeUserId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XInvokerInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['invoke_channel'])) {
            $model->invokeChannel = $map['invoke_channel'];
        }
        if (isset($map['invoke_channel_uid'])) {
            $model->invokeChannelUid = $map['invoke_channel_uid'];
        }
        if (isset($map['invoke_tenant'])) {
            $model->invokeTenant = $map['invoke_tenant'];
        }
        if (isset($map['invoke_user_id'])) {
            $model->invokeUserId = $map['invoke_user_id'];
        }

        return $model;
    }
}
