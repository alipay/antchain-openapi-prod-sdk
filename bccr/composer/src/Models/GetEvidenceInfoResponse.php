<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class GetEvidenceInfoResponse extends Model
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

    // 取证编号
    /**
     * @var string
     */
    public $evidenceId;

    // 取证状态（取证中：DOING，取证成功：SUCCESS，取证失败：FAIL）
    /**
     * @var string
     */
    public $status;

    // 公证处code
    /**
     * @var string
     */
    public $notaryOffice;

    // 取证url信息
    /**
     * @var EvidenceWebUrlInfo
     */
    public $evidenceUrl;

    // 取证结果文件下载url（有效期3天）
    /**
     * @var string
     */
    public $evidenceResultUrl;

    // 存证证明信息
    /**
     * @var EvidenceCertificateInfo
     */
    public $certificateInfo;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'evidenceId'        => 'evidence_id',
        'status'            => 'status',
        'notaryOffice'      => 'notary_office',
        'evidenceUrl'       => 'evidence_url',
        'evidenceResultUrl' => 'evidence_result_url',
        'certificateInfo'   => 'certificate_info',
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
        if (null !== $this->evidenceId) {
            $res['evidence_id'] = $this->evidenceId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->notaryOffice) {
            $res['notary_office'] = $this->notaryOffice;
        }
        if (null !== $this->evidenceUrl) {
            $res['evidence_url'] = null !== $this->evidenceUrl ? $this->evidenceUrl->toMap() : null;
        }
        if (null !== $this->evidenceResultUrl) {
            $res['evidence_result_url'] = $this->evidenceResultUrl;
        }
        if (null !== $this->certificateInfo) {
            $res['certificate_info'] = null !== $this->certificateInfo ? $this->certificateInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetEvidenceInfoResponse
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
        if (isset($map['evidence_id'])) {
            $model->evidenceId = $map['evidence_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['notary_office'])) {
            $model->notaryOffice = $map['notary_office'];
        }
        if (isset($map['evidence_url'])) {
            $model->evidenceUrl = EvidenceWebUrlInfo::fromMap($map['evidence_url']);
        }
        if (isset($map['evidence_result_url'])) {
            $model->evidenceResultUrl = $map['evidence_result_url'];
        }
        if (isset($map['certificate_info'])) {
            $model->certificateInfo = EvidenceCertificateInfo::fromMap($map['certificate_info']);
        }

        return $model;
    }
}
