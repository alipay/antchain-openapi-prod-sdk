<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryJusticeRightsResponse extends Model
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

    // 案件业务信息(申请人,被申请人,业务要素),示例查看对接文档
    /**
     * @var string
     */
    public $businessInfo;

    // 证据信息,示例查看对接文档
    /**
     * @var string
     */
    public $evidenceInfo;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'businessInfo' => 'business_info',
        'evidenceInfo' => 'evidence_info',
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
        if (null !== $this->evidenceInfo) {
            $res['evidence_info'] = $this->evidenceInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryJusticeRightsResponse
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
        if (isset($map['evidence_info'])) {
            $model->evidenceInfo = $map['evidence_info'];
        }

        return $model;
    }
}
