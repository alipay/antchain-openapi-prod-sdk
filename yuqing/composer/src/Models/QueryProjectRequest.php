<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class QueryProjectRequest extends Model
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

    // 父亲项目的id: 负数表示不限
    /**
     * @var int
     */
    public $parentId;

    // uid
    /**
     * @var string
     */
    public $uid;

    // 排序字段名称，如gmt_create
    /**
     * @var string
     */
    public $orderBy;

    // 请求ID
    /**
     * @var string
     */
    public $requestId;

    // 名称
    /**
     * @var string
     */
    public $name;

    // 指定ID
    /**
     * @var int[]
     */
    public $ids;

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    // 所在项目组ID
    /**
     * @var int
     */
    public $projectGroupId;

    // 页面大小
    /**
     * @var int
     */
    public $pageSize;

    // 排序方式：DESC降序，ASC升序
    /**
     * @var string
     */
    public $sortType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'parentId'          => 'parent_id',
        'uid'               => 'uid',
        'orderBy'           => 'order_by',
        'requestId'         => 'request_id',
        'name'              => 'name',
        'ids'               => 'ids',
        'currentPage'       => 'current_page',
        'projectGroupId'    => 'project_group_id',
        'pageSize'          => 'page_size',
        'sortType'          => 'sort_type',
    ];

    public function validate()
    {
        Model::validateRequired('currentPage', $this->currentPage, true);
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
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }
        if (null !== $this->orderBy) {
            $res['order_by'] = $this->orderBy;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->ids) {
            $res['ids'] = $this->ids;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->projectGroupId) {
            $res['project_group_id'] = $this->projectGroupId;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->sortType) {
            $res['sort_type'] = $this->sortType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryProjectRequest
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
        if (isset($map['parent_id'])) {
            $model->parentId = $map['parent_id'];
        }
        if (isset($map['uid'])) {
            $model->uid = $map['uid'];
        }
        if (isset($map['order_by'])) {
            $model->orderBy = $map['order_by'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['ids'])) {
            if (!empty($map['ids'])) {
                $model->ids = $map['ids'];
            }
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['project_group_id'])) {
            $model->projectGroupId = $map['project_group_id'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['sort_type'])) {
            $model->sortType = $map['sort_type'];
        }

        return $model;
    }
}
