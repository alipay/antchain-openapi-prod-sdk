<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class AmountSummaryConfig extends Model {
    protected $_name = [
        'summaryKey' => 'summary_key',
        'summaryValue' => 'summary_value',
    ];
    public function validate() {
        Model::validateRequired('summaryKey', $this->summaryKey, true);
        Model::validateRequired('summaryValue', $this->summaryValue, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->summaryKey) {
            $res['summary_key'] = $this->summaryKey;
        }
        if (null !== $this->summaryValue) {
            $res['summary_value'] = $this->summaryValue;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AmountSummaryConfig
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['summary_key'])){
            $model->summaryKey = $map['summary_key'];
        }
        if(isset($map['summary_value'])){
            $model->summaryValue = $map['summary_value'];
        }
        return $model;
    }
    // 汇总KEY
    /**
     * @example 2334445
     * @var string
     */
    public $summaryKey;

    // 汇总金额，单位为元
    /**
     * @example 230
     * @var string
     */
    public $summaryValue;

}
