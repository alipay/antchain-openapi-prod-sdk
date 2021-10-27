<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class UpdatePrivatecontractUserRequest extends Model
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
    //
    /**
     * @var string
     */
    public $instanceId;

    // 私有云生成的内部用户Id
    //
    /**
     * @var string
     */
    public $userInnerId;

    // 用户名称，个人用户为个人名称，企业为企业名称
    /**
     * @var string
     */
    public $userName;

    // 企业用户必填，企业法人名称
    //
    /**
     * @var string
     */
    public $legalName;

    // 法人证件类型
    //
    /**
     * @var string
     */
    public $legalCertType;

    // 法人证件对应的证件号码
    //
    /**
     * @var string
     */
    public $legalCertNumber;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'userInnerId'       => 'user_inner_id',
        'userName'          => 'user_name',
        'legalName'         => 'legal_name',
        'legalCertType'     => 'legal_cert_type',
        'legalCertNumber'   => 'legal_cert_number',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('userInnerId', $this->userInnerId, true);
        Model::validateRequired('userName', $this->userName, true);
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
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->legalName) {
            $res['legal_name'] = $this->legalName;
        }
        if (null !== $this->legalCertType) {
            $res['legal_cert_type'] = $this->legalCertType;
        }
        if (null !== $this->legalCertNumber) {
            $res['legal_cert_number'] = $this->legalCertNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdatePrivatecontractUserRequest
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
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['legal_name'])) {
            $model->legalName = $map['legal_name'];
        }
        if (isset($map['legal_cert_type'])) {
            $model->legalCertType = $map['legal_cert_type'];
        }
        if (isset($map['legal_cert_number'])) {
            $model->legalCertNumber = $map['legal_cert_number'];
        }

        return $model;
    }
}
