<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryWaybillInfoRequest extends Model
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

    // 运单id
    /**
     * @var string
     */
    public $taxWaybillId;

    // 填写无车承运平台did或者3plDid
    /**
     * @var string
     */
    public $did;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'taxWaybillId'      => 'tax_waybill_id',
        'did'               => 'did',
    ];

    public function validate()
    {
        Model::validateRequired('taxWaybillId', $this->taxWaybillId, true);
        Model::validateRequired('did', $this->did, true);
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
        if (null !== $this->taxWaybillId) {
            $res['tax_waybill_id'] = $this->taxWaybillId;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryWaybillInfoRequest
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
        if (isset($map['tax_waybill_id'])) {
            $model->taxWaybillId = $map['tax_waybill_id'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }

        return $model;
    }
}
