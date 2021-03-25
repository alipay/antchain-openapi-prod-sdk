<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class InitIdentificationFaceauthRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 认证人的姓名
    /**
     * @var string
     */
    public $certName;

    // 被验证者的身份证号码
    /**
     * @var string
     */
    public $certNo;

    // 授权码，针对某些特定场景使用，非必填
    /**
     * @var string
     */
    public $authCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'certName'          => 'cert_name',
        'certNo'            => 'cert_no',
        'authCode'          => 'auth_code',
    ];

    public function validate()
    {
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('certNo', $this->certNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitIdentificationFaceauthRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['auth_code'])) {
            $model->authCode = $map['auth_code'];
        }

        return $model;
    }
}
