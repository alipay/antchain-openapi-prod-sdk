<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class GetJusticeFileuploadurlResponse extends Model
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

    // 获取的文件key, 请妥善保存, 用于后续接口调用.
    /**
     * @var string
     */
    public $fileKey;

    // 文件上传链接url
    /**
     * @var string
     */
    public $uploadUrl;

    // 链接失效日期: "yyyy-MM-dd HH:mm:ss"
    /**
     * @var string
     */
    public $expiredTime;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'fileKey'     => 'file_key',
        'uploadUrl'   => 'upload_url',
        'expiredTime' => 'expired_time',
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
        if (null !== $this->fileKey) {
            $res['file_key'] = $this->fileKey;
        }
        if (null !== $this->uploadUrl) {
            $res['upload_url'] = $this->uploadUrl;
        }
        if (null !== $this->expiredTime) {
            $res['expired_time'] = $this->expiredTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetJusticeFileuploadurlResponse
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
        if (isset($map['file_key'])) {
            $model->fileKey = $map['file_key'];
        }
        if (isset($map['upload_url'])) {
            $model->uploadUrl = $map['upload_url'];
        }
        if (isset($map['expired_time'])) {
            $model->expiredTime = $map['expired_time'];
        }

        return $model;
    }
}
