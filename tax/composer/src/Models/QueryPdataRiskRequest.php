<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class QueryPdataRiskRequest extends Model
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

    // 身份证号
    /**
     * @var string
     */
    public $certNo;

    // 手机号
    /**
     * @var string
     */
    public $phoneNo;

    // 渠道编码
    /**
     * @var string
     */
    public $channelCode;

    // 模型id
    /**
     * @var string
     */
    public $modelId;

    // 授权编号
    /**
     * @var string
     */
    public $authorizationCode;

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
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'bizId'                   => 'biz_id',
        'name'                    => 'name',
        'certNo'                  => 'cert_no',
        'phoneNo'                 => 'phone_no',
        'channelCode'             => 'channel_code',
        'modelId'                 => 'model_id',
        'authorizationCode'       => 'authorization_code',
        'authorizationCredential' => 'authorization_credential',
        'credentialType'          => 'credential_type',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('channelCode', $this->channelCode, true);
        Model::validateRequired('modelId', $this->modelId, true);
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
        if (null !== $this->phoneNo) {
            $res['phone_no'] = $this->phoneNo;
        }
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }
        if (null !== $this->authorizationCode) {
            $res['authorization_code'] = $this->authorizationCode;
        }
        if (null !== $this->authorizationCredential) {
            $res['authorization_credential'] = $this->authorizationCredential;
        }
        if (null !== $this->credentialType) {
            $res['credential_type'] = $this->credentialType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPdataRiskRequest
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
        if (isset($map['phone_no'])) {
            $model->phoneNo = $map['phone_no'];
        }
        if (isset($map['channel_code'])) {
            $model->channelCode = $map['channel_code'];
        }
        if (isset($map['model_id'])) {
            $model->modelId = $map['model_id'];
        }
        if (isset($map['authorization_code'])) {
            $model->authorizationCode = $map['authorization_code'];
        }
        if (isset($map['authorization_credential'])) {
            $model->authorizationCredential = $map['authorization_credential'];
        }
        if (isset($map['credential_type'])) {
            $model->credentialType = $map['credential_type'];
        }

        return $model;
    }
}
