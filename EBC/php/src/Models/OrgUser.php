<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class OrgUser extends Model {
    protected $_name = [
        'orgDid' => 'org_did',
        'orgUserId' => 'org_user_id',
        'personDid' => 'person_did',
        'uid' => 'uid',
    ];
    public function validate() {
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
        Model::validateMaxLength('orgUserId', $this->orgUserId, 128);
        Model::validateMaxLength('personDid', $this->personDid, 128);
        Model::validateMaxLength('uid', $this->uid, 64);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->orgDid) {
            $res['org_did'] = $this->orgDid;
        }
        if (null !== $this->orgUserId) {
            $res['org_user_id'] = $this->orgUserId;
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
     * @return OrgUser
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['org_did'])){
            $model->orgDid = $map['org_did'];
        }
        if(isset($map['org_user_id'])){
            $model->orgUserId = $map['org_user_id'];
        }
        if(isset($map['person_did'])){
            $model->personDid = $map['person_did'];
        }
        if(isset($map['uid'])){
            $model->uid = $map['uid'];
        }
        return $model;
    }
    // 企业did
    /**
     * @example did:mychain:66530b21a9bee783234c442b653e909136629a5a3075be7b4d9ae085782e3d36 
     * @var string
     */
    public $orgDid;

    // 企业用户id
    /**
     * @example 0001
     * @var string
     */
    public $orgUserId;

    // 个人id
    /**
     * @example did:mychain:66530b21a9bee783234c442b653e909136629a5a3075be7b4d9ae085782e3d36 
     * @var string
     */
    public $personDid;

    // 机构内部用户工号
    /**
     * @example 00001
     * @var string
     */
    public $uid;

}
