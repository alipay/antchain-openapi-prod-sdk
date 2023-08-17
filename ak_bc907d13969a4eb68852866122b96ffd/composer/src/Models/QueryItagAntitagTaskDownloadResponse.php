<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class QueryItagAntitagTaskDownloadResponse extends Model
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

    // requestid
    /**
     * @var string
     */
    public $requestid;

    // code
    /**
     * @var string
     */
    public $code;

    // msg
    /**
     * @var string
     */
    public $msg;

    // succ
    /**
     * @var string
     */
    public $succ;

    // errinfo
    /**
     * @var string
     */
    public $errinfo;

    // runret
    /**
     * @var RunRet
     */
    public $runret;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'requestid'  => 'requestid',
        'code'       => 'code',
        'msg'        => 'msg',
        'succ'       => 'succ',
        'errinfo'    => 'errinfo',
        'runret'     => 'runret',
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
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->succ) {
            $res['succ'] = $this->succ;
        }
        if (null !== $this->errinfo) {
            $res['errinfo'] = $this->errinfo;
        }
        if (null !== $this->runret) {
            $res['runret'] = null !== $this->runret ? $this->runret->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryItagAntitagTaskDownloadResponse
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
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }
        if (isset($map['succ'])) {
            $model->succ = $map['succ'];
        }
        if (isset($map['errinfo'])) {
            $model->errinfo = $map['errinfo'];
        }
        if (isset($map['runret'])) {
            $model->runret = RunRet::fromMap($map['runret']);
        }

        return $model;
    }
}
