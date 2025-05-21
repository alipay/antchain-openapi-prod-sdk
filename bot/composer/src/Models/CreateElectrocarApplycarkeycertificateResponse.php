<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateElectrocarApplycarkeycertificateResponse extends Model
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

    // sn
    /**
     * @var string
     */
    public $tuid;

    // deviceDid
    /**
     * @var string
     */
    public $deviceDid;

    // 三元组+连接实例id
    /**
     * @var string
     */
    public $mqttContent;

    // 凭证接口返回参数
    /**
     * @var string
     */
    public $carKeyInitData;

    // 成功/失败
    /**
     * @var bool
     */
    public $success;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'tuid'           => 'tuid',
        'deviceDid'      => 'device_did',
        'mqttContent'    => 'mqtt_content',
        'carKeyInitData' => 'car_key_init_data',
        'success'        => 'success',
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
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->mqttContent) {
            $res['mqtt_content'] = $this->mqttContent;
        }
        if (null !== $this->carKeyInitData) {
            $res['car_key_init_data'] = $this->carKeyInitData;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateElectrocarApplycarkeycertificateResponse
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
        if (isset($map['tuid'])) {
            $model->tuid = $map['tuid'];
        }
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
        }
        if (isset($map['mqtt_content'])) {
            $model->mqttContent = $map['mqtt_content'];
        }
        if (isset($map['car_key_init_data'])) {
            $model->carKeyInitData = $map['car_key_init_data'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }

        return $model;
    }
}
