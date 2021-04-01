<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryBusinessContractencryptmethodRequest extends Model
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

    // 合约链所在地址
    /**
     * @var string
     */
    public $bizId;

    // 合约名称
    /**
     * @var string
     */
    public $contractName;

    // 合约类型
    /**
     * @var int
     */
    public $contractType;

    // 用户的did身份
    /**
     * @var string
     */
    public $did;

    // 输入参数
    /**
     * @var string
     */
    public $inputData;

    // 查询方法名接口
    /**
     * @var string
     */
    public $methodSignature;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'contractName'      => 'contract_name',
        'contractType'      => 'contract_type',
        'did'               => 'did',
        'inputData'         => 'input_data',
        'methodSignature'   => 'method_signature',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('contractName', $this->contractName, true);
        Model::validateRequired('contractType', $this->contractType, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('inputData', $this->inputData, true);
        Model::validateRequired('methodSignature', $this->methodSignature, true);
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
        if (null !== $this->contractName) {
            $res['contract_name'] = $this->contractName;
        }
        if (null !== $this->contractType) {
            $res['contract_type'] = $this->contractType;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->inputData) {
            $res['input_data'] = $this->inputData;
        }
        if (null !== $this->methodSignature) {
            $res['method_signature'] = $this->methodSignature;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBusinessContractencryptmethodRequest
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
        if (isset($map['contract_name'])) {
            $model->contractName = $map['contract_name'];
        }
        if (isset($map['contract_type'])) {
            $model->contractType = $map['contract_type'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['input_data'])) {
            $model->inputData = $map['input_data'];
        }
        if (isset($map['method_signature'])) {
            $model->methodSignature = $map['method_signature'];
        }

        return $model;
    }
}
