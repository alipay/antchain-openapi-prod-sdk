<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class GwCallDataStats extends Model
{
    // 租户
    /**
     * @example ds
     *
     * @var string
     */
    public $invokeTenant;

    // 租户ID
    /**
     * @example dd
     *
     * @var string
     */
    public $invokeTenantId;

    // 公key
    /**
     * @example ss
     *
     * @var string
     */
    public $accessKey;

    // 调用数量
    /**
     * @example 33
     *
     * @var string
     */
    public $invokeCount;

    // 调用查得统计
    /**
     * @example 3
     *
     * @var string
     */
    public $successCount;

    // id
    /**
     * @example 223
     *
     * @var string
     */
    public $id;
    protected $_name = [
        'invokeTenant'   => 'invoke_tenant',
        'invokeTenantId' => 'invoke_tenant_id',
        'accessKey'      => 'access_key',
        'invokeCount'    => 'invoke_count',
        'successCount'   => 'success_count',
        'id'             => 'id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->invokeTenant) {
            $res['invoke_tenant'] = $this->invokeTenant;
        }
        if (null !== $this->invokeTenantId) {
            $res['invoke_tenant_id'] = $this->invokeTenantId;
        }
        if (null !== $this->accessKey) {
            $res['access_key'] = $this->accessKey;
        }
        if (null !== $this->invokeCount) {
            $res['invoke_count'] = $this->invokeCount;
        }
        if (null !== $this->successCount) {
            $res['success_count'] = $this->successCount;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GwCallDataStats
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['invoke_tenant'])) {
            $model->invokeTenant = $map['invoke_tenant'];
        }
        if (isset($map['invoke_tenant_id'])) {
            $model->invokeTenantId = $map['invoke_tenant_id'];
        }
        if (isset($map['access_key'])) {
            $model->accessKey = $map['access_key'];
        }
        if (isset($map['invoke_count'])) {
            $model->invokeCount = $map['invoke_count'];
        }
        if (isset($map['success_count'])) {
            $model->successCount = $map['success_count'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }

        return $model;
    }
}
