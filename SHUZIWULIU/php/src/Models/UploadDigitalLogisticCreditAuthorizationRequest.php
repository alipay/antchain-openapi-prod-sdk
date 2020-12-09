<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UploadDigitalLogisticCreditAuthorizationRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'consignorCertNo' => 'consignor_cert_no',
        'consignorDid' => 'consignor_did',
        'consignorName' => 'consignor_name',
        'consignorPlatformAccount' => 'consignor_platform_account',
        'expireDate' => 'expire_date',
        'groupPlatformDid' => 'group_platform_did',
        'hasAuthorizationClause' => 'has_authorization_clause',
        'platformCertNo' => 'platform_cert_no',
        'platformDid' => 'platform_did',
        'platformName' => 'platform_name',
        'protocolImgId' => 'protocol_img_id',
        'protocolName' => 'protocol_name',
        'protocolNo' => 'protocol_no',
        'signDate' => 'sign_date',
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
        if (null !== $this->consignorCertNo) {
            $res['consignor_cert_no'] = $this->consignorCertNo;
        }
        if (null !== $this->consignorDid) {
            $res['consignor_did'] = $this->consignorDid;
        }
        if (null !== $this->consignorName) {
            $res['consignor_name'] = $this->consignorName;
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
        if (null !== $this->hasAuthorizationClause) {
            $res['has_authorization_clause'] = $this->hasAuthorizationClause;
        }
        if (null !== $this->platformCertNo) {
            $res['platform_cert_no'] = $this->platformCertNo;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->platformName) {
            $res['platform_name'] = $this->platformName;
        }
        if (null !== $this->protocolImgId) {
            $res['protocol_img_id'] = $this->protocolImgId;
        }
        if (null !== $this->protocolName) {
            $res['protocol_name'] = $this->protocolName;
        }
        if (null !== $this->protocolNo) {
            $res['protocol_no'] = $this->protocolNo;
        }
        if (null !== $this->signDate) {
            $res['sign_date'] = $this->signDate;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadDigitalLogisticCreditAuthorizationRequest
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
        if(isset($map['consignor_cert_no'])){
            $model->consignorCertNo = $map['consignor_cert_no'];
        }
        if(isset($map['consignor_did'])){
            $model->consignorDid = $map['consignor_did'];
        }
        if(isset($map['consignor_name'])){
            $model->consignorName = $map['consignor_name'];
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
        if(isset($map['has_authorization_clause'])){
            $model->hasAuthorizationClause = $map['has_authorization_clause'];
        }
        if(isset($map['platform_cert_no'])){
            $model->platformCertNo = $map['platform_cert_no'];
        }
        if(isset($map['platform_did'])){
            $model->platformDid = $map['platform_did'];
        }
        if(isset($map['platform_name'])){
            $model->platformName = $map['platform_name'];
        }
        if(isset($map['protocol_img_id'])){
            $model->protocolImgId = $map['protocol_img_id'];
        }
        if(isset($map['protocol_name'])){
            $model->protocolName = $map['protocol_name'];
        }
        if(isset($map['protocol_no'])){
            $model->protocolNo = $map['protocol_no'];
        }
        if(isset($map['sign_date'])){
            $model->signDate = $map['sign_date'];
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

    // 签署货主统一社会信用代码
    /**
     * @var string
     */
    public $consignorCertNo;

    // 签署货主did
    /**
     * @var string
     */
    public $consignorDid;

    // 签署货主企业名称
    /**
     * @var string
     */
    public $consignorName;

    // 授权的货主平台账号
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

    // 是否包含账号授权条款
    /**
     * @var bool
     */
    public $hasAuthorizationClause;

    // 签署子公司统一社会信用代码
    /**
     * @var string
     */
    public $platformCertNo;

    // 签署子公司did
    /**
     * @var string
     */
    public $platformDid;

    // 签署子公司企业名称
    // 
    /**
     * @var string
     */
    public $platformName;

    // 线下协议影像件id与文件哈希, 多id以逗号分隔, 最多支持10个
    /**
     * @var string
     */
    public $protocolImgId;

    // 协议名称
    /**
     * @var string
     */
    public $protocolName;

    // 线下协议编号
    /**
     * @var string
     */
    public $protocolNo;

    // 签署时间
    /**
     * @var string
     */
    public $signDate;

    // 产品id
    /**
     * @var string
     */
    public $productId;

}
