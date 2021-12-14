<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NOTIFICATION\Models;

use AlibabaCloud\Tea\Model;

class EventTenant extends Model
{
    // 智科租户2088 ID，tenant_id/tenant_name二选一
    /**
     * @example 20880000000000
     *
     * @var string
     */
    public $tenantId;

    // 租户8位字母，tenant_id/tenant_name二选一
    /**
     * @example ORGXYZCN
     *
     * @var string
     */
    public $tenantName;
    protected $_name = [
        'tenantId'   => 'tenant_id',
        'tenantName' => 'tenant_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EventTenant
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }

        return $model;
    }
}
