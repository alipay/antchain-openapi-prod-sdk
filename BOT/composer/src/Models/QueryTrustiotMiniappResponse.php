<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\DeviceScopeItem;

class QueryTrustiotMiniappResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'redirectUrl' => 'redirect_url',
        'validFrom' => 'valid_from',
        'validTo' => 'valid_to',
        'invalidDevices' => 'invalid_devices',
        'validDeviceCount' => 'valid_device_count',
    ];
    public function validate() {}
    public function toMap() {
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
        if (null !== $this->redirectUrl) {
            $res['redirect_url'] = $this->redirectUrl;
        }
        if (null !== $this->validFrom) {
            $res['valid_from'] = $this->validFrom;
        }
        if (null !== $this->validTo) {
            $res['valid_to'] = $this->validTo;
        }
        if (null !== $this->invalidDevices) {
            $res['invalid_devices'] = [];
            if(null !== $this->invalidDevices && is_array($this->invalidDevices)){
                $n = 0;
                foreach($this->invalidDevices as $item){
                    $res['invalid_devices'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->validDeviceCount) {
            $res['valid_device_count'] = $this->validDeviceCount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryTrustiotMiniappResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['redirect_url'])){
            $model->redirectUrl = $map['redirect_url'];
        }
        if(isset($map['valid_from'])){
            $model->validFrom = $map['valid_from'];
        }
        if(isset($map['valid_to'])){
            $model->validTo = $map['valid_to'];
        }
        if(isset($map['invalid_devices'])){
            if(!empty($map['invalid_devices'])){
                $model->invalidDevices = [];
                $n = 0;
                foreach($map['invalid_devices'] as $item) {
                    $model->invalidDevices[$n++] = null !== $item ? DeviceScopeItem::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['valid_device_count'])){
            $model->validDeviceCount = $map['valid_device_count'];
        }
        return $model;
    }
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

    // 携带 redirectToken 的跳转 URL
    /**
     * @var string
     */
    public $redirectUrl;

    // 有效期开始时间（时间戳）
    /**
     * @var int
     */
    public $validFrom;

    // 有效期截止时间（时间戳）
    /**
     * @var int
     */
    public $validTo;

    // 按 scene 聚合的未注册设备
    /**
     * @var DeviceScopeItem[]
     */
    public $invalidDevices;

    // 实际授权的有效设备数
    /**
     * @var int
     */
    public $validDeviceCount;

}
