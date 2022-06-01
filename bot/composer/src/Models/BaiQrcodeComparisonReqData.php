<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BaiQrcodeComparisonReqData extends Model
{
    // query图片定位信息
    /**
     * @example
     *
     * @var BaiResourceLocation
     */
    public $queryImageLocation;

    // gallery图片定位信息
    /**
     * @example
     *
     * @var BaiResourceLocation
     */
    public $galleryImageLocation;

    // 是否允许降级
    /**
     * @example true, false
     *
     * @var bool
     */
    public $downgrade;
    protected $_name = [
        'queryImageLocation'   => 'query_image_location',
        'galleryImageLocation' => 'gallery_image_location',
        'downgrade'            => 'downgrade',
    ];

    public function validate()
    {
        Model::validateRequired('queryImageLocation', $this->queryImageLocation, true);
        Model::validateRequired('galleryImageLocation', $this->galleryImageLocation, true);
        Model::validateRequired('downgrade', $this->downgrade, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->queryImageLocation) {
            $res['query_image_location'] = null !== $this->queryImageLocation ? $this->queryImageLocation->toMap() : null;
        }
        if (null !== $this->galleryImageLocation) {
            $res['gallery_image_location'] = null !== $this->galleryImageLocation ? $this->galleryImageLocation->toMap() : null;
        }
        if (null !== $this->downgrade) {
            $res['downgrade'] = $this->downgrade;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaiQrcodeComparisonReqData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['query_image_location'])) {
            $model->queryImageLocation = BaiResourceLocation::fromMap($map['query_image_location']);
        }
        if (isset($map['gallery_image_location'])) {
            $model->galleryImageLocation = BaiResourceLocation::fromMap($map['gallery_image_location']);
        }
        if (isset($map['downgrade'])) {
            $model->downgrade = $map['downgrade'];
        }

        return $model;
    }
}
