<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateBusinessContractencryptcallRequest extends Model
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

    // 具体数据的定义，加密在服务端，需传入原始值、类型及key等相关信息
    /**
     * @var ContractEncryptKeyItem[]
     */
    public $data;

    // 调用合约者用户身份
    /**
     * @var string
     */
    public $did;

    // 合约方法名
    /**
     * @var string
     */
    public $methodSignature;

    // 返回值类型
    /**
     * @var string
     */
    public $outputType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'contractName'      => 'contract_name',
        'contractType'      => 'contract_type',
        'data'              => 'data',
        'did'               => 'did',
        'methodSignature'   => 'method_signature',
        'outputType'        => 'output_type',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('contractName', $this->contractName, true);
        Model::validateRequired('contractType', $this->contractType, true);
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('methodSignature', $this->methodSignature, true);
        Model::validateRequired('outputType', $this->outputType, true);
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
        if (null !== $this->data) {
            $res['data'] = [];
            if (null !== $this->data && \is_array($this->data)) {
                $n = 0;
                foreach ($this->data as $item) {
                    $res['data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->methodSignature) {
            $res['method_signature'] = $this->methodSignature;
        }
        if (null !== $this->outputType) {
            $res['output_type'] = $this->outputType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBusinessContractencryptcallRequest
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
        if (isset($map['data'])) {
            if (!empty($map['data'])) {
                $model->data = [];
                $n           = 0;
                foreach ($map['data'] as $item) {
                    $model->data[$n++] = null !== $item ? ContractEncryptKeyItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['method_signature'])) {
            $model->methodSignature = $map['method_signature'];
        }
        if (isset($map['output_type'])) {
            $model->outputType = $map['output_type'];
        }

        return $model;
    }
}
