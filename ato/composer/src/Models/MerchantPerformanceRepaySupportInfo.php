<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class MerchantPerformanceRepaySupportInfo extends Model
{
    // 是否支持还款取消
    /**
     * @example true, false
     *
     * @var bool
     */
    public $supportRepay;

    // 商户履约期数
    /**
     * @example 2
     *
     * @var int
     */
    public $termIndex;
    protected $_name = [
        'supportRepay' => 'support_repay',
        'termIndex'    => 'term_index',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->supportRepay) {
            $res['support_repay'] = $this->supportRepay;
        }
        if (null !== $this->termIndex) {
            $res['term_index'] = $this->termIndex;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MerchantPerformanceRepaySupportInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['support_repay'])) {
            $model->supportRepay = $map['support_repay'];
        }
        if (isset($map['term_index'])) {
            $model->termIndex = $map['term_index'];
        }

        return $model;
    }
}
