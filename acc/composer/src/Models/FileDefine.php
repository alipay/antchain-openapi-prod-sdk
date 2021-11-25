<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class FileDefine extends Model
{
    // 调用方设定，保证文件唯一性。
    //
    //
    /**
     * @example 调用方设定，保证文件唯一性。
     *
     * @var string
     */
    public $bizId;

    // 文件名称
    /**
     * @example 文件名称
     *
     * @var string
     */
    public $fileName;

    // 文件大小
    /**
     * @example 文件大小
     *
     * @var int
     */
    public $size;

    // 文件key
    /**
     * @example 文件key
     *
     * @var string
     */
    public $osskey;

    // 文件类型
    /**
     * @example 文件类型
     *
     * @var string
     */
    public $type;

    // 预览链接
    /**
     * @example 预览链接
     *
     * @var string
     */
    public $url;
    protected $_name = [
        'bizId'    => 'biz_id',
        'fileName' => 'file_name',
        'size'     => 'size',
        'osskey'   => 'osskey',
        'type'     => 'type',
        'url'      => 'url',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('osskey', $this->osskey, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }
        if (null !== $this->osskey) {
            $res['osskey'] = $this->osskey;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FileDefine
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['size'])) {
            $model->size = $map['size'];
        }
        if (isset($map['osskey'])) {
            $model->osskey = $map['osskey'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }

        return $model;
    }
}
