<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class VipType extends Model
{
    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // vip_address_type
    /**
     * @example vip_address_type
     *
     * @var string
     */
    public $vipAddressType;

    // vip_type
    /**
     * @example vip_type
     *
     * @var string
     */
    public $vipType;
    protected $_name = [
        'name'           => 'name',
        'vipAddressType' => 'vip_address_type',
        'vipType'        => 'vip_type',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('vipAddressType', $this->vipAddressType, true);
        Model::validateRequired('vipType', $this->vipType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->vipAddressType) {
            $res['vip_address_type'] = $this->vipAddressType;
        }
        if (null !== $this->vipType) {
            $res['vip_type'] = $this->vipType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VipType
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['vip_address_type'])) {
            $model->vipAddressType = $map['vip_address_type'];
        }
        if (isset($map['vip_type'])) {
            $model->vipType = $map['vip_type'];
        }

        return $model;
    }
}
