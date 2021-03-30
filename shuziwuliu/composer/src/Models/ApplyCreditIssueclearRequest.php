<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyCreditIssueclearRequest extends Model
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

    // 申请日期，不输入则是当前时间
    /**
     * @var int
     */
    public $applyDate;

    // 清分金额，当前只支持全额清分，不填就是默认全额清分
    /**
     * @var string
     */
    public $clearAmt;

    // 主动清分方分布式数字身份
    /**
     * @var string
     */
    public $clearDid;

    // 扩展字段
    /**
     * @var string
     */
    public $extInfo;

    // 集团平台方分布式数字身份
    /**
     * @var string
     */
    public $groupPlatformDid;

    // 凭证id
    /**
     * @var string
     */
    public $issueId;

    // 全局唯一业务流水号
    /**
     * @var string
     */
    public $outBizNo;

    // 外部订单号，此为支付单号
    /**
     * @var string
     */
    public $outOrderNo;

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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'applyDate'         => 'apply_date',
        'clearAmt'          => 'clear_amt',
        'clearDid'          => 'clear_did',
        'extInfo'           => 'ext_info',
        'groupPlatformDid'  => 'group_platform_did',
        'issueId'           => 'issue_id',
        'outBizNo'          => 'out_biz_no',
        'outOrderNo'        => 'out_order_no',
        'platformDid'       => 'platform_did',
        'productId'         => 'product_id',
    ];

    public function validate()
    {
        Model::validateRequired('clearDid', $this->clearDid, true);
        Model::validateRequired('groupPlatformDid', $this->groupPlatformDid, true);
        Model::validateRequired('issueId', $this->issueId, true);
        Model::validateRequired('outBizNo', $this->outBizNo, true);
        Model::validateRequired('outOrderNo', $this->outOrderNo, true);
        Model::validateRequired('platformDid', $this->platformDid, true);
        Model::validateRequired('productId', $this->productId, true);
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
        if (null !== $this->applyDate) {
            $res['apply_date'] = $this->applyDate;
        }
        if (null !== $this->clearAmt) {
            $res['clear_amt'] = $this->clearAmt;
        }
        if (null !== $this->clearDid) {
            $res['clear_did'] = $this->clearDid;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
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
        if (null !== $this->outOrderNo) {
            $res['out_order_no'] = $this->outOrderNo;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyCreditIssueclearRequest
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
        if (isset($map['apply_date'])) {
            $model->applyDate = $map['apply_date'];
        }
        if (isset($map['clear_amt'])) {
            $model->clearAmt = $map['clear_amt'];
        }
        if (isset($map['clear_did'])) {
            $model->clearDid = $map['clear_did'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
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
        if (isset($map['out_order_no'])) {
            $model->outOrderNo = $map['out_order_no'];
        }
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }

        return $model;
    }
}
