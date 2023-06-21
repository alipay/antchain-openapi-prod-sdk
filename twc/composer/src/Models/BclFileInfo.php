<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BclFileInfo extends Model
{
    // 文件名称 包含后缀
    /**
     * @example asasd物流.jpg
     *
     * @var string
     */
    public $fileName;

    // 文件下载链接
    /**
     * @example https://oss.com/asdqwe
     *
     * @var string
     */
    public $fileUrl;
    protected $_name = [
        'fileName' => 'file_name',
        'fileUrl'  => 'file_url',
    ];

    public function validate()
    {
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('fileUrl', $this->fileUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BclFileInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }

        return $model;
    }
}
