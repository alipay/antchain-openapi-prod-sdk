<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CustomerUmktInfosModel extends Model
{
    // 归属用户的混合营销决策结果
    /**
     * @example
     *
     * @var UmktInfoModel[]
     */
    public $umktResults;

    // 用户凭证
    /**
     * @example 8002c3d97e7d4d20a0647c75dfab1efe
     *
     * @var string
     */
    public $customerKey;
    protected $_name = [
        'umktResults' => 'umkt_results',
        'customerKey' => 'customer_key',
    ];

    public function validate()
    {
        Model::validateRequired('umktResults', $this->umktResults, true);
        Model::validateRequired('customerKey', $this->customerKey, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->umktResults) {
            $res['umkt_results'] = [];
            if (null !== $this->umktResults && \is_array($this->umktResults)) {
                $n = 0;
                foreach ($this->umktResults as $item) {
                    $res['umkt_results'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->customerKey) {
            $res['customer_key'] = $this->customerKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CustomerUmktInfosModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['umkt_results'])) {
            if (!empty($map['umkt_results'])) {
                $model->umktResults = [];
                $n                  = 0;
                foreach ($map['umkt_results'] as $item) {
                    $model->umktResults[$n++] = null !== $item ? UmktInfoModel::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['customer_key'])) {
            $model->customerKey = $map['customer_key'];
        }

        return $model;
    }
}
