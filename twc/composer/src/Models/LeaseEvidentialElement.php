<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class LeaseEvidentialElement extends Model
{
    // 订单信息
    /**
     * @example
     *
     * @var LeaseOrderInfo
     */
    public $leaseOrderInfo;

    // 承诺信息
    /**
     * @example
     *
     * @var CommitmentInfo
     */
    public $commitmentInfo;

    // 物流信息
    /**
     * @example
     *
     * @var LogisticsInfo
     */
    public $logisticsInfo;

    // 履约信息
    /**
     * @example
     *
     * @var PerformanceInfo
     */
    public $performanceInfo;
    protected $_name = [
        'leaseOrderInfo'  => 'lease_order_info',
        'commitmentInfo'  => 'commitment_info',
        'logisticsInfo'   => 'logistics_info',
        'performanceInfo' => 'performance_info',
    ];

    public function validate()
    {
        Model::validateRequired('leaseOrderInfo', $this->leaseOrderInfo, true);
        Model::validateRequired('commitmentInfo', $this->commitmentInfo, true);
        Model::validateRequired('logisticsInfo', $this->logisticsInfo, true);
        Model::validateRequired('performanceInfo', $this->performanceInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->leaseOrderInfo) {
            $res['lease_order_info'] = null !== $this->leaseOrderInfo ? $this->leaseOrderInfo->toMap() : null;
        }
        if (null !== $this->commitmentInfo) {
            $res['commitment_info'] = null !== $this->commitmentInfo ? $this->commitmentInfo->toMap() : null;
        }
        if (null !== $this->logisticsInfo) {
            $res['logistics_info'] = null !== $this->logisticsInfo ? $this->logisticsInfo->toMap() : null;
        }
        if (null !== $this->performanceInfo) {
            $res['performance_info'] = null !== $this->performanceInfo ? $this->performanceInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LeaseEvidentialElement
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['lease_order_info'])) {
            $model->leaseOrderInfo = LeaseOrderInfo::fromMap($map['lease_order_info']);
        }
        if (isset($map['commitment_info'])) {
            $model->commitmentInfo = CommitmentInfo::fromMap($map['commitment_info']);
        }
        if (isset($map['logistics_info'])) {
            $model->logisticsInfo = LogisticsInfo::fromMap($map['logistics_info']);
        }
        if (isset($map['performance_info'])) {
            $model->performanceInfo = PerformanceInfo::fromMap($map['performance_info']);
        }

        return $model;
    }
}
