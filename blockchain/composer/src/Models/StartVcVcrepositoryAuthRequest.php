<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartVcVcrepositoryAuthRequest extends Model
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

    // 指定情况跟随 auth_did_list，如果auth_did_list不指定，则此字段无需指定，否则是与auth_did_list长度相同，并且对应auth_did_list的did的公钥加密AES密钥的结果。
    /**
     * @var string[]
     */
    public $authAccessKeyList;

    // 本次追加授权的did列表
    /**
     * @var string[]
     */
    public $authDidList;

    // 提交请求的did，通常是目标VC的subject did，也就是VC的owner。
    /**
     * @var string
     */
    public $did;

    // 对当前VC Repository操作的描述，signature字段需要包含此操作的描述，最终会记录在VC Repository连接的链上，可追溯此operation操作记录。
    /**
     * @var string
     */
    public $operation;

    // 读数据请求的did对应使用公钥做的数据签名，确保数据准确性，签名包含operation字段，会一起上链。
    /**
     * @var string
     */
    public $signature;

    // 目标VC的唯一id标识。
    /**
     * @var string
     */
    public $verifiableClaimId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authAccessKeyList' => 'auth_access_key_list',
        'authDidList'       => 'auth_did_list',
        'did'               => 'did',
        'operation'         => 'operation',
        'signature'         => 'signature',
        'verifiableClaimId' => 'verifiable_claim_id',
    ];

    public function validate()
    {
        Model::validateRequired('authAccessKeyList', $this->authAccessKeyList, true);
        Model::validateRequired('authDidList', $this->authDidList, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('operation', $this->operation, true);
        Model::validateRequired('signature', $this->signature, true);
        Model::validateRequired('verifiableClaimId', $this->verifiableClaimId, true);
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
        if (null !== $this->authAccessKeyList) {
            $res['auth_access_key_list'] = $this->authAccessKeyList;
        }
        if (null !== $this->authDidList) {
            $res['auth_did_list'] = $this->authDidList;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->operation) {
            $res['operation'] = $this->operation;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->verifiableClaimId) {
            $res['verifiable_claim_id'] = $this->verifiableClaimId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartVcVcrepositoryAuthRequest
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
        if (isset($map['auth_access_key_list'])) {
            if (!empty($map['auth_access_key_list'])) {
                $model->authAccessKeyList = $map['auth_access_key_list'];
            }
        }
        if (isset($map['auth_did_list'])) {
            if (!empty($map['auth_did_list'])) {
                $model->authDidList = $map['auth_did_list'];
            }
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['operation'])) {
            $model->operation = $map['operation'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['verifiable_claim_id'])) {
            $model->verifiableClaimId = $map['verifiable_claim_id'];
        }

        return $model;
    }
}
