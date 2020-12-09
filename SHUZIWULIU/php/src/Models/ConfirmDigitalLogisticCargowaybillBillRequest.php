<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ConfirmDigitalLogisticCargowaybillBillRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'billAmount' => 'bill_amount',
        'billCode' => 'bill_code',
        'billConsignorDid' => 'bill_consignor_did',
        'billSureDate' => 'bill_sure_date',
        'whetherSettle' => 'whether_settle',
        'platformDid' => 'platform_did',
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
        if (null !== $this->billAmount) {
            $res['bill_amount'] = $this->billAmount;
        }
        if (null !== $this->billCode) {
            $res['bill_code'] = $this->billCode;
        }
        if (null !== $this->billConsignorDid) {
            $res['bill_consignor_did'] = $this->billConsignorDid;
        }
        if (null !== $this->billSureDate) {
            $res['bill_sure_date'] = $this->billSureDate;
        }
        if (null !== $this->whetherSettle) {
            $res['whether_settle'] = $this->whetherSettle;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ConfirmDigitalLogisticCargowaybillBillRequest
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
        if(isset($map['bill_amount'])){
            $model->billAmount = $map['bill_amount'];
        }
        if(isset($map['bill_code'])){
            $model->billCode = $map['bill_code'];
        }
        if(isset($map['bill_consignor_did'])){
            $model->billConsignorDid = $map['bill_consignor_did'];
        }
        if(isset($map['bill_sure_date'])){
            $model->billSureDate = $map['bill_sure_date'];
        }
        if(isset($map['whether_settle'])){
            $model->whetherSettle = $map['whether_settle'];
        }
        if(isset($map['platform_did'])){
            $model->platformDid = $map['platform_did'];
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

    // 账单金额（两位小数）
    /**
     * @var string
     */
    public $billAmount;

    // 账单code（账单唯一标识）
    /**
     * @var string
     */
    public $billCode;

    // 账单确认货主did
    /**
     * @var string
     */
    public $billConsignorDid;

    // 账单确认日期（毫秒）
    /**
     * @var int
     */
    public $billSureDate;

    // 是否结算
    /**
     * @var bool
     */
    public $whetherSettle;

    // 平台did
    /**
     * @var string
     */
    public $platformDid;

}
