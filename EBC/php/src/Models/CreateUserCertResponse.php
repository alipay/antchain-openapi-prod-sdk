<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class CreateUserCertResponse extends Model {
    protected $_name = [
        'certId' => 'cert_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->certId) {
            $res['cert_id'] = $this->certId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateUserCertResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['cert_id'])){
            $model->certId = $map['cert_id'];
        }
        return $model;
    }
    /**
     * @description 证书id
     * @example 0001
     * @var string
     */
    public $certId;

}
