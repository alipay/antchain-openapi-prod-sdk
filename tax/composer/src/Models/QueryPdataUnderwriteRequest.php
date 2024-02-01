<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class QueryPdataUnderwriteRequest extends Model
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

    // 加密后的入参数据（包括姓名和身份ID）
    /**
     * @var string
     */
    public $encryptData;

    // 省份行政区划代码list
    /**
     * @var string[]
     */
    public $recommandProvinceList;

    // 授权编号
    /**
     * @var string
     */
    public $authorizationNo;

    // 授权凭证
    /**
     * @var string
     */
    public $authorizationCredential;

    // 凭证格式
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
        'encryptData'                 => 'encrypt_data',
        'recommandProvinceList'       => 'recommand_province_list',
        'authorizationNo'             => 'authorization_no',
        'authorizationCredential'     => 'authorization_credential',
        'credentialType'              => 'credential_type',
        'authorizationExpirationTime' => 'authorization_expiration_time',
        'authorizationType'           => 'authorization_type',
    ];

    public function validate()
    {
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
        if (null !== $this->encryptData) {
            $res['encrypt_data'] = $this->encryptData;
        }
        if (null !== $this->recommandProvinceList) {
            $res['recommand_province_list'] = $this->recommandProvinceList;
        }
        if (null !== $this->authorizationNo) {
            $res['authorization_no'] = $this->authorizationNo;
        }
        if (null !== $this->authorizationCredential) {
            $res['authorization_credential'] = $this->authorizationCredential;
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
     * @return QueryPdataUnderwriteRequest
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
        if (isset($map['encrypt_data'])) {
            $model->encryptData = $map['encrypt_data'];
        }
        if (isset($map['recommand_province_list'])) {
            if (!empty($map['recommand_province_list'])) {
                $model->recommandProvinceList = $map['recommand_province_list'];
            }
        }
        if (isset($map['authorization_no'])) {
            $model->authorizationNo = $map['authorization_no'];
        }
        if (isset($map['authorization_credential'])) {
            $model->authorizationCredential = $map['authorization_credential'];
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
