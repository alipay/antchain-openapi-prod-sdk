<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateContractRecordRequest extends Model
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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'abiOssKey'         => 'abi_oss_key',
        'bizid'             => 'bizid',
        'bytecodeOssKey'    => 'bytecode_oss_key',
        'identity'          => 'identity',
    ];

    public function validate()
    {
        Model::validateRequired('abiOssKey', $this->abiOssKey, true);
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('bytecodeOssKey', $this->bytecodeOssKey, true);
        Model::validateRequired('identity', $this->identity, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateContractRecordRequest
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

        return $model;
    }
}
