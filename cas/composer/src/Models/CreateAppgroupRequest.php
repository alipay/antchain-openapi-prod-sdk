<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateAppgroupRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // domain tree
    /**
     * @var AppDomainFlatten
     */
    public $domain;

    // 占位
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken' => 'auth_token',
        'domain'    => 'domain',
        'tenantId'  => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('domain', $this->domain, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->domain) {
            $res['domain'] = null !== $this->domain ? $this->domain->toMap() : null;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAppgroupRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['domain'])) {
            $model->domain = AppDomainFlatten::fromMap($map['domain']);
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
