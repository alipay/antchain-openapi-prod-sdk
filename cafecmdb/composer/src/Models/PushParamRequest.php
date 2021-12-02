<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB\Models;

use AlibabaCloud\Tea\Model;

class PushParamRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 更新的键值
    /**
     * @var string
     */
    public $key;

    // 由于OP不支持MAP，需要使用json字符串
    /**
     * @var string
     */
    public $valueJson;

    // description
    /**
     * @var string
     */
    public $description;

    // value_type
    /**
     * @var string
     */
    public $valueType;

    // 参数分组
    /**
     * @var string
     */
    public $groupName;
    protected $_name = [
        'authToken'   => 'auth_token',
        'key'         => 'key',
        'valueJson'   => 'value_json',
        'description' => 'description',
        'valueType'   => 'value_type',
        'groupName'   => 'group_name',
    ];

    public function validate()
    {
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('valueJson', $this->valueJson, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('valueType', $this->valueType, true);
        Model::validateRequired('groupName', $this->groupName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->valueJson) {
            $res['value_json'] = $this->valueJson;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->valueType) {
            $res['value_type'] = $this->valueType;
        }
        if (null !== $this->groupName) {
            $res['group_name'] = $this->groupName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushParamRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['value_json'])) {
            $model->valueJson = $map['value_json'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['value_type'])) {
            $model->valueType = $map['value_type'];
        }
        if (isset($map['group_name'])) {
            $model->groupName = $map['group_name'];
        }

        return $model;
    }
}
