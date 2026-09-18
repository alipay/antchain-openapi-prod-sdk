<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class PoiMallPointRechargeResult extends Model {
    protected $_name = [
        'succeedRechargeIds' => 'succeed_recharge_ids',
        'failedRechargeIds' => 'failed_recharge_ids',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->succeedRechargeIds) {
            $res['succeed_recharge_ids'] = $this->succeedRechargeIds;
        }
        if (null !== $this->failedRechargeIds) {
            $res['failed_recharge_ids'] = $this->failedRechargeIds;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PoiMallPointRechargeResult
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['succeed_recharge_ids'])){
            if(!empty($map['succeed_recharge_ids'])){
                $model->succeedRechargeIds = $map['succeed_recharge_ids'];
            }
        }
        if(isset($map['failed_recharge_ids'])){
            if(!empty($map['failed_recharge_ids'])){
                $model->failedRechargeIds = $map['failed_recharge_ids'];
            }
        }
        return $model;
    }
    // 充值成功的ID列表
    /**
     * @example undefined
     * @var string[]
     */
    public $succeedRechargeIds;

    // 充值失败的ID列表（全部成功时为空）
    /**
     * @example undefined
     * @var string[]
     */
    public $failedRechargeIds;

}
