<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRdaasTaxSimpleauthdecisionRequest extends Model
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

    // 决策租户
    /**
     * @var string
     */
    public $decisionTenant;

    // 授权类型
    /**
     * @var string
     */
    public $authType;

    // 省份
    /**
     * @var string
     */
    public $provinceCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'decisionTenant'    => 'decision_tenant',
        'authType'          => 'auth_type',
        'provinceCode'      => 'province_code',
    ];

    public function validate()
    {
        Model::validateRequired('decisionTenant', $this->decisionTenant, true);
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('provinceCode', $this->provinceCode, true);
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
        if (null !== $this->decisionTenant) {
            $res['decision_tenant'] = $this->decisionTenant;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->provinceCode) {
            $res['province_code'] = $this->provinceCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRdaasTaxSimpleauthdecisionRequest
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
        if (isset($map['decision_tenant'])) {
            $model->decisionTenant = $map['decision_tenant'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['province_code'])) {
            $model->provinceCode = $map['province_code'];
        }

        return $model;
    }
}
