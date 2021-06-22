<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class FileInfo extends Model
{
    // 文件key
    /**
     * @example 4293ed08-3576-4f35-a65d-0d63ae8c0e8b.jpg
     *
     * @var string
     */
    public $fileKey;

    // 文件名称
    /**
     * @example userInfo.jpg
     *
     * @var string
     */
    public $fileName;
    protected $_name = [
        'fileKey'  => 'file_key',
        'fileName' => 'file_name',
    ];

    public function validate()
    {
        Model::validateRequired('fileKey', $this->fileKey, true);
        Model::validateRequired('fileName', $this->fileName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileKey) {
            $res['file_key'] = $this->fileKey;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
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
        if (isset($map['file_key'])) {
            $model->fileKey = $map['file_key'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }

        return $model;
    }
}
