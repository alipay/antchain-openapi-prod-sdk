<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PreviewInnerFundmngbatchloanResponse extends Model
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

    // 同意放款数量
    /**
     * @var int
     */
    public $agreeLoanCount;

    // 拒绝放款数量
    /**
     * @var int
     */
    public $rejectLoanCount;

    // 导入失败数量
    /**
     * @var int
     */
    public $importFailCount;

    // 预览结果文件
    /**
     * @var string
     */
    public $fileUrl;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'agreeLoanCount'  => 'agree_loan_count',
        'rejectLoanCount' => 'reject_loan_count',
        'importFailCount' => 'import_fail_count',
        'fileUrl'         => 'file_url',
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
        if (null !== $this->agreeLoanCount) {
            $res['agree_loan_count'] = $this->agreeLoanCount;
        }
        if (null !== $this->rejectLoanCount) {
            $res['reject_loan_count'] = $this->rejectLoanCount;
        }
        if (null !== $this->importFailCount) {
            $res['import_fail_count'] = $this->importFailCount;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PreviewInnerFundmngbatchloanResponse
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
        if (isset($map['agree_loan_count'])) {
            $model->agreeLoanCount = $map['agree_loan_count'];
        }
        if (isset($map['reject_loan_count'])) {
            $model->rejectLoanCount = $map['reject_loan_count'];
        }
        if (isset($map['import_fail_count'])) {
            $model->importFailCount = $map['import_fail_count'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }

        return $model;
    }
}
