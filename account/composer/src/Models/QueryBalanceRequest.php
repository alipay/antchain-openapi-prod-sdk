<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACCOUNT\Models;

use AlibabaCloud\Tea\Model;

class QueryBalanceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 调用系统来源
    /**
     * @var string
     */
    public $source;

    // 所属OU，仅当客户属于非支付宝实名制用户，查询财资户的时候使用
    /**
     * @var string
     */
    public $ou;
    protected $_name = [
        'authToken' => 'auth_token',
        'tenantId'  => 'tenant_id',
        'source'    => 'source',
        'ou'        => 'ou',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('source', $this->source, true);
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
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->ou) {
            $res['ou'] = $this->ou;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBalanceRequest
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
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['ou'])) {
            $model->ou = $map['ou'];
        }

        return $model;
    }
}
