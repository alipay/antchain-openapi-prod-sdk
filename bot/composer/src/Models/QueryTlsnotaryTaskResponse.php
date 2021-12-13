<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryTlsnotaryTaskResponse extends Model
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

    // 唯一的业务 tlsnotary 任务 id
    /**
     * @var string
     */
    public $taskId;

    // tlsnotary任务执行状态
    /**
     * @var int
     */
    public $state;

    // 上传文件oss链接
    /**
     * @var TlsnotaryUploadOssLinks
     */
    public $uploadOssLinks;

    // 认证签名
    /**
     * @var string
     */
    public $notarySignature;

    // 业务错误码
    /**
     * @var int
     */
    public $errorCode;

    // 业务错误信息
    /**
     * @var string
     */
    public $errorMsg;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'taskId'          => 'task_id',
        'state'           => 'state',
        'uploadOssLinks'  => 'upload_oss_links',
        'notarySignature' => 'notary_signature',
        'errorCode'       => 'error_code',
        'errorMsg'        => 'error_msg',
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
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->uploadOssLinks) {
            $res['upload_oss_links'] = null !== $this->uploadOssLinks ? $this->uploadOssLinks->toMap() : null;
        }
        if (null !== $this->notarySignature) {
            $res['notary_signature'] = $this->notarySignature;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTlsnotaryTaskResponse
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
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['upload_oss_links'])) {
            $model->uploadOssLinks = TlsnotaryUploadOssLinks::fromMap($map['upload_oss_links']);
        }
        if (isset($map['notary_signature'])) {
            $model->notarySignature = $map['notary_signature'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }

        return $model;
    }
}
