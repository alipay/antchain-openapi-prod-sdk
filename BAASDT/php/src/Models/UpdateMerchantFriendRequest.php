<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UpdateMerchantFriendRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'friendTenantId' => 'friend_tenant_id',
        'outTxId' => 'out_tx_id',
        'type' => 'type',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->friendTenantId) {
            $res['friend_tenant_id'] = $this->friendTenantId;
        }
        if (null !== $this->outTxId) {
            $res['out_tx_id'] = $this->outTxId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateMerchantFriendRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['friend_tenant_id'])){
            $model->friendTenantId = $map['friend_tenant_id'];
        }
        if(isset($map['out_tx_id'])){
            $model->outTxId = $map['out_tx_id'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
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
     * @description 友好商户租户ID
     * @example IHATYSF
     * @var string
     */
    public $friendTenantId;

    /**
     * @description 外部交易ID
     * @example bizID532486
     * @var string
     */
    public $outTxId;

    /**
     * @description 更新类型
     * @example ADD | SUB
     * @var string
     */
    public $type;

}
