<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class QueryReportAppResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'type' => 'type',
        'schemaVersion' => 'schema_version',
        'totalCount' => 'total_count',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'hasNext' => 'has_next',
        'dataList' => 'data_list',
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
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->schemaVersion) {
            $res['schema_version'] = $this->schemaVersion;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->hasNext) {
            $res['has_next'] = $this->hasNext;
        }
        if (null !== $this->dataList) {
            $res['data_list'] = $this->dataList;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryReportAppResponse
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
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['schema_version'])){
            $model->schemaVersion = $map['schema_version'];
        }
        if(isset($map['total_count'])){
            $model->totalCount = $map['total_count'];
        }
        if(isset($map['page_num'])){
            $model->pageNum = $map['page_num'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['has_next'])){
            $model->hasNext = $map['has_next'];
        }
        if(isset($map['data_list'])){
            $model->dataList = $map['data_list'];
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

    // 报表类型
    /**
     * @var string
     */
    public $type;

    // dataList使用的 JSON 结构版本
    /**
     * @var string
     */
    public $schemaVersion;

    // 总条数
    /**
     * @var int
     */
    public $totalCount;

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 每页条数
    /**
     * @var int
     */
    public $pageSize;

    // 是否存在下一页
    /**
     * @var bool
     */
    public $hasNext;

    // JSON 数据列表；每一项为一个合法 JSON 对象的序列化字符串；无数据时返回空列表
    /**
     * @var string
     */
    public $dataList;

}
