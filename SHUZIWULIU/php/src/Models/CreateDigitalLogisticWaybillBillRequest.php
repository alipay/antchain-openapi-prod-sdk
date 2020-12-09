<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateDigitalLogisticWaybillBillRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'drawee' => 'drawee',
        'draweeTaxNo' => 'drawee_tax_no',
        'lzfpdm' => 'lzfpdm',
        'lzfphm' => 'lzfphm',
        'openTime' => 'open_time',
        'platformDid' => 'platform_did',
        'waybillId' => 'waybill_id',
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
        if (null !== $this->drawee) {
            $res['drawee'] = $this->drawee;
        }
        if (null !== $this->draweeTaxNo) {
            $res['drawee_tax_no'] = $this->draweeTaxNo;
        }
        if (null !== $this->lzfpdm) {
            $res['lzfpdm'] = $this->lzfpdm;
        }
        if (null !== $this->lzfphm) {
            $res['lzfphm'] = $this->lzfphm;
        }
        if (null !== $this->openTime) {
            $res['open_time'] = $this->openTime;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->waybillId) {
            $res['waybill_id'] = $this->waybillId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateDigitalLogisticWaybillBillRequest
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
        if(isset($map['drawee'])){
            $model->drawee = $map['drawee'];
        }
        if(isset($map['drawee_tax_no'])){
            $model->draweeTaxNo = $map['drawee_tax_no'];
        }
        if(isset($map['lzfpdm'])){
            $model->lzfpdm = $map['lzfpdm'];
        }
        if(isset($map['lzfphm'])){
            $model->lzfphm = $map['lzfphm'];
        }
        if(isset($map['open_time'])){
            $model->openTime = $map['open_time'];
        }
        if(isset($map['platform_did'])){
            $model->platformDid = $map['platform_did'];
        }
        if(isset($map['waybill_id'])){
            $model->waybillId = $map['waybill_id'];
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

    // 受票方名称
    // 
    /**
     * @var string
     */
    public $drawee;

    // 受票方纳税人识别号
    // 
    /**
     * @var string
     */
    public $draweeTaxNo;

    // 发票代码
    // 
    /**
     * @var string
     */
    public $lzfpdm;

    // 发票号码
    // 
    /**
     * @var string
     */
    public $lzfphm;

    // 开票时间戳
    // 
    /**
     * @var int
     */
    public $openTime;

    // 所属平台的分布式数字身份，缺省时为自己的分布式数字身份
    // 
    /**
     * @var string
     */
    public $platformDid;

    // 关联的运单ID
    // 
    /**
     * @var string
     */
    public $waybillId;

}
