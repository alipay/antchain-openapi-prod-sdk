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
    protected $_name = [
        'adImage'    => 'ad_image',
        'adImageTmp' => 'ad_image_tmp',
        'adUrl'      => 'ad_url',
        'adName'     => 'ad_name',
        'adType'     => 'ad_type',
    ];

    public function validate()
    {
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

        return $model;
    }
}
