<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryMerchantResponse extends Model {
    protected $_name = [
        'blockNumber' => 'block_number',
        'merchant' => 'merchant',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->blockNumber) {
            $res['block_number'] = $this->blockNumber;
        }
        if (null !== $this->merchant) {
            $res['merchant'] = null !== $this->merchant ? $this->merchant->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMerchantResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['block_number'])){
            $model->blockNumber = $map['block_number'];
        }
        if(isset($map['merchant'])){
            $model->merchant = Merchant::fromMap($map['merchant']);
        }
        return $model;
    }
    /**
     * @description 查询商户信息时的区块高度
     * @example 7855839
     * @var integer
     */
    public $blockNumber;

    /**
     * @description 商户完整信息
{
            "tenant_id": "Z",
            "did": "did:mychain:ct",
            "admin_id": "ed7b3acb718e2f91bc8fab6a5e7cc3c061",
            "fund_manager_id": "b7ecd55bde04827b3e611a741d",
            "description": "SK",
            "is_equity_provider": true,
            "is_equity_consumer": true,
            "is_asset_issuer": true,
            "status": 0,
            "provision": {
                "currency": "CNY",
                "debit": "99999999.0000",
                "credit_max": "99999999.0000",
                "credit_used": "0.0000"
            }
        }
     * @example 
     * @var Merchant
     */
    public $merchant;

}
