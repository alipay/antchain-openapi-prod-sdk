<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SECURITYTECH\Models\PoiMallPointRechargeInfo;

class RechargePoiMallpointRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pointRechargeInfoList' => 'point_recharge_info_list',
    ];
    public function validate() {
        Model::validateRequired('pointRechargeInfoList', $this->pointRechargeInfoList, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->pointRechargeInfoList) {
            $res['point_recharge_info_list'] = [];
            if(null !== $this->pointRechargeInfoList && is_array($this->pointRechargeInfoList)){
                $n = 0;
                foreach($this->pointRechargeInfoList as $item){
                    $res['point_recharge_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RechargePoiMallpointRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['point_recharge_info_list'])){
            if(!empty($map['point_recharge_info_list'])){
                $model->pointRechargeInfoList = [];
                $n = 0;
                foreach($map['point_recharge_info_list'] as $item) {
                    $model->pointRechargeInfoList[$n++] = null !== $item ? PoiMallPointRechargeInfo::fromMap($item) : $item;
                }
            }
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

    // 积分充值列表
    /**
     * @var PoiMallPointRechargeInfo[]
     */
    public $pointRechargeInfoList;

}
