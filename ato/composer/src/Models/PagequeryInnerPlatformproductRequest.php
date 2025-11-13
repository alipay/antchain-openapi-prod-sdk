<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PagequeryInnerPlatformproductRequest extends Model
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

    // 分页参数
    /**
     * @var PageQuery
     */
    public $pageInfo;

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 商品名称
    /**
     * @var string
     */
    public $productName;

    // 一级分类
    /**
     * @var string
     */
    public $primaryCategory;

    // 二级分类
    /**
     * @var string
     */
    public $secondaryCategory;

    // 是否只展示已申请的通品
    /**
     * @var bool
     */
    public $onlyShowApplied;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pageInfo'          => 'page_info',
        'tenantId'          => 'tenant_id',
        'productName'       => 'product_name',
        'primaryCategory'   => 'primary_category',
        'secondaryCategory' => 'secondary_category',
        'onlyShowApplied'   => 'only_show_applied',
    ];

    public function validate()
    {
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
        if (null !== $this->pageInfo) {
            $res['page_info'] = null !== $this->pageInfo ? $this->pageInfo->toMap() : null;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->primaryCategory) {
            $res['primary_category'] = $this->primaryCategory;
        }
        if (null !== $this->secondaryCategory) {
            $res['secondary_category'] = $this->secondaryCategory;
        }
        if (null !== $this->onlyShowApplied) {
            $res['only_show_applied'] = $this->onlyShowApplied;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryInnerPlatformproductRequest
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
        if (isset($map['page_info'])) {
            $model->pageInfo = PageQuery::fromMap($map['page_info']);
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['primary_category'])) {
            $model->primaryCategory = $map['primary_category'];
        }
        if (isset($map['secondary_category'])) {
            $model->secondaryCategory = $map['secondary_category'];
        }
        if (isset($map['only_show_applied'])) {
            $model->onlyShowApplied = $map['only_show_applied'];
        }

        return $model;
    }
}
