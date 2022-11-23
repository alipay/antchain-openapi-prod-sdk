<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class GetContractEncryptedfileuploadurlResponse extends Model
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

    // 上传的原始文件记录id
    /**
     * @var string
     */
    public $fileLogId;

    // 文件上传链接
    /**
     * @var string
     */
    public $fileUploadUrl;

    // 上传链接过期时间. yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $expiredTime;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'fileLogId'     => 'file_log_id',
        'fileUploadUrl' => 'file_upload_url',
        'expiredTime'   => 'expired_time',
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
        if (null !== $this->fileLogId) {
            $res['file_log_id'] = $this->fileLogId;
        }
        if (null !== $this->fileUploadUrl) {
            $res['file_upload_url'] = $this->fileUploadUrl;
        }
        if (null !== $this->expiredTime) {
            $res['expired_time'] = $this->expiredTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetContractEncryptedfileuploadurlResponse
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
        if (isset($map['file_log_id'])) {
            $model->fileLogId = $map['file_log_id'];
        }
        if (isset($map['file_upload_url'])) {
            $model->fileUploadUrl = $map['file_upload_url'];
        }
        if (isset($map['expired_time'])) {
            $model->expiredTime = $map['expired_time'];
        }

        return $model;
    }
}
