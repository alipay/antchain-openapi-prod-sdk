<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UploadDigitalLogisticCreditConfirmRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'accountId' => 'account_id',
        'confirmDate' => 'confirm_date',
        'confirmNo' => 'confirm_no',
        'consignorDid' => 'consignor_did',
        'consignorPlatformAccount' => 'consignor_platform_account',
        'expireDate' => 'expire_date',
        'groupPlatformDid' => 'group_platform_did',
        'platformDid' => 'platform_did',
        'protocolName' => 'protocol_name',
        'protocolPdfId' => 'protocol_pdf_id',
        'productId' => 'product_id',
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
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->confirmDate) {
            $res['confirm_date'] = $this->confirmDate;
        }
        if (null !== $this->confirmNo) {
            $res['confirm_no'] = $this->confirmNo;
        }
        if (null !== $this->consignorDid) {
            $res['consignor_did'] = $this->consignorDid;
        }
        if (null !== $this->consignorPlatformAccount) {
            $res['consignor_platform_account'] = $this->consignorPlatformAccount;
        }
        if (null !== $this->expireDate) {
            $res['expire_date'] = $this->expireDate;
        }
        if (null !== $this->groupPlatformDid) {
            $res['group_platform_did'] = $this->groupPlatformDid;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->protocolName) {
            $res['protocol_name'] = $this->protocolName;
        }
        if (null !== $this->protocolPdfId) {
            $res['protocol_pdf_id'] = $this->protocolPdfId;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadDigitalLogisticCreditConfirmRequest
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
        if(isset($map['account_id'])){
            $model->accountId = $map['account_id'];
        }
        if(isset($map['confirm_date'])){
            $model->confirmDate = $map['confirm_date'];
        }
        if(isset($map['confirm_no'])){
            $model->confirmNo = $map['confirm_no'];
        }
        if(isset($map['consignor_did'])){
            $model->consignorDid = $map['consignor_did'];
        }
        if(isset($map['consignor_platform_account'])){
            $model->consignorPlatformAccount = $map['consignor_platform_account'];
        }
        if(isset($map['expire_date'])){
            $model->expireDate = $map['expire_date'];
        }
        if(isset($map['group_platform_did'])){
            $model->groupPlatformDid = $map['group_platform_did'];
        }
        if(isset($map['platform_did'])){
            $model->platformDid = $map['platform_did'];
        }
        if(isset($map['protocol_name'])){
            $model->protocolName = $map['protocol_name'];
        }
        if(isset($map['protocol_pdf_id'])){
            $model->protocolPdfId = $map['protocol_pdf_id'];
        }
        if(isset($map['product_id'])){
            $model->productId = $map['product_id'];
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

    // 货主云资金商户id
    /**
     * @var string
     */
    public $accountId;

    // 确认时间
    /**
     * @var string
     */
    public $confirmDate;

    // 应收转让通知编号
    /**
     * @var string
     */
    public $confirmNo;

    // 签署货主did
    /**
     * @var string
     */
    public $consignorDid;

    // 签署的货主平台账号
    /**
     * @var string
     */
    public $consignorPlatformAccount;

    // 协议到期日
    /**
     * @var string
     */
    public $expireDate;

    // 集团平台did
    /**
     * @var string
     */
    public $groupPlatformDid;

    // 签署子公司did
    /**
     * @var string
     */
    public $platformDid;

    // 协议名称
    /**
     * @var string
     */
    public $protocolName;

    // 协议PDF文件, 多个文件可用逗号分隔, 最多10个
    /**
     * @var string
     */
    public $protocolPdfId;

    // 产品id
    /**
     * @var string
     */
    public $productId;

}
