<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class NetValueInfo extends Model
{
    // 净值
    /**
     * @example 3.14
     *
     * @var string
     */
    public $netValue;

    // 币种（目前支持USD、HKD）
    /**
     * @example HKD
     *
     * @var string
     */
    public $currency;

    // 更新时间戳
    /**
     * @example 1726292715000
     *
     * @var int
     */
    public $updateTime;
    protected $_name = [
        'netValue'   => 'net_value',
        'currency'   => 'currency',
        'updateTime' => 'update_time',
    ];

    public function validate()
    {
        Model::validateRequired('netValue', $this->netValue, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('updateTime', $this->updateTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->netValue) {
            $res['net_value'] = $this->netValue;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NetValueInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['net_value'])) {
            $model->netValue = $map['net_value'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }

        return $model;
    }
}
