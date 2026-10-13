<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class QueryElectricCommondataRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'entityCode' => 'entity_code',
        'schemaVersion' => 'schema_version',
        'queryJson' => 'query_json',
        'pageNo' => 'page_no',
        'pageSize' => 'page_size',
    ];
    public function validate() {
        Model::validateRequired('entityCode', $this->entityCode, true);
        Model::validateRequired('schemaVersion', $this->schemaVersion, true);
        Model::validateRequired('queryJson', $this->queryJson, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->entityCode) {
            $res['entity_code'] = $this->entityCode;
        }
        if (null !== $this->schemaVersion) {
            $res['schema_version'] = $this->schemaVersion;
        }
        if (null !== $this->queryJson) {
            $res['query_json'] = $this->queryJson;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryElectricCommondataRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['entity_code'])){
            $model->entityCode = $map['entity_code'];
        }
        if(isset($map['schema_version'])){
            $model->schemaVersion = $map['schema_version'];
        }
        if(isset($map['query_json'])){
            $model->queryJson = $map['query_json'];
        }
        if(isset($map['page_no'])){
            $model->pageNo = $map['page_no'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 主数据实体稳定编码
    /**
     * @var string
     */
    public $entityCode;

    // 实体结构版本
    /**
     * @var string
     */
    public $schemaVersion;

    // JSON 查询条件；无条件时传 {}
    /**
     * @var string
     */
    public $queryJson;

    // 页码，默认1，最小1
    /**
     * @var int
     */
    public $pageNo;

    // 每页数量，默认200，最大1000
    /**
     * @var int
     */
    public $pageSize;

}
