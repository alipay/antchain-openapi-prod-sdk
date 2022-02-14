<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryJusticeBasecaseResponse extends Model
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

    // 业务码，0表示成功 其余都是代表失败
    /**
     * @var int
     */
    public $code;

    // 案件基础信息出参
    /**
     * @var CaseBaseInfo[]
     */
    public $caseBaseInfoList;

    // 响应的详细信息
    /**
     * @var string
     */
    public $message;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'code'             => 'code',
        'caseBaseInfoList' => 'case_base_info_list',
        'message'          => 'message',
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->caseBaseInfoList) {
            $res['case_base_info_list'] = [];
            if (null !== $this->caseBaseInfoList && \is_array($this->caseBaseInfoList)) {
                $n = 0;
                foreach ($this->caseBaseInfoList as $item) {
                    $res['case_base_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryJusticeBasecaseResponse
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
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['case_base_info_list'])) {
            if (!empty($map['case_base_info_list'])) {
                $model->caseBaseInfoList = [];
                $n                       = 0;
                foreach ($map['case_base_info_list'] as $item) {
                    $model->caseBaseInfoList[$n++] = null !== $item ? CaseBaseInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
