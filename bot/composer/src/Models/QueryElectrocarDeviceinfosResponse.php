<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryElectrocarDeviceinfosResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // key
    /**
     * @var string
     */
    public $trustProductKey;

    // 产品key
    /**
     * @var string
     */
    public $productKey;

    // 设备唯一id
    /**
     * @var string
     */
    public $trustDeviceId;

    // 设备tuid
    /**
     * @var string
     */
    public $deviceName;

    // 设备名称
    /**
     * @var string
     */
    public $nickName;

    // 设备在线状态
    /**
     * @var string
     */
    public $deviceStatus;

    // 设备注册时间
    /**
     * @var string
     */
    public $deviceRegisterTime;

    // 设备激活时间
    /**
     * @var string
     */
    public $deviceActiveTime;

    // 最后在线时间
    /**
     * @var string
     */
    public $lastOnlineTime;

    // 最后离线时间
    /**
     * @var string
     */
    public $lastOfflineTime;

    // 最后通讯时间
    /**
     * @var string
     */
    public $lastCommunicationTime;

    // ota版本
    /**
     * @var string
     */
    public $deviceOtaVersion;
    protected $_name = [
        'reqMsgId'              => 'req_msg_id',
        'resultCode'            => 'result_code',
        'resultMsg'             => 'result_msg',
        'trustProductKey'       => 'trust_product_key',
        'productKey'            => 'product_key',
        'trustDeviceId'         => 'trust_device_id',
        'deviceName'            => 'device_name',
        'nickName'              => 'nick_name',
        'deviceStatus'          => 'device_status',
        'deviceRegisterTime'    => 'device_register_time',
        'deviceActiveTime'      => 'device_active_time',
        'lastOnlineTime'        => 'last_online_time',
        'lastOfflineTime'       => 'last_offline_time',
        'lastCommunicationTime' => 'last_communication_time',
        'deviceOtaVersion'      => 'device_ota_version',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->trustProductKey) {
            $res['trust_product_key'] = $this->trustProductKey;
        }
        if (null !== $this->productKey) {
            $res['product_key'] = $this->productKey;
        }
        if (null !== $this->trustDeviceId) {
            $res['trust_device_id'] = $this->trustDeviceId;
        }
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        if (null !== $this->deviceStatus) {
            $res['device_status'] = $this->deviceStatus;
        }
        if (null !== $this->deviceRegisterTime) {
            $res['device_register_time'] = $this->deviceRegisterTime;
        }
        if (null !== $this->deviceActiveTime) {
            $res['device_active_time'] = $this->deviceActiveTime;
        }
        if (null !== $this->lastOnlineTime) {
            $res['last_online_time'] = $this->lastOnlineTime;
        }
        if (null !== $this->lastOfflineTime) {
            $res['last_offline_time'] = $this->lastOfflineTime;
        }
        if (null !== $this->lastCommunicationTime) {
            $res['last_communication_time'] = $this->lastCommunicationTime;
        }
        if (null !== $this->deviceOtaVersion) {
            $res['device_ota_version'] = $this->deviceOtaVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryElectrocarDeviceinfosResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['trust_product_key'])) {
            $model->trustProductKey = $map['trust_product_key'];
        }
        if (isset($map['product_key'])) {
            $model->productKey = $map['product_key'];
        }
        if (isset($map['trust_device_id'])) {
            $model->trustDeviceId = $map['trust_device_id'];
        }
        if (isset($map['device_name'])) {
            $model->deviceName = $map['device_name'];
        }
        if (isset($map['nick_name'])) {
            $model->nickName = $map['nick_name'];
        }
        if (isset($map['device_status'])) {
            $model->deviceStatus = $map['device_status'];
        }
        if (isset($map['device_register_time'])) {
            $model->deviceRegisterTime = $map['device_register_time'];
        }
        if (isset($map['device_active_time'])) {
            $model->deviceActiveTime = $map['device_active_time'];
        }
        if (isset($map['last_online_time'])) {
            $model->lastOnlineTime = $map['last_online_time'];
        }
        if (isset($map['last_offline_time'])) {
            $model->lastOfflineTime = $map['last_offline_time'];
        }
        if (isset($map['last_communication_time'])) {
            $model->lastCommunicationTime = $map['last_communication_time'];
        }
        if (isset($map['device_ota_version'])) {
            $model->deviceOtaVersion = $map['device_ota_version'];
        }

        return $model;
    }
}
