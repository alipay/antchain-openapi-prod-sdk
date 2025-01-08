<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SyncFourwheelerCareventRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 注册到蚂蚁IoT返回的唯一ID
    // 注：deviceDid有值时，deviceSn 和 cordeviceCorp 可以为空
    /**
     * @var string
     */
    public $deviceDid;

    // 设备序列号
    // 注:当deviceSn 和 cordeviceCorp有值时，deviceDid 可以为空。
    /**
     * @var string
     */
    public $deviceSn;

    // 设备厂商
    // 注:当deviceSn 和 cordeviceCorp有值时，deviceDid 可以为空。
    /**
     * @var string
     */
    public $deviceCorp;

    // 车辆事件集合
    /**
     * @var FourWheelerCarEvent[]
     */
    public $items;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceDid'         => 'device_did',
        'deviceSn'          => 'device_sn',
        'deviceCorp'        => 'device_corp',
        'items'             => 'items',
    ];

    public function validate()
    {
        Model::validateRequired('items', $this->items, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->deviceSn) {
            $res['device_sn'] = $this->deviceSn;
        }
        if (null !== $this->deviceCorp) {
            $res['device_corp'] = $this->deviceCorp;
        }
        if (null !== $this->items) {
            $res['items'] = [];
            if (null !== $this->items && \is_array($this->items)) {
                $n = 0;
                foreach ($this->items as $item) {
                    $res['items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncFourwheelerCareventRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
        }
        if (isset($map['device_sn'])) {
            $model->deviceSn = $map['device_sn'];
        }
        if (isset($map['device_corp'])) {
            $model->deviceCorp = $map['device_corp'];
        }
        if (isset($map['items'])) {
            if (!empty($map['items'])) {
                $model->items = [];
                $n            = 0;
                foreach ($map['items'] as $item) {
                    $model->items[$n++] = null !== $item ? FourWheelerCarEvent::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
