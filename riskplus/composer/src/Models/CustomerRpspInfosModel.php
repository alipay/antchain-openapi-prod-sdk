<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CustomerRpspInfosModel extends Model
{
    // 归属用户的混合分层决策结果
    /**
     * @example
     *
     * @var RpspInfoModel[]
     */
    public $rpspResults;

    // 用户凭证
    /**
     * @example 8002c3d97e7d4d20a0647c75dfab1efe
     *
     * @var string
     */
    public $customerKey;
    protected $_name = [
        'rpspResults' => 'rpsp_results',
        'customerKey' => 'customer_key',
    ];

    public function validate()
    {
        Model::validateRequired('rpspResults', $this->rpspResults, true);
        Model::validateRequired('customerKey', $this->customerKey, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->rpspResults) {
            $res['rpsp_results'] = [];
            if (null !== $this->rpspResults && \is_array($this->rpspResults)) {
                $n = 0;
                foreach ($this->rpspResults as $item) {
                    $res['rpsp_results'][$n++] = null !== $item ? $item->toMap() : $item;
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
     * @return CustomerRpspInfosModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['rpsp_results'])) {
            if (!empty($map['rpsp_results'])) {
                $model->rpspResults = [];
                $n                  = 0;
                foreach ($map['rpsp_results'] as $item) {
                    $model->rpspResults[$n++] = null !== $item ? RpspInfoModel::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['customer_key'])) {
            $model->customerKey = $map['customer_key'];
        }

        return $model;
    }
}
