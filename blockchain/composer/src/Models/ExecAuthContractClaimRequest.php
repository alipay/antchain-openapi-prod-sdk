<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ExecAuthContractClaimRequest extends Model
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

    // 长度不超过64字符的业务流水唯一ID，用于对一个业务流的追踪，与请求中的biz_id一致方便业务方使用。
    /**
     * @var string
     */
    public $bizId;

    // 业务类型
    /**
     * @var string
     */
    public $bizType;

    // 合约名称
    /**
     * @var string
     */
    public $contractName;

    // 合约方法名称
    /**
     * @var string
     */
    public $functionName;

    // 合约入参类型，和 arguments对应， 取值类型： DOUBLE，STRING，INTEGER，LONG，FLOAT； 默认为String
    /**
     * @var string[]
     */
    public $arguments;

    // 保留参数，选填，目前暂未用到，合约入参类型，和 arguments对应 取值类型： DOUBLE，STRING，INTEGER，LONG，FLOAT；
    /**
     * @var string[]
     */
    public $types;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'bizType'           => 'biz_type',
        'contractName'      => 'contract_name',
        'functionName'      => 'function_name',
        'arguments'         => 'arguments',
        'types'             => 'types',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('contractName', $this->contractName, true);
        Model::validateRequired('functionName', $this->functionName, true);
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
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->contractName) {
            $res['contract_name'] = $this->contractName;
        }
        if (null !== $this->functionName) {
            $res['function_name'] = $this->functionName;
        }
        if (null !== $this->arguments) {
            $res['arguments'] = $this->arguments;
        }
        if (null !== $this->types) {
            $res['types'] = $this->types;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecAuthContractClaimRequest
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
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['contract_name'])) {
            $model->contractName = $map['contract_name'];
        }
        if (isset($map['function_name'])) {
            $model->functionName = $map['function_name'];
        }
        if (isset($map['arguments'])) {
            if (!empty($map['arguments'])) {
                $model->arguments = $map['arguments'];
            }
        }
        if (isset($map['types'])) {
            if (!empty($map['types'])) {
                $model->types = $map['types'];
            }
        }

        return $model;
    }
}
