<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDistributionFundPromoterflowRequest extends Model
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

    // 分页号
    /**
     * @var int
     */
    public $pageNum;

    // 分页显示条数
    /**
     * @var int
     */
    public $pageSize;

    // 推广人id
    /**
     * @var string
     */
    public $promoterId;

    // 商户id
    /**
     * @var string
     */
    public $shopId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
        'promoterId'        => 'promoter_id',
        'shopId'            => 'shop_id',
    ];

    public function validate()
    {
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('promoterId', $this->promoterId, true);
        Model::validateRequired('shopId', $this->shopId, true);
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
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->promoterId) {
            $res['promoter_id'] = $this->promoterId;
        }
        if (null !== $this->shopId) {
            $res['shop_id'] = $this->shopId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDistributionFundPromoterflowRequest
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
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['promoter_id'])) {
            $model->promoterId = $map['promoter_id'];
        }
        if (isset($map['shop_id'])) {
            $model->shopId = $map['shop_id'];
        }

        return $model;
    }
}
