<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class KytApplyParams extends Model
{
    // 设备类型
    /**
     * @example tw_car
     *
     * @var string
     */
    public $deviceType;

    // 凭证类型
    /**
     * @example mcu_dk_cred
     *
     * @var string
     */
    public $credType;

    // 品牌
    /**
     * @example JL
     *
     * @var string
     */
    public $brandId;

    // 凭证内容
    /**
     * @example []
     *
     * @var string
     */
    public $generateCode;

    // 协议类型
    /**
     * @example ble
     *
     * @var string
     */
    public $protocolType;

    // 无感参数
    /**
     * @example 1
     *
     * @var string
     */
    public $keyLess;

    // mac
    /**
     * @example F8:5F:56:F6:05:BC
     *
     * @var string
     */
    public $mac;

    // ble_name
    /**
     * @example ble_
     *
     * @var string
     */
    public $bleName;

    // 通道
    /**
     * @example DT
     *
     * @var string
     */
    public $channel;
    protected $_name = [
        'deviceType'   => 'device_type',
        'credType'     => 'cred_type',
        'brandId'      => 'brand_id',
        'generateCode' => 'generate_code',
        'protocolType' => 'protocol_type',
        'keyLess'      => 'key_less',
        'mac'          => 'mac',
        'bleName'      => 'ble_name',
        'channel'      => 'channel',
    ];

    public function validate()
    {
        Model::validateRequired('brandId', $this->brandId, true);
        Model::validateRequired('protocolType', $this->protocolType, true);
        Model::validateRequired('keyLess', $this->keyLess, true);
        Model::validateRequired('mac', $this->mac, true);
        Model::validateRequired('bleName', $this->bleName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceType) {
            $res['device_type'] = $this->deviceType;
        }
        if (null !== $this->credType) {
            $res['cred_type'] = $this->credType;
        }
        if (null !== $this->brandId) {
            $res['brand_id'] = $this->brandId;
        }
        if (null !== $this->generateCode) {
            $res['generate_code'] = $this->generateCode;
        }
        if (null !== $this->protocolType) {
            $res['protocol_type'] = $this->protocolType;
        }
        if (null !== $this->keyLess) {
            $res['key_less'] = $this->keyLess;
        }
        if (null !== $this->mac) {
            $res['mac'] = $this->mac;
        }
        if (null !== $this->bleName) {
            $res['ble_name'] = $this->bleName;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return KytApplyParams
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_type'])) {
            $model->deviceType = $map['device_type'];
        }
        if (isset($map['cred_type'])) {
            $model->credType = $map['cred_type'];
        }
        if (isset($map['brand_id'])) {
            $model->brandId = $map['brand_id'];
        }
        if (isset($map['generate_code'])) {
            $model->generateCode = $map['generate_code'];
        }
        if (isset($map['protocol_type'])) {
            $model->protocolType = $map['protocol_type'];
        }
        if (isset($map['key_less'])) {
            $model->keyLess = $map['key_less'];
        }
        if (isset($map['mac'])) {
            $model->mac = $map['mac'];
        }
        if (isset($map['ble_name'])) {
            $model->bleName = $map['ble_name'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }

        return $model;
    }
}
