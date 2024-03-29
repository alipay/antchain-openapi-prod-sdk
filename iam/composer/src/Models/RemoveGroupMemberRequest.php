<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class RemoveGroupMemberRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 成员组ID
    /**
     * @var string
     */
    public $groupId;

    // 操作员ID
    /**
     * @var string[]
     */
    public $operatorIds;
    protected $_name = [
        'authToken'   => 'auth_token',
        'groupId'     => 'group_id',
        'operatorIds' => 'operator_ids',
    ];

    public function validate()
    {
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('operatorIds', $this->operatorIds, true);
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
        if (null !== $this->operatorIds) {
            $res['operator_ids'] = $this->operatorIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RemoveGroupMemberRequest
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
        if (isset($map['operator_ids'])) {
            if (!empty($map['operator_ids'])) {
                $model->operatorIds = $map['operator_ids'];
            }
        }

        return $model;
    }
}
