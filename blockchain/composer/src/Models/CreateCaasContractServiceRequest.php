<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateCaasContractServiceRequest extends Model
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

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 联盟ID
    /**
     * @var string
     */
    public $unionId;

    // 合约模板标识
    /**
     * @var string
     */
    public $templateId;

    // 合约名称
    /**
     * @var string
     */
    public $name;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'chainId'           => 'chain_id',
        'unionId'           => 'union_id',
        'templateId'        => 'template_id',
        'name'              => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('unionId', $this->unionId, true);
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateMaxLength('chainId', $this->chainId, 64);
        Model::validateMaxLength('templateId', $this->templateId, 64);
        Model::validateMaxLength('name', $this->name, 64);
        Model::validateMinLength('chainId', $this->chainId, 1);
        Model::validateMinLength('templateId', $this->templateId, 1);
        Model::validateMinLength('name', $this->name, 1);
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
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->unionId) {
            $res['union_id'] = $this->unionId;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateCaasContractServiceRequest
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
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['union_id'])) {
            $model->unionId = $map['union_id'];
        }
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
