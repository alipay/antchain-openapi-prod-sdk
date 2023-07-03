<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class JtMedia extends Model
{
    // 多媒体ID
    /**
     * @example 123
     *
     * @var string
     */
    public $mediaId;

    // 文件名称
    /**
     * @example xxxx.jpg
     *
     * @var string
     */
    public $name;

    // 可访问的url
    /**
     * @example https://oss.com/53/85855.jpg?sign=xxx
     *
     * @var string
     */
    public $url;

    // 上传时间
    /**
     * @example 1687859592688
     *
     * @var int
     */
    public $gmtCreate;

    // 多媒体类型枚举：IMAGE 图像；AUDIO 音频；VIDEO视频； UN_KNOW  未知；
    /**
     * @example IMAGE
     *
     * @var string
     */
    public $mediaType;
    protected $_name = [
        'mediaId'   => 'media_id',
        'name'      => 'name',
        'url'       => 'url',
        'gmtCreate' => 'gmt_create',
        'mediaType' => 'media_type',
    ];

    public function validate()
    {
        Model::validateRequired('mediaId', $this->mediaId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('url', $this->url, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('mediaType', $this->mediaType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->mediaId) {
            $res['media_id'] = $this->mediaId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->mediaType) {
            $res['media_type'] = $this->mediaType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JtMedia
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['media_id'])) {
            $model->mediaId = $map['media_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['media_type'])) {
            $model->mediaType = $map['media_type'];
        }

        return $model;
    }
}
