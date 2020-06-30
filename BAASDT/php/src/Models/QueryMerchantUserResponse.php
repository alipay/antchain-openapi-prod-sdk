<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryMerchantUserResponse extends Model {
    protected $_name = [
        'user' => 'user',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->user) {
            $res['user'] = null !== $this->user ? $this->user->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMerchantUserResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['user'])){
            $model->user = User::fromMap($map['user']);
        }
        return $model;
    }
    /**
     * @description 用户完整信息
{
            "tenant_id": "ZKUA",
            "user_id": "331f9b0922f940f464d4b94b5628180408ac305b7fc72d3e40f5b7727d0702fb",
            "local_id": "user01",
            "did": "",
            "vc": "",
            "pk": "3280b948a7fa8525c0fbfd47d1df75d7a7ee9f3baedd6964565b42f461dd86732717c4bc4c8203ea2b9b1aeef7b148644babba3c0cd6927c4c0964919f590c6c"
        }

     * @example 
     * @var User
     */
    public $user;

}
