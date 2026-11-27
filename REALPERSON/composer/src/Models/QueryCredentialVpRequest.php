<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryCredentialVpRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'queryString' => 'query_string',
        'bodyJson' => 'body_json',
        'sceneCode' => 'scene_code',
    ];
    public function validate() {
        Model::validateRequired('queryString', $this->queryString, true);
        Model::validateRequired('bodyJson', $this->bodyJson, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->queryString) {
            $res['query_string'] = $this->queryString;
        }
        if (null !== $this->bodyJson) {
            $res['body_json'] = $this->bodyJson;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryCredentialVpRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['query_string'])){
            $model->queryString = $map['query_string'];
        }
        if(isset($map['body_json'])){
            $model->bodyJson = $map['body_json'];
        }
        if(isset($map['scene_code'])){
            $model->sceneCode = $map['scene_code'];
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

    // 签名参数
    /**
     * @var string
     */
    public $queryString;

    // 业务参数
    /**
     * @var string
     */
    public $bodyJson;

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;

}
