<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class QueryCombinationResponse extends Model
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

    // 实施内容详情
    /**
     * @var OpenSubjectCombinationVO
     */
    public $openSubjectCombinationVo;
    protected $_name = [
        'reqMsgId'                 => 'req_msg_id',
        'resultCode'               => 'result_code',
        'resultMsg'                => 'result_msg',
        'openSubjectCombinationVo' => 'open_subject_combination_vo',
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
        if (null !== $this->openSubjectCombinationVo) {
            $res['open_subject_combination_vo'] = null !== $this->openSubjectCombinationVo ? $this->openSubjectCombinationVo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCombinationResponse
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
        if (isset($map['open_subject_combination_vo'])) {
            $model->openSubjectCombinationVo = OpenSubjectCombinationVO::fromMap($map['open_subject_combination_vo']);
        }

        return $model;
    }
}
