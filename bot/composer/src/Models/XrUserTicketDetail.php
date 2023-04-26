<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class XrUserTicketDetail extends Model
{
    // 业务类型
    /**
     * @example XR_LEASE
     *
     * @var string
     */
    public $bizScene;

    // 所属客户
    /**
     * @example QWERTYUI
     *
     * @var string
     */
    public $tenantId;

    // 用户通行证编码
    /**
     * @example 8613356
     *
     * @var string
     */
    public $xrTicketCode;

    // xr通行证资源池名称
    /**
     * @example 资源池001
     *
     * @var string
     */
    public $xrTicketPoolName;

    // 用户id
    /**
     * @example 2088**
     *
     * @var string
     */
    public $userId;

    // 资源id
    /**
     * @example xsadds
     *
     * @var string
     */
    public $resourceId;

    // 资源名称
    /**
     * @example 资源001
     *
     * @var string
     */
    public $resourceName;

    // 用户通行证状态
    /**
     * @example 待核销
     *
     * @var string
     */
    public $status;

    // 有效期
    /**
     * @example 2023-03-28
     *
     * @var string
     */
    public $validTime;

    // 实例id
    /**
     * @example 86871
     *
     * @var string
     */
    public $instanceId;

    // 核销时间
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $xrVerificationTime;

    // 体验开始时间
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $sampleStartTime;

    // 体验结束时间
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $sampleEndTime;

    // 核销类型
    /**
     * @example XR_DEVICE
     *
     * @var string
     */
    public $xrVerificationType;

    // 实例名称
    /**
     * @example 实例001
     *
     * @var string
     */
    public $instanceName;

    // 体验时长，分
    /**
     * @example 60
     *
     * @var string
     */
    public $testTime;

    // vr应用集合
    /**
     * @example vr应用集合
     *
     * @var string
     */
    public $xrApps;
    protected $_name = [
        'bizScene'           => 'biz_scene',
        'tenantId'           => 'tenant_id',
        'xrTicketCode'       => 'xr_ticket_code',
        'xrTicketPoolName'   => 'xr_ticket_pool_name',
        'userId'             => 'user_id',
        'resourceId'         => 'resource_id',
        'resourceName'       => 'resource_name',
        'status'             => 'status',
        'validTime'          => 'valid_time',
        'instanceId'         => 'instance_id',
        'xrVerificationTime' => 'xr_verification_time',
        'sampleStartTime'    => 'sample_start_time',
        'sampleEndTime'      => 'sample_end_time',
        'xrVerificationType' => 'xr_verification_type',
        'instanceName'       => 'instance_name',
        'testTime'           => 'test_time',
        'xrApps'             => 'xr_apps',
    ];

    public function validate()
    {
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('xrTicketCode', $this->xrTicketCode, true);
        Model::validateRequired('xrTicketPoolName', $this->xrTicketPoolName, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('resourceId', $this->resourceId, true);
        Model::validateRequired('resourceName', $this->resourceName, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('validTime', $this->validTime, true);
        Model::validateRequired('xrVerificationType', $this->xrVerificationType, true);
        Model::validateRequired('testTime', $this->testTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->xrTicketCode) {
            $res['xr_ticket_code'] = $this->xrTicketCode;
        }
        if (null !== $this->xrTicketPoolName) {
            $res['xr_ticket_pool_name'] = $this->xrTicketPoolName;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->resourceName) {
            $res['resource_name'] = $this->resourceName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->validTime) {
            $res['valid_time'] = $this->validTime;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->xrVerificationTime) {
            $res['xr_verification_time'] = $this->xrVerificationTime;
        }
        if (null !== $this->sampleStartTime) {
            $res['sample_start_time'] = $this->sampleStartTime;
        }
        if (null !== $this->sampleEndTime) {
            $res['sample_end_time'] = $this->sampleEndTime;
        }
        if (null !== $this->xrVerificationType) {
            $res['xr_verification_type'] = $this->xrVerificationType;
        }
        if (null !== $this->instanceName) {
            $res['instance_name'] = $this->instanceName;
        }
        if (null !== $this->testTime) {
            $res['test_time'] = $this->testTime;
        }
        if (null !== $this->xrApps) {
            $res['xr_apps'] = $this->xrApps;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XrUserTicketDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['xr_ticket_code'])) {
            $model->xrTicketCode = $map['xr_ticket_code'];
        }
        if (isset($map['xr_ticket_pool_name'])) {
            $model->xrTicketPoolName = $map['xr_ticket_pool_name'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['resource_name'])) {
            $model->resourceName = $map['resource_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['valid_time'])) {
            $model->validTime = $map['valid_time'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['xr_verification_time'])) {
            $model->xrVerificationTime = $map['xr_verification_time'];
        }
        if (isset($map['sample_start_time'])) {
            $model->sampleStartTime = $map['sample_start_time'];
        }
        if (isset($map['sample_end_time'])) {
            $model->sampleEndTime = $map['sample_end_time'];
        }
        if (isset($map['xr_verification_type'])) {
            $model->xrVerificationType = $map['xr_verification_type'];
        }
        if (isset($map['instance_name'])) {
            $model->instanceName = $map['instance_name'];
        }
        if (isset($map['test_time'])) {
            $model->testTime = $map['test_time'];
        }
        if (isset($map['xr_apps'])) {
            $model->xrApps = $map['xr_apps'];
        }

        return $model;
    }
}
