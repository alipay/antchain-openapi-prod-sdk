<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class CreateOrganizationUserRequest extends Model {
    protected $_name = [
        'orgDid' => 'org_did',
        'personDid' => 'person_did',
        'uid' => 'uid',
    ];
    public function validate() {
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
        Model::validateMaxLength('personDid', $this->personDid, 128);
        Model::validateMaxLength('uid', $this->uid, 64);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->orgDid) {
            $res['org_did'] = $this->orgDid;
        }
        if (null !== $this->personDid) {
            $res['person_did'] = $this->personDid;
        }
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateOrganizationUserRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['org_did'])){
            $model->orgDid = $map['org_did'];
        }
        if(isset($map['person_did'])){
            $model->personDid = $map['person_did'];
        }
        if(isset($map['uid'])){
            $model->uid = $map['uid'];
        }
        return $model;
    }
    /**
     * @description 企业id
     * @example did:mychain:66530b21a9bee783234c442b653e909136629a5a3075be7b4d9ae085782e3d36 
     * @var string
     */
    public $orgDid;

    /**
     * @description 个人id
     * @example did:mychain:66530b21a9bee783234c442b653e909136629a5a3075be7b4d9ae085782e3d36 
     * @var string
     */
    public $personDid;

    /**
     * @description 机构内部用户工号
     * @example 00001
     * @var string
     */
    public $uid;

}
