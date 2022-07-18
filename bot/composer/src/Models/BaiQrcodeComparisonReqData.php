<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BaiQrcodeComparisonReqData extends Model
{
    // 扫码操作id，多次请求的trace_id相同代表短时间内在扫同一个码
    /**
     * @example trace_id_001
     *
     * @var string
     */
    public $traceId;

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
        'traceId'              => 'trace_id',
        'queryImageLocation'   => 'query_image_location',
        'galleryImageLocation' => 'gallery_image_location',
        'downgrade'            => 'downgrade',
    ];

    public function validate()
    {
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('queryImageLocation', $this->queryImageLocation, true);
        Model::validateRequired('galleryImageLocation', $this->galleryImageLocation, true);
        Model::validateRequired('downgrade', $this->downgrade, true);
        Model::validateMaxLength('traceId', $this->traceId, 128);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
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
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
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
