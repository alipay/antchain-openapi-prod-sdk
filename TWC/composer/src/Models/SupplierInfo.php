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

    // 被代理机构社会统一信用码
    /**
     * @example 12345678
     *
     * @var string
     */
    public $agentSupplierCorpId;

    // 被代理机构名称
    /**
     * @example 阿里巴巴有限公司
     *
     * @var string
     */
    public $agentSupplierCorpName;

    // 被代理供应商名称
    /**
     * @example 阿里
     *
     * @var string
     */
    public $agentSupplierName;

    // 被代理机构的法人名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $agentSupplierCorpOwnerName;

    // 额外信息
    /**
     * @example {}
     *
     * @var string
     */
    public $extraInfo;
    protected $_name = [
        'agentSupplierId'            => 'agent_supplier_id',
        'agentSupplierCorpId'        => 'agent_supplier_corp_id',
        'agentSupplierCorpName'      => 'agent_supplier_corp_name',
        'agentSupplierName'          => 'agent_supplier_name',
        'agentSupplierCorpOwnerName' => 'agent_supplier_corp_owner_name',
        'extraInfo'                  => 'extra_info',
    ];

    public function validate()
    {
        Model::validateRequired('agentSupplierId', $this->agentSupplierId, true);
        Model::validateRequired('agentSupplierCorpId', $this->agentSupplierCorpId, true);
        Model::validateRequired('agentSupplierCorpName', $this->agentSupplierCorpName, true);
        Model::validateRequired('agentSupplierName', $this->agentSupplierName, true);
        Model::validateRequired('agentSupplierCorpOwnerName', $this->agentSupplierCorpOwnerName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->agentSupplierId) {
            $res['agent_supplier_id'] = $this->agentSupplierId;
        }
        if (null !== $this->agentSupplierCorpId) {
            $res['agent_supplier_corp_id'] = $this->agentSupplierCorpId;
        }
        if (null !== $this->agentSupplierCorpName) {
            $res['agent_supplier_corp_name'] = $this->agentSupplierCorpName;
        }
        if (null !== $this->agentSupplierName) {
            $res['agent_supplier_name'] = $this->agentSupplierName;
        }
        if (null !== $this->agentSupplierCorpOwnerName) {
            $res['agent_supplier_corp_owner_name'] = $this->agentSupplierCorpOwnerName;
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
        if (isset($map['agent_supplier_corp_id'])) {
            $model->agentSupplierCorpId = $map['agent_supplier_corp_id'];
        }
        if (isset($map['agent_supplier_corp_name'])) {
            $model->agentSupplierCorpName = $map['agent_supplier_corp_name'];
        }
        if (isset($map['agent_supplier_name'])) {
            $model->agentSupplierName = $map['agent_supplier_name'];
        }
        if (isset($map['agent_supplier_corp_owner_name'])) {
            $model->agentSupplierCorpOwnerName = $map['agent_supplier_corp_owner_name'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }

        return $model;
    }
}
