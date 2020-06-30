<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class CreatePersonResponse extends Model {
    protected $_name = [
        'personDid' => 'person_did',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->personDid) {
            $res['person_did'] = $this->personDid;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreatePersonResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['person_did'])){
            $model->personDid = $map['person_did'];
        }
        return $model;
    }
    /**
     * @description 个人id
     * @example did:mychain:66530b21a9bee783234c442b653e909136629a5a3075be7b4d9ae085782e3d36 
     * @var string
     */
    public $personDid;

}
