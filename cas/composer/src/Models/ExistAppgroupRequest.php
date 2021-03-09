<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ExistAppgroupRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // name
    /**
     * @var string
     */
    public $name;

    // parentId
    /**
     * @var string
     */
    public $parentId;
    protected $_name = [
        'authToken' => 'auth_token',
        'name'      => 'name',
        'parentId'  => 'parent_id',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExistAppgroupRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['parent_id'])) {
            $model->parentId = $map['parent_id'];
        }

        return $model;
    }
}
