<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class ProductInfo extends Model
{
    // 能源类型
    /**
     * @example xxxx
     *
     * @var string
     */
    public $fueltype;

    // 车型名称
    /**
     * @example xxxx
     *
     * @var string
     */
    public $name;

    // 车型id
    /**
     * @example xxxx
     *
     * @var string
     */
    public $id;
    protected $_name = [
        'fueltype' => 'fueltype',
        'name'     => 'name',
        'id'       => 'id',
    ];

    public function validate()
    {
        Model::validateRequired('fueltype', $this->fueltype, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fueltype) {
            $res['fueltype'] = $this->fueltype;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
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
        if (isset($map['fueltype'])) {
            $model->fueltype = $map['fueltype'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }

        return $model;
    }
}
