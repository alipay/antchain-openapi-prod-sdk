<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryDatabaseAccountRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // current_page
    /**
     * @var int
     */
    public $currentPage;

    // database_id
    /**
     * @var string
     */
    public $databaseId;

    // page_size
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'   => 'auth_token',
        'currentPage' => 'current_page',
        'databaseId'  => 'database_id',
        'pageSize'    => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('databaseId', $this->databaseId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->databaseId) {
            $res['database_id'] = $this->databaseId;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDatabaseAccountRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['database_id'])) {
            $model->databaseId = $map['database_id'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
