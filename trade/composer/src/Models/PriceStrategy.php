<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class PriceStrategy extends Model
{
    // 继承租户在商品下的价格
    /**
     * @example 2088123412341234
     *
     * @var string
     */
    public $followTenantId;
    protected $_name = [
        'followTenantId' => 'follow_tenant_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->followTenantId) {
            $res['follow_tenant_id'] = $this->followTenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PriceStrategy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['follow_tenant_id'])) {
            $model->followTenantId = $map['follow_tenant_id'];
        }

        return $model;
    }
}
