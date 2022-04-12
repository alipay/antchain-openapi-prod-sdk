<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM\Models;

use AlibabaCloud\Tea\Model;

class QueryCustomRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 分页页码
    /**
     * @var int
     */
    public $pageNo;

    // 分页长度，最大不超过50
    /**
     * @var int
     */
    public $pageSize;

    // 项目id，非必填；可通过项目id查询单个项目
    /**
     * @var string
     */
    public $projectId;
    protected $_name = [
        'authToken' => 'auth_token',
        'pageNo'    => 'page_no',
        'pageSize'  => 'page_size',
        'projectId' => 'project_id',
    ];

    public function validate()
    {
        Model::validateRequired('pageNo', $this->pageNo, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateMaximum('pageSize', $this->pageSize, 50);
        Model::validateMinimum('pageSize', $this->pageSize, 10);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCustomRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['page_no'])) {
            $model->pageNo = $map['page_no'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }

        return $model;
    }
}
