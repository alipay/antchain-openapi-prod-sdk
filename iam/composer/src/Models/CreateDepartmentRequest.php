<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class CreateDepartmentRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 部门唯一码
    /**
     * @var string
     */
    public $code;

    // 部门名称
    /**
     * @var string
     */
    public $name;

    // 部门描述信息
    /**
     * @var string
     */
    public $description;

    // 父部门 code，如果需要创建根部门，需填：ROOT
    /**
     * @var string
     */
    public $parentCode;
    protected $_name = [
        'authToken'   => 'auth_token',
        'code'        => 'code',
        'name'        => 'name',
        'description' => 'description',
        'parentCode'  => 'parent_code',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('parentCode', $this->parentCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->parentCode) {
            $res['parent_code'] = $this->parentCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDepartmentRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['parent_code'])) {
            $model->parentCode = $map['parent_code'];
        }

        return $model;
    }
}
