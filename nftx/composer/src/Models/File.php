<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class File extends Model
{
    // 原文件的可访问路径
    /**
     * @example 原文件的可访问路径
     *
     * @var string
     */
    public $originalFilePath;

    // 缩略图的可访问路径
    /**
     * @example 缩略图的可访问路径
     *
     * @var string
     */
    public $miniImagePath;

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
        'originalFilePath' => 'original_file_path',
        'miniImagePath'    => 'mini_image_path',
        'name'             => 'name',
        'type'             => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('originalFilePath', $this->originalFilePath, true);
        Model::validateRequired('miniImagePath', $this->miniImagePath, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->originalFilePath) {
            $res['original_file_path'] = $this->originalFilePath;
        }
        if (null !== $this->miniImagePath) {
            $res['mini_image_path'] = $this->miniImagePath;
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
        if (isset($map['original_file_path'])) {
            $model->originalFilePath = $map['original_file_path'];
        }
        if (isset($map['mini_image_path'])) {
            $model->miniImagePath = $map['mini_image_path'];
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
