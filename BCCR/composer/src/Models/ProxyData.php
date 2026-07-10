<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ProxyData extends Model
{
    // 金融云租户id
    /**
     * @example 2088XXXXXX
     *
     * @var string
     */
    public $tenantId;

    // 租户名称
    /**
     * @example FJKDNESX
     *
     * @var string
     */
    public $tenantName;

    // 是否计量
    /**
     * @example true, false
     *
     * @var bool
     */
    public $ifMeasure;
    protected $_name = [
        'tenantId'   => 'tenant_id',
        'tenantName' => 'tenant_name',
        'ifMeasure'  => 'if_measure',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('tenantName', $this->tenantName, true);
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
        if (null !== $this->ifMeasure) {
            $res['if_measure'] = $this->ifMeasure;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProxyData
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
        if (isset($map['if_measure'])) {
            $model->ifMeasure = $map['if_measure'];
        }

        return $model;
    }
}
