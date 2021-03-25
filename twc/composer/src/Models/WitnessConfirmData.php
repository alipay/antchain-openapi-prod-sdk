<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class WitnessConfirmData extends Model
{
    // 文档fileKey
    /**
     * @example
     *
     * @var string
     */
    public $docFileKey;

    // 文档摘要算法，SHA256
    /**
     * @example SHA256
     *
     * @var string
     */
    public $hashAlgorithm;

    // 签署后文档摘要值
    /**
     * @example 04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a9790099269
     *
     * @var string
     */
    public $signedHash;

    // 第三方文档id
    /**
     * @example someId
     *
     * @var string
     */
    public $thirdDocId;
    protected $_name = [
        'docFileKey'    => 'doc_file_key',
        'hashAlgorithm' => 'hash_algorithm',
        'signedHash'    => 'signed_hash',
        'thirdDocId'    => 'third_doc_id',
    ];

    public function validate()
    {
        Model::validateRequired('hashAlgorithm', $this->hashAlgorithm, true);
        Model::validateRequired('signedHash', $this->signedHash, true);
        Model::validateRequired('thirdDocId', $this->thirdDocId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->docFileKey) {
            $res['doc_file_key'] = $this->docFileKey;
        }
        if (null !== $this->hashAlgorithm) {
            $res['hash_algorithm'] = $this->hashAlgorithm;
        }
        if (null !== $this->signedHash) {
            $res['signed_hash'] = $this->signedHash;
        }
        if (null !== $this->thirdDocId) {
            $res['third_doc_id'] = $this->thirdDocId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WitnessConfirmData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['doc_file_key'])) {
            $model->docFileKey = $map['doc_file_key'];
        }
        if (isset($map['hash_algorithm'])) {
            $model->hashAlgorithm = $map['hash_algorithm'];
        }
        if (isset($map['signed_hash'])) {
            $model->signedHash = $map['signed_hash'];
        }
        if (isset($map['third_doc_id'])) {
            $model->thirdDocId = $map['third_doc_id'];
        }

        return $model;
    }
}
