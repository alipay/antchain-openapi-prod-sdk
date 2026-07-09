<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class XrTicketPoolFailList extends Model
{
    // 券名称
    /**
     * @example 券名称
     *
     * @var string
     */
    public $xrTicketPoolName;

    // 资源id
    /**
     * @example 资源id
     *
     * @var string
     */
    public $resourceId;

    // 错误码
    /**
     * @example ok
     *
     * @var string
     */
    public $errorCode;

    // 租户id
    /**
     * @example 租户id
     *
     * @var string
     */
    public $tenantId;

    // 错误信息
    /**
     * @example 错误信息
     *
     * @var string
     */
    public $errorMsg;

    // 核销类型
    /**
     * @example XR_DEVICE
     *
     * @var string
     */
    public $xrVerificationType;
    protected $_name = [
        'xrTicketPoolName'   => 'xr_ticket_pool_name',
        'resourceId'         => 'resource_id',
        'errorCode'          => 'error_code',
        'tenantId'           => 'tenant_id',
        'errorMsg'           => 'error_msg',
        'xrVerificationType' => 'xr_verification_type',
    ];

    public function validate()
    {
        Model::validateRequired('xrTicketPoolName', $this->xrTicketPoolName, true);
        Model::validateRequired('resourceId', $this->resourceId, true);
        Model::validateRequired('errorCode', $this->errorCode, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('errorMsg', $this->errorMsg, true);
        Model::validateRequired('xrVerificationType', $this->xrVerificationType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->xrTicketPoolName) {
            $res['xr_ticket_pool_name'] = $this->xrTicketPoolName;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }
        if (null !== $this->xrVerificationType) {
            $res['xr_verification_type'] = $this->xrVerificationType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XrTicketPoolFailList
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['xr_ticket_pool_name'])) {
            $model->xrTicketPoolName = $map['xr_ticket_pool_name'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }
        if (isset($map['xr_verification_type'])) {
            $model->xrVerificationType = $map['xr_verification_type'];
        }

        return $model;
    }
}
