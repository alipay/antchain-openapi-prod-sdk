<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class ProductBaseInfo extends Model
{
    // 产品码
    /**
     * @example IIFS
     *
     * @var string
     */
    public $code;

    // 产品名称
    /**
     * @example 票聚链-普惠金融服务
     *
     * @var string
     */
    public $name;

    // 产品英文名称
    /**
     * @example invoichain-finance
     *
     * @var string
     */
    public $nameEn;
    protected $_name = [
        'code'   => 'code',
        'name'   => 'name',
        'nameEn' => 'name_en',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->nameEn) {
            $res['name_en'] = $this->nameEn;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductBaseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['name_en'])) {
            $model->nameEn = $map['name_en'];
        }

        return $model;
    }
}
