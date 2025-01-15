<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class AddLeadBusinessRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 商机信息
    /**
     * @var BusinessRequest[]
     */
    public $request;

    // 线索服务化，多租户模型
    /**
     * @var string
     */
    public $tenantName;
    protected $_name = [
        'authToken'  => 'auth_token',
        'request'    => 'request',
        'tenantName' => 'tenant_name',
    ];

    public function validate()
    {
        Model::validateRequired('request', $this->request, true);
        Model::validateRequired('tenantName', $this->tenantName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->request) {
            $res['request'] = [];
            if (null !== $this->request && \is_array($this->request)) {
                $n = 0;
                foreach ($this->request as $item) {
                    $res['request'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddLeadBusinessRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['request'])) {
            if (!empty($map['request'])) {
                $model->request = [];
                $n              = 0;
                foreach ($map['request'] as $item) {
                    $model->request[$n++] = null !== $item ? BusinessRequest::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }

        return $model;
    }
}
