<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UploadDigitalLogisticTransportRouteRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'endAddress' => 'end_address',
        'endDetailedAddress' => 'end_detailed_address',
        'startAddress' => 'start_address',
        'startDetailedAddress' => 'start_detailed_address',
        'thirdPartyLogisticsDid' => 'third_party_logistics_did',
        'transportContractCode' => 'transport_contract_code',
        'transportRouteCode' => 'transport_route_code',
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
        if (null !== $this->endAddress) {
            $res['end_address'] = $this->endAddress;
        }
        if (null !== $this->endDetailedAddress) {
            $res['end_detailed_address'] = $this->endDetailedAddress;
        }
        if (null !== $this->startAddress) {
            $res['start_address'] = $this->startAddress;
        }
        if (null !== $this->startDetailedAddress) {
            $res['start_detailed_address'] = $this->startDetailedAddress;
        }
        if (null !== $this->thirdPartyLogisticsDid) {
            $res['third_party_logistics_did'] = $this->thirdPartyLogisticsDid;
        }
        if (null !== $this->transportContractCode) {
            $res['transport_contract_code'] = $this->transportContractCode;
        }
        if (null !== $this->transportRouteCode) {
            $res['transport_route_code'] = $this->transportRouteCode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadDigitalLogisticTransportRouteRequest
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
        if(isset($map['end_address'])){
            $model->endAddress = $map['end_address'];
        }
        if(isset($map['end_detailed_address'])){
            $model->endDetailedAddress = $map['end_detailed_address'];
        }
        if(isset($map['start_address'])){
            $model->startAddress = $map['start_address'];
        }
        if(isset($map['start_detailed_address'])){
            $model->startDetailedAddress = $map['start_detailed_address'];
        }
        if(isset($map['third_party_logistics_did'])){
            $model->thirdPartyLogisticsDid = $map['third_party_logistics_did'];
        }
        if(isset($map['transport_contract_code'])){
            $model->transportContractCode = $map['transport_contract_code'];
        }
        if(isset($map['transport_route_code'])){
            $model->transportRouteCode = $map['transport_route_code'];
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

    // 目的地省市区，要求格式 XX省-XX市-XX区，比如四川省-成都市-青白江区
    /**
     * @var string
     */
    public $endAddress;

    // 目的地详细地址，街道村社区道路楼宇门牌号
    /**
     * @var string
     */
    public $endDetailedAddress;

    // 起始地省市区，要求格式  XX省-XX市-XX区。比如浙江省-杭州市-余杭区
    /**
     * @var string
     */
    public $startAddress;

    // 起始地详细地址，街道村社区道路楼宇门牌号
    /**
     * @var string
     */
    public $startDetailedAddress;

    // 3plDid
    /**
     * @var string
     */
    public $thirdPartyLogisticsDid;

    // 运输合同编号
    /**
     * @var string
     */
    public $transportContractCode;

    // 运输线路编码
    /**
     * @var string
     */
    public $transportRouteCode;

}
