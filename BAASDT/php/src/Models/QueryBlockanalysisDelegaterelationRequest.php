<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockanalysisDelegaterelationRequest extends Model {
    protected $_name = [
        'delegatedTenantId' => 'delegated_tenant_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->delegatedTenantId) {
            $res['delegated_tenant_id'] = $this->delegatedTenantId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBlockanalysisDelegaterelationRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['delegated_tenant_id'])){
            $model->delegatedTenantId = $map['delegated_tenant_id'];
        }
        return $model;
    }
    /**
     * @description 被代理的租户ID
     * @example OKIJUHYG
     * @var string
     */
    public $delegatedTenantId;

}
