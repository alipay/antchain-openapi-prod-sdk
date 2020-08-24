<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class GetIRealpersonFacevrfEvidenceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'certifyId' => 'certify_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetIRealpersonFacevrfEvidenceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['certify_id'])){
            $model->certifyId = $map['certify_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 某次刷脸的certifyId
    /**
     * @var string
     */
    public $certifyId;

}
