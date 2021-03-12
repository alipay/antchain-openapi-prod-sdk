<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ContractIdeConfig extends Model
{
    // 合约链的一个已创建的测试账户
    /**
     * @example Tester001
     *
     * @var string
     */
    public $accountName;

    // 区块链唯一标识
    /**
     * @example 0001bcde
     *
     * @var string
     */
    public $bizid;

    // 合约链的名字
    /**
     * @example 合约体验链
     *
     * @var string
     */
    public $chainName;

    // 目标合约链的host地址
    /**
     * @example https://127.0.0.1
     *
     * @var string
     */
    public $host;

    // 说明是否开启wasm合约功能
    /**
     * @example true
     *
     * @var bool
     */
    public $isWasm;

    // 目标合约链服务公开的端口号
    /**
     * @example 18131
     *
     * @var string
     */
    public $port;

    // 合约链已创建的测试账户的密钥
    /**
     * @example c8d6079a1ea7e5dba407998fecd89ac0783295c7e1a84d44e304b5314c765e73
     *
     * @var string
     */
    public $privateKey;

    // 如果是TEE硬件隐私合约链，会包含此字段内容
    /**
     * @example -----BEGIN PUBLIC KEY----- <RSA公钥> -----END PUBLIC KEY-----
     *
     * @var string
     */
    public $rsaPublicKey;

    // 合约链的版本说明
    /**
     * @example 2.7
     *
     * @var string
     */
    public $version;
    protected $_name = [
        'accountName'  => 'account_name',
        'bizid'        => 'bizid',
        'chainName'    => 'chain_name',
        'host'         => 'host',
        'isWasm'       => 'is_wasm',
        'port'         => 'port',
        'privateKey'   => 'private_key',
        'rsaPublicKey' => 'rsa_public_key',
        'version'      => 'version',
    ];

    public function validate()
    {
        Model::validateRequired('accountName', $this->accountName, true);
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('chainName', $this->chainName, true);
        Model::validateRequired('host', $this->host, true);
        Model::validateRequired('port', $this->port, true);
        Model::validateRequired('privateKey', $this->privateKey, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountName) {
            $res['account_name'] = $this->accountName;
        }
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->chainName) {
            $res['chain_name'] = $this->chainName;
        }
        if (null !== $this->host) {
            $res['host'] = $this->host;
        }
        if (null !== $this->isWasm) {
            $res['is_wasm'] = $this->isWasm;
        }
        if (null !== $this->port) {
            $res['port'] = $this->port;
        }
        if (null !== $this->privateKey) {
            $res['private_key'] = $this->privateKey;
        }
        if (null !== $this->rsaPublicKey) {
            $res['rsa_public_key'] = $this->rsaPublicKey;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractIdeConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_name'])) {
            $model->accountName = $map['account_name'];
        }
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['chain_name'])) {
            $model->chainName = $map['chain_name'];
        }
        if (isset($map['host'])) {
            $model->host = $map['host'];
        }
        if (isset($map['is_wasm'])) {
            $model->isWasm = $map['is_wasm'];
        }
        if (isset($map['port'])) {
            $model->port = $map['port'];
        }
        if (isset($map['private_key'])) {
            $model->privateKey = $map['private_key'];
        }
        if (isset($map['rsa_public_key'])) {
            $model->rsaPublicKey = $map['rsa_public_key'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
