<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockanalysisUnwriteoffvalueResponse extends Model {
    protected $_name = [
        'assetId' => 'asset_id',
        'tenantId' => 'tenant_id',
        'totalValue' => 'total_value',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->totalValue) {
            $res['total_value'] = $this->totalValue;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBlockanalysisUnwriteoffvalueResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['asset_id'])){
            $model->assetId = $map['asset_id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['total_value'])){
            $model->totalValue = $map['total_value'];
        }
        return $model;
    }
    /**
     * @description 资产ID
     * @example AssetID
     * @var string
     */
    public $assetId;

    /**
     * @description 租户ID
     * @example tenantID
     * @var string
     */
    public $tenantId;

    /**
     * @description 未核销的资产总额（单位：元）
     * @example 54.45
     * @var string
     */
    public $totalValue;

}
