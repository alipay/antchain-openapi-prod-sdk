<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class ProductInfo extends Model
{
    // 产品码
    /**
     * @example YUNQING
     *
     * @var string
     */
    public $prodCode;

    // sdk版本号
    /**
     * @example 1.1.3
     *
     * @var string
     */
    public $sdkVersion;
    protected $_name = [
        'prodCode'   => 'prod_code',
        'sdkVersion' => 'sdk_version',
    ];

    public function validate()
    {
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('sdkVersion', $this->sdkVersion, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->sdkVersion) {
            $res['sdk_version'] = $this->sdkVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['sdk_version'])) {
            $model->sdkVersion = $map['sdk_version'];
        }

        return $model;
    }
}
