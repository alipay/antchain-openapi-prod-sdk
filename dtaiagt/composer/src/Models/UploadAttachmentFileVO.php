<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class UploadAttachmentFileVO extends Model
{
    // 上传结果
    //
    /**
     * @example success
     *
     * @var string
     */
    public $uploadStatus;

    // 文件URL
    /**
     * @example fileUrl
     *
     * @var string
     */
    public $fileUrl;

    // file_id
    /**
     * @example 1
     *
     * @var string
     */
    public $fileId;

    // 文件类型
    /**
     * @example fileType
     *
     * @var string
     */
    public $fileType;

    // 文件名
    /**
     * @example fileName
     *
     * @var string
     */
    public $fileName;

    // 附件大小
    //
    /**
     * @example 123
     *
     * @var int
     */
    public $fileSize;

    // 内容库 ID（用于检索）
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $contentId;

    // 错误信息
    //
    /**
     * @example "上传失败"
     *
     * @var string
     */
    public $errorMessage;
    protected $_name = [
        'uploadStatus' => 'upload_status',
        'fileUrl'      => 'file_url',
        'fileId'       => 'file_id',
        'fileType'     => 'file_type',
        'fileName'     => 'file_name',
        'fileSize'     => 'file_size',
        'contentId'    => 'content_id',
        'errorMessage' => 'error_message',
    ];

    public function validate()
    {
        Model::validateRequired('uploadStatus', $this->uploadStatus, true);
        Model::validateRequired('fileUrl', $this->fileUrl, true);
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('fileSize', $this->fileSize, true);
        Model::validateRequired('contentId', $this->contentId, true);
        Model::validateRequired('errorMessage', $this->errorMessage, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->uploadStatus) {
            $res['upload_status'] = $this->uploadStatus;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileSize) {
            $res['file_size'] = $this->fileSize;
        }
        if (null !== $this->contentId) {
            $res['content_id'] = $this->contentId;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadAttachmentFileVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['upload_status'])) {
            $model->uploadStatus = $map['upload_status'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_size'])) {
            $model->fileSize = $map['file_size'];
        }
        if (isset($map['content_id'])) {
            $model->contentId = $map['content_id'];
        }
        if (isset($map['error_message'])) {
            $model->errorMessage = $map['error_message'];
        }

        return $model;
    }
}
