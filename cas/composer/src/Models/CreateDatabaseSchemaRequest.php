<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateDatabaseSchemaRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // char_set
    /**
     * @var string
     */
    public $charSet;

    // description
    /**
     * @var string
     */
    public $description;

    // grant_map
    /**
     * @var MapStringToStringEntity[]
     */
    public $grantMap;

    // 数据库id
    /**
     * @var string
     */
    public $id;

    // name
    /**
     * @var string
     */
    public $name;
    protected $_name = [
        'authToken'   => 'auth_token',
        'charSet'     => 'char_set',
        'description' => 'description',
        'grantMap'    => 'grant_map',
        'id'          => 'id',
        'name'        => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('charSet', $this->charSet, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->charSet) {
            $res['char_set'] = $this->charSet;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->grantMap) {
            $res['grant_map'] = [];
            if (null !== $this->grantMap && \is_array($this->grantMap)) {
                $n = 0;
                foreach ($this->grantMap as $item) {
                    $res['grant_map'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDatabaseSchemaRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['char_set'])) {
            $model->charSet = $map['char_set'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['grant_map'])) {
            if (!empty($map['grant_map'])) {
                $model->grantMap = [];
                $n               = 0;
                foreach ($map['grant_map'] as $item) {
                    $model->grantMap[$n++] = null !== $item ? MapStringToStringEntity::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
