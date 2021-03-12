<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateBusinessContractDeployRequest extends Model
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

    // 业务链对应的bizId
    /**
     * @var string
     */
    public $bizId;

    // 合约代码
    /**
     * @var string
     */
    public $contractCode;

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

    // 合约部署者did身份
    /**
     * @var string
     */
    public $did;

    // 构造函数传入参数
    /**
     * @var string
     */
    public $inputData;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'contractCode'      => 'contract_code',
        'contractName'      => 'contract_name',
        'contractType'      => 'contract_type',
        'did'               => 'did',
        'inputData'         => 'input_data',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('contractCode', $this->contractCode, true);
        Model::validateRequired('contractName', $this->contractName, true);
        Model::validateRequired('contractType', $this->contractType, true);
        Model::validateRequired('did', $this->did, true);
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
        if (null !== $this->contractCode) {
            $res['contract_code'] = $this->contractCode;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBusinessContractDeployRequest
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
        if (isset($map['contract_code'])) {
            $model->contractCode = $map['contract_code'];
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

        return $model;
    }
}
