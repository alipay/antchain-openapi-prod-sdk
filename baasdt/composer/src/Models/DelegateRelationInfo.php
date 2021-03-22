<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class DelegateRelationInfo extends Model
{
    // 被授权的租户ID
    /**
     * @example OKIJUHYG
     *
     * @var string
     */
    public $tenantId;

    // 被代理的租户ID
    /**
     * @example WAESRDTF
     *
     * @var string
     */
    public $delegatedTenantId;

    // 更新时间
    /**
     * @example 20200327153541
     *
     * @var string
     */
    public $updateTime;

    // 状态
    /**
     * @example true
     *
     * @var bool
     */
    public $status;

    // 扩展字段
    /**
     * @example extension
     *
     * @var string
     */
    public $extension;
    protected $_name = [
        'tenantId'          => 'tenant_id',
        'delegatedTenantId' => 'delegated_tenant_id',
        'updateTime'        => 'update_time',
        'status'            => 'status',
        'extension'         => 'extension',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('delegatedTenantId', $this->delegatedTenantId, true);
        Model::validateRequired('updateTime', $this->updateTime, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('extension', $this->extension, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->delegatedTenantId) {
            $res['delegated_tenant_id'] = $this->delegatedTenantId;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DelegateRelationInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['delegated_tenant_id'])) {
            $model->delegatedTenantId = $map['delegated_tenant_id'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }

        return $model;
    }
}
