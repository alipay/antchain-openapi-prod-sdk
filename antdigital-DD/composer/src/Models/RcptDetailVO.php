<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class RcptDetailVO extends Model {
    protected $_name = [
        'arNo' => 'ar_no',
        'ou' => 'ou',
        'tenantId' => 'tenant_id',
        'tenantName' => 'tenant_name',
        'receiptNo' => 'receipt_no',
        'ccy' => 'ccy',
        'tax' => 'tax',
        'commodityCode' => 'commodity_code',
        'mode' => 'mode',
        'totalAmt' => 'total_amt',
        'invedAmt' => 'inved_amt',
        'remainAmt' => 'remain_amt',
        'commodityName' => 'commodity_name',
    ];
    public function validate() {
        Model::validateRequired('arNo', $this->arNo, true);
        Model::validateRequired('ou', $this->ou, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('tenantName', $this->tenantName, true);
        Model::validateRequired('receiptNo', $this->receiptNo, true);
        Model::validateRequired('ccy', $this->ccy, true);
        Model::validateRequired('commodityCode', $this->commodityCode, true);
        Model::validateRequired('mode', $this->mode, true);
        Model::validateRequired('totalAmt', $this->totalAmt, true);
        Model::validateRequired('invedAmt', $this->invedAmt, true);
        Model::validateRequired('remainAmt', $this->remainAmt, true);
        Model::validateRequired('commodityName', $this->commodityName, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->arNo) {
            $res['ar_no'] = $this->arNo;
        }
        if (null !== $this->ou) {
            $res['ou'] = $this->ou;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->receiptNo) {
            $res['receipt_no'] = $this->receiptNo;
        }
        if (null !== $this->ccy) {
            $res['ccy'] = $this->ccy;
        }
        if (null !== $this->tax) {
            $res['tax'] = $this->tax;
        }
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }
        if (null !== $this->mode) {
            $res['mode'] = $this->mode;
        }
        if (null !== $this->totalAmt) {
            $res['total_amt'] = $this->totalAmt;
        }
        if (null !== $this->invedAmt) {
            $res['inved_amt'] = $this->invedAmt;
        }
        if (null !== $this->remainAmt) {
            $res['remain_amt'] = $this->remainAmt;
        }
        if (null !== $this->commodityName) {
            $res['commodity_name'] = $this->commodityName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RcptDetailVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['ar_no'])){
            $model->arNo = $map['ar_no'];
        }
        if(isset($map['ou'])){
            $model->ou = $map['ou'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['tenant_name'])){
            $model->tenantName = $map['tenant_name'];
        }
        if(isset($map['receipt_no'])){
            $model->receiptNo = $map['receipt_no'];
        }
        if(isset($map['ccy'])){
            $model->ccy = $map['ccy'];
        }
        if(isset($map['tax'])){
            $model->tax = $map['tax'];
        }
        if(isset($map['commodity_code'])){
            $model->commodityCode = $map['commodity_code'];
        }
        if(isset($map['mode'])){
            $model->mode = $map['mode'];
        }
        if(isset($map['total_amt'])){
            $model->totalAmt = $map['total_amt'];
        }
        if(isset($map['inved_amt'])){
            $model->invedAmt = $map['inved_amt'];
        }
        if(isset($map['remain_amt'])){
            $model->remainAmt = $map['remain_amt'];
        }
        if(isset($map['commodity_name'])){
            $model->commodityName = $map['commodity_name'];
        }
        return $model;
    }
    // 合同号
    /**
     * @example 2088720671581149-ZNHYFM01222234
     * @var string
     */
    public $arNo;

    // OU
    /**
     * @example ZL6
     * @var string
     */
    public $ou;

    // 租户ID
    /**
     * @example 2088720671581149
     * @var string
     */
    public $tenantId;

    // 客户名称
    /**
     * @example 测试客户
     * @var string
     */
    public $tenantName;

    // 单据唯一号
    /**
     * @example 20230928107305000028710015937380
     * @var string
     */
    public $receiptNo;

    // 币种
    /**
     * @example 156
     * @var string
     */
    public $ccy;

    // 税率
    /**
     * @example 0.06
     * @var string
     */
    public $tax;

    // 商品CODE
    /**
     * @example SQBRFSZL601262688
     * @var string
     */
    public $commodityCode;

    // 开票模式，01：先款后票、02：先票后款
    /**
     * @example 01
     * @var string
     */
    public $mode;

    // 单据可开票总金额
    /**
     * @example 13.45
     * @var string
     */
    public $totalAmt;

    // 已开票金额
    /**
     * @example 2.23
     * @var string
     */
    public $invedAmt;

    // 剩余可开票金额
    /**
     * @example 234.99
     * @var string
     */
    public $remainAmt;

    // 商品名称
    /**
     * @example 商品名称
     * @var string
     */
    public $commodityName;

}
