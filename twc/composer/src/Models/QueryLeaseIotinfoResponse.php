<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryLeaseIotinfoResponse extends Model
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

    // 错误码
    /**
     * @var int
     */
    public $code;

    // ""
    /**
     * @var string
     */
    public $errMessage;

    // 设备详情
    /**
     * @var LeaseIotItemInfo[]
     */
    public $leaseIotItemInfo;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'code'             => 'code',
        'errMessage'       => 'err_message',
        'leaseIotItemInfo' => 'lease_iot_item_info',
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->errMessage) {
            $res['err_message'] = $this->errMessage;
        }
        if (null !== $this->leaseIotItemInfo) {
            $res['lease_iot_item_info'] = [];
            if (null !== $this->leaseIotItemInfo && \is_array($this->leaseIotItemInfo)) {
                $n = 0;
                foreach ($this->leaseIotItemInfo as $item) {
                    $res['lease_iot_item_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLeaseIotinfoResponse
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
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['err_message'])) {
            $model->errMessage = $map['err_message'];
        }
        if (isset($map['lease_iot_item_info'])) {
            if (!empty($map['lease_iot_item_info'])) {
                $model->leaseIotItemInfo = [];
                $n                       = 0;
                foreach ($map['lease_iot_item_info'] as $item) {
                    $model->leaseIotItemInfo[$n++] = null !== $item ? LeaseIotItemInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
