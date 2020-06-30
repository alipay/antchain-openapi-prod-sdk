<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class CreateOrganizationUserResponse extends Model {
    protected $_name = [
        'orgUserId' => 'org_user_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->orgUserId) {
            $res['org_user_id'] = $this->orgUserId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateOrganizationUserResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['org_user_id'])){
            $model->orgUserId = $map['org_user_id'];
        }
        return $model;
    }
    /**
     * @description 机构内用户id
     * @example 00001
     * @var string
     */
    public $orgUserId;

}
