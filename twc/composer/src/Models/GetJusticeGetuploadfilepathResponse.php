<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class GetJusticeGetuploadfilepathResponse extends Model
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

    // OSS上传链接
    /**
     * @var string
     */
    public $uploadFileUrl;

    // 文件key
    /**
     * @var string
     */
    public $fileKey;

    // 业务码 0表示成功
    /**
     * @var int
     */
    public $code;

    // 业务码描述
    /**
     * @var string
     */
    public $message;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'uploadFileUrl' => 'upload_file_url',
        'fileKey'       => 'file_key',
        'code'          => 'code',
        'message'       => 'message',
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
        if (null !== $this->uploadFileUrl) {
            $res['upload_file_url'] = $this->uploadFileUrl;
        }
        if (null !== $this->fileKey) {
            $res['file_key'] = $this->fileKey;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetJusticeGetuploadfilepathResponse
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
        if (isset($map['upload_file_url'])) {
            $model->uploadFileUrl = $map['upload_file_url'];
        }
        if (isset($map['file_key'])) {
            $model->fileKey = $map['file_key'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
