<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class ApplyCertUrlRequest extends Model {
    protected $_name = [
        'certCode' => 'cert_code',
        'orgDid' => 'org_did',
        'orgUserId' => 'org_user_id',
    ];
    public function validate() {
        Model::validateMaxLength('certCode', $this->certCode, 128);
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->certCode) {
            $res['cert_code'] = $this->certCode;
        }
        if (null !== $this->orgDid) {
            $res['org_did'] = $this->orgDid;
        }
        if (null !== $this->orgUserId) {
            $res['org_user_id'] = $this->orgUserId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyCertUrlRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['cert_code'])){
            $model->certCode = $map['cert_code'];
        }
        if(isset($map['org_did'])){
            $model->orgDid = $map['org_did'];
        }
        if(isset($map['org_user_id'])){
            $model->orgUserId = $map['org_user_id'];
        }
        return $model;
    }
    /**
     * @description 证书code
     * @example G00011
     * @var string
     */
    public $certCode;

    /**
     * @description 机构did
     * @example mychain:66530b21a9bee783234c442b653e909136629a5a3075be7b4d9ae085782e3d36 
     * @var string
     */
    public $orgDid;

    /**
     * @description 证书持有人id
     * @example 0001
     * @var string
     */
    public $orgUserId;

}
