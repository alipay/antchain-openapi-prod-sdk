<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class VerifyUserRequest extends Model
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

    // 账号id
    /**
     * @var int
     */
    public $userId;

    // 个人名称
    /**
     * @var string
     */
    public $name;

    // 证件类型
    /**
     * @var string
     */
    public $certType;

    // 证件号码
    /**
     * @var string
     */
    public $certNum;

    // 个人证件正面图片,osskey值
    //
    /**
     * @var string
     */
    public $certFileFrontId;

    // 个人证件反面图片,oss的key值
    /**
     * @var string
     */
    public $certFileReverseId;

    // JPG
    /**
     * @var string
     */
    public $certFileFrontType;

    // 个人证件文件反面，文件类型
    /**
     * @var string
     */
    public $certFileReverseType;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'userId'              => 'user_id',
        'name'                => 'name',
        'certType'            => 'cert_type',
        'certNum'             => 'cert_num',
        'certFileFrontId'     => 'cert_file_front_id',
        'certFileReverseId'   => 'cert_file_reverse_id',
        'certFileFrontType'   => 'cert_file_front_type',
        'certFileReverseType' => 'cert_file_reverse_type',
        'tenantId'            => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('certNum', $this->certNum, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->certNum) {
            $res['cert_num'] = $this->certNum;
        }
        if (null !== $this->certFileFrontId) {
            $res['cert_file_front_id'] = $this->certFileFrontId;
        }
        if (null !== $this->certFileReverseId) {
            $res['cert_file_reverse_id'] = $this->certFileReverseId;
        }
        if (null !== $this->certFileFrontType) {
            $res['cert_file_front_type'] = $this->certFileFrontType;
        }
        if (null !== $this->certFileReverseType) {
            $res['cert_file_reverse_type'] = $this->certFileReverseType;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyUserRequest
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cert_num'])) {
            $model->certNum = $map['cert_num'];
        }
        if (isset($map['cert_file_front_id'])) {
            $model->certFileFrontId = $map['cert_file_front_id'];
        }
        if (isset($map['cert_file_reverse_id'])) {
            $model->certFileReverseId = $map['cert_file_reverse_id'];
        }
        if (isset($map['cert_file_front_type'])) {
            $model->certFileFrontType = $map['cert_file_front_type'];
        }
        if (isset($map['cert_file_reverse_type'])) {
            $model->certFileReverseType = $map['cert_file_reverse_type'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
