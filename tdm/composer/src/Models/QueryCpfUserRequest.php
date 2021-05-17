<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class QueryCpfUserRequest extends Model
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

    // 数据源ID
    /**
     * @var string
     */
    public $providerId;

    // 用户身份证ID
    /**
     * @var string
     */
    public $dataOwnerIdentity;

    // 用户姓名
    /**
     * @var string
     */
    public $dataOwnerName;

    // 证件类型
    /**
     * @var string
     */
    public $dataOwnerIdentifyType;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'terminalIdentity'      => 'terminal_identity',
        'providerId'            => 'provider_id',
        'dataOwnerIdentity'     => 'data_owner_identity',
        'dataOwnerName'         => 'data_owner_name',
        'dataOwnerIdentifyType' => 'data_owner_identify_type',
    ];

    public function validate()
    {
        Model::validateRequired('terminalIdentity', $this->terminalIdentity, true);
        Model::validateRequired('providerId', $this->providerId, true);
        Model::validateRequired('dataOwnerIdentity', $this->dataOwnerIdentity, true);
        Model::validateRequired('dataOwnerName', $this->dataOwnerName, true);
        Model::validateRequired('dataOwnerIdentifyType', $this->dataOwnerIdentifyType, true);
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
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->dataOwnerIdentity) {
            $res['data_owner_identity'] = $this->dataOwnerIdentity;
        }
        if (null !== $this->dataOwnerName) {
            $res['data_owner_name'] = $this->dataOwnerName;
        }
        if (null !== $this->dataOwnerIdentifyType) {
            $res['data_owner_identify_type'] = $this->dataOwnerIdentifyType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCpfUserRequest
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
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['data_owner_identity'])) {
            $model->dataOwnerIdentity = $map['data_owner_identity'];
        }
        if (isset($map['data_owner_name'])) {
            $model->dataOwnerName = $map['data_owner_name'];
        }
        if (isset($map['data_owner_identify_type'])) {
            $model->dataOwnerIdentifyType = $map['data_owner_identify_type'];
        }

        return $model;
    }
}
