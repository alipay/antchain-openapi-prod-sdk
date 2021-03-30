<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateDocumentFileRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 原文件md5
    /**
     * @var string
     */
    public $fileMd5;

    // 文件名称
    /**
     * @var string
     */
    public $fileName;

    // 原文件大小
    /**
     * @var int
     */
    public $fileSize;

    // 文件类型【CONTRACT 合同, NOTE 票据, DOCUMENT 文件, UNKNOWN 未知】
    /**
     * @var string
     */
    public $fileType;

    // 原文件url
    /**
     * @var string
     */
    public $fileUrl;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileMd5'           => 'file_md5',
        'fileName'          => 'file_name',
        'fileSize'          => 'file_size',
        'fileType'          => 'file_type',
        'fileUrl'           => 'file_url',
    ];

    public function validate()
    {
        Model::validateRequired('fileMd5', $this->fileMd5, true);
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('fileSize', $this->fileSize, true);
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('fileUrl', $this->fileUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->fileMd5) {
            $res['file_md5'] = $this->fileMd5;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileSize) {
            $res['file_size'] = $this->fileSize;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDocumentFileRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['file_md5'])) {
            $model->fileMd5 = $map['file_md5'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_size'])) {
            $model->fileSize = $map['file_size'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }

        return $model;
    }
}
