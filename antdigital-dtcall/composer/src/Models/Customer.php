<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTCALL\Models;

use AlibabaCloud\Tea\Model;

class Customer extends Model
{
    // 用户手机号
    /**
     * @example 0571****5678
     *
     * @var string
     */
    public $phoneNumber;

    // 用户业务 ID，回执中透出，需保证唯一
    /**
     * @example 12313156789654
     *
     * @var string
     */
    public $bizId;

    // 扩展业务字段，可用于变量参数和回执透出 json格式字符串
    /**
     * @example {"name":"张三"}
     *
     * @var string
     */
    public $bizProperties;
    protected $_name = [
        'phoneNumber'   => 'phone_number',
        'bizId'         => 'biz_id',
        'bizProperties' => 'biz_properties',
    ];

    public function validate()
    {
        Model::validateRequired('phoneNumber', $this->phoneNumber, true);
        Model::validateRequired('bizId', $this->bizId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->bizProperties) {
            $res['biz_properties'] = $this->bizProperties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Customer
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['biz_properties'])) {
            $model->bizProperties = $map['biz_properties'];
        }

        return $model;
    }
}
