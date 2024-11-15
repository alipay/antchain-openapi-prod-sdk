<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class QueryTenantRatelimitRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户id
    /**
     * @var string[]
     */
    public $tenantIdList;

    // api名
    /**
     * @var string[]
     */
    public $apiNameList;
    protected $_name = [
        'authToken'    => 'auth_token',
        'tenantIdList' => 'tenant_id_list',
        'apiNameList'  => 'api_name_list',
    ];

    public function validate()
    {
        Model::validateRequired('tenantIdList', $this->tenantIdList, true);
        Model::validateRequired('apiNameList', $this->apiNameList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenantIdList) {
            $res['tenant_id_list'] = $this->tenantIdList;
        }
        if (null !== $this->apiNameList) {
            $res['api_name_list'] = $this->apiNameList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTenantRatelimitRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant_id_list'])) {
            if (!empty($map['tenant_id_list'])) {
                $model->tenantIdList = $map['tenant_id_list'];
            }
        }
        if (isset($map['api_name_list'])) {
            if (!empty($map['api_name_list'])) {
                $model->apiNameList = $map['api_name_list'];
            }
        }

        return $model;
    }
}
