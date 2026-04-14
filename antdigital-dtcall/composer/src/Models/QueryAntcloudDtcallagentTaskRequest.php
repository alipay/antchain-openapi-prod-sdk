<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTCALL\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudDtcallagentTaskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 实例编码
    /**
     * @var string
     */
    public $instanceCode;

    // 任务名称，支持模糊匹配
    /**
     * @var string
     */
    public $name;
    protected $_name = [
        'authToken'    => 'auth_token',
        'tenantId'     => 'tenant_id',
        'instanceCode' => 'instance_code',
        'name'         => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('instanceCode', $this->instanceCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->instanceCode) {
            $res['instance_code'] = $this->instanceCode;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntcloudDtcallagentTaskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['instance_code'])) {
            $model->instanceCode = $map['instance_code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
