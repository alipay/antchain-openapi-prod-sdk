<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\InvoiceLineVO;

class InvoiceInfoVO extends Model {
    protected $_name = [
        'invoiceId' => 'invoice_id',
        'invoiceCode' => 'invoice_code',
        'invoiceNo' => 'invoice_no',
        'invoiceAmt' => 'invoice_amt',
        'invoiceType' => 'invoice_type',
        'status' => 'status',
        'invoiceMaterial' => 'invoice_material',
        'invoiceLines' => 'invoice_lines',
        'invoiceDate' => 'invoice_date',
    ];
    public function validate() {
        Model::validateRequired('invoiceId', $this->invoiceId, true);
        Model::validateRequired('invoiceAmt', $this->invoiceAmt, true);
        Model::validateRequired('invoiceType', $this->invoiceType, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('invoiceDate', $this->invoiceDate, true);
        Model::validatePattern('invoiceDate', $this->invoiceDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->invoiceId) {
            $res['invoice_id'] = $this->invoiceId;
        }
        if (null !== $this->invoiceCode) {
            $res['invoice_code'] = $this->invoiceCode;
        }
        if (null !== $this->invoiceNo) {
            $res['invoice_no'] = $this->invoiceNo;
        }
        if (null !== $this->invoiceAmt) {
            $res['invoice_amt'] = $this->invoiceAmt;
        }
        if (null !== $this->invoiceType) {
            $res['invoice_type'] = $this->invoiceType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->invoiceMaterial) {
            $res['invoice_material'] = $this->invoiceMaterial;
        }
        if (null !== $this->invoiceLines) {
            $res['invoice_lines'] = [];
            if(null !== $this->invoiceLines && is_array($this->invoiceLines)){
                $n = 0;
                foreach($this->invoiceLines as $item){
                    $res['invoice_lines'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->invoiceDate) {
            $res['invoice_date'] = $this->invoiceDate;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return InvoiceInfoVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['invoice_id'])){
            $model->invoiceId = $map['invoice_id'];
        }
        if(isset($map['invoice_code'])){
            $model->invoiceCode = $map['invoice_code'];
        }
        if(isset($map['invoice_no'])){
            $model->invoiceNo = $map['invoice_no'];
        }
        if(isset($map['invoice_amt'])){
            $model->invoiceAmt = $map['invoice_amt'];
        }
        if(isset($map['invoice_type'])){
            $model->invoiceType = $map['invoice_type'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['invoice_material'])){
            $model->invoiceMaterial = $map['invoice_material'];
        }
        if(isset($map['invoice_lines'])){
            if(!empty($map['invoice_lines'])){
                $model->invoiceLines = [];
                $n = 0;
                foreach($map['invoice_lines'] as $item) {
                    $model->invoiceLines[$n++] = null !== $item ? InvoiceLineVO::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['invoice_date'])){
            $model->invoiceDate = $map['invoice_date'];
        }
        return $model;
    }
    // 发票ID
    /**
     * @example 233445656676
     * @var string
     */
    public $invoiceId;

    // 发票编号
    /**
     * @example FULL_ELECTRONIC_INVOICE
     * @var string
     */
    public $invoiceCode;

    // 发票号码
    /**
     * @example 3455666767777
     * @var string
     */
    public $invoiceNo;

    // 发票金额
    /**
     * @example 220.09
     * @var string
     */
    public $invoiceAmt;

    // 发票类型,01专票 02普票 03营业税发票 04国际形式发票 05其它发票
    /**
     * @example 01
     * @var string
     */
    public $invoiceType;

    // 发票的业务状态, 待开票: TO_INV, 开票中: INV_ING, 已开票: INVED, 退票中: INV_RETURN, 换票中: INV_REPLACE, 已失效: INV_DEP
    /**
     * @example INVED
     * @var string
     */
    public $status;

    // 发票介质，01：电子，02：纸质
    /**
     * @example 01
     * @var string
     */
    public $invoiceMaterial;

    // 发票行信息
    /**
     * @example 
     * @var InvoiceLineVO[]
     */
    public $invoiceLines;

    // 开票日期
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $invoiceDate;

}
