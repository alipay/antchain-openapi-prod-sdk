<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class QueryIndexresearchBrandindexRequest extends Model
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

    // 品牌码
    /**
     * @var string
     */
    public $brandCode;

    // 店铺标签
    /**
     * @var string
     */
    public $shopTag;

    // 月份
    /**
     * @var string[]
     */
    public $month;

    // 字段排序方式
    /**
     * @var string[]
     */
    public $sort;

    // page_info
    /**
     * @var PageInfo
     */
    public $pageInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'brandCode'         => 'brand_code',
        'shopTag'           => 'shop_tag',
        'month'             => 'month',
        'sort'              => 'sort',
        'pageInfo'          => 'page_info',
    ];

    public function validate()
    {
        Model::validateRequired('pageInfo', $this->pageInfo, true);
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
        if (null !== $this->brandCode) {
            $res['brand_code'] = $this->brandCode;
        }
        if (null !== $this->shopTag) {
            $res['shop_tag'] = $this->shopTag;
        }
        if (null !== $this->month) {
            $res['month'] = $this->month;
        }
        if (null !== $this->sort) {
            $res['sort'] = $this->sort;
        }
        if (null !== $this->pageInfo) {
            $res['page_info'] = null !== $this->pageInfo ? $this->pageInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIndexresearchBrandindexRequest
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
        if (isset($map['brand_code'])) {
            $model->brandCode = $map['brand_code'];
        }
        if (isset($map['shop_tag'])) {
            $model->shopTag = $map['shop_tag'];
        }
        if (isset($map['month'])) {
            if (!empty($map['month'])) {
                $model->month = $map['month'];
            }
        }
        if (isset($map['sort'])) {
            if (!empty($map['sort'])) {
                $model->sort = $map['sort'];
            }
        }
        if (isset($map['page_info'])) {
            $model->pageInfo = PageInfo::fromMap($map['page_info']);
        }

        return $model;
    }
}
