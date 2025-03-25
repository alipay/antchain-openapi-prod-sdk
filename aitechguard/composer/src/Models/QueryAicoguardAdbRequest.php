<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECHGUARD\Models;

use AlibabaCloud\Tea\Model;

class QueryAicoguardAdbRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 查询向量库的内容
    /**
     * @var string
     */
    public $content;

    // 向量库的表名
    /**
     * @var string
     */
    public $collectionName;
    protected $_name = [
        'authToken'      => 'auth_token',
        'content'        => 'content',
        'collectionName' => 'collection_name',
    ];

    public function validate()
    {
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('collectionName', $this->collectionName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->collectionName) {
            $res['collection_name'] = $this->collectionName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAicoguardAdbRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['collection_name'])) {
            $model->collectionName = $map['collection_name'];
        }

        return $model;
    }
}
