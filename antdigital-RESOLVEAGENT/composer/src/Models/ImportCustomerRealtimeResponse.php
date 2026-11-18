<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RESOLVEAGENT\Models;

use AlibabaCloud\Tea\Model;

class ImportCustomerRealtimeResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'requestId' => 'request_id',
        'providerBatchId' => 'provider_batch_id',
        'totalCount' => 'total_count',
        'acceptedCount' => 'accepted_count',
        'rejectedCount' => 'rejected_count',
        'acceptedSerialNos' => 'accepted_serial_nos',
        'rejectedItems' => 'rejected_items',
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
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->providerBatchId) {
            $res['provider_batch_id'] = $this->providerBatchId;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->acceptedCount) {
            $res['accepted_count'] = $this->acceptedCount;
        }
        if (null !== $this->rejectedCount) {
            $res['rejected_count'] = $this->rejectedCount;
        }
        if (null !== $this->acceptedSerialNos) {
            $res['accepted_serial_nos'] = $this->acceptedSerialNos;
        }
        if (null !== $this->rejectedItems) {
            $res['rejected_items'] = $this->rejectedItems;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ImportCustomerRealtimeResponse
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
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['provider_batch_id'])){
            $model->providerBatchId = $map['provider_batch_id'];
        }
        if(isset($map['total_count'])){
            $model->totalCount = $map['total_count'];
        }
        if(isset($map['accepted_count'])){
            $model->acceptedCount = $map['accepted_count'];
        }
        if(isset($map['rejected_count'])){
            $model->rejectedCount = $map['rejected_count'];
        }
        if(isset($map['accepted_serial_nos'])){
            if(!empty($map['accepted_serial_nos'])){
                $model->acceptedSerialNos = $map['accepted_serial_nos'];
            }
        }
        if(isset($map['rejected_items'])){
            $model->rejectedItems = $map['rejected_items'];
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

    // 原样回传请求中的 requestId
    /**
     * @var string
     */
    public $requestId;

    // 我方生成的批次流水号，用于对账与追踪
    /**
     * @var string
     */
    public $providerBatchId;

    // 名单行总数（= custInfo 行数）
    /**
     * @var int
     */
    public $totalCount;

    // 受理成功、进入外呼队列的行数
    /**
     * @var int
     */
    public $acceptedCount;

    // 校验未通过被拒绝的行数
    /**
     * @var int
     */
    public $rejectedCount;

    // 受理成功的 serialNo 列表
    /**
     * @var string[]
     */
    public $acceptedSerialNos;

    // 被拒绝的 serialNo → 拒绝原因
    /**
     * @var string
     */
    public $rejectedItems;

}
