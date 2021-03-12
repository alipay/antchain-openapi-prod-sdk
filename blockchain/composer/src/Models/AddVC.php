<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AddVC extends Model
{
    // vc原文hash
    /**
     * @example 1232
     *
     * @var string
     */
    public $contentHash;

    // issuer后缀的hash值
    /**
     * @example 12345667
     *
     * @var string
     */
    public $issuerHash;

    // valid or invalid
    /**
     * @example valid
     *
     * @var string
     */
    public $status;

    // 接收者后缀hash值
    /**
     * @example 1234567
     *
     * @var string
     */
    public $subjectHash;

    // 可验证声明id
    /**
     * @example vc:mychain:xxxxxx
     *
     * @var string
     */
    public $vcId;
    protected $_name = [
        'contentHash' => 'content_hash',
        'issuerHash'  => 'issuer_hash',
        'status'      => 'status',
        'subjectHash' => 'subject_hash',
        'vcId'        => 'vc_id',
    ];

    public function validate()
    {
        Model::validateRequired('contentHash', $this->contentHash, true);
        Model::validateRequired('issuerHash', $this->issuerHash, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('subjectHash', $this->subjectHash, true);
        Model::validateRequired('vcId', $this->vcId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contentHash) {
            $res['content_hash'] = $this->contentHash;
        }
        if (null !== $this->issuerHash) {
            $res['issuer_hash'] = $this->issuerHash;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->subjectHash) {
            $res['subject_hash'] = $this->subjectHash;
        }
        if (null !== $this->vcId) {
            $res['vc_id'] = $this->vcId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddVC
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['content_hash'])) {
            $model->contentHash = $map['content_hash'];
        }
        if (isset($map['issuer_hash'])) {
            $model->issuerHash = $map['issuer_hash'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['subject_hash'])) {
            $model->subjectHash = $map['subject_hash'];
        }
        if (isset($map['vc_id'])) {
            $model->vcId = $map['vc_id'];
        }

        return $model;
    }
}
