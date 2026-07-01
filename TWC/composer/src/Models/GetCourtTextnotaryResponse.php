<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class GetCourtTextnotaryResponse extends Model
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

    // 业务类型标识
    /**
     * @var string
     */
    public $businessType;

    // 数据类型标识
    /**
     * @var string
     */
    public $dataType;

    // 文本数据
    /**
     * @var string
     */
    public $textContent;

    // 可信时间戳
    /**
     * @var TsrResponse
     */
    public $tsr;

    // 对应的法院编号
    /**
     * @var string
     */
    public $agencyCode;

    // 对应的法院应用ID
    /**
     * @var string
     */
    public $applicationCode;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'businessType'    => 'business_type',
        'dataType'        => 'data_type',
        'textContent'     => 'text_content',
        'tsr'             => 'tsr',
        'agencyCode'      => 'agency_code',
        'applicationCode' => 'application_code',
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
        if (null !== $this->businessType) {
            $res['business_type'] = $this->businessType;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->textContent) {
            $res['text_content'] = $this->textContent;
        }
        if (null !== $this->tsr) {
            $res['tsr'] = null !== $this->tsr ? $this->tsr->toMap() : null;
        }
        if (null !== $this->agencyCode) {
            $res['agency_code'] = $this->agencyCode;
        }
        if (null !== $this->applicationCode) {
            $res['application_code'] = $this->applicationCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetCourtTextnotaryResponse
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
        if (isset($map['business_type'])) {
            $model->businessType = $map['business_type'];
        }
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }
        if (isset($map['text_content'])) {
            $model->textContent = $map['text_content'];
        }
        if (isset($map['tsr'])) {
            $model->tsr = TsrResponse::fromMap($map['tsr']);
        }
        if (isset($map['agency_code'])) {
            $model->agencyCode = $map['agency_code'];
        }
        if (isset($map['application_code'])) {
            $model->applicationCode = $map['application_code'];
        }

        return $model;
    }
}
