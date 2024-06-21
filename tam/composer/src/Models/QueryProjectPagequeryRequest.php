<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM\Models;

use AlibabaCloud\Tea\Model;

class QueryProjectPagequeryRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 兼容BD待客下单对外暴露项目Id查询
    /**
     * @var string
     */
    public $id;

    // 项目唯一编码
    /**
     * @var string
     */
    public $projectCode;

    // 项目名称，支持模糊
    /**
     * @var string
     */
    public $title;

    // 客户id
    /**
     * @var string
     */
    public $customerId;

    // 客户名称
    /**
     * @var string
     */
    public $customerName;

    // 项目阶段，支持多个过滤
    /**
     * @var string[]
     */
    public $status;

    // 项目阶段，支持多个过滤
    /**
     * @var string[]
     */
    public $stages;

    // 项目BD工号列表
    /**
     * @var string[]
     */
    public $bdWorkNos;

    // 交付项目经理工号列表
    /**
     * @var string[]
     */
    public $pmWorkNos;

    // 页面大小
    /**
     * @var int
     */
    public $pageSize;

    // 当前页面
    /**
     * @var int
     */
    public $currentPage;
    protected $_name = [
        'authToken'    => 'auth_token',
        'id'           => 'id',
        'projectCode'  => 'project_code',
        'title'        => 'title',
        'customerId'   => 'customer_id',
        'customerName' => 'customer_name',
        'status'       => 'status',
        'stages'       => 'stages',
        'bdWorkNos'    => 'bd_work_nos',
        'pmWorkNos'    => 'pm_work_nos',
        'pageSize'     => 'page_size',
        'currentPage'  => 'current_page',
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->projectCode) {
            $res['project_code'] = $this->projectCode;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->customerName) {
            $res['customer_name'] = $this->customerName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->stages) {
            $res['stages'] = $this->stages;
        }
        if (null !== $this->bdWorkNos) {
            $res['bd_work_nos'] = $this->bdWorkNos;
        }
        if (null !== $this->pmWorkNos) {
            $res['pm_work_nos'] = $this->pmWorkNos;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryProjectPagequeryRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['project_code'])) {
            $model->projectCode = $map['project_code'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['customer_name'])) {
            $model->customerName = $map['customer_name'];
        }
        if (isset($map['status'])) {
            if (!empty($map['status'])) {
                $model->status = $map['status'];
            }
        }
        if (isset($map['stages'])) {
            if (!empty($map['stages'])) {
                $model->stages = $map['stages'];
            }
        }
        if (isset($map['bd_work_nos'])) {
            if (!empty($map['bd_work_nos'])) {
                $model->bdWorkNos = $map['bd_work_nos'];
            }
        }
        if (isset($map['pm_work_nos'])) {
            if (!empty($map['pm_work_nos'])) {
                $model->pmWorkNos = $map['pm_work_nos'];
            }
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }

        return $model;
    }
}
