<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class ExpenditureQuotationItem extends Model
{
    // 外部唯一id，sku-id
    /**
     * @example 123456
     *
     * @var string
     */
    public $outUniqueId;

    // 配置单商品名称
    /**
     * @example 越王宝剑
     *
     * @var string
     */
    public $name;

    // 支出配置单对象描述
    /**
     * @example 支出配置单对象描述
     *
     * @var string
     */
    public $description;

    // 预估交易金额（分）
    /**
     * @example
     *
     * @var int
     */
    public $predictTransactionAmount;
    protected $_name = [
        'outUniqueId'              => 'out_unique_id',
        'name'                     => 'name',
        'description'              => 'description',
        'predictTransactionAmount' => 'predict_transaction_amount',
    ];

    public function validate()
    {
        Model::validateRequired('outUniqueId', $this->outUniqueId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('predictTransactionAmount', $this->predictTransactionAmount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->outUniqueId) {
            $res['out_unique_id'] = $this->outUniqueId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->predictTransactionAmount) {
            $res['predict_transaction_amount'] = $this->predictTransactionAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExpenditureQuotationItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['out_unique_id'])) {
            $model->outUniqueId = $map['out_unique_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['predict_transaction_amount'])) {
            $model->predictTransactionAmount = $map['predict_transaction_amount'];
        }

        return $model;
    }
}
