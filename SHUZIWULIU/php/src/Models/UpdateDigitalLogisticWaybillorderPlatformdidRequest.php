<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UpdateDigitalLogisticWaybillorderPlatformdidRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'newPlatformDid' => 'new_platform_did',
        'oldPlatformDid' => 'old_platform_did',
        'taxWaybillId' => 'tax_waybill_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->newPlatformDid) {
            $res['new_platform_did'] = $this->newPlatformDid;
        }
        if (null !== $this->oldPlatformDid) {
            $res['old_platform_did'] = $this->oldPlatformDid;
        }
        if (null !== $this->taxWaybillId) {
            $res['tax_waybill_id'] = $this->taxWaybillId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateDigitalLogisticWaybillorderPlatformdidRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['new_platform_did'])){
            $model->newPlatformDid = $map['new_platform_did'];
        }
        if(isset($map['old_platform_did'])){
            $model->oldPlatformDid = $map['old_platform_did'];
        }
        if(isset($map['tax_waybill_id'])){
            $model->taxWaybillId = $map['tax_waybill_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 新平台diid
    /**
     * @var string
     */
    public $newPlatformDid;

    // 老平台did
    /**
     * @var string
     */
    public $oldPlatformDid;

    // 运单号
    /**
     * @var string
     */
    public $taxWaybillId;

}
