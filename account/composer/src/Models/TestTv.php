<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACCOUNT\Models;

use AlibabaCloud\Tea\Model;

class TestTv extends Model
{
    // 租户ID
    /**
     * @example 2088X
     *
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'tenantId' => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TestTv
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
