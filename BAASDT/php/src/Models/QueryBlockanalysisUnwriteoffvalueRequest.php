<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockanalysisUnwriteoffvalueRequest extends Model {
    protected $_name = [
        'assetId' => 'asset_id',
        'chainId' => 'chain_id',
        'optTenantId' => 'opt_tenant_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->optTenantId) {
            $res['opt_tenant_id'] = $this->optTenantId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBlockanalysisUnwriteoffvalueRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['asset_id'])){
            $model->assetId = $map['asset_id'];
        }
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['opt_tenant_id'])){
            $model->optTenantId = $map['opt_tenant_id'];
        }
        return $model;
    }
    /**
     * @description 资产ID
     * @example asset001
     * @var string
     */
    public $assetId;

    /**
     * @description 链ID
     * @example antdao
     * @var string
     */
    public $chainId;

    /**
     * @description 要查询的租户ID
     * @example GYDUYT
     * @var string
     */
    public $optTenantId;

}
