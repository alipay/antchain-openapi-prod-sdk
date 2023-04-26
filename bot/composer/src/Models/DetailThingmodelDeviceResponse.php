<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DetailThingmodelDeviceResponse extends Model
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

    // 设备状态
    /**
     * @var string
     */
    public $status;

    // 设备状态是否可用
    /**
     * @var bool
     */
    public $statusAvailable;

    // SDK版本号
    /**
     * @var string
     */
    public $sdkVersion;

    // SDK版本号是否可用
    /**
     * @var bool
     */
    public $sdkVersionAvailable;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'status'              => 'status',
        'statusAvailable'     => 'status_available',
        'sdkVersion'          => 'sdk_version',
        'sdkVersionAvailable' => 'sdk_version_available',
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->statusAvailable) {
            $res['status_available'] = $this->statusAvailable;
        }
        if (null !== $this->sdkVersion) {
            $res['sdk_version'] = $this->sdkVersion;
        }
        if (null !== $this->sdkVersionAvailable) {
            $res['sdk_version_available'] = $this->sdkVersionAvailable;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailThingmodelDeviceResponse
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['status_available'])) {
            $model->statusAvailable = $map['status_available'];
        }
        if (isset($map['sdk_version'])) {
            $model->sdkVersion = $map['sdk_version'];
        }
        if (isset($map['sdk_version_available'])) {
            $model->sdkVersionAvailable = $map['sdk_version_available'];
        }

        return $model;
    }
}
