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
    protected $_name = [
        'adImage' => 'ad_image',
        'adUrl'   => 'ad_url',
        'adName'  => 'ad_name',
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
        if (null !== $this->adUrl) {
            $res['ad_url'] = $this->adUrl;
        }
        if (null !== $this->adName) {
            $res['ad_name'] = $this->adName;
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
        if (isset($map['ad_url'])) {
            $model->adUrl = $map['ad_url'];
        }
        if (isset($map['ad_name'])) {
            $model->adName = $map['ad_name'];
        }

        return $model;
    }
}
