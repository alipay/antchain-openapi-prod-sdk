<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyDigitalLogisticCreditmodeIssueclearRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'productId' => 'product_id',
        'groupPlatformDid' => 'group_platform_did',
        'platformDid' => 'platform_did',
        'clearDid' => 'clear_did',
        'issueId' => 'issue_id',
        'outBizNo' => 'out_biz_no',
        'outOrderNo' => 'out_order_no',
        'clearAmt' => 'clear_amt',
        'modeType' => 'mode_type',
        'applyDate' => 'apply_date',
        'extInfo' => 'ext_info',
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
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->groupPlatformDid) {
            $res['group_platform_did'] = $this->groupPlatformDid;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->clearDid) {
            $res['clear_did'] = $this->clearDid;
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
        if (null !== $this->clearAmt) {
            $res['clear_amt'] = $this->clearAmt;
        }
        if (null !== $this->modeType) {
            $res['mode_type'] = $this->modeType;
        }
        if (null !== $this->applyDate) {
            $res['apply_date'] = $this->applyDate;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyDigitalLogisticCreditmodeIssueclearRequest
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
        if(isset($map['product_id'])){
            $model->productId = $map['product_id'];
        }
        if(isset($map['group_platform_did'])){
            $model->groupPlatformDid = $map['group_platform_did'];
        }
        if(isset($map['platform_did'])){
            $model->platformDid = $map['platform_did'];
        }
        if(isset($map['clear_did'])){
            $model->clearDid = $map['clear_did'];
        }
        if(isset($map['issue_id'])){
            $model->issueId = $map['issue_id'];
        }
        if(isset($map['out_biz_no'])){
            $model->outBizNo = $map['out_biz_no'];
        }
        if(isset($map['out_order_no'])){
            $model->outOrderNo = $map['out_order_no'];
        }
        if(isset($map['clear_amt'])){
            $model->clearAmt = $map['clear_amt'];
        }
        if(isset($map['mode_type'])){
            $model->modeType = $map['mode_type'];
        }
        if(isset($map['apply_date'])){
            $model->applyDate = $map['apply_date'];
        }
        if(isset($map['ext_info'])){
            $model->extInfo = $map['ext_info'];
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

    // 产品id
    /**
     * @var string
     */
    public $productId;

    // 集团平台方分布式数字身份
    /**
     * @var string
     */
    public $groupPlatformDid;

    // 业务平台方分布式数字身份
    /**
     * @var string
     */
    public $platformDid;

    // 主动清分方分布式数字身份
    /**
     * @var string
     */
    public $clearDid;

    // 凭证id
    /**
     * @var string
     */
    public $issueId;

    // 全局业务号
    /**
     * @var string
     */
    public $outBizNo;

    // 支付单号
    /**
     * @var string
     */
    public $outOrderNo;

    // 清分金额
    /**
     * @var string
     */
    public $clearAmt;

    // 模式  B:b模式
    /**
     * @var string
     */
    public $modeType;

    // 申请日期
    /**
     * @var string
     */
    public $applyDate;

    // 扩展字段
    /**
     * @var string
     */
    public $extInfo;

}
