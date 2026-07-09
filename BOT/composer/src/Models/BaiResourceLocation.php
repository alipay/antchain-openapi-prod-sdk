<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BaiResourceLocation extends Model
{
    // 资源定位类型
    // HTTP_URL：资源url
    // STRING_BASE64：资源base64字符串（不带base64头部）
    /**
     * @example HTTP_URL, STRING_BASE64
     *
     * @var string
     */
    public $locationType;

    // 资源定位值
    /**
     * @example abc
     *
     * @var string
     */
    public $locationValue;
    protected $_name = [
        'locationType'  => 'location_type',
        'locationValue' => 'location_value',
    ];

    public function validate()
    {
        Model::validateRequired('locationType', $this->locationType, true);
        Model::validateRequired('locationValue', $this->locationValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->locationType) {
            $res['location_type'] = $this->locationType;
        }
        if (null !== $this->locationValue) {
            $res['location_value'] = $this->locationValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaiResourceLocation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['location_type'])) {
            $model->locationType = $map['location_type'];
        }
        if (isset($map['location_value'])) {
            $model->locationValue = $map['location_value'];
        }

        return $model;
    }
}
