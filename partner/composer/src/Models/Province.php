<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class Province extends Model
{
    // 省份名称
    /**
     * @example 浙江省
     *
     * @var string
     */
    public $provinceName;
    protected $_name = [
        'provinceName' => 'province_name',
    ];

    public function validate()
    {
        Model::validateRequired('provinceName', $this->provinceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->provinceName) {
            $res['province_name'] = $this->provinceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Province
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['province_name'])) {
            $model->provinceName = $map['province_name'];
        }

        return $model;
    }
}
