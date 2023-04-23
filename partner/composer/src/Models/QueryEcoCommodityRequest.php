<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class QueryEcoCommodityRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户name
    /**
     * @var string
     */
    public $tenantName;

    // 商品信息列表
    /**
     * @var string[]
     */
    public $offerCodes;
    protected $_name = [
        'authToken'  => 'auth_token',
        'tenantName' => 'tenant_name',
        'offerCodes' => 'offer_codes',
    ];

    public function validate()
    {
        Model::validateRequired('tenantName', $this->tenantName, true);
        Model::validateRequired('offerCodes', $this->offerCodes, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->offerCodes) {
            $res['offer_codes'] = $this->offerCodes;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryEcoCommodityRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['offer_codes'])) {
            if (!empty($map['offer_codes'])) {
                $model->offerCodes = $map['offer_codes'];
            }
        }

        return $model;
    }
}
