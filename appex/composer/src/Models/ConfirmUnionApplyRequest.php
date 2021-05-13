<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class ConfirmUnionApplyRequest extends Model
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

    // 审核是否通过，SUCCESS,FAILURE,FREEZE
    /**
     * @var string
     */
    public $status;

    // 联盟id
    /**
     * @var int
     */
    public $unionId;

    // 区块链ID，status为SUCCESS时需要传入
    /**
     * @var string
     */
    public $chainId;

    // COMMON:普通链
    // TEE：TEE链
    // status为SUCCESS时需要填充
    /**
     * @var string
     */
    public $chainType;

    // TEE场景下要部署的链上合约名称，chain_type为TEE时需要传入
    /**
     * @var string
     */
    public $contractName;

    // 合约版本，TEE场景下需要传入
    /**
     * @var string
     */
    public $contractVersion;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'status'            => 'status',
        'unionId'           => 'union_id',
        'chainId'           => 'chain_id',
        'chainType'         => 'chain_type',
        'contractName'      => 'contract_name',
        'contractVersion'   => 'contract_version',
    ];

    public function validate()
    {
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('unionId', $this->unionId, true);
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->unionId) {
            $res['union_id'] = $this->unionId;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->chainType) {
            $res['chain_type'] = $this->chainType;
        }
        if (null !== $this->contractName) {
            $res['contract_name'] = $this->contractName;
        }
        if (null !== $this->contractVersion) {
            $res['contract_version'] = $this->contractVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmUnionApplyRequest
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['union_id'])) {
            $model->unionId = $map['union_id'];
        }
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['chain_type'])) {
            $model->chainType = $map['chain_type'];
        }
        if (isset($map['contract_name'])) {
            $model->contractName = $map['contract_name'];
        }
        if (isset($map['contract_version'])) {
            $model->contractVersion = $map['contract_version'];
        }

        return $model;
    }
}
