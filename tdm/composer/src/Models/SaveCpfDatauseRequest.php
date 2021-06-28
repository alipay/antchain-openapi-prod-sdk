<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class SaveCpfDatauseRequest extends Model
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

    // 数据拥有方ID
    /**
     * @var string
     */
    public $dataOwnerIdentity;

    // 数据拥有方名称
    /**
     * @var string
     */
    public $dataOwnerName;

    // 数据源ID
    /**
     * @var string
     */
    public $providerId;

    // 数据源名称
    /**
     * @var string
     */
    public $providerName;

    // 端ID
    /**
     * @var string
     */
    public $terminalIdentity;

    // 业务数据描述
    /**
     * @var string
     */
    public $dataDesc;

    // 存证数据hash
    /**
     * @var string
     */
    public $dataHash;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataUserIdentity'  => 'data_user_identity',
        'dataUserName'      => 'data_user_name',
        'dataOwnerIdentity' => 'data_owner_identity',
        'dataOwnerName'     => 'data_owner_name',
        'providerId'        => 'provider_id',
        'providerName'      => 'provider_name',
        'terminalIdentity'  => 'terminal_identity',
        'dataDesc'          => 'data_desc',
        'dataHash'          => 'data_hash',
    ];

    public function validate()
    {
        Model::validateRequired('dataUserIdentity', $this->dataUserIdentity, true);
        Model::validateRequired('dataUserName', $this->dataUserName, true);
        Model::validateRequired('dataOwnerIdentity', $this->dataOwnerIdentity, true);
        Model::validateRequired('dataOwnerName', $this->dataOwnerName, true);
        Model::validateRequired('providerId', $this->providerId, true);
        Model::validateRequired('providerName', $this->providerName, true);
        Model::validateRequired('terminalIdentity', $this->terminalIdentity, true);
        Model::validateRequired('dataDesc', $this->dataDesc, true);
        Model::validateRequired('dataHash', $this->dataHash, true);
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
        if (null !== $this->dataUserIdentity) {
            $res['data_user_identity'] = $this->dataUserIdentity;
        }
        if (null !== $this->dataUserName) {
            $res['data_user_name'] = $this->dataUserName;
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
        if (null !== $this->providerName) {
            $res['provider_name'] = $this->providerName;
        }
        if (null !== $this->terminalIdentity) {
            $res['terminal_identity'] = $this->terminalIdentity;
        }
        if (null !== $this->dataDesc) {
            $res['data_desc'] = $this->dataDesc;
        }
        if (null !== $this->dataHash) {
            $res['data_hash'] = $this->dataHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveCpfDatauseRequest
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
        if (isset($map['data_user_identity'])) {
            $model->dataUserIdentity = $map['data_user_identity'];
        }
        if (isset($map['data_user_name'])) {
            $model->dataUserName = $map['data_user_name'];
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
        if (isset($map['provider_name'])) {
            $model->providerName = $map['provider_name'];
        }
        if (isset($map['terminal_identity'])) {
            $model->terminalIdentity = $map['terminal_identity'];
        }
        if (isset($map['data_desc'])) {
            $model->dataDesc = $map['data_desc'];
        }
        if (isset($map['data_hash'])) {
            $model->dataHash = $map['data_hash'];
        }

        return $model;
    }
}
