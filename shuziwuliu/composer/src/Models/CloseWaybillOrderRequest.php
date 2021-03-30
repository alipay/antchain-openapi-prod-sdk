<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CloseWaybillOrderRequest extends Model
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

    // 无车承运平台分布式数字身份
    /**
     * @var string
     */
    public $platformDid;

    // 运单ID
    //
    /**
     * @var string
     */
    public $taxWaybillId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'platformDid'       => 'platform_did',
        'taxWaybillId'      => 'tax_waybill_id',
    ];

    public function validate()
    {
        Model::validateRequired('platformDid', $this->platformDid, true);
        Model::validateRequired('taxWaybillId', $this->taxWaybillId, true);
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
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->taxWaybillId) {
            $res['tax_waybill_id'] = $this->taxWaybillId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CloseWaybillOrderRequest
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
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }
        if (isset($map['tax_waybill_id'])) {
            $model->taxWaybillId = $map['tax_waybill_id'];
        }

        return $model;
    }
}
