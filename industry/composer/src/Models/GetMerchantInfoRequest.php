<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class GetMerchantInfoRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // source, 由中台为业务方分配, 标识业务来源
    /**
     * @var string
     */
    public $source;

    // 行业商户支付宝uid，跟merchant_tenant_name不能同时为空
    /**
     * @var string
     */
    public $merchantUserId;

    // 行业商户租户名称， 跟merchant_user_id不能同时为空
    /**
     * @var string
     */
    public $merchantTenantName;
    protected $_name = [
        'authToken'          => 'auth_token',
        'source'             => 'source',
        'merchantUserId'     => 'merchant_user_id',
        'merchantTenantName' => 'merchant_tenant_name',
    ];

    public function validate()
    {
        Model::validateRequired('source', $this->source, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->merchantUserId) {
            $res['merchant_user_id'] = $this->merchantUserId;
        }
        if (null !== $this->merchantTenantName) {
            $res['merchant_tenant_name'] = $this->merchantTenantName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetMerchantInfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['merchant_user_id'])) {
            $model->merchantUserId = $map['merchant_user_id'];
        }
        if (isset($map['merchant_tenant_name'])) {
            $model->merchantTenantName = $map['merchant_tenant_name'];
        }

        return $model;
    }
}
