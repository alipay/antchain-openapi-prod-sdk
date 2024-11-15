<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class ListProductRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 用户域账号
    /**
     * @var string
     */
    public $userId;

    // 产品关键字
    /**
     * @var string
     */
    public $keyword;

    // 每页记录
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
        'authToken'   => 'auth_token',
        'userId'      => 'user_id',
        'keyword'     => 'keyword',
        'pageSize'    => 'page_size',
        'currentPage' => 'current_page',
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->keyword) {
            $res['keyword'] = $this->keyword;
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
     * @return ListProductRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['keyword'])) {
            $model->keyword = $map['keyword'];
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
