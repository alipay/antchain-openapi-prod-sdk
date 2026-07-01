<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractDocSignVerifySignatureInfo extends Model
{
    // 是否篡改
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isModify;

    // 签署时间来源
    /**
     * @example tsr
     *
     * @var string
     */
    public $timeFrom;

    // 签署时间
    /**
     * @example 2020-11-18 20:30:41
     *
     * @var string
     */
    public $signDate;
    protected $_name = [
        'isModify' => 'is_modify',
        'timeFrom' => 'time_from',
        'signDate' => 'sign_date',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->isModify) {
            $res['is_modify'] = $this->isModify;
        }
        if (null !== $this->timeFrom) {
            $res['time_from'] = $this->timeFrom;
        }
        if (null !== $this->signDate) {
            $res['sign_date'] = $this->signDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractDocSignVerifySignatureInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['is_modify'])) {
            $model->isModify = $map['is_modify'];
        }
        if (isset($map['time_from'])) {
            $model->timeFrom = $map['time_from'];
        }
        if (isset($map['sign_date'])) {
            $model->signDate = $map['sign_date'];
        }

        return $model;
    }
}
