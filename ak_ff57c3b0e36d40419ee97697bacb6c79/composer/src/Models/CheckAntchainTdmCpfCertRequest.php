<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ff57c3b0e36d40419ee97697bacb6c79\Models;

use AlibabaCloud\Tea\Model;

class CheckAntchainTdmCpfCertRequest extends Model
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

    // 外部业务流水
    /**
     * @var string
     */
    public $bizId;

    // 扫码验真类型
    /**
     * @var string
     */
    public $type;

    // 端ID
    /**
     * @var string
     */
    public $terminalIdentity;

    // 证明ID
    /**
     * @var string
     */
    public $issueId;

    // 身份证ID
    /**
     * @var string
     */
    public $dataOwnerIdentity;

    // 使用方ID
    /**
     * @var string
     */
    public $dataUserIdentity;

    // 使用方名称
    /**
     * @var string
     */
    public $dataUserName;

    // 用途
    /**
     * @var string
     */
    public $purpose;

    // 使用时间
    /**
     * @var string
     */
    public $useTime;

    // 扩展字段
    /**
     * @var string
     */
    public $extendParams;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'type'              => 'type',
        'terminalIdentity'  => 'terminal_identity',
        'issueId'           => 'issue_id',
        'dataOwnerIdentity' => 'data_owner_identity',
        'dataUserIdentity'  => 'data_user_identity',
        'dataUserName'      => 'data_user_name',
        'purpose'           => 'purpose',
        'useTime'           => 'use_time',
        'extendParams'      => 'extend_params',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('terminalIdentity', $this->terminalIdentity, true);
        Model::validateRequired('issueId', $this->issueId, true);
        Model::validateRequired('dataOwnerIdentity', $this->dataOwnerIdentity, true);
        Model::validatePattern('useTime', $this->useTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->terminalIdentity) {
            $res['terminal_identity'] = $this->terminalIdentity;
        }
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
        }
        if (null !== $this->dataOwnerIdentity) {
            $res['data_owner_identity'] = $this->dataOwnerIdentity;
        }
        if (null !== $this->dataUserIdentity) {
            $res['data_user_identity'] = $this->dataUserIdentity;
        }
        if (null !== $this->dataUserName) {
            $res['data_user_name'] = $this->dataUserName;
        }
        if (null !== $this->purpose) {
            $res['purpose'] = $this->purpose;
        }
        if (null !== $this->useTime) {
            $res['use_time'] = $this->useTime;
        }
        if (null !== $this->extendParams) {
            $res['extend_params'] = $this->extendParams;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckAntchainTdmCpfCertRequest
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
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['terminal_identity'])) {
            $model->terminalIdentity = $map['terminal_identity'];
        }
        if (isset($map['issue_id'])) {
            $model->issueId = $map['issue_id'];
        }
        if (isset($map['data_owner_identity'])) {
            $model->dataOwnerIdentity = $map['data_owner_identity'];
        }
        if (isset($map['data_user_identity'])) {
            $model->dataUserIdentity = $map['data_user_identity'];
        }
        if (isset($map['data_user_name'])) {
            $model->dataUserName = $map['data_user_name'];
        }
        if (isset($map['purpose'])) {
            $model->purpose = $map['purpose'];
        }
        if (isset($map['use_time'])) {
            $model->useTime = $map['use_time'];
        }
        if (isset($map['extend_params'])) {
            $model->extendParams = $map['extend_params'];
        }

        return $model;
    }
}
