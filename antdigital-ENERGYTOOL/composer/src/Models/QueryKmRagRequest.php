<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class QueryKmRagRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'query' => 'query',
        'knowledgeBaseIds' => 'knowledge_base_ids',
        'topk' => 'topk',
        'includeReferences' => 'include_references',
    ];
    public function validate() {
        Model::validateRequired('query', $this->query, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->query) {
            $res['query'] = $this->query;
        }
        if (null !== $this->knowledgeBaseIds) {
            $res['knowledge_base_ids'] = $this->knowledgeBaseIds;
        }
        if (null !== $this->topk) {
            $res['topk'] = $this->topk;
        }
        if (null !== $this->includeReferences) {
            $res['include_references'] = $this->includeReferences;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryKmRagRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['query'])){
            $model->query = $map['query'];
        }
        if(isset($map['knowledge_base_ids'])){
            if(!empty($map['knowledge_base_ids'])){
                $model->knowledgeBaseIds = $map['knowledge_base_ids'];
            }
        }
        if(isset($map['topk'])){
            $model->topk = $map['topk'];
        }
        if(isset($map['include_references'])){
            $model->includeReferences = $map['include_references'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 用户问题
    /**
     * @var string
     */
    public $query;

    // 子范围标识（目录树），用于缩小召回范围；不传则不限范围
    /**
     * @var string[]
     */
    public $knowledgeBaseIds;

    // 召回条数
    /**
     * @var int
     */
    public $topk;

    // 是否包含引用来源
    /**
     * @var bool
     */
    public $includeReferences;

}
