<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class StartDatastatusDriveRequest extends Model
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

    // 区块链身份
    /**
     * @var string
     */
    public $userDid;

    // 联盟标识（联盟码）
    /**
     * @var string
     */
    public $unionId;

    // 链上物体的身份，即物体（物权）上链接口返回的交易哈希
    /**
     * @var string
     */
    public $objectHash;

    // 进行驱动状态的环节业务类型
    /**
     * @var string
     */
    public $formType;

    // 驱动状态的信息备注
    /**
     * @var string
     */
    public $formBody;

    // 是否驱动状态流转，前置条件配置了状态流转模版
    /**
     * @var bool
     */
    public $driveStatus;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userDid'           => 'user_did',
        'unionId'           => 'union_id',
        'objectHash'        => 'object_hash',
        'formType'          => 'form_type',
        'formBody'          => 'form_body',
        'driveStatus'       => 'drive_status',
    ];

    public function validate()
    {
        Model::validateRequired('userDid', $this->userDid, true);
        Model::validateRequired('unionId', $this->unionId, true);
        Model::validateRequired('objectHash', $this->objectHash, true);
        Model::validateRequired('formType', $this->formType, true);
        Model::validateRequired('formBody', $this->formBody, true);
        Model::validateRequired('driveStatus', $this->driveStatus, true);
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
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }
        if (null !== $this->unionId) {
            $res['union_id'] = $this->unionId;
        }
        if (null !== $this->objectHash) {
            $res['object_hash'] = $this->objectHash;
        }
        if (null !== $this->formType) {
            $res['form_type'] = $this->formType;
        }
        if (null !== $this->formBody) {
            $res['form_body'] = $this->formBody;
        }
        if (null !== $this->driveStatus) {
            $res['drive_status'] = $this->driveStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDatastatusDriveRequest
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
        if (isset($map['user_did'])) {
            $model->userDid = $map['user_did'];
        }
        if (isset($map['union_id'])) {
            $model->unionId = $map['union_id'];
        }
        if (isset($map['object_hash'])) {
            $model->objectHash = $map['object_hash'];
        }
        if (isset($map['form_type'])) {
            $model->formType = $map['form_type'];
        }
        if (isset($map['form_body'])) {
            $model->formBody = $map['form_body'];
        }
        if (isset($map['drive_status'])) {
            $model->driveStatus = $map['drive_status'];
        }

        return $model;
    }
}
