<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class CaSignFileRequest extends Model
{
    // 文件名称
    /**
     * @example xxx合同协议
     *
     * @var string
     */
    public $fileName;

    // 文件id,映射唯一的文件。多文件签署场景下，fileId必须唯一且和文件一一对应
    /**
     * @example F1232434
     *
     * @var string
     */
    public $fileId;
    protected $_name = [
        'fileName' => 'file_name',
        'fileId'   => 'file_id',
    ];

    public function validate()
    {
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('fileId', $this->fileId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CaSignFileRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }

        return $model;
    }
}
