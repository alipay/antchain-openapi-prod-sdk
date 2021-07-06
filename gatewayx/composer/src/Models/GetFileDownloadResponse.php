<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GATEWAYX\Models;

use AlibabaCloud\Tea\Model;

class GetFileDownloadResponse extends Model
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

    // 创建文件使用的apiCode
    /**
     * @var string
     */
    public $apiCode;

    // 文件下载地址
    /**
     * @var string
     */
    public $downloadUrl;

    // 下载超时时间
    /**
     * @var string
     */
    public $expiredTime;

    // 文件标签
    /**
     * @var string
     */
    public $fileLabel;

    // 请求上传时的自定义元数据
    /**
     * @var string
     */
    public $fileMetadata;

    // 文件名
    /**
     * @var string
     */
    public $fileName;

    // 文件路径
    /**
     * @var string
     */
    public $filePath;

    // 文件大小
    /**
     * @var int
     */
    public $fileSize;

    // 上传的调用者信息
    /**
     * @var XInvokerInfo
     */
    public $uploadInvoker;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'apiCode'       => 'api_code',
        'downloadUrl'   => 'download_url',
        'expiredTime'   => 'expired_time',
        'fileLabel'     => 'file_label',
        'fileMetadata'  => 'file_metadata',
        'fileName'      => 'file_name',
        'filePath'      => 'file_path',
        'fileSize'      => 'file_size',
        'uploadInvoker' => 'upload_invoker',
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
        if (null !== $this->apiCode) {
            $res['api_code'] = $this->apiCode;
        }
        if (null !== $this->downloadUrl) {
            $res['download_url'] = $this->downloadUrl;
        }
        if (null !== $this->expiredTime) {
            $res['expired_time'] = $this->expiredTime;
        }
        if (null !== $this->fileLabel) {
            $res['file_label'] = $this->fileLabel;
        }
        if (null !== $this->fileMetadata) {
            $res['file_metadata'] = $this->fileMetadata;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->filePath) {
            $res['file_path'] = $this->filePath;
        }
        if (null !== $this->fileSize) {
            $res['file_size'] = $this->fileSize;
        }
        if (null !== $this->uploadInvoker) {
            $res['upload_invoker'] = null !== $this->uploadInvoker ? $this->uploadInvoker->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetFileDownloadResponse
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
        if (isset($map['api_code'])) {
            $model->apiCode = $map['api_code'];
        }
        if (isset($map['download_url'])) {
            $model->downloadUrl = $map['download_url'];
        }
        if (isset($map['expired_time'])) {
            $model->expiredTime = $map['expired_time'];
        }
        if (isset($map['file_label'])) {
            $model->fileLabel = $map['file_label'];
        }
        if (isset($map['file_metadata'])) {
            $model->fileMetadata = $map['file_metadata'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_path'])) {
            $model->filePath = $map['file_path'];
        }
        if (isset($map['file_size'])) {
            $model->fileSize = $map['file_size'];
        }
        if (isset($map['upload_invoker'])) {
            $model->uploadInvoker = XInvokerInfo::fromMap($map['upload_invoker']);
        }

        return $model;
    }
}
