<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class XrTicketPoolItem extends Model
{
    // 业务类型
    /**
     * @example XR_LEASE
     *
     * @var string
     */
    public $bizScene;

    // 通行证名称
    /**
     * @example 通行证名称
     *
     * @var string
     */
    public $xrTicketPoolName;

    // 资源id
    /**
     * @example 1
     *
     * @var string
     */
    public $resourceId;

    // 有效期
    /**
     * @example 2022-10-02
     *
     * @var string
     */
    public $validTime;

    // 体验时长
    /**
     * @example 15(单位分钟)
     *
     * @var int
     */
    public $testTime;

    // 通行证状态：EXPIRED：已过期  VALID：有效  SALED：已出售
    /**
     * @example 通行证状态
     *
     * @var string
     */
    public $status;

    // 判断已发放数量>0(USED：已使用)  判断已发放数量=0(NOT_USED：未使用)
    /**
     * @example USED
     *
     * @var string
     */
    public $useStatus;

    // 资源名称
    /**
     * @example 资源名称
     *
     * @var string
     */
    public $resourceName;

    // 设备集合
    /**
     * @example json 或数组
     *
     * @var string
     */
    public $xrApps;

    // 券池最大票数
    /**
     * @example 133
     *
     * @var int
     */
    public $maxPoolCount;

    // 租户id
    /**
     * @example ADSAERDS
     *
     * @var string
     */
    public $tenantId;

    // 核销类型
    /**
     * @example XR_DEVICE
     *
     * @var string
     */
    public $xrVerificationType;

    // 剩余可用券数量
    /**
     * @example 100
     *
     * @var int
     */
    public $surplusCount;

    // 已发放数量 （总数-剩余数量）
    /**
     * @example 12
     *
     * @var int
     */
    public $issuedCount;
    protected $_name = [
        'bizScene'           => 'biz_scene',
        'xrTicketPoolName'   => 'xr_ticket_pool_name',
        'resourceId'         => 'resource_id',
        'validTime'          => 'valid_time',
        'testTime'           => 'test_time',
        'status'             => 'status',
        'useStatus'          => 'use_status',
        'resourceName'       => 'resource_name',
        'xrApps'             => 'xr_apps',
        'maxPoolCount'       => 'max_pool_count',
        'tenantId'           => 'tenant_id',
        'xrVerificationType' => 'xr_verification_type',
        'surplusCount'       => 'surplus_count',
        'issuedCount'        => 'issued_count',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->xrTicketPoolName) {
            $res['xr_ticket_pool_name'] = $this->xrTicketPoolName;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->validTime) {
            $res['valid_time'] = $this->validTime;
        }
        if (null !== $this->testTime) {
            $res['test_time'] = $this->testTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->useStatus) {
            $res['use_status'] = $this->useStatus;
        }
        if (null !== $this->resourceName) {
            $res['resource_name'] = $this->resourceName;
        }
        if (null !== $this->xrApps) {
            $res['xr_apps'] = $this->xrApps;
        }
        if (null !== $this->maxPoolCount) {
            $res['max_pool_count'] = $this->maxPoolCount;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->xrVerificationType) {
            $res['xr_verification_type'] = $this->xrVerificationType;
        }
        if (null !== $this->surplusCount) {
            $res['surplus_count'] = $this->surplusCount;
        }
        if (null !== $this->issuedCount) {
            $res['issued_count'] = $this->issuedCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XrTicketPoolItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }
        if (isset($map['xr_ticket_pool_name'])) {
            $model->xrTicketPoolName = $map['xr_ticket_pool_name'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['valid_time'])) {
            $model->validTime = $map['valid_time'];
        }
        if (isset($map['test_time'])) {
            $model->testTime = $map['test_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['use_status'])) {
            $model->useStatus = $map['use_status'];
        }
        if (isset($map['resource_name'])) {
            $model->resourceName = $map['resource_name'];
        }
        if (isset($map['xr_apps'])) {
            $model->xrApps = $map['xr_apps'];
        }
        if (isset($map['max_pool_count'])) {
            $model->maxPoolCount = $map['max_pool_count'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['xr_verification_type'])) {
            $model->xrVerificationType = $map['xr_verification_type'];
        }
        if (isset($map['surplus_count'])) {
            $model->surplusCount = $map['surplus_count'];
        }
        if (isset($map['issued_count'])) {
            $model->issuedCount = $map['issued_count'];
        }

        return $model;
    }
}
