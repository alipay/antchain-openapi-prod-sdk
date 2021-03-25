<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPContactInfo extends Model
{
    // 联系人姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 联系人手机号码
    /**
     * @example 1388888888
     *
     * @var string
     */
    public $mobile;

    // 联系人电话号码
    /**
     * @example 0551-12345678
     *
     * @var string
     */
    public $phone;

    // 联系人类型, 1-法人；2-实际控制人；3-代理人；4-其他
    /**
     * @example 1
     *
     * @var int
     */
    public $type;
    protected $_name = [
        'name'   => 'name',
        'mobile' => 'mobile',
        'phone'  => 'phone',
        'type'   => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
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
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPContactInfo
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
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
