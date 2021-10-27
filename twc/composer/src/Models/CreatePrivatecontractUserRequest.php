<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreatePrivatecontractUserRequest extends Model
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

    // 私有云实例id
    /**
     * @var string
     */
    public $instanceId;

    // 私有云系统内部生成的id
    /**
     * @var string
     */
    public $userInnerId;

    // 用户类型,个人PERSON，企业ORG
    /**
     * @var string
     */
    public $userType;

    // 用户名称, 个人为个人名称，企业为企业名称
    /**
     * @var string
     */
    public $userName;

    // 用户证件类型，默认个人,身份证CRED_PSN_CH_IDCARD；
    // 企业,统一社会信用代码,CRED_ORG_USCC
    /**
     * @var string
     */
    public $userCertType;

    // 证件号码
    /**
     * @var string
     */
    public $userCertNumber;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'userInnerId'       => 'user_inner_id',
        'userType'          => 'user_type',
        'userName'          => 'user_name',
        'userCertType'      => 'user_cert_type',
        'userCertNumber'    => 'user_cert_number',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('userInnerId', $this->userInnerId, true);
        Model::validateRequired('userType', $this->userType, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('userCertType', $this->userCertType, true);
        Model::validateRequired('userCertNumber', $this->userCertNumber, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->userInnerId) {
            $res['user_inner_id'] = $this->userInnerId;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userCertType) {
            $res['user_cert_type'] = $this->userCertType;
        }
        if (null !== $this->userCertNumber) {
            $res['user_cert_number'] = $this->userCertNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreatePrivatecontractUserRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['user_inner_id'])) {
            $model->userInnerId = $map['user_inner_id'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['user_cert_type'])) {
            $model->userCertType = $map['user_cert_type'];
        }
        if (isset($map['user_cert_number'])) {
            $model->userCertNumber = $map['user_cert_number'];
        }

        return $model;
    }
}
