<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateTraasmetaTenantRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户列表
    /**
     * @var TraasTenantDto[]
     */
    public $tenants;
    protected $_name = [
        'authToken' => 'auth_token',
        'tenants'   => 'tenants',
    ];

    public function validate()
    {
        Model::validateRequired('tenants', $this->tenants, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenants) {
            $res['tenants'] = [];
            if (null !== $this->tenants && \is_array($this->tenants)) {
                $n = 0;
                foreach ($this->tenants as $item) {
                    $res['tenants'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateTraasmetaTenantRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenants'])) {
            if (!empty($map['tenants'])) {
                $model->tenants = [];
                $n              = 0;
                foreach ($map['tenants'] as $item) {
                    $model->tenants[$n++] = null !== $item ? TraasTenantDto::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
