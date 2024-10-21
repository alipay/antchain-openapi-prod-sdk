<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class UserInfo extends Model
{
    // 钱包地址
    /**
     * @example 0x111111111
     *
     * @var string
     */
    public $address;
    protected $_name = [
        'address' => 'address',
    ];

    public function validate()
    {
        Model::validateRequired('address', $this->address, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }

        return $model;
    }
}
