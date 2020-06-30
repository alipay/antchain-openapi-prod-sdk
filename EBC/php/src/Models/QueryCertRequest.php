<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class QueryCertRequest extends Model {
    protected $_name = [
        'certId' => 'cert_id',
        'orgDid' => 'org_did',
    ];
    public function validate() {
        Model::validateMaxLength('certId', $this->certId, 128);
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->certId) {
            $res['cert_id'] = $this->certId;
        }
        if (null !== $this->orgDid) {
            $res['org_did'] = $this->orgDid;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryCertRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['cert_id'])){
            $model->certId = $map['cert_id'];
        }
        if(isset($map['org_did'])){
            $model->orgDid = $map['org_did'];
        }
        return $model;
    }
    /**
     * @description 证书id
     * @example 0001
     * @var string
     */
    public $certId;

    /**
     * @description 企业did
     * @example dimychain:66530b21a9bee783234c442b653e909136629a5a3075be7b4d9ae085782e3d36
     * @var string
     */
    public $orgDid;

}
