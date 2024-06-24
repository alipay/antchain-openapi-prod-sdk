<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class FileInfo extends Model
{
    // 文件名称
    /**
     * @example asasd.jpg
     *
     * @var string
     */
    public $fileName;

    // 文件key
    /**
     * @example adadqweqw12sads1
     *
     * @var string
     */
    public $fileKey;
    protected $_name = [
        'fileName' => 'file_name',
        'fileKey'  => 'file_key',
    ];

    public function validate()
    {
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('fileKey', $this->fileKey, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileKey) {
            $res['file_key'] = $this->fileKey;
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
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_key'])) {
            $model->fileKey = $map['file_key'];
        }

        return $model;
    }
}
