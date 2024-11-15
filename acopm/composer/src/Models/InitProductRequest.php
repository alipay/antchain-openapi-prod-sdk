<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class InitProductRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 产品码
    /**
     * @var string
     */
    public $prodCode;

    // 品牌名
    /**
     * @var string
     */
    public $firstName;

    // 产品标识
    /**
     * @var string
     */
    public $secondName;

    // api类型，tr或http(不区分大小写)
    /**
     * @var string
     */
    public $type;
    protected $_name = [
        'authToken'  => 'auth_token',
        'prodCode'   => 'prod_code',
        'firstName'  => 'first_name',
        'secondName' => 'second_name',
        'type'       => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('prodCode', $this->prodCode, true);
        Model::validateRequired('firstName', $this->firstName, true);
        Model::validateRequired('secondName', $this->secondName, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->prodCode) {
            $res['prod_code'] = $this->prodCode;
        }
        if (null !== $this->firstName) {
            $res['first_name'] = $this->firstName;
        }
        if (null !== $this->secondName) {
            $res['second_name'] = $this->secondName;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitProductRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['prod_code'])) {
            $model->prodCode = $map['prod_code'];
        }
        if (isset($map['first_name'])) {
            $model->firstName = $map['first_name'];
        }
        if (isset($map['second_name'])) {
            $model->secondName = $map['second_name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
