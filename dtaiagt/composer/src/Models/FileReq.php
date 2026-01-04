<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class FileReq extends Model
{
    // 导入文件地址
    /**
     * @example null
     *
     * @var string
     */
    public $url;

    // 文件名称
    /**
     * @example 文件名称
     *
     * @var string
     */
    public $fileName;

    // 文件类型，不设置使用全局类型
    /**
     * @example pdf
     *
     * @var string
     */
    public $fileType;

    // 文件标签列表（用于AI参考）
    /**
     * @example
     *
     * @var string[]
     */
    public $tagList;
    protected $_name = [
        'url'      => 'url',
        'fileName' => 'file_name',
        'fileType' => 'file_type',
        'tagList'  => 'tag_list',
    ];

    public function validate()
    {
        Model::validateRequired('url', $this->url, true);
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('fileType', $this->fileType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->tagList) {
            $res['tag_list'] = $this->tagList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FileReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['tag_list'])) {
            if (!empty($map['tag_list'])) {
                $model->tagList = $map['tag_list'];
            }
        }

        return $model;
    }
}
