<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RdaasTaxDecsionServiceIndicator extends Model
{
    // 决策指标id
    /**
     * @example 决策指标id
     *
     * @var string
     */
    public $id;

    // 决策服务id
    /**
     * @example 700002
     *
     * @var string
     */
    public $serviceId;

    // 属性名
    /**
     * @example weight
     *
     * @var string
     */
    public $propertyName;

    // 属性值或指标值
    /**
     * @example 100
     *
     * @var string
     */
    public $propertyValue;

    // 决策租户
    /**
     * @example DEFAULT
     *
     * @var string
     */
    public $decisionTenant;

    // 创建时间，格式:yyyy-MM-dd HH:mm:ss
    /**
     * @example 创建时间，格式:yyyy-MM-dd HH:mm:ss
     *
     * @var string
     */
    public $createTime;
    protected $_name = [
        'id'             => 'id',
        'serviceId'      => 'service_id',
        'propertyName'   => 'property_name',
        'propertyValue'  => 'property_value',
        'decisionTenant' => 'decision_tenant',
        'createTime'     => 'create_time',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('propertyName', $this->propertyName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->propertyName) {
            $res['property_name'] = $this->propertyName;
        }
        if (null !== $this->propertyValue) {
            $res['property_value'] = $this->propertyValue;
        }
        if (null !== $this->decisionTenant) {
            $res['decision_tenant'] = $this->decisionTenant;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RdaasTaxDecsionServiceIndicator
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['property_name'])) {
            $model->propertyName = $map['property_name'];
        }
        if (isset($map['property_value'])) {
            $model->propertyValue = $map['property_value'];
        }
        if (isset($map['decision_tenant'])) {
            $model->decisionTenant = $map['decision_tenant'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }

        return $model;
    }
}
