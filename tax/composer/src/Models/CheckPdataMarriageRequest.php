<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class CheckPdataMarriageRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 业务流水号
    /**
     * @var string
     */
    public $bizId;

    // 姓名
    /**
     * @var string
     */
    public $name;

    // 身份证
    /**
     * @var string
     */
    public $certNo;

    // 授权凭证
    /**
     * @var string
     */
    public $authorizationCredential;

    // 授权编号(同一机构内唯一)
    /**
     * @var string
     */
    public $authorizationNo;

    // 授权格式
    /**
     * @var string
     */
    public $credentialType;

    // 授权有效期
    /**
     * @var string
     */
    public $authorizationExpirationTime;

    // 授权对象
    /**
     * @var string
     */
    public $authorizationType;
    protected $_name = [
        'authToken'                   => 'auth_token',
        'productInstanceId'           => 'product_instance_id',
        'bizId'                       => 'biz_id',
        'name'                        => 'name',
        'certNo'                      => 'cert_no',
        'authorizationCredential'     => 'authorization_credential',
        'authorizationNo'             => 'authorization_no',
        'credentialType'              => 'credential_type',
        'authorizationExpirationTime' => 'authorization_expiration_time',
        'authorizationType'           => 'authorization_type',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('authorizationCredential', $this->authorizationCredential, true);
        Model::validateRequired('authorizationNo', $this->authorizationNo, true);
        Model::validateRequired('credentialType', $this->credentialType, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->authorizationCredential) {
            $res['authorization_credential'] = $this->authorizationCredential;
        }
        if (null !== $this->authorizationNo) {
            $res['authorization_no'] = $this->authorizationNo;
        }
        if (null !== $this->credentialType) {
            $res['credential_type'] = $this->credentialType;
        }
        if (null !== $this->authorizationExpirationTime) {
            $res['authorization_expiration_time'] = $this->authorizationExpirationTime;
        }
        if (null !== $this->authorizationType) {
            $res['authorization_type'] = $this->authorizationType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckPdataMarriageRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['authorization_credential'])) {
            $model->authorizationCredential = $map['authorization_credential'];
        }
        if (isset($map['authorization_no'])) {
            $model->authorizationNo = $map['authorization_no'];
        }
        if (isset($map['credential_type'])) {
            $model->credentialType = $map['credential_type'];
        }
        if (isset($map['authorization_expiration_time'])) {
            $model->authorizationExpirationTime = $map['authorization_expiration_time'];
        }
        if (isset($map['authorization_type'])) {
            $model->authorizationType = $map['authorization_type'];
        }

        return $model;
    }
}
