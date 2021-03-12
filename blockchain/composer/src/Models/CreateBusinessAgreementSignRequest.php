<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateBusinessAgreementSignRequest extends Model
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

    // 业务链bizId
    /**
     * @var string
     */
    public $bizId;

    // 回调合约名称
    /**
     * @var string
     */
    public $contractId;

    // 业务共识合约名称
    /**
     * @var string
     */
    public $contractName;

    // 用户did身份
    /**
     * @var string
     */
    public $did;

    // 业务共识唯一标识
    /**
     * @var string
     */
    public $key;

    // 用户签名
    /**
     * @var string
     */
    public $signData;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'contractId'        => 'contract_id',
        'contractName'      => 'contract_name',
        'did'               => 'did',
        'key'               => 'key',
        'signData'          => 'sign_data',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('contractId', $this->contractId, true);
        Model::validateRequired('contractName', $this->contractName, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('key', $this->key, true);
        Model::validateRequired('signData', $this->signData, true);
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
        if (null !== $this->contractId) {
            $res['contract_id'] = $this->contractId;
        }
        if (null !== $this->contractName) {
            $res['contract_name'] = $this->contractName;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->signData) {
            $res['sign_data'] = $this->signData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBusinessAgreementSignRequest
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
        if (isset($map['contract_id'])) {
            $model->contractId = $map['contract_id'];
        }
        if (isset($map['contract_name'])) {
            $model->contractName = $map['contract_name'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['sign_data'])) {
            $model->signData = $map['sign_data'];
        }

        return $model;
    }
}
