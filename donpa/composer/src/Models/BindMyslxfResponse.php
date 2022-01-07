<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DONPA\Models;

use AlibabaCloud\Tea\Model;

class BindMyslxfResponse extends Model
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

    // 绑定ID
    /**
     * @var string
     */
    public $bindId;

    // 绑定过期时间
    /**
     * @var string
     */
    public $expireTime;

    // 绑定的虚拟号码
    /**
     * @var string
     */
    public $virtualNumber;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'bindId'        => 'bind_id',
        'expireTime'    => 'expire_time',
        'virtualNumber' => 'virtual_number',
    ];

    public function validate()
    {
        Model::validatePattern('expireTime', $this->expireTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->bindId) {
            $res['bind_id'] = $this->bindId;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        if (null !== $this->virtualNumber) {
            $res['virtual_number'] = $this->virtualNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindMyslxfResponse
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
        if (isset($map['bind_id'])) {
            $model->bindId = $map['bind_id'];
        }
        if (isset($map['expire_time'])) {
            $model->expireTime = $map['expire_time'];
        }
        if (isset($map['virtual_number'])) {
            $model->virtualNumber = $map['virtual_number'];
        }

        return $model;
    }
}
