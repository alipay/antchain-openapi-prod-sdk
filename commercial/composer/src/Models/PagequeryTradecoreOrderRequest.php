<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class PagequeryTradecoreOrderRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 取值范围：NEW
    /**
     * @var string
     */
    public $orderType;

    // 取值范围：INIT、PAY_SUCCESS、CLOSED
    /**
     * @var string
     */
    public $orderStatus;

    // 取值范围：GMT_CREATE（订单创建时间）、GMT_PAY_SUCCESS（订单支付成功时间）
    /**
     * @var string
     */
    public $sortColumn;

    // 取值范围：ASC（升序）、DESC（降序）
    /**
     * @var string
     */
    public $sortType;

    // page_num
    /**
     * @var int
     */
    public $pageNum;

    // page_size
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'   => 'auth_token',
        'orderType'   => 'order_type',
        'orderStatus' => 'order_status',
        'sortColumn'  => 'sort_column',
        'sortType'    => 'sort_type',
        'pageNum'     => 'page_num',
        'pageSize'    => 'page_size',
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
        if (null !== $this->orderType) {
            $res['order_type'] = $this->orderType;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->sortColumn) {
            $res['sort_column'] = $this->sortColumn;
        }
        if (null !== $this->sortType) {
            $res['sort_type'] = $this->sortType;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryTradecoreOrderRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['order_type'])) {
            $model->orderType = $map['order_type'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }
        if (isset($map['sort_column'])) {
            $model->sortColumn = $map['sort_column'];
        }
        if (isset($map['sort_type'])) {
            $model->sortType = $map['sort_type'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
