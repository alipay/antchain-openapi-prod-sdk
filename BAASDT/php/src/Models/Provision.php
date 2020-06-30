<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class Provision extends Model {
    protected $_name = [
        'creditMax' => 'credit_max',
        'creditUsed' => 'credit_used',
        'currency' => 'currency',
        'debit' => 'debit',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->creditMax) {
            $res['credit_max'] = $this->creditMax;
        }
        if (null !== $this->creditUsed) {
            $res['credit_used'] = $this->creditUsed;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->debit) {
            $res['debit'] = $this->debit;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return Provision
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['credit_max'])){
            $model->creditMax = $map['credit_max'];
        }
        if(isset($map['credit_used'])){
            $model->creditUsed = $map['credit_used'];
        }
        if(isset($map['currency'])){
            $model->currency = $map['currency'];
        }
        if(isset($map['debit'])){
            $model->debit = $map['debit'];
        }
        return $model;
    }
    /**
     * @example 99999999.0000
     * @description 授信上限
     * @var string
     */
    public $creditMax;

    /**
     * @example 0.0000
     * @description 授信已使用
     * @var string
     */
    public $creditUsed;

    /**
     * @example CNY
     * @description 币种
     * @var string
     */
    public $currency;

    /**
     * @example 99999999.0000
     * @description 余额
     * @var string
     */
    public $debit;

}
