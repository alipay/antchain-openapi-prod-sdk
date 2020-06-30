<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryConfigWhitelistRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'tenantId' => 'tenant_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryConfigWhitelistRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        return $model;
    }
    /**
     * @description 查询链的白名单信息
     * @example antdao
     * @var string
     */
    public $chainId;

    /**
     * @description 查询该租户的白名单信息
     * @example 租户ID
     * @var string
     */
    public $tenantId;

}
