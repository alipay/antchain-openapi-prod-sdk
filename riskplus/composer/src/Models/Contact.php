<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class Contact extends Model
{
    // 联系人类型
    // 1配偶
    // 2父母
    // 3子女
    // 4兄弟
    // 5姐妹
    // 6朋友
    // 7其他
    /**
     * @example 1
     *
     * @var string
     */
    public $kind;

    // 联系人姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 联系人手机号
    /**
     * @example 12345
     *
     * @var string
     */
    public $mobile;
    protected $_name = [
        'kind'   => 'kind',
        'name'   => 'name',
        'mobile' => 'mobile',
    ];

    public function validate()
    {
        Model::validateRequired('kind', $this->kind, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('mobile', $this->mobile, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->kind) {
            $res['kind'] = $this->kind;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Contact
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['kind'])) {
            $model->kind = $map['kind'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }

        return $model;
    }
}
