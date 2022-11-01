<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryJusticeCommoncaseinfoResponse extends Model
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

    // 要素信息
    /**
     * @var string
     */
    public $businessInfo;

    // 查询的案件编号
    /**
     * @var string
     */
    public $caseNo;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'businessInfo' => 'business_info',
        'caseNo'       => 'case_no',
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
        if (null !== $this->businessInfo) {
            $res['business_info'] = $this->businessInfo;
        }
        if (null !== $this->caseNo) {
            $res['case_no'] = $this->caseNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryJusticeCommoncaseinfoResponse
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
        if (isset($map['business_info'])) {
            $model->businessInfo = $map['business_info'];
        }
        if (isset($map['case_no'])) {
            $model->caseNo = $map['case_no'];
        }

        return $model;
    }
}
