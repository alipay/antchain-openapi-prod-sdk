<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeCertificateLxResponse extends Model
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

    // 返回码
    // 0：成功
    // 1：失败
    // 2：处理中
    // 99：系统异常
    /**
     * @var string
     */
    public $status;

    // 申请结果描述，失败原因，失败时必传
    /**
     * @var string
     */
    public $msg;

    // 文件路径
    // 实时返回文件路径给到乐信，乐信去对应sftp路径上取，路径命名规则：download/2602/loanReqNo_文件类型.pdf
    // 若失败则返回失败原因到msg字段
    /**
     * @var string
     */
    public $filePath;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'status'     => 'status',
        'msg'        => 'msg',
        'filePath'   => 'file_path',
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
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->filePath) {
            $res['file_path'] = $this->filePath;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeCertificateLxResponse
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
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }
        if (isset($map['file_path'])) {
            $model->filePath = $map['file_path'];
        }

        return $model;
    }
}
