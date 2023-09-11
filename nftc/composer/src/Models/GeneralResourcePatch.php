<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class GeneralResourcePatch extends Model
{
    // 差量包文件下载地址
    /**
     * @example https://download.address
     *
     * @var string
     */
    public $url;

    // 差量包的旧版本号
    /**
     * @example 1
     *
     * @var int
     */
    public $oldVersion;

    // md5摘要值
    /**
     * @example 9d5f26c7469ea9699a6e5f03ecfce24d
     *
     * @var string
     */
    public $md5;

    // 差量包文件大小
    /**
     * @example 123
     *
     * @var int
     */
    public $size;
    protected $_name = [
        'url'        => 'url',
        'oldVersion' => 'old_version',
        'md5'        => 'md5',
        'size'       => 'size',
    ];

    public function validate()
    {
        Model::validateRequired('url', $this->url, true);
        Model::validateRequired('oldVersion', $this->oldVersion, true);
        Model::validateRequired('md5', $this->md5, true);
        Model::validateRequired('size', $this->size, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        if (null !== $this->oldVersion) {
            $res['old_version'] = $this->oldVersion;
        }
        if (null !== $this->md5) {
            $res['md5'] = $this->md5;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GeneralResourcePatch
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }
        if (isset($map['old_version'])) {
            $model->oldVersion = $map['old_version'];
        }
        if (isset($map['md5'])) {
            $model->md5 = $map['md5'];
        }
        if (isset($map['size'])) {
            $model->size = $map['size'];
        }

        return $model;
    }
}
