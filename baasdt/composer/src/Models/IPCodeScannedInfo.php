<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPCodeScannedInfo extends Model
{
    // 正版码ID
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $ipCode;

    // 用户的ID
    /**
     * @example 2d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $userId;

    // 用户的名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $userName;

    // 用户头像地址
    /**
     * @example 用户头像地址
     *
     * @var string
     */
    public $avatar;

    // 用户的手机号
    /**
     * @example 13291887615
     *
     * @var string
     */
    public $phoneNumber;

    // 用户的位置信息
    /**
     * @example 浙江省杭州市西湖区
     *
     * @var string
     */
    public $gps;

    // 处理时间(毫秒时间戳)
    /**
     * @example 713471745
     *
     * @var int
     */
    public $timestamp;

    // IP ID
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb167354725347
     *
     * @var string
     */
    public $ipId;

    // 订单ID
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb1653461535297423
     *
     * @var string
     */
    public $orderId;

    // 正版码商品信息配置列表
    /**
     * @example
     *
     * @var IPCodeGoodsInfo[]
     */
    public $goodsInfoList;

    // 正版码资源位配置信息列表
    /**
     * @example
     *
     * @var IPCodeAdvertisingInfo[]
     */
    public $adInfoList;
    protected $_name = [
        'ipCode'        => 'ip_code',
        'userId'        => 'user_id',
        'userName'      => 'user_name',
        'avatar'        => 'avatar',
        'phoneNumber'   => 'phone_number',
        'gps'           => 'gps',
        'timestamp'     => 'timestamp',
        'ipId'          => 'ip_id',
        'orderId'       => 'order_id',
        'goodsInfoList' => 'goods_info_list',
        'adInfoList'    => 'ad_info_list',
    ];

    public function validate()
    {
        Model::validateRequired('ipCode', $this->ipCode, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('avatar', $this->avatar, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('ipId', $this->ipId, true);
        Model::validateRequired('orderId', $this->orderId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ipCode) {
            $res['ip_code'] = $this->ipCode;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->avatar) {
            $res['avatar'] = $this->avatar;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->gps) {
            $res['gps'] = $this->gps;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->ipId) {
            $res['ip_id'] = $this->ipId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->goodsInfoList) {
            $res['goods_info_list'] = [];
            if (null !== $this->goodsInfoList && \is_array($this->goodsInfoList)) {
                $n = 0;
                foreach ($this->goodsInfoList as $item) {
                    $res['goods_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->adInfoList) {
            $res['ad_info_list'] = [];
            if (null !== $this->adInfoList && \is_array($this->adInfoList)) {
                $n = 0;
                foreach ($this->adInfoList as $item) {
                    $res['ad_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPCodeScannedInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ip_code'])) {
            $model->ipCode = $map['ip_code'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['avatar'])) {
            $model->avatar = $map['avatar'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['gps'])) {
            $model->gps = $map['gps'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['ip_id'])) {
            $model->ipId = $map['ip_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['goods_info_list'])) {
            if (!empty($map['goods_info_list'])) {
                $model->goodsInfoList = [];
                $n                    = 0;
                foreach ($map['goods_info_list'] as $item) {
                    $model->goodsInfoList[$n++] = null !== $item ? IPCodeGoodsInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ad_info_list'])) {
            if (!empty($map['ad_info_list'])) {
                $model->adInfoList = [];
                $n                 = 0;
                foreach ($map['ad_info_list'] as $item) {
                    $model->adInfoList[$n++] = null !== $item ? IPCodeAdvertisingInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
