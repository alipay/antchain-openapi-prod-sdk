<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ContainsImageInfo extends Model
{
    // 是否包含图片
    /**
     * @example true
     *
     * @var bool
     */
    public $containsImage;

    // 包含图片，处理后的图片副件
    /**
     * @example 图片链接
     *
     * @var string
     */
    public $resolvedFileUrl;
    protected $_name = [
        'containsImage'   => 'contains_image',
        'resolvedFileUrl' => 'resolved_file_url',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->containsImage) {
            $res['contains_image'] = $this->containsImage;
        }
        if (null !== $this->resolvedFileUrl) {
            $res['resolved_file_url'] = $this->resolvedFileUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainsImageInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['contains_image'])) {
            $model->containsImage = $map['contains_image'];
        }
        if (isset($map['resolved_file_url'])) {
            $model->resolvedFileUrl = $map['resolved_file_url'];
        }

        return $model;
    }
}
