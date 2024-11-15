<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class UpdateRateLimit extends Model
{
    // api_name
    /**
     * @example api_name
     *
     * @var string
     */
    public $apiName;

    // provider_id
    /**
     * @example provider_id
     *
     * @var string
     */
    public $providerId;

    // update_scope_value
    /**
     * @example
     *
     * @var UpdateScopeValue
     */
    public $updateScopeValue;
    protected $_name = [
        'apiName'          => 'api_name',
        'providerId'       => 'provider_id',
        'updateScopeValue' => 'update_scope_value',
    ];

    public function validate()
    {
        Model::validateRequired('apiName', $this->apiName, true);
        Model::validateRequired('providerId', $this->providerId, true);
        Model::validateRequired('updateScopeValue', $this->updateScopeValue, true);
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
        if (null !== $this->updateScopeValue) {
            $res['update_scope_value'] = null !== $this->updateScopeValue ? $this->updateScopeValue->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateRateLimit
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
        if (isset($map['update_scope_value'])) {
            $model->updateScopeValue = UpdateScopeValue::fromMap($map['update_scope_value']);
        }

        return $model;
    }
}
