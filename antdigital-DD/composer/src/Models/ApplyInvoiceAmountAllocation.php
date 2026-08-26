<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\AmountSummaryConfig;

class ApplyInvoiceAmountAllocation extends Model {
    protected $_name = [
        'amountSummaryConfig' => 'amount_summary_config',
        'amountSource' => 'amount_source',
        'ccy' => 'ccy',
    ];
    public function validate() {
        Model::validateRequired('ccy', $this->ccy, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->amountSummaryConfig) {
            $res['amount_summary_config'] = [];
            if(null !== $this->amountSummaryConfig && is_array($this->amountSummaryConfig)){
                $n = 0;
                foreach($this->amountSummaryConfig as $item){
                    $res['amount_summary_config'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->amountSource) {
            $res['amount_source'] = $this->amountSource;
        }
        if (null !== $this->ccy) {
            $res['ccy'] = $this->ccy;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyInvoiceAmountAllocation
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['amount_summary_config'])){
            if(!empty($map['amount_summary_config'])){
                $model->amountSummaryConfig = [];
                $n = 0;
                foreach($map['amount_summary_config'] as $item) {
                    $model->amountSummaryConfig[$n++] = null !== $item ? AmountSummaryConfig::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['amount_source'])){
            $model->amountSource = $map['amount_source'];
        }
        if(isset($map['ccy'])){
            $model->ccy = $map['ccy'];
        }
        return $model;
    }
    // 额度汇总信息，标准可开票单据下，KEY为需要占用的单据号，VALUE为需要占用的额度
    /**
     * @example xxx
     * @var AmountSummaryConfig[]
     */
    public $amountSummaryConfig;

    // 额度来源，默认INVOICE_RCPT
    /**
     * @example INVOICE_RCPT
     * @var string
     */
    public $amountSource;

    // 币种，默认156
    /**
     * @example 156
     * @var string
     */
    public $ccy;

}
