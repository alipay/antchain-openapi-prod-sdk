<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class UpdateFirmInfoRequest extends Model
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

    // 云蚂侧用户id
    /**
     * @var int
     */
    public $userId;

    // 信息同步类型
    /**
     * @var string
     */
    public $operationType;

    // 云蚂侧企业id
    /**
     * @var int
     */
    public $firmId;

    // 企业名称
    /**
     * @var string
     */
    public $firmName;

    // 企业认证状态
    /**
     * @var string
     */
    public $firmCertStatus;

    // 企业认证did
    /**
     * @var string
     */
    public $firmDid;

    // 账户角色
    /**
     * @var string
     */
    public $referType;

    // 云蚂侧原管理员账户id
    /**
     * @var int
     */
    public $formerAdminId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId'            => 'user_id',
        'operationType'     => 'operation_type',
        'firmId'            => 'firm_id',
        'firmName'          => 'firm_name',
        'firmCertStatus'    => 'firm_cert_status',
        'firmDid'           => 'firm_did',
        'referType'         => 'refer_type',
        'formerAdminId'     => 'former_admin_id',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('operationType', $this->operationType, true);
        Model::validateRequired('firmId', $this->firmId, true);
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
        if (null !== $this->operationType) {
            $res['operation_type'] = $this->operationType;
        }
        if (null !== $this->firmId) {
            $res['firm_id'] = $this->firmId;
        }
        if (null !== $this->firmName) {
            $res['firm_name'] = $this->firmName;
        }
        if (null !== $this->firmCertStatus) {
            $res['firm_cert_status'] = $this->firmCertStatus;
        }
        if (null !== $this->firmDid) {
            $res['firm_did'] = $this->firmDid;
        }
        if (null !== $this->referType) {
            $res['refer_type'] = $this->referType;
        }
        if (null !== $this->formerAdminId) {
            $res['former_admin_id'] = $this->formerAdminId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateFirmInfoRequest
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
        if (isset($map['operation_type'])) {
            $model->operationType = $map['operation_type'];
        }
        if (isset($map['firm_id'])) {
            $model->firmId = $map['firm_id'];
        }
        if (isset($map['firm_name'])) {
            $model->firmName = $map['firm_name'];
        }
        if (isset($map['firm_cert_status'])) {
            $model->firmCertStatus = $map['firm_cert_status'];
        }
        if (isset($map['firm_did'])) {
            $model->firmDid = $map['firm_did'];
        }
        if (isset($map['refer_type'])) {
            $model->referType = $map['refer_type'];
        }
        if (isset($map['former_admin_id'])) {
            $model->formerAdminId = $map['former_admin_id'];
        }

        return $model;
    }
}
