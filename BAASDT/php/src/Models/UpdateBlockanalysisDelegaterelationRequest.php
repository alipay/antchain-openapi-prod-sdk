<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UpdateBlockanalysisDelegaterelationRequest extends Model {
    protected $_name = [
        'delegatedTenantId' => 'delegated_tenant_id',
        'optTenantId' => 'opt_tenant_id',
        'optType' => 'opt_type',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->delegatedTenantId) {
            $res['delegated_tenant_id'] = $this->delegatedTenantId;
        }
        if (null !== $this->optTenantId) {
            $res['opt_tenant_id'] = $this->optTenantId;
        }
        if (null !== $this->optType) {
            $res['opt_type'] = $this->optType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateBlockanalysisDelegaterelationRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['delegated_tenant_id'])){
            $model->delegatedTenantId = $map['delegated_tenant_id'];
        }
        if(isset($map['opt_tenant_id'])){
            $model->optTenantId = $map['opt_tenant_id'];
        }
        if(isset($map['opt_type'])){
            $model->optType = $map['opt_type'];
        }
        return $model;
    }
    /**
     * @description 被代理的租户ID
     * @example IKAHGTUH
     * @var string
     */
    public $delegatedTenantId;

    /**
     * @description 代理租户ID
     * @example HUYOIUJN
     * @var string
     */
    public $optTenantId;

    /**
     * @description 操作类型，ADD表示添加，SUB表示撤销
     * @example ADD | SUB
     * @var string
     */
    public $optType;

}
