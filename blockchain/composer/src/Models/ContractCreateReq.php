<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ContractCreateReq extends Model
{
    // 链ID
    /**
     * @example 284f75bc-8069-443f-9d46-4576bb15f210
     *
     * @var string
     */
    public $chainId;

    // 合约模板标识
    /**
     * @example cme2023072511571851e2f3
     *
     * @var string
     */
    public $templateId;

    // 合约名称
    /**
     * @example 资产合约
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'chainId'    => 'chain_id',
        'templateId' => 'template_id',
        'name'       => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
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
     * @return ContractCreateReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
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
