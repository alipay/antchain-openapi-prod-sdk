<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_55afdde95cc7448bad87a98d904c1f44\Models;

use AlibabaCloud\Tea\Model;

class GetUniversalsaasDigitalhumanNlsTokenRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 租户code&租户id，对于子部门客户需要上传子部门id
    /**
     * @var string
     */
    public $tenantCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantCode'        => 'tenant_code',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->tenantCode) {
            $res['tenant_code'] = $this->tenantCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetUniversalsaasDigitalhumanNlsTokenRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['tenant_code'])) {
            $model->tenantCode = $map['tenant_code'];
        }

        return $model;
    }
}
