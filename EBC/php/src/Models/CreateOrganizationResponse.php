<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class CreateOrganizationResponse extends Model {
    protected $_name = [
        'orgDid' => 'org_did',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->orgDid) {
            $res['org_did'] = $this->orgDid;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateOrganizationResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['org_did'])){
            $model->orgDid = $map['org_did'];
        }
        return $model;
    }
    /**
     * @description 企业did
     * @example did:mychain:66530b21a9bee783234c442b653e909136629a5a3075be7b4d9ae085782e3d36 
     * @var string
     */
    public $orgDid;

}
