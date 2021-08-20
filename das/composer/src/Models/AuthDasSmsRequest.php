<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class AuthDasSmsRequest extends Model
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

    // 手机验证码
    /**
     * @var string
     */
    public $verificationCode;

    // 授权实例ID
    /**
     * @var string
     */
    public $authInstanceId;

    // 被授权企业接入应用ID
    /**
     * @var string
     */
    public $beAuthedPersonAppId;

    // 授权企业信息
    /**
     * @var AuthPersonEnterpriseInfo
     */
    public $authPersonEnterpriseInfo;

    // 授权人个人信息
    /**
     * @var AuthPersonIndividualInfo
     */
    public $authPersonIndividualInfo;
    protected $_name = [
        'authToken'                => 'auth_token',
        'productInstanceId'        => 'product_instance_id',
        'verificationCode'         => 'verification_code',
        'authInstanceId'           => 'auth_instance_id',
        'beAuthedPersonAppId'      => 'be_authed_person_app_id',
        'authPersonEnterpriseInfo' => 'auth_person_enterprise_info',
        'authPersonIndividualInfo' => 'auth_person_individual_info',
    ];

    public function validate()
    {
        Model::validateRequired('verificationCode', $this->verificationCode, true);
        Model::validateRequired('authInstanceId', $this->authInstanceId, true);
        Model::validateRequired('beAuthedPersonAppId', $this->beAuthedPersonAppId, true);
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
        if (null !== $this->verificationCode) {
            $res['verification_code'] = $this->verificationCode;
        }
        if (null !== $this->authInstanceId) {
            $res['auth_instance_id'] = $this->authInstanceId;
        }
        if (null !== $this->beAuthedPersonAppId) {
            $res['be_authed_person_app_id'] = $this->beAuthedPersonAppId;
        }
        if (null !== $this->authPersonEnterpriseInfo) {
            $res['auth_person_enterprise_info'] = null !== $this->authPersonEnterpriseInfo ? $this->authPersonEnterpriseInfo->toMap() : null;
        }
        if (null !== $this->authPersonIndividualInfo) {
            $res['auth_person_individual_info'] = null !== $this->authPersonIndividualInfo ? $this->authPersonIndividualInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthDasSmsRequest
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
        if (isset($map['verification_code'])) {
            $model->verificationCode = $map['verification_code'];
        }
        if (isset($map['auth_instance_id'])) {
            $model->authInstanceId = $map['auth_instance_id'];
        }
        if (isset($map['be_authed_person_app_id'])) {
            $model->beAuthedPersonAppId = $map['be_authed_person_app_id'];
        }
        if (isset($map['auth_person_enterprise_info'])) {
            $model->authPersonEnterpriseInfo = AuthPersonEnterpriseInfo::fromMap($map['auth_person_enterprise_info']);
        }
        if (isset($map['auth_person_individual_info'])) {
            $model->authPersonIndividualInfo = AuthPersonIndividualInfo::fromMap($map['auth_person_individual_info']);
        }

        return $model;
    }
}
