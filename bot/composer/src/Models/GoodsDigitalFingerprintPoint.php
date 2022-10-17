<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class GoodsDigitalFingerprintPoint extends Model
{
    // 鉴定点子项
    /**
     * @example 正面
     *
     * @var string
     */
    public $subPointName;

    // 鉴定点图片url
    /**
     * @example 图片url
     *
     * @var string
     */
    public $imageUrl;
    protected $_name = [
        'subPointName' => 'sub_point_name',
        'imageUrl'     => 'image_url',
    ];

    public function validate()
    {
        Model::validateRequired('subPointName', $this->subPointName, true);
        Model::validateRequired('imageUrl', $this->imageUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->subPointName) {
            $res['sub_point_name'] = $this->subPointName;
        }
        if (null !== $this->imageUrl) {
            $res['image_url'] = $this->imageUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GoodsDigitalFingerprintPoint
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sub_point_name'])) {
            $model->subPointName = $map['sub_point_name'];
        }
        if (isset($map['image_url'])) {
            $model->imageUrl = $map['image_url'];
        }

        return $model;
    }
}
