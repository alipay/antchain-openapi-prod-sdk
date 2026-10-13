<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class QueryElectricCommondataResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'entityCode' => 'entity_code',
        'schemaVersion' => 'schema_version',
        'dataJson' => 'data_json',
        'metaJson' => 'meta_json',
        'totalCount' => 'total_count',
        'pageNo' => 'page_no',
        'pageSize' => 'page_size',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->entityCode) {
            $res['entity_code'] = $this->entityCode;
        }
        if (null !== $this->schemaVersion) {
            $res['schema_version'] = $this->schemaVersion;
        }
        if (null !== $this->dataJson) {
            $res['data_json'] = $this->dataJson;
        }
        if (null !== $this->metaJson) {
            $res['meta_json'] = $this->metaJson;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
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
     * @return QueryElectricCommondataResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['entity_code'])){
            $model->entityCode = $map['entity_code'];
        }
        if(isset($map['schema_version'])){
            $model->schemaVersion = $map['schema_version'];
        }
        if(isset($map['data_json'])){
            $model->dataJson = $map['data_json'];
        }
        if(isset($map['meta_json'])){
            $model->metaJson = $map['meta_json'];
        }
        if(isset($map['total_count'])){
            $model->totalCount = $map['total_count'];
        }
        if(isset($map['page_no'])){
            $model->pageNo = $map['page_no'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 实际返回的实体编码
    /**
     * @var string
     */
    public $entityCode;

    // 实际返回的实体结构版本
    /**
     * @var string
     */
    public $schemaVersion;

    // JSON数组字符串；成功但无数据时为 []
    /**
     * @var string
     */
    public $dataJson;

    // 完整性、覆盖范围和来源等元数据
    /**
     * @var string
     */
    public $metaJson;

    // 符合条件的总记录数
    /**
     * @var int
     */
    public $totalCount;

    // 当前页码
    /**
     * @var int
     */
    public $pageNo;

    // 当前分页大小
    /**
     * @var int
     */
    public $pageSize;

}
