<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UploadCreditIssuebatchRequest extends Model
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

    // 批次id
    /**
     * @var string
     */
    public $batchId;

    // 回调地址
    /**
     * @var string
     */
    public $callbackUrl;

    // 凭证发行方did
    /**
     * @var string
     */
    public $createDid;

    // 发行后自动贴现，true: 自动贴现，false: 不自动贴现 （默认）
    /**
     * @var bool
     */
    public $easyFinance;

    // 凭证到期时间
    /**
     * @var string
     */
    public $expireDate;

    // 支付单运费总额，运费最多精确到小数点后2位
    /**
     * @var string
     */
    public $freight;

    // 集团平台did
    /**
     * @var string
     */
    public $groupPlatformDid;

    // 全局业务唯一编号
    /**
     * @var string
     */
    public $outBizNo;

    // 支付订单号
    /**
     * @var string
     */
    public $payOrder;

    // 产品id
    /**
     * @var string
     */
    public $productId;

    // 凭证接收方did
    /**
     * @var string
     */
    public $receiveDid;

    // 运单合并列表
    /**
     * @var string[]
     */
    public $waybillIds;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'batchId'           => 'batch_id',
        'callbackUrl'       => 'callback_url',
        'createDid'         => 'create_did',
        'easyFinance'       => 'easy_finance',
        'expireDate'        => 'expire_date',
        'freight'           => 'freight',
        'groupPlatformDid'  => 'group_platform_did',
        'outBizNo'          => 'out_biz_no',
        'payOrder'          => 'pay_order',
        'productId'         => 'product_id',
        'receiveDid'        => 'receive_did',
        'waybillIds'        => 'waybill_ids',
    ];

    public function validate()
    {
        Model::validateRequired('batchId', $this->batchId, true);
        Model::validateRequired('callbackUrl', $this->callbackUrl, true);
        Model::validateRequired('createDid', $this->createDid, true);
        Model::validateRequired('expireDate', $this->expireDate, true);
        Model::validateRequired('freight', $this->freight, true);
        Model::validateRequired('groupPlatformDid', $this->groupPlatformDid, true);
        Model::validateRequired('outBizNo', $this->outBizNo, true);
        Model::validateRequired('payOrder', $this->payOrder, true);
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('receiveDid', $this->receiveDid, true);
        Model::validateRequired('waybillIds', $this->waybillIds, true);
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
        if (null !== $this->batchId) {
            $res['batch_id'] = $this->batchId;
        }
        if (null !== $this->callbackUrl) {
            $res['callback_url'] = $this->callbackUrl;
        }
        if (null !== $this->createDid) {
            $res['create_did'] = $this->createDid;
        }
        if (null !== $this->easyFinance) {
            $res['easy_finance'] = $this->easyFinance;
        }
        if (null !== $this->expireDate) {
            $res['expire_date'] = $this->expireDate;
        }
        if (null !== $this->freight) {
            $res['freight'] = $this->freight;
        }
        if (null !== $this->groupPlatformDid) {
            $res['group_platform_did'] = $this->groupPlatformDid;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->payOrder) {
            $res['pay_order'] = $this->payOrder;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->receiveDid) {
            $res['receive_did'] = $this->receiveDid;
        }
        if (null !== $this->waybillIds) {
            $res['waybill_ids'] = $this->waybillIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadCreditIssuebatchRequest
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
        if (isset($map['batch_id'])) {
            $model->batchId = $map['batch_id'];
        }
        if (isset($map['callback_url'])) {
            $model->callbackUrl = $map['callback_url'];
        }
        if (isset($map['create_did'])) {
            $model->createDid = $map['create_did'];
        }
        if (isset($map['easy_finance'])) {
            $model->easyFinance = $map['easy_finance'];
        }
        if (isset($map['expire_date'])) {
            $model->expireDate = $map['expire_date'];
        }
        if (isset($map['freight'])) {
            $model->freight = $map['freight'];
        }
        if (isset($map['group_platform_did'])) {
            $model->groupPlatformDid = $map['group_platform_did'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['pay_order'])) {
            $model->payOrder = $map['pay_order'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['receive_did'])) {
            $model->receiveDid = $map['receive_did'];
        }
        if (isset($map['waybill_ids'])) {
            if (!empty($map['waybill_ids'])) {
                $model->waybillIds = $map['waybill_ids'];
            }
        }

        return $model;
    }
}
