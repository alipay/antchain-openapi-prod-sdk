<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UploadCreditAplusissueResponse extends Model
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

    // 批次id
    /**
     * @var string
     */
    public $batchId;

    // 批次状态 -1:失效， 0:初始化完成，1:进行中，2:部分成功，3:成功
    /**
     * @var int
     */
    public $batchIdStatus;

    // 凭证发行跳转url
    /**
     * @var string
     */
    public $issueUrl;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'batchId'       => 'batch_id',
        'batchIdStatus' => 'batch_id_status',
        'issueUrl'      => 'issue_url',
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
        if (null !== $this->batchId) {
            $res['batch_id'] = $this->batchId;
        }
        if (null !== $this->batchIdStatus) {
            $res['batch_id_status'] = $this->batchIdStatus;
        }
        if (null !== $this->issueUrl) {
            $res['issue_url'] = $this->issueUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadCreditAplusissueResponse
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
        if (isset($map['batch_id'])) {
            $model->batchId = $map['batch_id'];
        }
        if (isset($map['batch_id_status'])) {
            $model->batchIdStatus = $map['batch_id_status'];
        }
        if (isset($map['issue_url'])) {
            $model->issueUrl = $map['issue_url'];
        }

        return $model;
    }
}
