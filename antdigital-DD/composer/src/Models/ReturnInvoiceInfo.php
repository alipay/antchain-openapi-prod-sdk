<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class ReturnInvoiceInfo extends Model {
    protected $_name = [
        'invoiceId' => 'invoice_id',
        'returnOrderType' => 'return_order_type',
        'returnReasonType' => 'return_reason_type',
        'memo' => 'memo',
        'trackingNo' => 'tracking_no',
        'expressCompanyName' => 'express_company_name',
        'auth' => 'auth',
    ];
    public function validate() {
        Model::validateRequired('invoiceId', $this->invoiceId, true);
        Model::validateRequired('returnOrderType', $this->returnOrderType, true);
        Model::validateRequired('returnReasonType', $this->returnReasonType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->invoiceId) {
            $res['invoice_id'] = $this->invoiceId;
        }
        if (null !== $this->returnOrderType) {
            $res['return_order_type'] = $this->returnOrderType;
        }
        if (null !== $this->returnReasonType) {
            $res['return_reason_type'] = $this->returnReasonType;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->trackingNo) {
            $res['tracking_no'] = $this->trackingNo;
        }
        if (null !== $this->expressCompanyName) {
            $res['express_company_name'] = $this->expressCompanyName;
        }
        if (null !== $this->auth) {
            $res['auth'] = $this->auth;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ReturnInvoiceInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['invoice_id'])){
            $model->invoiceId = $map['invoice_id'];
        }
        if(isset($map['return_order_type'])){
            $model->returnOrderType = $map['return_order_type'];
        }
        if(isset($map['return_reason_type'])){
            $model->returnReasonType = $map['return_reason_type'];
        }
        if(isset($map['memo'])){
            $model->memo = $map['memo'];
        }
        if(isset($map['tracking_no'])){
            $model->trackingNo = $map['tracking_no'];
        }
        if(isset($map['express_company_name'])){
            $model->expressCompanyName = $map['express_company_name'];
        }
        if(isset($map['auth'])){
            $model->auth = $map['auth'];
        }
        return $model;
    }
    // 发票ID
    /**
     * @example 33445566556
     * @var string
     */
    public $invoiceId;

    // 退换票类型,01:退票 02:换票
    /**
     * @example 01
     * @var string
     */
    public $returnOrderType;

    // 退换票原因类型, 01：发票介质修改  02：发票类型修改  03：发票信息修改 05：其他 06：不需要发票
    /**
     * @example 06
     * @var string
     */
    public $returnReasonType;

    // 备注
    /**
     * @example 备注
     * @var string
     */
    public $memo;

    // 快递单号
    /**
     * @example 3444
     * @var string
     */
    public $trackingNo;

    // 快递公司名称
    /**
     * @example XX快递
     * @var string
     */
    public $expressCompanyName;

    // 是否认证，1：已认证抵扣 0：未认证抵扣
    /**
     * @example 0
     * @var string
     */
    public $auth;

}
