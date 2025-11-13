<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class ProductSpecValue extends Model
{
    // 规格值
    /**
     * @example 123
     *
     * @var string
     */
    public $specValue;

    // 规格图片key
    /**
     * @example /merchant/key
     *
     * @var string
     */
    public $imageFileKey;

    // 规格图片http链接
    /**
     * @example http://merchant/key
     *
     * @var string
     */
    public $largeImageFileKey;
    protected $_name = [
        'specValue'         => 'spec_value',
        'imageFileKey'      => 'image_file_key',
        'largeImageFileKey' => 'large_image_file_key',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->specValue) {
            $res['spec_value'] = $this->specValue;
        }
        if (null !== $this->imageFileKey) {
            $res['image_file_key'] = $this->imageFileKey;
        }
        if (null !== $this->largeImageFileKey) {
            $res['large_image_file_key'] = $this->largeImageFileKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductSpecValue
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['spec_value'])) {
            $model->specValue = $map['spec_value'];
        }
        if (isset($map['image_file_key'])) {
            $model->imageFileKey = $map['image_file_key'];
        }
        if (isset($map['large_image_file_key'])) {
            $model->largeImageFileKey = $map['large_image_file_key'];
        }

        return $model;
    }
}
