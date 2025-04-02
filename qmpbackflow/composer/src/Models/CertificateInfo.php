<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CertificateInfo extends Model
{
    // 结清证明开具结果，0：有结清证明、1：无结清证明、2：开具中、3：暂不支持开具
    /**
     * @example 0
     *
     * @var string
     */
    public $status;

    // 用信申请订单号
    /**
     * @example 123123
     *
     * @var string
     */
    public $relationNo;

    // 结清证明url
    /**
     * @example https://www.example.com/ffff.pdf?expire=111111
     *
     * @var string
     */
    public $certificateUrl;

    // 结清证明文件Base64
    /**
     * @example BEAKENMCT...
     *
     * @var string
     */
    public $certificateBase64;

    // 说明
    /**
     * @example 已开具
     *
     * @var string
     */
    public $message;
    protected $_name = [
        'status'            => 'status',
        'relationNo'        => 'relation_no',
        'certificateUrl'    => 'certificate_url',
        'certificateBase64' => 'certificate_base64',
        'message'           => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->relationNo) {
            $res['relation_no'] = $this->relationNo;
        }
        if (null !== $this->certificateUrl) {
            $res['certificate_url'] = $this->certificateUrl;
        }
        if (null !== $this->certificateBase64) {
            $res['certificate_base64'] = $this->certificateBase64;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CertificateInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['relation_no'])) {
            $model->relationNo = $map['relation_no'];
        }
        if (isset($map['certificate_url'])) {
            $model->certificateUrl = $map['certificate_url'];
        }
        if (isset($map['certificate_base64'])) {
            $model->certificateBase64 = $map['certificate_base64'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
