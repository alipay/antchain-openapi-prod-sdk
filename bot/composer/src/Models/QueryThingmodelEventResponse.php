<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryThingmodelEventResponse extends Model
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

    // 物模型事件json
    //
    /**
     * @var string
     */
    public $thingModelEventJson;

    // 数据样例
    /**
     * @var string
     */
    public $dataDemo;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'thingModelEventJson' => 'thing_model_event_json',
        'dataDemo'            => 'data_demo',
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
        if (null !== $this->thingModelEventJson) {
            $res['thing_model_event_json'] = $this->thingModelEventJson;
        }
        if (null !== $this->dataDemo) {
            $res['data_demo'] = $this->dataDemo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryThingmodelEventResponse
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
        if (isset($map['thing_model_event_json'])) {
            $model->thingModelEventJson = $map['thing_model_event_json'];
        }
        if (isset($map['data_demo'])) {
            $model->dataDemo = $map['data_demo'];
        }

        return $model;
    }
}
