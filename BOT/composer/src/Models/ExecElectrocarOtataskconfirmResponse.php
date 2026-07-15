<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ExecElectrocarOtataskconfirmResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'success' => 'success',
        'firmwareUrl' => 'firmware_url',
        'firmwareSize' => 'firmware_size',
        'firmwareMd5' => 'firmware_md5',
        'destVersion' => 'dest_version',
        'firmwareData' => 'firmware_data',
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->firmwareUrl) {
            $res['firmware_url'] = $this->firmwareUrl;
        }
        if (null !== $this->firmwareSize) {
            $res['firmware_size'] = $this->firmwareSize;
        }
        if (null !== $this->firmwareMd5) {
            $res['firmware_md5'] = $this->firmwareMd5;
        }
        if (null !== $this->destVersion) {
            $res['dest_version'] = $this->destVersion;
        }
        if (null !== $this->firmwareData) {
            $res['firmware_data'] = $this->firmwareData;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecElectrocarOtataskconfirmResponse
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
        if(isset($map['success'])){
            $model->success = $map['success'];
        }
        if(isset($map['firmware_url'])){
            $model->firmwareUrl = $map['firmware_url'];
        }
        if(isset($map['firmware_size'])){
            $model->firmwareSize = $map['firmware_size'];
        }
        if(isset($map['firmware_md5'])){
            $model->firmwareMd5 = $map['firmware_md5'];
        }
        if(isset($map['dest_version'])){
            $model->destVersion = $map['dest_version'];
        }
        if(isset($map['firmware_data'])){
            if(!empty($map['firmware_data'])){
                $model->firmwareData = $map['firmware_data'];
            }
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

    // 确认操作是否成功
    /**
     * @var bool
     */
    public $success;

    // BLE 固件下载地址；4G 通道确认时为空
    /**
     * @var string
     */
    public $firmwareUrl;

    // BLE 固件文件大小，单位 B
    /**
     * @var int
     */
    public $firmwareSize;

    // BLE 固件 MD5
    /**
     * @var string
     */
    public $firmwareMd5;

    // 本次任务目标版本号
    /**
     * @var string
     */
    public $destVersion;

    // BLE 固件分包数据，按端侧传输协议编码后的字符串列表
    /**
     * @var string[]
     */
    public $firmwareData;

}
