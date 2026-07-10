<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryDciCertificateresultRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'certificateVerifyId' => 'certificate_verify_id',
    ];
    public function validate() {
        Model::validateRequired('certificateVerifyId', $this->certificateVerifyId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->certificateVerifyId) {
            $res['certificate_verify_id'] = $this->certificateVerifyId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDciCertificateresultRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['certificate_verify_id'])){
            $model->certificateVerifyId = $map['certificate_verify_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // DCI证书核验ID
    /**
     * @var string
     */
    public $certificateVerifyId;

}
