<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class QueryCertResponse extends Model {
    protected $_name = [
        'cert' => 'cert',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->cert) {
            $res['cert'] = null !== $this->cert ? $this->cert->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryCertResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['cert'])){
            $model->cert = Cert::fromMap($map['cert']);
        }
        return $model;
    }
    /**
     * @description 证书明细
     * @example {}
     * @var Cert
     */
    public $cert;

}
