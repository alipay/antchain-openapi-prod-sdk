<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class XrUserTicketPageInfo extends Model
{
    // 用户id
    /**
     * @example 2088**
     *
     * @var string
     */
    public $userId;

    // 用户通行证编码
    /**
     * @example 2739875205
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

    // 资源名称
    /**
     * @example 资源001
     *
     * @var string
     */
    public $resourceName;

    // 用户通行证状态
    /**
     * @example VALID
     *
     * @var string
     */
    public $status;

    // 有效期
    /**
     * @example 2023-04-06
     *
     * @var string
     */
    public $validTime;

    // 所属业务
    /**
     * @example XR_LEASE
     *
     * @var string
     */
    public $bizScene;

    // 租户id
    /**
     * @example QWERTYUI
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
    protected $_name = [
        'userId'             => 'user_id',
        'xrTicketCode'       => 'xr_ticket_code',
        'xrTicketPoolName'   => 'xr_ticket_pool_name',
        'resourceName'       => 'resource_name',
        'status'             => 'status',
        'validTime'          => 'valid_time',
        'bizScene'           => 'biz_scene',
        'tenantId'           => 'tenant_id',
        'xrVerificationType' => 'xr_verification_type',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('xrTicketCode', $this->xrTicketCode, true);
        Model::validateRequired('xrTicketPoolName', $this->xrTicketPoolName, true);
        Model::validateRequired('resourceName', $this->resourceName, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('validTime', $this->validTime, true);
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('xrVerificationType', $this->xrVerificationType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->xrTicketCode) {
            $res['xr_ticket_code'] = $this->xrTicketCode;
        }
        if (null !== $this->xrTicketPoolName) {
            $res['xr_ticket_pool_name'] = $this->xrTicketPoolName;
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
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->xrVerificationType) {
            $res['xr_verification_type'] = $this->xrVerificationType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XrUserTicketPageInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['xr_ticket_code'])) {
            $model->xrTicketCode = $map['xr_ticket_code'];
        }
        if (isset($map['xr_ticket_pool_name'])) {
            $model->xrTicketPoolName = $map['xr_ticket_pool_name'];
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
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['xr_verification_type'])) {
            $model->xrVerificationType = $map['xr_verification_type'];
        }

        return $model;
    }
}
