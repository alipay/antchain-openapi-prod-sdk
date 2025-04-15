<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class OfflineEvidenceWatermarkResult extends Model
{
    // 取证编号
    /**
     * @example 123456
     *
     * @var string
     */
    public $evidenceNo;

    // 水印链接
    /**
     * @example https://www.baidu.com
     *
     * @var string
     */
    public $watermarkUrl;

    // 封面链接
    /**
     * @example https://www.baidu.com
     *
     * @var string
     */
    public $coverUrl;

    // 失败原因
    /**
     * @example 失败原因
     *
     * @var string
     */
    public $failReason;
    protected $_name = [
        'evidenceNo'   => 'evidence_no',
        'watermarkUrl' => 'watermark_url',
        'coverUrl'     => 'cover_url',
        'failReason'   => 'fail_reason',
    ];

    public function validate()
    {
        Model::validateRequired('evidenceNo', $this->evidenceNo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->evidenceNo) {
            $res['evidence_no'] = $this->evidenceNo;
        }
        if (null !== $this->watermarkUrl) {
            $res['watermark_url'] = $this->watermarkUrl;
        }
        if (null !== $this->coverUrl) {
            $res['cover_url'] = $this->coverUrl;
        }
        if (null !== $this->failReason) {
            $res['fail_reason'] = $this->failReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OfflineEvidenceWatermarkResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['evidence_no'])) {
            $model->evidenceNo = $map['evidence_no'];
        }
        if (isset($map['watermark_url'])) {
            $model->watermarkUrl = $map['watermark_url'];
        }
        if (isset($map['cover_url'])) {
            $model->coverUrl = $map['cover_url'];
        }
        if (isset($map['fail_reason'])) {
            $model->failReason = $map['fail_reason'];
        }

        return $model;
    }
}
