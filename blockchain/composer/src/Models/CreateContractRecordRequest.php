<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateContractRecordRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // abi对应oss key
    /**
     * @var string
     */
    public $abiOssKey;

    // 区块链唯一标识
    /**
     * @var string
     */
    public $bizid;

    // bytecode对应oss key
    /**
     * @var string
     */
    public $bytecodeOssKey;

    // 16进制表示的合约identity
    /**
     * @var string
     */
    public $identity;

    // 合约代码中定义的合约实例名，比如solidity的contract 关键字后面的命名
    /**
     * @var string
     */
    public $instanceName;

    // 合约名称
    /**
     * @var string
     */
    public $name;

    // 交易hash
    /**
     * @var string
     */
    public $txHash;

    // solidity|cpp|go
    /**
     * @var string
     */
    public $type;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'abiOssKey'         => 'abi_oss_key',
        'bizid'             => 'bizid',
        'bytecodeOssKey'    => 'bytecode_oss_key',
        'identity'          => 'identity',
        'instanceName'      => 'instance_name',
        'name'              => 'name',
        'txHash'            => 'tx_hash',
        'type'              => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('abiOssKey', $this->abiOssKey, true);
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('bytecodeOssKey', $this->bytecodeOssKey, true);
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('instanceName', $this->instanceName, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateMaxLength('identity', $this->identity, 64);
        Model::validateMaxLength('txHash', $this->txHash, 64);
        Model::validateMinLength('identity', $this->identity, 64);
        Model::validateMinLength('txHash', $this->txHash, 64);
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
        if (null !== $this->abiOssKey) {
            $res['abi_oss_key'] = $this->abiOssKey;
        }
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->bytecodeOssKey) {
            $res['bytecode_oss_key'] = $this->bytecodeOssKey;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->instanceName) {
            $res['instance_name'] = $this->instanceName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContractRecordRequest
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
        if (isset($map['abi_oss_key'])) {
            $model->abiOssKey = $map['abi_oss_key'];
        }
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['bytecode_oss_key'])) {
            $model->bytecodeOssKey = $map['bytecode_oss_key'];
        }
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['instance_name'])) {
            $model->instanceName = $map['instance_name'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
