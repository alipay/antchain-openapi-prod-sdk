<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SHUZIWULIU\Models\UploadFileInfo;

class UploadDigitalLogisticTransportReceiptRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'consignorDid' => 'consignor_did',
        'fileInfo' => 'file_info',
        'receiptId' => 'receipt_id',
        'taxWaybillId' => 'tax_waybill_id',
        'thirdPartyLogisticsDid' => 'third_party_logistics_did',
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
        if (null !== $this->fileInfo) {
            $res['file_info'] = null !== $this->fileInfo ? $this->fileInfo->toMap() : null;
        }
        if (null !== $this->receiptId) {
            $res['receipt_id'] = $this->receiptId;
        }
        if (null !== $this->taxWaybillId) {
            $res['tax_waybill_id'] = $this->taxWaybillId;
        }
        if (null !== $this->thirdPartyLogisticsDid) {
            $res['third_party_logistics_did'] = $this->thirdPartyLogisticsDid;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadDigitalLogisticTransportReceiptRequest
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
        if(isset($map['file_info'])){
            $model->fileInfo = UploadFileInfo::fromMap($map['file_info']);
        }
        if(isset($map['receipt_id'])){
            $model->receiptId = $map['receipt_id'];
        }
        if(isset($map['tax_waybill_id'])){
            $model->taxWaybillId = $map['tax_waybill_id'];
        }
        if(isset($map['third_party_logistics_did'])){
            $model->thirdPartyLogisticsDid = $map['third_party_logistics_did'];
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

    // 请求蚂蚁影像上传接口上传文件获取的文件id和文件hash信息。影像文件格式：bmp,jpg,jpeg,gif,psd,png,tiff,tga,eps,pdf
    /**
     * @var UploadFileInfo
     */
    public $fileInfo;

    // 回单id，客户编辑的唯一回单编码
    /**
     * @var string
     */
    public $receiptId;

    // 客户系统内运单编号
    /**
     * @var string
     */
    public $taxWaybillId;

    // 3plDid，一般为合同乙方的链上数字身份
    /**
     * @var string
     */
    public $thirdPartyLogisticsDid;

}
