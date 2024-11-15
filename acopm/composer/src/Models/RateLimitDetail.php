<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class RateLimitDetail extends Model
{
    // apiName
    /**
     * @example apiName
     *
     * @var string
     */
    public $apiName;

    // provider_id
    /**
     * @example 0000000123
     *
     * @var string
     */
    public $providerId;

    // 租户ID
    /**
     * @example AJHKJHJKD
     *
     * @var string
     */
    public $tenantId;

    // 已使用量
    /**
     * @example 500
     *
     * @var int
     */
    public $used;

    // effectScope
    /**
     * @example effectScope
     *
     * @var RateLimitEffectScopeDTO
     */
    public $effectScope;
    protected $_name = [
        'apiName'     => 'api_name',
        'providerId'  => 'provider_id',
        'tenantId'    => 'tenant_id',
        'used'        => 'used',
        'effectScope' => 'effect_scope',
    ];

    public function validate()
    {
        Model::validateRequired('apiName', $this->apiName, true);
        Model::validateRequired('providerId', $this->providerId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiName) {
            $res['api_name'] = $this->apiName;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->used) {
            $res['used'] = $this->used;
        }
        if (null !== $this->effectScope) {
            $res['effect_scope'] = null !== $this->effectScope ? $this->effectScope->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RateLimitDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_name'])) {
            $model->apiName = $map['api_name'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['used'])) {
            $model->used = $map['used'];
        }
        if (isset($map['effect_scope'])) {
            $model->effectScope = RateLimitEffectScopeDTO::fromMap($map['effect_scope']);
        }

        return $model;
    }
}
