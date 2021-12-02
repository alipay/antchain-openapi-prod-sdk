<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB\Models;

use AlibabaCloud\Tea\Model;

class SystemParam extends Model
{
    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // key
    /**
     * @example key
     *
     * @var string
     */
    public $key;

    // value_type
    /**
     * @example value_type
     *
     * @var string
     */
    public $valueType;

    // value_json
    /**
     * @example value_json
     *
     * @var string
     */
    public $valueJson;

    // group_name
    /**
     * @example group_name
     *
     * @var string
     */
    public $groupName;
    protected $_name = [
        'description' => 'description',
        'key'         => 'key',
        'valueType'   => 'value_type',
        'valueJson'   => 'value_json',
        'groupName'   => 'group_name',
    ];

    public function validate()
    {
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('valueType', $this->valueType, true);
        Model::validateRequired('valueJson', $this->valueJson, true);
        Model::validateRequired('groupName', $this->groupName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->valueType) {
            $res['value_type'] = $this->valueType;
        }
        if (null !== $this->valueJson) {
            $res['value_json'] = $this->valueJson;
        }
        if (null !== $this->groupName) {
            $res['group_name'] = $this->groupName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SystemParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['value_type'])) {
            $model->valueType = $map['value_type'];
        }
        if (isset($map['value_json'])) {
            $model->valueJson = $map['value_json'];
        }
        if (isset($map['group_name'])) {
            $model->groupName = $map['group_name'];
        }

        return $model;
    }
}
