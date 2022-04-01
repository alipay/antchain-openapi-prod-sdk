<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class QueryCommodityRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 关键词，模糊查询商品名称、商品code、商品格式化编码
    /**
     * @var string
     */
    public $keyword;

    // 搜索返回条数限制
    /**
     * @var int
     */
    public $limit;
    protected $_name = [
        'authToken' => 'auth_token',
        'keyword'   => 'keyword',
        'limit'     => 'limit',
    ];

    public function validate()
    {
        Model::validateRequired('keyword', $this->keyword, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->keyword) {
            $res['keyword'] = $this->keyword;
        }
        if (null !== $this->limit) {
            $res['limit'] = $this->limit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCommodityRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['keyword'])) {
            $model->keyword = $map['keyword'];
        }
        if (isset($map['limit'])) {
            $model->limit = $map['limit'];
        }

        return $model;
    }
}
