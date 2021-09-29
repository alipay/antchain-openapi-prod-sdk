<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SupplierInfo extends Model
{
    // 供应商id
    /**
     * @example ABCDEFGH
     *
     * @var string
     */
    public $agentSupplierId;

    // 被代理供应商名称
    /**
     * @example 戴尔
     *
     * @var string
     */
    public $agentSupplierName;

    // 额外信息
    /**
     * @example {}
     *
     * @var string
     */
    public $extraInfo;
    protected $_name = [
        'agentSupplierId'   => 'agent_supplier_id',
        'agentSupplierName' => 'agent_supplier_name',
        'extraInfo'         => 'extra_info',
    ];

    public function validate()
    {
        Model::validateRequired('agentSupplierId', $this->agentSupplierId, true);
        Model::validateRequired('agentSupplierName', $this->agentSupplierName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->agentSupplierId) {
            $res['agent_supplier_id'] = $this->agentSupplierId;
        }
        if (null !== $this->agentSupplierName) {
            $res['agent_supplier_name'] = $this->agentSupplierName;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SupplierInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['agent_supplier_id'])) {
            $model->agentSupplierId = $map['agent_supplier_id'];
        }
        if (isset($map['agent_supplier_name'])) {
            $model->agentSupplierName = $map['agent_supplier_name'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }

        return $model;
    }
}
