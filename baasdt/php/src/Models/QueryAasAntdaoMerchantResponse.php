<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryAasAntdaoMerchantResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'blockNumber' => 'block_number',
        'merchant' => 'merchant',
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
     * @return QueryAasAntdaoMerchantResponse
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
        if(isset($map['block_number'])){
            $model->blockNumber = $map['block_number'];
        }
        if(isset($map['merchant'])){
            $model->merchant = Merchant::fromMap($map['merchant']);
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

    // 查询商户信息时的区块高度
    /**
     * @var integer
     */
    public $blockNumber;

    // 商户完整信息
    // {
    // "tenant_id": "Z",
    // "did": "did:mychain:ct",
    // "admin_id": "ed7b3acb718e2f91bc8fab6a5e7cc3c061",
    // "fund_manager_id": "b7ecd55bde04827b3e611a741d",
    // "description": "SK",
    // "is_equity_provider": true,
    // "is_equity_consumer": true,
    // "is_asset_issuer": true,
    // "status": 0,
    // "provision": {
    // "currency": "CNY",
    // "debit": "99999999.0000",
    // "credit_max": "99999999.0000",
    // "credit_used": "0.0000"
    // }
    // }
    /**
     * @var Merchant
     */
    public $merchant;

}
