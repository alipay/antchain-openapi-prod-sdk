<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SHUZIWULIU\Models\UploadFileInfo;

class UploadDigitalLogisticTransportContractRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'consignorDid' => 'consignor_did',
        'contractEffectiveDate' => 'contract_effective_date',
        'contractExpiresDate' => 'contract_expires_date',
        'fileInfos' => 'file_infos',
        'thirdPartyLogisticsDid' => 'third_party_logistics_did',
        'transportContractCode' => 'transport_contract_code',
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
        if (null !== $this->consignorDid) {
            $res['consignor_did'] = $this->consignorDid;
        }
        if (null !== $this->contractEffectiveDate) {
            $res['contract_effective_date'] = $this->contractEffectiveDate;
        }
        if (null !== $this->contractExpiresDate) {
            $res['contract_expires_date'] = $this->contractExpiresDate;
        }
        if (null !== $this->fileInfos) {
            $res['file_infos'] = [];
            if(null !== $this->fileInfos && is_array($this->fileInfos)){
                $n = 0;
                foreach($this->fileInfos as $item){
                    $res['file_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->thirdPartyLogisticsDid) {
            $res['third_party_logistics_did'] = $this->thirdPartyLogisticsDid;
        }
        if (null !== $this->transportContractCode) {
            $res['transport_contract_code'] = $this->transportContractCode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadDigitalLogisticTransportContractRequest
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
        if(isset($map['consignor_did'])){
            $model->consignorDid = $map['consignor_did'];
        }
        if(isset($map['contract_effective_date'])){
            $model->contractEffectiveDate = $map['contract_effective_date'];
        }
        if(isset($map['contract_expires_date'])){
            $model->contractExpiresDate = $map['contract_expires_date'];
        }
        if(isset($map['file_infos'])){
            if(!empty($map['file_infos'])){
                $model->fileInfos = [];
                $n = 0;
                foreach($map['file_infos'] as $item) {
                    $model->fileInfos[$n++] = null !== $item ? UploadFileInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['third_party_logistics_did'])){
            $model->thirdPartyLogisticsDid = $map['third_party_logistics_did'];
        }
        if(isset($map['transport_contract_code'])){
            $model->transportContractCode = $map['transport_contract_code'];
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

    // 货主did，一般为合同甲方的链上数字身份
    /**
     * @var string
     */
    public $consignorDid;

    // 运输合同生效日期，格式要求yyyy-MM-dd
    /**
     * @var string
     */
    public $contractEffectiveDate;

    // 运输合同到期日期，要求格式yyyy-MM-dd
    /**
     * @var string
     */
    public $contractExpiresDate;

    // 影像件文件信息列表，可以包含多个文件，每个文件需要有文件id和文件hash  (请求蚂蚁影像上传接口获取的文件id和文件hash)。影像文件格式要求：bmp,jpg,jpeg,gif,psd,png,tiff,tga,eps,pdf
    /**
     * @var UploadFileInfo[]
     */
    public $fileInfos;

    // 3plDid，一般为合同乙方的链上数字身份
    /**
     * @var string
     */
    public $thirdPartyLogisticsDid;

    // 运输合同编号
    /**
     * @var string
     */
    public $transportContractCode;

}
