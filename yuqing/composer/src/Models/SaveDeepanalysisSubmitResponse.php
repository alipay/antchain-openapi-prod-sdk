<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class SaveDeepanalysisSubmitResponse extends Model
{
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

    // 深度分析任务ID
    /**
     * @var int
     */
    public $analysisId;

    // 其他返回
    /**
     * @var string
     */
    public $resultJson;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'analysisId' => 'analysis_id',
        'resultJson' => 'result_json',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
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
        if (null !== $this->analysisId) {
            $res['analysis_id'] = $this->analysisId;
        }
        if (null !== $this->resultJson) {
            $res['result_json'] = $this->resultJson;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveDeepanalysisSubmitResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['analysis_id'])) {
            $model->analysisId = $map['analysis_id'];
        }
        if (isset($map['result_json'])) {
            $model->resultJson = $map['result_json'];
        }

        return $model;
    }
}
