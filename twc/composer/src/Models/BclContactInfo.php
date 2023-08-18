<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BclContactInfo extends Model
{
    // 联系人名称，最大长度：128
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 联系人手机号
    // 最大长度：20
    // 示例：13812348888
    /**
     * @example 138xxxx8888
     *
     * @var string
     */
    public $mobile;

    // 联系人电话
    // 最大长度：20
    // 示例：0571-12345678
    /**
     * @example 0571-12345678
     *
     * @var string
     */
    public $phone;
    protected $_name = [
        'name'   => 'name',
        'mobile' => 'mobile',
        'phone'  => 'phone',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('mobile', $this->mobile, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BclContactInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }

        return $model;
    }
}
