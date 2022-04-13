<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ListDeploymentTemplateRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 模板编码或名称模糊搜索
    /**
     * @var string
     */
    public $name;

    // 当前页码，从1开始，默认为1
    /**
     * @var int
     */
    public $pageNumber;

    // 分页大小，默认为10
    /**
     * @var int
     */
    public $pageSize;

    // 查询方式，默认FUZZY，模糊查询
    /**
     * @var string
     */
    public $queryType;
    protected $_name = [
        'authToken'  => 'auth_token',
        'name'       => 'name',
        'pageNumber' => 'page_number',
        'pageSize'   => 'page_size',
        'queryType'  => 'query_type',
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->queryType) {
            $res['query_type'] = $this->queryType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListDeploymentTemplateRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['query_type'])) {
            $model->queryType = $map['query_type'];
        }

        return $model;
    }
}
