<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryAasAntdaoAssetResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'asset' => 'asset',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->asset) {
            $res['asset'] = null !== $this->asset ? $this->asset->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAasAntdaoAssetResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['asset'])){
            $model->asset = Asset::fromMap($map['asset']);
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 资产完整信息
    // {
    // "asset_id": "CT::Asset001",
    // "asset_name": "CTPoints",
    // "tenant_id": "OREDKOCN",
    // "admin_id": "f46857d8796fc2b829862e2752bda38f7eefeec5581ad41398002f50a3ad8ccd",
    // "currency": "CNY",
    // "asset_rate": "1000.0000",
    // "total_issue_balance": "11111111.0000",
    // "issue_account_balance": "0.0000",
    // "relay_Account_balance": "0.0000",
    // "receive_payment_account_balance": "0.0000",
    // "overdue_recovery_account_balance": "",
    // "status": 76,
    // "asset_ext_info": {
    // "dispense_tenant_id": "",
    // "dispense_balance": "",
    // "user_id": "",
    // "user_credit_balance": ""
    // }
    // }
    /**
     * @var Asset
     */
    public $asset;

}
