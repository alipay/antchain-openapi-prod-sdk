<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class QueryReportAppRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'type' => 'type',
        'queryJson' => 'query_json',
    ];
    public function validate() {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('queryJson', $this->queryJson, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->queryJson) {
            $res['query_json'] = $this->queryJson;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryReportAppRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['query_json'])){
            $model->queryJson = $map['query_json'];
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

    // 报表类型
    /**
     * @var string
     */
    public $type;

    // 查询条件 JSON 序列化字符串，JSON 格式由type决定
    /**
     * @var string
     */
    public $queryJson;

}
