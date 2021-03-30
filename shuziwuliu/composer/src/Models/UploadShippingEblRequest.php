<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UploadShippingEblRequest extends Model
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

    // 电子提单copy文件hash
    /**
     * @var string
     */
    public $eblCopyPdfFileHash;

    // copy电子提单pdf文件id
    /**
     * @var string
     */
    public $eblCopyPdfFileId;

    // 电子提单编号
    /**
     * @var string
     */
    public $eblNo;

    // 电子甜的原文件hash
    /**
     * @var string
     */
    public $eblOriginalPdfFileHash;

    // 原电子提单pdf文件id
    /**
     * @var string
     */
    public $eblOriginalPdfFileId;

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
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'carrierName'            => 'carrier_name',
        'consigneeDid'           => 'consignee_did',
        'eblCategory'            => 'ebl_category',
        'eblCopyPdfFileHash'     => 'ebl_copy_pdf_file_hash',
        'eblCopyPdfFileId'       => 'ebl_copy_pdf_file_id',
        'eblNo'                  => 'ebl_no',
        'eblOriginalPdfFileHash' => 'ebl_original_pdf_file_hash',
        'eblOriginalPdfFileId'   => 'ebl_original_pdf_file_id',
        'negotiatingBankDid'     => 'negotiating_bank_did',
        'shipperDid'             => 'shipper_did',
    ];

    public function validate()
    {
        Model::validateRequired('carrierName', $this->carrierName, true);
        Model::validateRequired('consigneeDid', $this->consigneeDid, true);
        Model::validateRequired('eblCategory', $this->eblCategory, true);
        Model::validateRequired('eblCopyPdfFileHash', $this->eblCopyPdfFileHash, true);
        Model::validateRequired('eblCopyPdfFileId', $this->eblCopyPdfFileId, true);
        Model::validateRequired('eblNo', $this->eblNo, true);
        Model::validateRequired('negotiatingBankDid', $this->negotiatingBankDid, true);
        Model::validateRequired('shipperDid', $this->shipperDid, true);
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
        if (null !== $this->carrierName) {
            $res['carrier_name'] = $this->carrierName;
        }
        if (null !== $this->consigneeDid) {
            $res['consignee_did'] = $this->consigneeDid;
        }
        if (null !== $this->eblCategory) {
            $res['ebl_category'] = $this->eblCategory;
        }
        if (null !== $this->eblCopyPdfFileHash) {
            $res['ebl_copy_pdf_file_hash'] = $this->eblCopyPdfFileHash;
        }
        if (null !== $this->eblCopyPdfFileId) {
            $res['ebl_copy_pdf_file_id'] = $this->eblCopyPdfFileId;
        }
        if (null !== $this->eblNo) {
            $res['ebl_no'] = $this->eblNo;
        }
        if (null !== $this->eblOriginalPdfFileHash) {
            $res['ebl_original_pdf_file_hash'] = $this->eblOriginalPdfFileHash;
        }
        if (null !== $this->eblOriginalPdfFileId) {
            $res['ebl_original_pdf_file_id'] = $this->eblOriginalPdfFileId;
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
     *
     * @return UploadShippingEblRequest
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
        if (isset($map['carrier_name'])) {
            $model->carrierName = $map['carrier_name'];
        }
        if (isset($map['consignee_did'])) {
            $model->consigneeDid = $map['consignee_did'];
        }
        if (isset($map['ebl_category'])) {
            $model->eblCategory = $map['ebl_category'];
        }
        if (isset($map['ebl_copy_pdf_file_hash'])) {
            $model->eblCopyPdfFileHash = $map['ebl_copy_pdf_file_hash'];
        }
        if (isset($map['ebl_copy_pdf_file_id'])) {
            $model->eblCopyPdfFileId = $map['ebl_copy_pdf_file_id'];
        }
        if (isset($map['ebl_no'])) {
            $model->eblNo = $map['ebl_no'];
        }
        if (isset($map['ebl_original_pdf_file_hash'])) {
            $model->eblOriginalPdfFileHash = $map['ebl_original_pdf_file_hash'];
        }
        if (isset($map['ebl_original_pdf_file_id'])) {
            $model->eblOriginalPdfFileId = $map['ebl_original_pdf_file_id'];
        }
        if (isset($map['negotiating_bank_did'])) {
            $model->negotiatingBankDid = $map['negotiating_bank_did'];
        }
        if (isset($map['shipper_did'])) {
            $model->shipperDid = $map['shipper_did'];
        }

        return $model;
    }
}
