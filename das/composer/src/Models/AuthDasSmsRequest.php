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

    // 授权实例biz_uuid
    /**
     * @var string
     */
    public $authInstanceBizUuid;

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
        'authInstanceBizUuid'      => 'auth_instance_biz_uuid',
        'authPersonEnterpriseInfo' => 'auth_person_enterprise_info',
        'authPersonIndividualInfo' => 'auth_person_individual_info',
    ];

    public function validate()
    {
        Model::validateRequired('verificationCode', $this->verificationCode, true);
        Model::validateRequired('authInstanceBizUuid', $this->authInstanceBizUuid, true);
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
        if (null !== $this->authInstanceBizUuid) {
            $res['auth_instance_biz_uuid'] = $this->authInstanceBizUuid;
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
        if (isset($map['auth_instance_biz_uuid'])) {
            $model->authInstanceBizUuid = $map['auth_instance_biz_uuid'];
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
