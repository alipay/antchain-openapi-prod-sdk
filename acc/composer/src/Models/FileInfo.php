<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class FileInfo extends Model
{
    // 业务id
    /**
     * @example id
     *
     * @var string
     */
    public $bizId;

    // 财报文件，base64
    /**
     * @example file
     *
     * @var string
     */
    public $fileStr;

    // 文件名称（企业财报.jpg）
    /**
     * @example name
     *
     * @var string
     */
    public $fileName;

    // 文件大小(byte长度)
    /**
     * @example 100
     *
     * @var int
     */
    public $fileSize;

    // 文件类型(jpg)
    /**
     * @example jpg
     *
     * @var string
     */
    public $fileType;
    protected $_name = [
        'bizId'    => 'biz_id',
        'fileStr'  => 'file_str',
        'fileName' => 'file_name',
        'fileSize' => 'file_size',
        'fileType' => 'file_type',
    ];

    public function validate()
    {
        Model::validateRequired('fileStr', $this->fileStr, true);
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('fileSize', $this->fileSize, true);
        Model::validateRequired('fileType', $this->fileType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->fileStr) {
            $res['file_str'] = $this->fileStr;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FileInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['file_str'])) {
            $model->fileStr = $map['file_str'];
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

        return $model;
    }
}
