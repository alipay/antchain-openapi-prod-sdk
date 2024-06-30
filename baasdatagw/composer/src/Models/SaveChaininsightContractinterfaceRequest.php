<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class SaveChaininsightContractinterfaceRequest extends Model
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
    public $bizId;

    // 合约 / 存证账户地址
    /**
     * @var string
     */
    public $contract;

    // 生效块高
    /**
     * @var string
     */
    public $ver;

    // 接口类型，Function / Event
    /**
     * @var string
     */
    public $interfaceType;

    // 接口列表
    /**
     * @var ChainInsightContractInterface[]
     */
    public $contractInterfaces;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'bizId'              => 'biz_id',
        'contract'           => 'contract',
        'ver'                => 'ver',
        'interfaceType'      => 'interface_type',
        'contractInterfaces' => 'contract_interfaces',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('contract', $this->contract, true);
        Model::validateRequired('interfaceType', $this->interfaceType, true);
        Model::validateRequired('contractInterfaces', $this->contractInterfaces, true);
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
        if (null !== $this->contract) {
            $res['contract'] = $this->contract;
        }
        if (null !== $this->ver) {
            $res['ver'] = $this->ver;
        }
        if (null !== $this->interfaceType) {
            $res['interface_type'] = $this->interfaceType;
        }
        if (null !== $this->contractInterfaces) {
            $res['contract_interfaces'] = [];
            if (null !== $this->contractInterfaces && \is_array($this->contractInterfaces)) {
                $n = 0;
                foreach ($this->contractInterfaces as $item) {
                    $res['contract_interfaces'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveChaininsightContractinterfaceRequest
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
        if (isset($map['contract'])) {
            $model->contract = $map['contract'];
        }
        if (isset($map['ver'])) {
            $model->ver = $map['ver'];
        }
        if (isset($map['interface_type'])) {
            $model->interfaceType = $map['interface_type'];
        }
        if (isset($map['contract_interfaces'])) {
            if (!empty($map['contract_interfaces'])) {
                $model->contractInterfaces = [];
                $n                         = 0;
                foreach ($map['contract_interfaces'] as $item) {
                    $model->contractInterfaces[$n++] = null !== $item ? ChainInsightContractInterface::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
