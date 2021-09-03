<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DONPA\Models;

use AlibabaCloud\Tea\Model;

class PersonData extends Model
{
    // 姓名
    /**
     * @example 刘猫本
     *
     * @var string
     */
    public $userName;

    // 待修复 sha256 加密身份证号
    /**
     * @example 384a3bdc4347348b9cfd74eb33a3daa43054f461a0e5ad01a97f912eaa6799ef
     *
     * @var string
     */
    public $idCard;

    // 手机号
    /**
     * @example 13718750000
     *
     * @var string
     */
    public $phone;
    protected $_name = [
        'userName' => 'user_name',
        'idCard'   => 'id_card',
        'phone'    => 'phone',
    ];

    public function validate()
    {
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('idCard', $this->idCard, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->idCard) {
            $res['id_card'] = $this->idCard;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PersonData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['id_card'])) {
            $model->idCard = $map['id_card'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }

        return $model;
    }
}
