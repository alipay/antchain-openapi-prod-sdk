<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class RegisterItagAntitagUserResponse extends Model
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

    // 请求ID
    /**
     * @var string
     */
    public $requestid;

    // 结果码
    /**
     * @var int
     */
    public $code;

    // 错误信息
    /**
     * @var string
     */
    public $errmsg;

    // 结果消息
    /**
     * @var string
     */
    public $msg;

    // 标注平台userid
    /**
     * @var string
     */
    public $result;

    // 结果
    /**
     * @var bool
     */
    public $succ;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'requestid'  => 'requestid',
        'code'       => 'code',
        'errmsg'     => 'errmsg',
        'msg'        => 'msg',
        'result'     => 'result',
        'succ'       => 'succ',
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
        if (null !== $this->requestid) {
            $res['requestid'] = $this->requestid;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->errmsg) {
            $res['errmsg'] = $this->errmsg;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->succ) {
            $res['succ'] = $this->succ;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterItagAntitagUserResponse
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
        if (isset($map['requestid'])) {
            $model->requestid = $map['requestid'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['errmsg'])) {
            $model->errmsg = $map['errmsg'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['succ'])) {
            $model->succ = $map['succ'];
        }

        return $model;
    }
}
