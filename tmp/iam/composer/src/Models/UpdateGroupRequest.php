<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class UpdateGroupRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 成员组ID
    /**
     * @var string
     */
    public $groupId;

    // 名称
    /**
     * @var string
     */
    public $name;

    // 描述
    /**
     * @var string
     */
    public $description;
    protected $_name = [
        'authToken'   => 'auth_token',
        'groupId'     => 'group_id',
        'name'        => 'name',
        'description' => 'description',
    ];

    public function validate()
    {
        Model::validateRequired('groupId', $this->groupId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateGroupRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }

        return $model;
    }
}
