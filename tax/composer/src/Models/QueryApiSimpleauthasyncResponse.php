<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class QueryApiSimpleauthasyncResponse extends Model
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

    // 成功
    /**
     * @var string
     */
    public $returnResult;

    // false 有值
    // true  无值
    /**
     * @var string
     */
    public $nullDataFlag;

    // json格式，其他内容
    /**
     * @var string
     */
    public $bizContent;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'returnResult' => 'return_result',
        'nullDataFlag' => 'null_data_flag',
        'bizContent'   => 'biz_content',
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
        if (null !== $this->returnResult) {
            $res['return_result'] = $this->returnResult;
        }
        if (null !== $this->nullDataFlag) {
            $res['null_data_flag'] = $this->nullDataFlag;
        }
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApiSimpleauthasyncResponse
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
        if (isset($map['return_result'])) {
            $model->returnResult = $map['return_result'];
        }
        if (isset($map['null_data_flag'])) {
            $model->nullDataFlag = $map['null_data_flag'];
        }
        if (isset($map['biz_content'])) {
            $model->bizContent = $map['biz_content'];
        }

        return $model;
    }
}
