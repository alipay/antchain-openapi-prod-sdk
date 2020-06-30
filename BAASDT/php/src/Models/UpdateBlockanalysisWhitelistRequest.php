<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UpdateBlockanalysisWhitelistRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'optTenantId' => 'opt_tenant_id',
        'optType' => 'opt_type',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
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
     * @return UpdateBlockanalysisWhitelistRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
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
     * @description 链ID
     * @example antdao
     * @var string
     */
    public $chainId;

    /**
     * @description 租户ID
     * @example IJKOUYTF
     * @var string
     */
    public $optTenantId;

    /**
     * @description 操作类型
     * @example ADD | SUB
     * @var string
     */
    public $optType;

}
