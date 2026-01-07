<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class RegisterElectrocarDeviceResponse extends Model
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

    // 状态
    /**
     * @var string
     */
    public $success;

    // tuid
    /**
     * @var string
     */
    public $tuid;

    // kyt 返回的蓝牙凭证信息
    /**
     * @var string
     */
    public $carKeyInitData;

    // 物联网平台三元组加密
    /**
     * @var string
     */
    public $mqttContent;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'success'        => 'success',
        'tuid'           => 'tuid',
        'carKeyInitData' => 'car_key_init_data',
        'mqttContent'    => 'mqtt_content',
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->carKeyInitData) {
            $res['car_key_init_data'] = $this->carKeyInitData;
        }
        if (null !== $this->mqttContent) {
            $res['mqtt_content'] = $this->mqttContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterElectrocarDeviceResponse
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
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['tuid'])) {
            $model->tuid = $map['tuid'];
        }
        if (isset($map['car_key_init_data'])) {
            $model->carKeyInitData = $map['car_key_init_data'];
        }
        if (isset($map['mqtt_content'])) {
            $model->mqttContent = $map['mqtt_content'];
        }

        return $model;
    }
}
