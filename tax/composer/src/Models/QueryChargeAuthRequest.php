<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class QueryChargeAuthRequest extends Model
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

    // 租户
    /**
     * @var string
     */
    public $bizTenant;

    // 授权类型,业务类型
    /**
     * @var string
     */
    public $bizType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizTenant'         => 'biz_tenant',
        'bizType'           => 'biz_type',
    ];

    public function validate()
    {
        Model::validateRequired('bizTenant', $this->bizTenant, true);
        Model::validateRequired('bizType', $this->bizType, true);
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
        if (null !== $this->bizTenant) {
            $res['biz_tenant'] = $this->bizTenant;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryChargeAuthRequest
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
        if (isset($map['biz_tenant'])) {
            $model->bizTenant = $map['biz_tenant'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }

        return $model;
    }
}
