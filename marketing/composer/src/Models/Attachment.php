<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class Attachment extends Model
{
    // 文件唯一标识，作为幂等字段
    /**
     * @example 10100000219487
     *
     * @var string
     */
    public $fileId;

    // 文件名称，用作展示
    /**
     * @example exmaple.pdf
     *
     * @var string
     */
    public $filename;

    // 访问地址
    /**
     * @example 文件链接
     *
     * @var string
     */
    public $url;
    protected $_name = [
        'fileId'   => 'file_id',
        'filename' => 'filename',
        'url'      => 'url',
    ];

    public function validate()
    {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('url', $this->url, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->filename) {
            $res['filename'] = $this->filename;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Attachment
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['filename'])) {
            $model->filename = $map['filename'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }

        return $model;
    }
}
