<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ApplyDataauthorizationAuthorizationWithsignatureResponse extends Model
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

    // 操作结果
    /**
     * @var ProcessResult
     */
    public $processResult;

    // 权限凭证
    /**
     * @var string
     */
    public $authorityCert;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'processResult' => 'process_result',
        'authorityCert' => 'authority_cert',
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
        if (null !== $this->processResult) {
            $res['process_result'] = null !== $this->processResult ? $this->processResult->toMap() : null;
        }
        if (null !== $this->authorityCert) {
            $res['authority_cert'] = $this->authorityCert;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyDataauthorizationAuthorizationWithsignatureResponse
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
        if (isset($map['process_result'])) {
            $model->processResult = ProcessResult::fromMap($map['process_result']);
        }
        if (isset($map['authority_cert'])) {
            $model->authorityCert = $map['authority_cert'];
        }

        return $model;
    }
}
