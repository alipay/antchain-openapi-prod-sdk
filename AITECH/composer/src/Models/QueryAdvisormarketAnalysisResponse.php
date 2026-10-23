<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class QueryAdvisormarketAnalysisResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'data' => 'data',
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
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAdvisormarketAnalysisResponse
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
        if(isset($map['data'])){
            $model->data = $map['data'];
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

    // JSON 数组字符串，调用方需再次解析。示例：[{"task_id":"ana_01K5A1B2","display_name":"中心商圈","analysis_type":"YINLI_CROWD_ANALYSIS","status":"PROCESSING","result_url":null,"created_at":"2026-09-14 15:30:00"}]。无数据返回 []；仅 SUCCESS 任务的结果查询会返回 result_url。
    /**
     * @var string
     */
    public $data;

}
