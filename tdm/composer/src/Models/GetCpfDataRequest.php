<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class GetCpfDataRequest extends Model
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

    // 端ID
    /**
     * @var string
     */
    public $terminalIdentity;

    // 业务流水号
    /**
     * @var string
     */
    public $bizId;

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

    // 证件类型
    /**
     * @var string
     */
    public $dataOwnerIdentityType;

    // 用户ID
    /**
     * @var string
     */
    public $dataOwnerIdentity;

    // 用户姓名
    /**
     * @var string
     */
    public $dataOwnerName;

    // 数据源ID
    /**
     * @var string
     */
    public $providerId;

    // 数据项code
    /**
     * @var string
     */
    public $dataCode;

    // 授权码
    /**
     * @var string
     */
    public $targetCode;

    // 扩展字段。
    /**
     * @var string
     */
    public $extendParams;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'terminalIdentity'      => 'terminal_identity',
        'bizId'                 => 'biz_id',
        'dataUserIdentity'      => 'data_user_identity',
        'dataUserName'          => 'data_user_name',
        'dataOwnerIdentityType' => 'data_owner_identity_type',
        'dataOwnerIdentity'     => 'data_owner_identity',
        'dataOwnerName'         => 'data_owner_name',
        'providerId'            => 'provider_id',
        'dataCode'              => 'data_code',
        'targetCode'            => 'target_code',
        'extendParams'          => 'extend_params',
    ];

    public function validate()
    {
        Model::validateRequired('terminalIdentity', $this->terminalIdentity, true);
        Model::validateRequired('dataUserIdentity', $this->dataUserIdentity, true);
        Model::validateRequired('dataUserName', $this->dataUserName, true);
        Model::validateRequired('dataOwnerIdentityType', $this->dataOwnerIdentityType, true);
        Model::validateRequired('dataOwnerIdentity', $this->dataOwnerIdentity, true);
        Model::validateRequired('dataOwnerName', $this->dataOwnerName, true);
        Model::validateRequired('providerId', $this->providerId, true);
        Model::validateRequired('dataCode', $this->dataCode, true);
        Model::validateRequired('targetCode', $this->targetCode, true);
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
        if (null !== $this->terminalIdentity) {
            $res['terminal_identity'] = $this->terminalIdentity;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->dataUserIdentity) {
            $res['data_user_identity'] = $this->dataUserIdentity;
        }
        if (null !== $this->dataUserName) {
            $res['data_user_name'] = $this->dataUserName;
        }
        if (null !== $this->dataOwnerIdentityType) {
            $res['data_owner_identity_type'] = $this->dataOwnerIdentityType;
        }
        if (null !== $this->dataOwnerIdentity) {
            $res['data_owner_identity'] = $this->dataOwnerIdentity;
        }
        if (null !== $this->dataOwnerName) {
            $res['data_owner_name'] = $this->dataOwnerName;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->dataCode) {
            $res['data_code'] = $this->dataCode;
        }
        if (null !== $this->targetCode) {
            $res['target_code'] = $this->targetCode;
        }
        if (null !== $this->extendParams) {
            $res['extend_params'] = $this->extendParams;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetCpfDataRequest
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
        if (isset($map['terminal_identity'])) {
            $model->terminalIdentity = $map['terminal_identity'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['data_user_identity'])) {
            $model->dataUserIdentity = $map['data_user_identity'];
        }
        if (isset($map['data_user_name'])) {
            $model->dataUserName = $map['data_user_name'];
        }
        if (isset($map['data_owner_identity_type'])) {
            $model->dataOwnerIdentityType = $map['data_owner_identity_type'];
        }
        if (isset($map['data_owner_identity'])) {
            $model->dataOwnerIdentity = $map['data_owner_identity'];
        }
        if (isset($map['data_owner_name'])) {
            $model->dataOwnerName = $map['data_owner_name'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['data_code'])) {
            $model->dataCode = $map['data_code'];
        }
        if (isset($map['target_code'])) {
            $model->targetCode = $map['target_code'];
        }
        if (isset($map['extend_params'])) {
            $model->extendParams = $map['extend_params'];
        }

        return $model;
    }
}
