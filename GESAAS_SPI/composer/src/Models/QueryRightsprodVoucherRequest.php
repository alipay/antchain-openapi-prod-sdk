<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS_SPI\Models;

use AlibabaCloud\Tea\Model;

class QueryRightsprodVoucherRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'supplyRightsCode' => 'supply_rights_code',
        'voucherCode' => 'voucher_code',
    ];
    public function validate() {
        Model::validateRequired('supplyRightsCode', $this->supplyRightsCode, true);
        Model::validateRequired('voucherCode', $this->voucherCode, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->supplyRightsCode) {
            $res['supply_rights_code'] = $this->supplyRightsCode;
        }
        if (null !== $this->voucherCode) {
            $res['voucher_code'] = $this->voucherCode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRightsprodVoucherRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['supply_rights_code'])){
            $model->supplyRightsCode = $map['supply_rights_code'];
        }
        if(isset($map['voucher_code'])){
            $model->voucherCode = $map['voucher_code'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 供应商权益编码
    /**
     * @var string
     */
    public $supplyRightsCode;

    // 权益实例
    /**
     * @var string
     */
    public $voucherCode;

}
