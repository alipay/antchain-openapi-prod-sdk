<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\ReplenishInfo;

class SyncDubbridgeCustomRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'openId' => 'open_id',
        'replenishInfo' => 'replenish_info',
        'extInfo' => 'ext_info',
        'fundCode' => 'fund_code',
    ];
    public function validate() {
        Model::validateRequired('openId', $this->openId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->replenishInfo) {
            $res['replenish_info'] = null !== $this->replenishInfo ? $this->replenishInfo->toMap() : null;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->fundCode) {
            $res['fund_code'] = $this->fundCode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SyncDubbridgeCustomRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['open_id'])){
            $model->openId = $map['open_id'];
        }
        if(isset($map['replenish_info'])){
            $model->replenishInfo = ReplenishInfo::fromMap($map['replenish_info']);
        }
        if(isset($map['ext_info'])){
            $model->extInfo = $map['ext_info'];
        }
        if(isset($map['fund_code'])){
            $model->fundCode = $map['fund_code'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 资产方用户唯一标识
    /**
     * @var string
     */
    public $openId;

    // 补充信息
    /**
     * @var ReplenishInfo
     */
    public $replenishInfo;

    // 扩展信息，json格式字符串
    /**
     * @var string
     */
    public $extInfo;

    // 资金方编码
    /**
     * @var string
     */
    public $fundCode;

}
