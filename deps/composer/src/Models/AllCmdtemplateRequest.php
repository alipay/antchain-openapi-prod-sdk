<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class AllCmdtemplateRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // 页码
    /**
     * @var int
     */
    public $pageNo;

    // 页容量
    /**
     * @var int
     */
    public $pageSize;

    // 工作空间
    /**
     * @var string
     */
    public $workspace;

    // 排序字段
    /**
     * @var string[]
     */
    public $orders;

    // 关键字
    /**
     * @var string
     */
    public $keyword;
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant'    => 'tenant',
        'pageNo'    => 'page_no',
        'pageSize'  => 'page_size',
        'workspace' => 'workspace',
        'orders'    => 'orders',
        'keyword'   => 'keyword',
    ];

    public function validate()
    {
        Model::validateRequired('pageNo', $this->pageNo, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->orders) {
            $res['orders'] = $this->orders;
        }
        if (null !== $this->keyword) {
            $res['keyword'] = $this->keyword;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AllCmdtemplateRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['page_no'])) {
            $model->pageNo = $map['page_no'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['orders'])) {
            if (!empty($map['orders'])) {
                $model->orders = $map['orders'];
            }
        }
        if (isset($map['keyword'])) {
            $model->keyword = $map['keyword'];
        }

        return $model;
    }
}
