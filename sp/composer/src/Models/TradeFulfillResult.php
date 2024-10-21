<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class TradeFulfillResult extends Model
{
    // 履约单据号，可用于作为幂等依据
    /**
     * @example 20220429174600FL00240000000003#1000
     *
     * @var string
     */
    public $fulfillOrderNo;

    // 履约枚举，生产-PROVISION，停服-STOP，释放-RELEASE，恢复/RESUME
    //
    /**
     * @example PROVISION
     *
     * @var string
     */
    public $fulfillType;

    // 租户ID
    /**
     * @example 2088241332274240
     *
     * @var string
     */
    public $tenantId;

    // 主商品编码
    /**
     * @example ZLPTFM00013689
     *
     * @var string
     */
    public $commodityCode;

    // 履约实例ID
    /**
     * @example A0BQBHFM00034877FVDJWUXR1ZXEMOD1U4G
     *
     * @var string
     */
    public $instanceId;
    protected $_name = [
        'fulfillOrderNo' => 'fulfill_order_no',
        'fulfillType'    => 'fulfill_type',
        'tenantId'       => 'tenant_id',
        'commodityCode'  => 'commodity_code',
        'instanceId'     => 'instance_id',
    ];

    public function validate()
    {
        Model::validateRequired('fulfillOrderNo', $this->fulfillOrderNo, true);
        Model::validateRequired('fulfillType', $this->fulfillType, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('commodityCode', $this->commodityCode, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fulfillOrderNo) {
            $res['fulfill_order_no'] = $this->fulfillOrderNo;
        }
        if (null !== $this->fulfillType) {
            $res['fulfill_type'] = $this->fulfillType;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TradeFulfillResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['fulfill_order_no'])) {
            $model->fulfillOrderNo = $map['fulfill_order_no'];
        }
        if (isset($map['fulfill_type'])) {
            $model->fulfillType = $map['fulfill_type'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['commodity_code'])) {
            $model->commodityCode = $map['commodity_code'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }

        return $model;
    }
}
