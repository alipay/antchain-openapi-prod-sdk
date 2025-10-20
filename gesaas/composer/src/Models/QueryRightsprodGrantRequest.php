<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryRightsprodGrantRequest extends Model
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

    // 外部发放订单号
    /**
     * @var string
     */
    public $outGrantOrderNo;

    // 技术租户ID、当开通权益中心产品在非数科的应用租户下时需要填写对应的技术租户ID（涉及到时技术对接时 技术会分配，如未分配则不需要传值）
    /**
     * @var string
     */
    public $techTenantId;

    // 扩展信息
    /**
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outGrantOrderNo'   => 'out_grant_order_no',
        'techTenantId'      => 'tech_tenant_id',
        'extInfo'           => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('outGrantOrderNo', $this->outGrantOrderNo, true);
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
        if (null !== $this->outGrantOrderNo) {
            $res['out_grant_order_no'] = $this->outGrantOrderNo;
        }
        if (null !== $this->techTenantId) {
            $res['tech_tenant_id'] = $this->techTenantId;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRightsprodGrantRequest
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
        if (isset($map['out_grant_order_no'])) {
            $model->outGrantOrderNo = $map['out_grant_order_no'];
        }
        if (isset($map['tech_tenant_id'])) {
            $model->techTenantId = $map['tech_tenant_id'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
