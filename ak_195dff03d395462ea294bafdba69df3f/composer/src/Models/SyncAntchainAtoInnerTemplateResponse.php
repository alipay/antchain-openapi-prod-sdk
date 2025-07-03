<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class SyncAntchainAtoInnerTemplateResponse extends Model
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

    // 同步后的新模板code
    /**
     * @var string
     */
    public $targetTemplateCode;

    // 模板同步上线时(强管控字段)校验结果
    /**
     * @var bool
     */
    public $validResult;

    // 校验结果明细JSONStr
    /**
     * @var string
     */
    public $validFieldDetail;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'targetTemplateCode' => 'target_template_code',
        'validResult'        => 'valid_result',
        'validFieldDetail'   => 'valid_field_detail',
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
        if (null !== $this->targetTemplateCode) {
            $res['target_template_code'] = $this->targetTemplateCode;
        }
        if (null !== $this->validResult) {
            $res['valid_result'] = $this->validResult;
        }
        if (null !== $this->validFieldDetail) {
            $res['valid_field_detail'] = $this->validFieldDetail;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncAntchainAtoInnerTemplateResponse
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
        if (isset($map['target_template_code'])) {
            $model->targetTemplateCode = $map['target_template_code'];
        }
        if (isset($map['valid_result'])) {
            $model->validResult = $map['valid_result'];
        }
        if (isset($map['valid_field_detail'])) {
            $model->validFieldDetail = $map['valid_field_detail'];
        }

        return $model;
    }
}
