<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CustomerServiceInfo extends Model
{
    // 公司社会统一信息代码
    /**
     * @example 91301010101010101A
     *
     * @var string
     */
    public $merchantId;

    // 公司名称
    /**
     * @example xxx公司
     *
     * @var string
     */
    public $merchantName;

    // 处理类型: 商家处理 服务商代处理
    /**
     * @example 商家处理
     *
     * @var string
     */
    public $processType;
    protected $_name = [
        'merchantId'   => 'merchant_id',
        'merchantName' => 'merchant_name',
        'processType'  => 'process_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->merchantName) {
            $res['merchant_name'] = $this->merchantName;
        }
        if (null !== $this->processType) {
            $res['process_type'] = $this->processType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CustomerServiceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['merchant_name'])) {
            $model->merchantName = $map['merchant_name'];
        }
        if (isset($map['process_type'])) {
            $model->processType = $map['process_type'];
        }

        return $model;
    }
}
