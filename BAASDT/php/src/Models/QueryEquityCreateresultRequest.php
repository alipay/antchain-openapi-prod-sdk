<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryEquityCreateresultRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'createEquityRequestId' => 'create_equity_request_id',
        'delegatedTenantId' => 'delegated_tenant_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->createEquityRequestId) {
            $res['create_equity_request_id'] = $this->createEquityRequestId;
        }
        if (null !== $this->delegatedTenantId) {
            $res['delegated_tenant_id'] = $this->delegatedTenantId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryEquityCreateresultRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['create_equity_request_id'])){
            $model->createEquityRequestId = $map['create_equity_request_id'];
        }
        if(isset($map['delegated_tenant_id'])){
            $model->delegatedTenantId = $map['delegated_tenant_id'];
        }
        return $model;
    }
    /**
     * @description 链ID
     * @example antdao
     * @var string
     */
    public $chainId;

    /**
     * @description 异步发布权益结果查询ID
     * @example 234763abc56
     * @var string
     */
    public $createEquityRequestId;

    /**
     * @description 要代理操作的租户ID
     * @example delegated_tenant_id
     * @var string
     */
    public $delegatedTenantId;

}
