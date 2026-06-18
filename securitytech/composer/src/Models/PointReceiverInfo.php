<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class PointReceiverInfo extends Model
{
    // 联系人名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $contactName;

    // 手机号
    /**
     * @example 13000000000
     *
     * @var string
     */
    public $mobile;

    // 收货地址
    /**
     * @example 上海市
     *
     * @var string
     */
    public $address;
    protected $_name = [
        'contactName' => 'contact_name',
        'mobile'      => 'mobile',
        'address'     => 'address',
    ];

    public function validate()
    {
        Model::validateRequired('contactName', $this->contactName, true);
        Model::validateRequired('mobile', $this->mobile, true);
        Model::validateRequired('address', $this->address, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contactName) {
            $res['contact_name'] = $this->contactName;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PointReceiverInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['contact_name'])) {
            $model->contactName = $map['contact_name'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }

        return $model;
    }
}
