<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class BaseCustomerUmktInfoModel extends Model
{
    // 用户凭证
    /**
     * @example 15011111605
     *
     * @var string
     */
    public $customerKey;

    // 输入模板
    /**
     * @example MOBILE
     *
     * @var string
     */
    public $queryTemplate;

    // 实时营销结果
    /**
     * @example 1
     *
     * @var int
     */
    public $umktResult;
    protected $_name = [
        'customerKey'   => 'customer_key',
        'queryTemplate' => 'query_template',
        'umktResult'    => 'umkt_result',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->customerKey) {
            $res['customer_key'] = $this->customerKey;
        }
        if (null !== $this->queryTemplate) {
            $res['query_template'] = $this->queryTemplate;
        }
        if (null !== $this->umktResult) {
            $res['umkt_result'] = $this->umktResult;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaseCustomerUmktInfoModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['customer_key'])) {
            $model->customerKey = $map['customer_key'];
        }
        if (isset($map['query_template'])) {
            $model->queryTemplate = $map['query_template'];
        }
        if (isset($map['umkt_result'])) {
            $model->umktResult = $map['umkt_result'];
        }

        return $model;
    }
}
