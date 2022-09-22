<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ListUnireleaseSolutionsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 当前页
    /**
     * @var int
     */
    public $page;

    // 页大小
    /**
     * @var int
     */
    public $pageSize;

    // 操作人
    /**
     * @var string
     */
    public $operator;

    // 发布名称
    /**
     * @var string
     */
    public $name;

    // 创建时间初始值
    /**
     * @var string
     */
    public $creationTimeFrom;

    // 创建时间结束值
    /**
     * @var string
     */
    public $creationTimeTo;

    // AC ID
    /**
     * @var string
     */
    public $acId;
    protected $_name = [
        'authToken'        => 'auth_token',
        'page'             => 'page',
        'pageSize'         => 'page_size',
        'operator'         => 'operator',
        'name'             => 'name',
        'creationTimeFrom' => 'creation_time_from',
        'creationTimeTo'   => 'creation_time_to',
        'acId'             => 'ac_id',
    ];

    public function validate()
    {
        Model::validateRequired('page', $this->page, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validatePattern('creationTimeFrom', $this->creationTimeFrom, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('creationTimeTo', $this->creationTimeTo, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->page) {
            $res['page'] = $this->page;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->creationTimeFrom) {
            $res['creation_time_from'] = $this->creationTimeFrom;
        }
        if (null !== $this->creationTimeTo) {
            $res['creation_time_to'] = $this->creationTimeTo;
        }
        if (null !== $this->acId) {
            $res['ac_id'] = $this->acId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListUnireleaseSolutionsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['page'])) {
            $model->page = $map['page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['creation_time_from'])) {
            $model->creationTimeFrom = $map['creation_time_from'];
        }
        if (isset($map['creation_time_to'])) {
            $model->creationTimeTo = $map['creation_time_to'];
        }
        if (isset($map['ac_id'])) {
            $model->acId = $map['ac_id'];
        }

        return $model;
    }
}
