<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class QueryBusinessruleMatchResponse extends Model
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

    // 最终匹配结果
    /**
     * @var string
     */
    public $matchResult;

    // 出入参信息
    /**
     * @var string
     */
    public $httpContent;

    // 防控结果
    /**
     * @var string
     */
    public $preventResult;

    // 匹配到的L5
    /**
     * @var string
     */
    public $matchBusinessCode;

    // 匹配到的实例id
    /**
     * @var string
     */
    public $matchInstanceId;

    // 规则引擎耗时
    /**
     * @var string
     */
    public $engineTime;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'matchResult'       => 'match_result',
        'httpContent'       => 'http_content',
        'preventResult'     => 'prevent_result',
        'matchBusinessCode' => 'match_business_code',
        'matchInstanceId'   => 'match_instance_id',
        'engineTime'        => 'engine_time',
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
        if (null !== $this->matchResult) {
            $res['match_result'] = $this->matchResult;
        }
        if (null !== $this->httpContent) {
            $res['http_content'] = $this->httpContent;
        }
        if (null !== $this->preventResult) {
            $res['prevent_result'] = $this->preventResult;
        }
        if (null !== $this->matchBusinessCode) {
            $res['match_business_code'] = $this->matchBusinessCode;
        }
        if (null !== $this->matchInstanceId) {
            $res['match_instance_id'] = $this->matchInstanceId;
        }
        if (null !== $this->engineTime) {
            $res['engine_time'] = $this->engineTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBusinessruleMatchResponse
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
        if (isset($map['match_result'])) {
            $model->matchResult = $map['match_result'];
        }
        if (isset($map['http_content'])) {
            $model->httpContent = $map['http_content'];
        }
        if (isset($map['prevent_result'])) {
            $model->preventResult = $map['prevent_result'];
        }
        if (isset($map['match_business_code'])) {
            $model->matchBusinessCode = $map['match_business_code'];
        }
        if (isset($map['match_instance_id'])) {
            $model->matchInstanceId = $map['match_instance_id'];
        }
        if (isset($map['engine_time'])) {
            $model->engineTime = $map['engine_time'];
        }

        return $model;
    }
}
