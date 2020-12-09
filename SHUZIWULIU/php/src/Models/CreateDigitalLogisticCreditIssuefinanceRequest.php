<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateDigitalLogisticCreditIssuefinanceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'callbackUrl' => 'callback_url',
        'groupPlatformDid' => 'group_platform_did',
        'issueId' => 'issue_id',
        'loanerDid' => 'loaner_did',
        'outBizNo' => 'out_biz_no',
        'platformDid' => 'platform_did',
        'productId' => 'product_id',
        'txAmt' => 'tx_amt',
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
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }
        if (null !== $this->groupPlatformDid) {
            $res['group_platform_did'] = $this->groupPlatformDid;
        }
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
        }
        if (null !== $this->loanerDid) {
            $res['loaner_did'] = $this->loanerDid;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->txAmt) {
            $res['tx_amt'] = $this->txAmt;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateDigitalLogisticCreditIssuefinanceRequest
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
        if(isset($map['callback_url'])){
            $model->callbackUrl = $map['callback_url'];
        }
        if(isset($map['group_platform_did'])){
            $model->groupPlatformDid = $map['group_platform_did'];
        }
        if(isset($map['issue_id'])){
            $model->issueId = $map['issue_id'];
        }
        if(isset($map['loaner_did'])){
            $model->loanerDid = $map['loaner_did'];
        }
        if(isset($map['out_biz_no'])){
            $model->outBizNo = $map['out_biz_no'];
        }
        if(isset($map['platform_did'])){
            $model->platformDid = $map['platform_did'];
        }
        if(isset($map['product_id'])){
            $model->productId = $map['product_id'];
        }
        if(isset($map['tx_amt'])){
            $model->txAmt = $map['tx_amt'];
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

    // 转让结果回调url
    /**
     * @var string
     */
    public $callbackUrl;

    // 集团平台方分布式数字身份
    /**
     * @var string
     */
    public $groupPlatformDid;

    // 信用流转凭证
    /**
     * @var string
     */
    public $issueId;

    // 融资申请方分布式数字身份
    /**
     * @var string
     */
    public $loanerDid;

    // 全局业务号，保证唯一性，如融资业务单号
    /**
     * @var string
     */
    public $outBizNo;

    // 业务发起方分布式数字身份
    /**
     * @var string
     */
    public $platformDid;

    // 产品id
    // A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
    /**
     * @var string
     */
    public $productId;

    // 融资金额
    /**
     * @var string
     */
    public $txAmt;

}
