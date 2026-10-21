<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGENT\Models;

use AlibabaCloud\Tea\Model;

class QueryEnergyknowledgeRagrecallRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'query' => 'query',
        'knowledgebaseids' => 'knowledgebaseids',
        'includereferences' => 'includereferences',
        'topk' => 'topk',
    ];
    public function validate() {
        Model::validateRequired('query', $this->query, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->query) {
            $res['query'] = $this->query;
        }
        if (null !== $this->knowledgebaseids) {
            $res['knowledgebaseids'] = $this->knowledgebaseids;
        }
        if (null !== $this->includereferences) {
            $res['includereferences'] = $this->includereferences;
        }
        if (null !== $this->topk) {
            $res['topk'] = $this->topk;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryEnergyknowledgeRagrecallRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['query'])){
            $model->query = $map['query'];
        }
        if(isset($map['knowledgebaseids'])){
            if(!empty($map['knowledgebaseids'])){
                $model->knowledgebaseids = $map['knowledgebaseids'];
            }
        }
        if(isset($map['includereferences'])){
            $model->includereferences = $map['includereferences'];
        }
        if(isset($map['topk'])){
            $model->topk = $map['topk'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // rag检索问题
    /**
     * @var string
     */
    public $query;

    // 召回的知识库id
    /**
     * @var string[]
     */
    public $knowledgebaseids;

    // 是否包含召回文件名，默认true
    /**
     * @var bool
     */
    public $includereferences;

    // 召回条数，默认5
    /**
     * @var int
     */
    public $topk;

}
