<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainMiniAppLog extends Model
{
    // access_count
    /**
     * @example 100
     *
     * @var int
     */
    public $accessCount;

    // access_alipay_account_count
    /**
     * @example 1000
     *
     * @var int
     */
    public $accessAlipayAccountCount;
    protected $_name = [
        'accessCount'              => 'access_count',
        'accessAlipayAccountCount' => 'access_alipay_account_count',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accessCount) {
            $res['access_count'] = $this->accessCount;
        }
        if (null !== $this->accessAlipayAccountCount) {
            $res['access_alipay_account_count'] = $this->accessAlipayAccountCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainMiniAppLog
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['access_count'])) {
            $model->accessCount = $map['access_count'];
        }
        if (isset($map['access_alipay_account_count'])) {
            $model->accessAlipayAccountCount = $map['access_alipay_account_count'];
        }

        return $model;
    }
}
