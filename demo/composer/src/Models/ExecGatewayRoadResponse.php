<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class ExecGatewayRoadResponse extends Model
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

    // 返回用户请求编号+1
    /**
     * @var int
     */
    public $execNumEcho;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'execNumEcho' => 'exec_num_echo',
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
        if (null !== $this->execNumEcho) {
            $res['exec_num_echo'] = $this->execNumEcho;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecGatewayRoadResponse
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
        if (isset($map['exec_num_echo'])) {
            $model->execNumEcho = $map['exec_num_echo'];
        }

        return $model;
    }
}
