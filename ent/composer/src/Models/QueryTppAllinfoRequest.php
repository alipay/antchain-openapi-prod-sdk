<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class QueryTppAllinfoRequest extends Model
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

    // 支付宝UID
    /**
     * @var string
     */
    public $alipayUid;

    // 排序方式，默认降序
    /**
     * @var string
     */
    public $orderBy;

    // 页码
    /**
     * @var int
     */
    public $pageId;

    // 页面大小
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'alipayUid'         => 'alipay_uid',
        'orderBy'           => 'order_by',
        'pageId'            => 'page_id',
        'pageSize'          => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('alipayUid', $this->alipayUid, true);
        Model::validateRequired('pageId', $this->pageId, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
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
        if (null !== $this->alipayUid) {
            $res['alipay_uid'] = $this->alipayUid;
        }
        if (null !== $this->orderBy) {
            $res['order_by'] = $this->orderBy;
        }
        if (null !== $this->pageId) {
            $res['page_id'] = $this->pageId;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTppAllinfoRequest
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
        if (isset($map['alipay_uid'])) {
            $model->alipayUid = $map['alipay_uid'];
        }
        if (isset($map['order_by'])) {
            $model->orderBy = $map['order_by'];
        }
        if (isset($map['page_id'])) {
            $model->pageId = $map['page_id'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
