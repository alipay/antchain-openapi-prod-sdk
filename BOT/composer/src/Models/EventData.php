<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class EventData extends Model
{
    // 数据内容
    /**
     * @example { "DEVICE-ID": "ABC123", "IMEI": "868331011992179", "HEART-BEAT-TIME": 1699053387008 }
     *
     * @var string
     */
    public $content;

    // 可信设备ID
    /**
     * @example 7213004826408435712
     *
     * @var int
     */
    public $trustIotDeviceId;

    // 业务ID
    /**
     * @example 20240815
     *
     * @var string
     */
    public $bizId;

    // 设备数据签名
    /**
     * @example 8e084d95c5ac9198b01b9f6b8040b2daa35a3e2706a472295f52ec0966119383d7654eb2c1f67eb563194ab9d2197fcd8fcb5232308927e708257ebea8ce1cda
     *
     * @var string
     */
    public $signature;

    // 设备数据间接上报时，服务端补充数据
    /**
     * @example {"PRICE":2.2,"NUMBER":3}
     *
     * @var string
     */
    public $extraData;
    protected $_name = [
        'content'          => 'content',
        'trustIotDeviceId' => 'trust_iot_device_id',
        'bizId'            => 'biz_id',
        'signature'        => 'signature',
        'extraData'        => 'extra_data',
    ];

    public function validate()
    {
        Model::validateRequired('content', $this->content, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->trustIotDeviceId) {
            $res['trust_iot_device_id'] = $this->trustIotDeviceId;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->extraData) {
            $res['extra_data'] = $this->extraData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EventData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['trust_iot_device_id'])) {
            $model->trustIotDeviceId = $map['trust_iot_device_id'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['extra_data'])) {
            $model->extraData = $map['extra_data'];
        }

        return $model;
    }
}
