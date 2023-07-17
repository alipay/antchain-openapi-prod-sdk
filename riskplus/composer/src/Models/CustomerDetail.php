<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CustomerDetail extends Model
{
    // 用户标识
    /**
     * @example "186123456789"
     *
     * @var string
     */
    public $customerKey;

    // 渠道参数
    /**
     * @example "{"name":"苹果","code":"5643","num":"5"}"
     *
     * @var string
     */
    public $channelParams;

    // 用户透传字段
    /**
     * @example "[{"name":"zhangshan"}]"
     *
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'customerKey'   => 'customer_key',
        'channelParams' => 'channel_params',
        'extInfo'       => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('customerKey', $this->customerKey, true);
        Model::validateRequired('channelParams', $this->channelParams, true);
        Model::validateRequired('extInfo', $this->extInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->customerKey) {
            $res['customer_key'] = $this->customerKey;
        }
        if (null !== $this->channelParams) {
            $res['channel_params'] = $this->channelParams;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CustomerDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['customer_key'])) {
            $model->customerKey = $map['customer_key'];
        }
        if (isset($map['channel_params'])) {
            $model->channelParams = $map['channel_params'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
