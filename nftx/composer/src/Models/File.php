<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class File extends Model
{
    // 文件的可访问路径
    /**
     * @example 文件的可访问路径
     *
     * @var string
     */
    public $path;

    // 文件名称
    /**
     * @example 文件名称
     *
     * @var string
     */
    public $name;

    // IMAGE("IMAGE","图片"),
    // VIDEO("VIDEO","视频"),
    // ;
    /**
     * @example 文件类型
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'path' => 'path',
        'name' => 'name',
        'type' => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('path', $this->path, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return File
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
