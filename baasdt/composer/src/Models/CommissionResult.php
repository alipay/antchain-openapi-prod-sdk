<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CommissionResult extends Model
{
    // 手续费生效时间
    /**
     * @example 1588867200000
     *
     * @var int
     */
    public $beginTime;

    // 手续费
    /**
     * @example 0.01
     *
     * @var string
     */
    public $commission;

    // 手续费信息ID
    /**
     * @example 40000
     *
     * @var string
     */
    public $commissionId;

    // 手续费状态（0可用，1停用，2禁用）
    /**
     * @example 0
     *
     * @var int
     */
    public $commissionStatus;

    // 手续费失效时间
    /**
     * @example 1588867200000
     *
     * @var int
     */
    public $endTime;

    // 商品类型
    /**
     * @example 100020001
     *
     * @var int
     */
    public $equityType;

    // 租户ID
    /**
     * @example JNIUYGTR
     *
     * @var string
     */
    public $tenantId;

    // 手续费信息ID
    /**
     * @example 40000#0
     *
     * @var string
     */
    public $commissionSubId;
    protected $_name = [
        'beginTime'        => 'begin_time',
        'commission'       => 'commission',
        'commissionId'     => 'commission_id',
        'commissionStatus' => 'commission_status',
        'endTime'          => 'end_time',
        'equityType'       => 'equity_type',
        'tenantId'         => 'tenant_id',
        'commissionSubId'  => 'commission_sub_id',
    ];

    public function validate()
    {
        Model::validateRequired('beginTime', $this->beginTime, true);
        Model::validateRequired('commission', $this->commission, true);
        Model::validateRequired('commissionId', $this->commissionId, true);
        Model::validateRequired('commissionStatus', $this->commissionStatus, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('equityType', $this->equityType, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('commissionSubId', $this->commissionSubId, true);
    }

    public function toMap()
    {
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
        if (null !== $this->commissionStatus) {
            $res['commission_status'] = $this->commissionStatus;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->equityType) {
            $res['equity_type'] = $this->equityType;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->commissionSubId) {
            $res['commission_sub_id'] = $this->commissionSubId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CommissionResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['begin_time'])) {
            $model->beginTime = $map['begin_time'];
        }
        if (isset($map['commission'])) {
            $model->commission = $map['commission'];
        }
        if (isset($map['commission_id'])) {
            $model->commissionId = $map['commission_id'];
        }
        if (isset($map['commission_status'])) {
            $model->commissionStatus = $map['commission_status'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['equity_type'])) {
            $model->equityType = $map['equity_type'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['commission_sub_id'])) {
            $model->commissionSubId = $map['commission_sub_id'];
        }

        return $model;
    }
}
