<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class ExportItagAntitagTaskDownloadResponse extends Model
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

    // RequestId
    /**
     * @var string
     */
    public $requestid;

    // Succ
    /**
     * @var string
     */
    public $succ;

    // Code
    /**
     * @var string
     */
    public $code;

    // Msg
    /**
     * @var string
     */
    public $msg;

    // errinfo
    /**
     * @var string
     */
    public $errinfo;

    // result
    /**
     * @var DownloadMarkResult
     */
    public $result;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'requestid'  => 'requestid',
        'succ'       => 'succ',
        'code'       => 'code',
        'msg'        => 'msg',
        'errinfo'    => 'errinfo',
        'result'     => 'result',
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
        if (null !== $this->succ) {
            $res['succ'] = $this->succ;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->errinfo) {
            $res['errinfo'] = $this->errinfo;
        }
        if (null !== $this->result) {
            $res['result'] = null !== $this->result ? $this->result->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExportItagAntitagTaskDownloadResponse
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
        if (isset($map['succ'])) {
            $model->succ = $map['succ'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }
        if (isset($map['errinfo'])) {
            $model->errinfo = $map['errinfo'];
        }
        if (isset($map['result'])) {
            $model->result = DownloadMarkResult::fromMap($map['result']);
        }

        return $model;
    }
}
