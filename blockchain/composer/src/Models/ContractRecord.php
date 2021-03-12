<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ContractRecord extends Model
{
    // abi对应oss key
    /**
     * @example abi-oss-key
     *
     * @var string
     */
    public $abiOssKey;

    // abi oss 地址
    /**
     * @example abi-oss-url
     *
     * @var string
     */
    public $abiOssUrl;

    // 区块链唯一标识
    /**
     * @example 0001bcde
     *
     * @var string
     */
    public $bizid;

    // 区块链名称
    /**
     * @example 合约体验链
     *
     * @var string
     */
    public $blockchainName;

    // bytecode对应oss key
    /**
     * @example bytecode-oss-key
     *
     * @var string
     */
    public $bytecodeOssKey;

    // bytecode oss 地址
    /**
     * @example bytecode-oss-url
     *
     * @var string
     */
    public $bytecodeOssUrl;

    // 16进制表示的合约identity
    /**
     * @example e7d3e769f3f593dadcb8634cc5b09fc90dd3a61c4a06a79cb0923662fe6fae6b
     *
     * @var string
     */
    public $identity;

    // 合约代码中定义的合约实例名，比如solidity的contract 关键字后面的命名
    /**
     * @example instance-name
     *
     * @var string
     */
    public $instanceName;

    // 合约名称
    /**
     * @example contract-name
     *
     * @var string
     */
    public $name;

    // 发布状态，1未发布，3已发布
    /**
     * @example 3
     *
     * @var int
     */
    public $publish;

    // 交易hash
    /**
     * @example e93372533f323b2f12783aa3a586135cf421486439c2cdcde47411b78f9839ec
     *
     * @var string
     */
    public $txHash;

    // solidity|cpp|go
    /**
     * @example solidity
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'abiOssKey'      => 'abi_oss_key',
        'abiOssUrl'      => 'abi_oss_url',
        'bizid'          => 'bizid',
        'blockchainName' => 'blockchain_name',
        'bytecodeOssKey' => 'bytecode_oss_key',
        'bytecodeOssUrl' => 'bytecode_oss_url',
        'identity'       => 'identity',
        'instanceName'   => 'instance_name',
        'name'           => 'name',
        'publish'        => 'publish',
        'txHash'         => 'tx_hash',
        'type'           => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('abiOssKey', $this->abiOssKey, true);
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('blockchainName', $this->blockchainName, true);
        Model::validateRequired('bytecodeOssKey', $this->bytecodeOssKey, true);
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('instanceName', $this->instanceName, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('publish', $this->publish, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->abiOssKey) {
            $res['abi_oss_key'] = $this->abiOssKey;
        }
        if (null !== $this->abiOssUrl) {
            $res['abi_oss_url'] = $this->abiOssUrl;
        }
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->blockchainName) {
            $res['blockchain_name'] = $this->blockchainName;
        }
        if (null !== $this->bytecodeOssKey) {
            $res['bytecode_oss_key'] = $this->bytecodeOssKey;
        }
        if (null !== $this->bytecodeOssUrl) {
            $res['bytecode_oss_url'] = $this->bytecodeOssUrl;
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
        if (null !== $this->publish) {
            $res['publish'] = $this->publish;
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
     * @return ContractRecord
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['abi_oss_key'])) {
            $model->abiOssKey = $map['abi_oss_key'];
        }
        if (isset($map['abi_oss_url'])) {
            $model->abiOssUrl = $map['abi_oss_url'];
        }
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['blockchain_name'])) {
            $model->blockchainName = $map['blockchain_name'];
        }
        if (isset($map['bytecode_oss_key'])) {
            $model->bytecodeOssKey = $map['bytecode_oss_key'];
        }
        if (isset($map['bytecode_oss_url'])) {
            $model->bytecodeOssUrl = $map['bytecode_oss_url'];
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
        if (isset($map['publish'])) {
            $model->publish = $map['publish'];
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
