<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAASSPI\Models;

use AlibabaCloud\Tea\Model;

class DownloadAntchainSdsStockRefundflowRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 格式yyyy-MM- dd仅支持近1年的日期账单数据下载，账单日期需早于当前日期，且在批次有效期内。
    /**
     * @var string
     */
    public $billDate;

    // 单次请求仅支持单批次，校验批次号合法性，需要为创建方创建的批次号，支持全场券、单品券、全场立减、全场折扣、单品立减。
    /**
     * @var string
     */
    public $stockId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'billDate'          => 'bill_date',
        'stockId'           => 'stock_id',
    ];

    public function validate()
    {
        Model::validateRequired('billDate', $this->billDate, true);
        Model::validateRequired('stockId', $this->stockId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->billDate) {
            $res['bill_date'] = $this->billDate;
        }
        if (null !== $this->stockId) {
            $res['stock_id'] = $this->stockId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DownloadAntchainSdsStockRefundflowRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['bill_date'])) {
            $model->billDate = $map['bill_date'];
        }
        if (isset($map['stock_id'])) {
            $model->stockId = $map['stock_id'];
        }

        return $model;
    }
}
