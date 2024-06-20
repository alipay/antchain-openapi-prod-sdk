<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class YuqingMessageExtInfo extends Model
{
    // 媒体地域
    /**
     * @example 媒体地域-国家
     *
     * @var string
     */
    public $mediaAreaCountry;

    // 媒体地域省份
    /**
     * @example 北京
     *
     * @var string
     */
    public $mediaAreaProvince;

    // 媒体地域-市
    /**
     * @example 北京
     *
     * @var string
     */
    public $mediaAreaCity;

    // 内容风险
    /**
     * @example 内容风险
     *
     * @var string
     */
    public $generalModel;
    protected $_name = [
        'mediaAreaCountry'  => 'media_area_country',
        'mediaAreaProvince' => 'media_area_province',
        'mediaAreaCity'     => 'media_area_city',
        'generalModel'      => 'general_model',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->mediaAreaCountry) {
            $res['media_area_country'] = $this->mediaAreaCountry;
        }
        if (null !== $this->mediaAreaProvince) {
            $res['media_area_province'] = $this->mediaAreaProvince;
        }
        if (null !== $this->mediaAreaCity) {
            $res['media_area_city'] = $this->mediaAreaCity;
        }
        if (null !== $this->generalModel) {
            $res['general_model'] = $this->generalModel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return YuqingMessageExtInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['media_area_country'])) {
            $model->mediaAreaCountry = $map['media_area_country'];
        }
        if (isset($map['media_area_province'])) {
            $model->mediaAreaProvince = $map['media_area_province'];
        }
        if (isset($map['media_area_city'])) {
            $model->mediaAreaCity = $map['media_area_city'];
        }
        if (isset($map['general_model'])) {
            $model->generalModel = $map['general_model'];
        }

        return $model;
    }
}
