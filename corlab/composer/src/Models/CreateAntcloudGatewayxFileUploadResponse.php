<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CORLAB\Models;

use AlibabaCloud\Tea\Model;

class CreateAntcloudGatewayxFileUploadResponse extends Model
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

    // 上传有效期
    /**
     * @var string
     */
    public $expiredTime;

    // 32位文件唯一id
    /**
     * @var string
     */
    public $fileId;

    // 放入http请求头里
    /**
     * @var XNameValuePair[]
     */
    public $uploadHeaders;

    // 文件上传地址
    /**
     * @var string
     */
    public $uploadUrl;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'expiredTime'   => 'expired_time',
        'fileId'        => 'file_id',
        'uploadHeaders' => 'upload_headers',
        'uploadUrl'     => 'upload_url',
    ];

    public function validate()
    {
        Model::validatePattern('expiredTime', $this->expiredTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->expiredTime) {
            $res['expired_time'] = $this->expiredTime;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->uploadHeaders) {
            $res['upload_headers'] = [];
            if (null !== $this->uploadHeaders && \is_array($this->uploadHeaders)) {
                $n = 0;
                foreach ($this->uploadHeaders as $item) {
                    $res['upload_headers'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->uploadUrl) {
            $res['upload_url'] = $this->uploadUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAntcloudGatewayxFileUploadResponse
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
        if (isset($map['expired_time'])) {
            $model->expiredTime = $map['expired_time'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['upload_headers'])) {
            if (!empty($map['upload_headers'])) {
                $model->uploadHeaders = [];
                $n                    = 0;
                foreach ($map['upload_headers'] as $item) {
                    $model->uploadHeaders[$n++] = null !== $item ? XNameValuePair::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['upload_url'])) {
            $model->uploadUrl = $map['upload_url'];
        }

        return $model;
    }
}
