<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CommissionResult extends Model {
    protected $_name = [
        'beginTime' => 'begin_time',
        'commission' => 'commission',
        'commissionId' => 'commission_id',
        'endTime' => 'end_time',
        'equityType' => 'equity_type',
        'status' => 'status',
        'tenantId' => 'tenant_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->beginTime) {
            $res['begin_time'] = $this->beginTime;
        }
        if (null !== $this->commission) {
            $res['commission'] = $this->commission;
        }
        if (null !== $this->commissionId) {
            $res['commission_id'] = $this->commissionId;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->equityType) {
            $res['equity_type'] = $this->equityType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CommissionResult
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['begin_time'])){
            $model->beginTime = $map['begin_time'];
        }
        if(isset($map['commission'])){
            $model->commission = $map['commission'];
        }
        if(isset($map['commission_id'])){
            $model->commissionId = $map['commission_id'];
        }
        if(isset($map['end_time'])){
            $model->endTime = $map['end_time'];
        }
        if(isset($map['equity_type'])){
            $model->equityType = $map['equity_type'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        return $model;
    }
    // 手续费生效时间
    /**
     * @example 1588867200000
     * @var integer
     */
    public $beginTime;

    // 手续费
    /**
     * @example 0.01
     * @var string
     */
    public $commission;

    // 手续费信息ID
    /**
     * @example CommissionID
     * @var string
     */
    public $commissionId;

    // 手续费失效时间
    /**
     * @example 1588867200000
     * @var integer
     */
    public $endTime;

    // 商品类型
    /**
     * @example 100020001
     * @var integer
     */
    public $equityType;

    // 手续费状态（0可用，1停用，2禁用）
    /**
     * @example 0
     * @var integer
     */
    public $status;

    // 租户ID
    /**
     * @example JNIUYGTR
     * @var string
     */
    public $tenantId;

}
