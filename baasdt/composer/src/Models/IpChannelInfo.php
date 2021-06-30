<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IpChannelInfo extends Model
{
    // 渠道名字
    /**
     * @example tianmao
     *
     * @var string
     */
    public $channelName;

    // 授权模式 商品授权 0普通授权/1独家授权  本期只有0
    /**
     * @example 0
     *
     * @var int
     */
    public $authorizationMode;

    // 计费模式 0:按量 1:按金额
    /**
     * @example 1
     *
     * @var int
     */
    public $payMode;

    // ip等级 （5位数字） 对应a，0:经典IP/1:流量IP/2:设计IP
    /**
     * @example 1
     *
     * @var int
     */
    public $ipLevel;

    // 商品状态（0:待上架，1:上架，2:下架）
    /**
     * @example 0
     *
     * @var int
     */
    public $status;

    // 交易是否需要确认
    /**
     * @example true, false
     *
     * @var bool
     */
    public $tradeNeedConfirm;
    protected $_name = [
        'channelName'       => 'channel_name',
        'authorizationMode' => 'authorization_mode',
        'payMode'           => 'pay_mode',
        'ipLevel'           => 'ip_level',
        'status'            => 'status',
        'tradeNeedConfirm'  => 'trade_need_confirm',
    ];

    public function validate()
    {
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validateRequired('authorizationMode', $this->authorizationMode, true);
        Model::validateRequired('payMode', $this->payMode, true);
        Model::validateRequired('ipLevel', $this->ipLevel, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }
        if (null !== $this->authorizationMode) {
            $res['authorization_mode'] = $this->authorizationMode;
        }
        if (null !== $this->payMode) {
            $res['pay_mode'] = $this->payMode;
        }
        if (null !== $this->ipLevel) {
            $res['ip_level'] = $this->ipLevel;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tradeNeedConfirm) {
            $res['trade_need_confirm'] = $this->tradeNeedConfirm;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IpChannelInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }
        if (isset($map['authorization_mode'])) {
            $model->authorizationMode = $map['authorization_mode'];
        }
        if (isset($map['pay_mode'])) {
            $model->payMode = $map['pay_mode'];
        }
        if (isset($map['ip_level'])) {
            $model->ipLevel = $map['ip_level'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['trade_need_confirm'])) {
            $model->tradeNeedConfirm = $map['trade_need_confirm'];
        }

        return $model;
    }
}
