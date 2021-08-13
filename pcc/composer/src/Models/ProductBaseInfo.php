<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class ProductBaseInfo extends Model
{
    // 产品码，系统内部识别
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

    // 产品短码，管理维度识别
    /**
     * @example IIFS
     *
     * @var string
     */
    public $shortCode;
    protected $_name = [
        'code'      => 'code',
        'name'      => 'name',
        'nameEn'    => 'name_en',
        'shortCode' => 'short_code',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('shortCode', $this->shortCode, true);
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
        if (null !== $this->shortCode) {
            $res['short_code'] = $this->shortCode;
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
        if (isset($map['short_code'])) {
            $model->shortCode = $map['short_code'];
        }

        return $model;
    }
}
