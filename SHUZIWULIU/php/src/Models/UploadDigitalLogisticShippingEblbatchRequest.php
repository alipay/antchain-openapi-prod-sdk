<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SHUZIWULIU\Models\EblDetail;

class UploadDigitalLogisticShippingEblbatchRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'agentDid' => 'agent_did',
        'agentFlag' => 'agent_flag',
        'batchNo' => 'batch_no',
        'carrierName' => 'carrier_name',
        'consigneeDid' => 'consignee_did',
        'eblCategory' => 'ebl_category',
        'eblDetails' => 'ebl_details',
        'negotiatingBankDid' => 'negotiating_bank_did',
        'shipperDid' => 'shipper_did',
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
        if (null !== $this->agentDid) {
            $res['agent_did'] = $this->agentDid;
        }
        if (null !== $this->agentFlag) {
            $res['agent_flag'] = $this->agentFlag;
        }
        if (null !== $this->batchNo) {
            $res['batch_no'] = $this->batchNo;
        }
        if (null !== $this->carrierName) {
            $res['carrier_name'] = $this->carrierName;
        }
        if (null !== $this->consigneeDid) {
            $res['consignee_did'] = $this->consigneeDid;
        }
        if (null !== $this->eblCategory) {
            $res['ebl_category'] = $this->eblCategory;
        }
        if (null !== $this->eblDetails) {
            $res['ebl_details'] = [];
            if(null !== $this->eblDetails && is_array($this->eblDetails)){
                $n = 0;
                foreach($this->eblDetails as $item){
                    $res['ebl_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->negotiatingBankDid) {
            $res['negotiating_bank_did'] = $this->negotiatingBankDid;
        }
        if (null !== $this->shipperDid) {
            $res['shipper_did'] = $this->shipperDid;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadDigitalLogisticShippingEblbatchRequest
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
        if(isset($map['agent_did'])){
            $model->agentDid = $map['agent_did'];
        }
        if(isset($map['agent_flag'])){
            $model->agentFlag = $map['agent_flag'];
        }
        if(isset($map['batch_no'])){
            $model->batchNo = $map['batch_no'];
        }
        if(isset($map['carrier_name'])){
            $model->carrierName = $map['carrier_name'];
        }
        if(isset($map['consignee_did'])){
            $model->consigneeDid = $map['consignee_did'];
        }
        if(isset($map['ebl_category'])){
            $model->eblCategory = $map['ebl_category'];
        }
        if(isset($map['ebl_details'])){
            if(!empty($map['ebl_details'])){
                $model->eblDetails = [];
                $n = 0;
                foreach($map['ebl_details'] as $item) {
                    $model->eblDetails[$n++] = null !== $item ? EblDetail::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['negotiating_bank_did'])){
            $model->negotiatingBankDid = $map['negotiating_bank_did'];
        }
        if(isset($map['shipper_did'])){
            $model->shipperDid = $map['shipper_did'];
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

    // 代理人did
    /**
     * @var string
     */
    public $agentDid;

    // 是否为代理操作
    /**
     * @var bool
     */
    public $agentFlag;

    // 格式：carrierName_yyyyMMddHHmmss_5位随机数字；全局唯一
    /**
     * @var string
     */
    public $batchNo;

    // 船公司名称
    /**
     * @var string
     */
    public $carrierName;

    // 收货人did
    /**
     * @var string
     */
    public $consigneeDid;

    // 电子提单类型
    /**
     * @var string
     */
    public $eblCategory;

    // 批次下的提单明细
    // 
    // 
    /**
     * @var EblDetail[]
     */
    public $eblDetails;

    // 议付行did
    /**
     * @var string
     */
    public $negotiatingBankDid;

    // 托运人did
    /**
     * @var string
     */
    public $shipperDid;

}
