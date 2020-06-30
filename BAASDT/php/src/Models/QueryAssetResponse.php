<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryAssetResponse extends Model {
    protected $_name = [
        'asset' => 'asset',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->asset) {
            $res['asset'] = null !== $this->asset ? $this->asset->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAssetResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['asset'])){
            $model->asset = Asset::fromMap($map['asset']);
        }
        return $model;
    }
    /**
     * @description 资产完整信息
{
            "asset_id": "CT::Asset001",
            "asset_name": "CTPoints",
            "tenant_id": "OREDKOCN",
            "admin_id": "f46857d8796fc2b829862e2752bda38f7eefeec5581ad41398002f50a3ad8ccd",
            "currency": "CNY",
            "asset_rate": "1000.0000",
            "total_issue_balance": "11111111.0000",
            "issue_account_balance": "0.0000",
            "relay_Account_balance": "0.0000",
            "receive_payment_account_balance": "0.0000",
            "overdue_recovery_account_balance": "",
            "status": 76,
            "asset_ext_info": {
                "dispense_tenant_id": "",
                "dispense_balance": "",
                "user_id": "",
                "user_credit_balance": ""
            }
        }
     * @example 
     * @var Asset
     */
    public $asset;

}
