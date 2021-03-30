<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateCreditIssuetransferRequest extends Model
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

    // 全局业务号，保证唯一性，如拆分转让业务单号
    /**
     * @var string
     */
    public $outBizNo;

    // 转入方分布式数字身份
    /**
     * @var string
     */
    public $payeeDid;

    // 转出方分布式数字身份
    /**
     * @var string
     */
    public $payerDid;

    // 业务发起方分布式数字身份
    /**
     * @var string
     */
    public $platformDid;

    // 产品id 目前使用PRODUCT_MYBANK
    /**
     * @var string
     */
    public $productId;

    // 转让金额
    /**
     * @var string
     */
    public $txAmt;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'callbackUrl'       => 'callback_url',
        'groupPlatformDid'  => 'group_platform_did',
        'issueId'           => 'issue_id',
        'outBizNo'          => 'out_biz_no',
        'payeeDid'          => 'payee_did',
        'payerDid'          => 'payer_did',
        'platformDid'       => 'platform_did',
        'productId'         => 'product_id',
        'txAmt'             => 'tx_amt',
    ];

    public function validate()
    {
        Model::validateRequired('callbackUrl', $this->callbackUrl, true);
        Model::validateRequired('groupPlatformDid', $this->groupPlatformDid, true);
        Model::validateRequired('issueId', $this->issueId, true);
        Model::validateRequired('outBizNo', $this->outBizNo, true);
        Model::validateRequired('payeeDid', $this->payeeDid, true);
        Model::validateRequired('payerDid', $this->payerDid, true);
        Model::validateRequired('platformDid', $this->platformDid, true);
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('txAmt', $this->txAmt, true);
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
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }
        if (null !== $this->groupPlatformDid) {
            $res['group_platform_did'] = $this->groupPlatformDid;
        }
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->payeeDid) {
            $res['payee_did'] = $this->payeeDid;
        }
        if (null !== $this->payerDid) {
            $res['payer_did'] = $this->payerDid;
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
     *
     * @return CreateCreditIssuetransferRequest
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
        if (isset($map['callback_url'])) {
            $model->callbackUrl = $map['callback_url'];
        }
        if (isset($map['group_platform_did'])) {
            $model->groupPlatformDid = $map['group_platform_did'];
        }
        if (isset($map['issue_id'])) {
            $model->issueId = $map['issue_id'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['payee_did'])) {
            $model->payeeDid = $map['payee_did'];
        }
        if (isset($map['payer_did'])) {
            $model->payerDid = $map['payer_did'];
        }
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['tx_amt'])) {
            $model->txAmt = $map['tx_amt'];
        }

        return $model;
    }
}
