<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPCodeAdvertisingInfo extends Model
{
    // 资源位头图
    /**
     * @example 资源位头图
     *
     * @var string
     */
    public $adImage;

    // 资源位头图可直接访问的临时链接
    /**
     * @example http://xxx
     *
     * @var string
     */
    public $adImageTmp;

    // 资源位链接
    /**
     * @example 资源位链接
     *
     * @var string
     */
    public $adUrl;

    // 资源商品名称
    /**
     * @example 小龙坎火锅
     *
     * @var string
     */
    public $adName;

    // 广告位类型，为空时代表是商品广告位，Resource时代表是资源位
    /**
     * @example Resource
     *
     * @var string
     */
    public $adType;

    // 展示有效期开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $adValidBeginTime;

    // 展示有效期结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $adValidEndTime;
    protected $_name = [
        'adImage'          => 'ad_image',
        'adImageTmp'       => 'ad_image_tmp',
        'adUrl'            => 'ad_url',
        'adName'           => 'ad_name',
        'adType'           => 'ad_type',
        'adValidBeginTime' => 'ad_valid_begin_time',
        'adValidEndTime'   => 'ad_valid_end_time',
    ];

    public function validate()
    {
        Model::validatePattern('adValidBeginTime', $this->adValidBeginTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('adValidEndTime', $this->adValidEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->adImage) {
            $res['ad_image'] = $this->adImage;
        }
        if (null !== $this->adImageTmp) {
            $res['ad_image_tmp'] = $this->adImageTmp;
        }
        if (null !== $this->adUrl) {
            $res['ad_url'] = $this->adUrl;
        }
        if (null !== $this->adName) {
            $res['ad_name'] = $this->adName;
        }
        if (null !== $this->adType) {
            $res['ad_type'] = $this->adType;
        }
        if (null !== $this->adValidBeginTime) {
            $res['ad_valid_begin_time'] = $this->adValidBeginTime;
        }
        if (null !== $this->adValidEndTime) {
            $res['ad_valid_end_time'] = $this->adValidEndTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPCodeAdvertisingInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ad_image'])) {
            $model->adImage = $map['ad_image'];
        }
        if (isset($map['ad_image_tmp'])) {
            $model->adImageTmp = $map['ad_image_tmp'];
        }
        if (isset($map['ad_url'])) {
            $model->adUrl = $map['ad_url'];
        }
        if (isset($map['ad_name'])) {
            $model->adName = $map['ad_name'];
        }
        if (isset($map['ad_type'])) {
            $model->adType = $map['ad_type'];
        }
        if (isset($map['ad_valid_begin_time'])) {
            $model->adValidBeginTime = $map['ad_valid_begin_time'];
        }
        if (isset($map['ad_valid_end_time'])) {
            $model->adValidEndTime = $map['ad_valid_end_time'];
        }

        return $model;
    }
}
