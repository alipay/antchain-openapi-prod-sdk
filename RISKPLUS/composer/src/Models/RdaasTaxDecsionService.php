<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RdaasTaxDecsionService extends Model
{
    // 决策服务id
    /**
     * @example 1
     *
     * @var string
     */
    public $id;

    // 产品编码
    /**
     * @example 13
     *
     * @var string
     */
    public $serviceName;

    // 区域编码
    /**
     * @example SJ_ALL
     *
     * @var string
     */
    public $serviceZone;

    // 渠道
    /**
     * @example HZSZKJ
     *
     * @var string
     */
    public $channel;

    // 决策租户
    /**
     * @example DEFAULT
     *
     * @var string
     */
    public $decisionTenant;

    // 是否启用
    /**
     * @example enabled
     *
     * @var string
     */
    public $status;

    // 创建时间，格式:yyyy-MM-dd HH:mm:ss
    /**
     * @example 创建时间，格式:yyyy-MM-dd HH:mm:ss
     *
     * @var string
     */
    public $createTime;
    protected $_name = [
        'id'             => 'id',
        'serviceName'    => 'service_name',
        'serviceZone'    => 'service_zone',
        'channel'        => 'channel',
        'decisionTenant' => 'decision_tenant',
        'status'         => 'status',
        'createTime'     => 'create_time',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('serviceName', $this->serviceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->serviceName) {
            $res['service_name'] = $this->serviceName;
        }
        if (null !== $this->serviceZone) {
            $res['service_zone'] = $this->serviceZone;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->decisionTenant) {
            $res['decision_tenant'] = $this->decisionTenant;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RdaasTaxDecsionService
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['service_name'])) {
            $model->serviceName = $map['service_name'];
        }
        if (isset($map['service_zone'])) {
            $model->serviceZone = $map['service_zone'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['decision_tenant'])) {
            $model->decisionTenant = $map['decision_tenant'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }

        return $model;
    }
}
