<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class User extends Model {
    protected $_name = [
        'did' => 'did',
        'localId' => 'local_id',
        'pk' => 'pk',
        'tenantId' => 'tenant_id',
        'userId' => 'user_id',
        'vc' => 'vc',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->localId) {
            $res['local_id'] = $this->localId;
        }
        if (null !== $this->pk) {
            $res['pk'] = $this->pk;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->vc) {
            $res['vc'] = $this->vc;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return User
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['did'])){
            $model->did = $map['did'];
        }
        if(isset($map['local_id'])){
            $model->localId = $map['local_id'];
        }
        if(isset($map['pk'])){
            $model->pk = $map['pk'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['vc'])){
            $model->vc = $map['vc'];
        }
        return $model;
    }
    /**
     * @example did
     * @description 用户分布式身份ID
     * @var string
     */
    public $did;

    /**
     * @example user01
     * @description 用户的链外身份ID
     * @var string
     */
    public $localId;

    /**
     * @example 3280b948a7fa8525c0fbfd47d1df75d7a7ee9f3baedd6964565b42f461dd86732717c4bc4c8203ea2b9b1aeef7b148644babba3c0cd6927c4c0964919f590c6c
     * @description 用户公钥
     * @var string
     */
    public $pk;

    /**
     * @example GIUGUIYF
     * @description 租户ID
     * @var string
     */
    public $tenantId;

    /**
     * @example 331f9b0922f940f464d4b94b5628180408ac305b7fc72d3e40f5b7727d0702fb
     * @description 用户ID
     * @var string
     */
    public $userId;

    /**
     * @example vc
     * @description 用户VC
     * @var string
     */
    public $vc;

}
