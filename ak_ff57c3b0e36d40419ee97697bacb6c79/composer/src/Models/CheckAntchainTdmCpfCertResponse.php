<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ff57c3b0e36d40419ee97697bacb6c79\Models;

use AlibabaCloud\Tea\Model;

class CheckAntchainTdmCpfCertResponse extends Model
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

    // 证明ID
    /**
     * @var string
     */
    public $issueId;

    // 证明文件获取地址
    /**
     * @var string
     */
    public $depositCert;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'issueId'     => 'issue_id',
        'depositCert' => 'deposit_cert',
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
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
        }
        if (null !== $this->depositCert) {
            $res['deposit_cert'] = $this->depositCert;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckAntchainTdmCpfCertResponse
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
        if (isset($map['issue_id'])) {
            $model->issueId = $map['issue_id'];
        }
        if (isset($map['deposit_cert'])) {
            $model->depositCert = $map['deposit_cert'];
        }

        return $model;
    }
}
