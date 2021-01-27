<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class GetGroupRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'groupId' => 'group_id',
    ];
    public function validate() {
        Model::validateRequired('groupId', $this->groupId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetGroupRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['group_id'])){
            $model->groupId = $map['group_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 成员组ID
    /**
     * @var string
     */
    public $groupId;

}
