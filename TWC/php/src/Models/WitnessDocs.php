<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class WitnessDocs extends Model {
    protected $_name = [
        'docHash' => 'doc_hash',
        'thirdDocId' => 'third_doc_id',
    ];
    public function validate() {
        Model::validateRequired('docHash', $this->docHash, true);
        Model::validateRequired('thirdDocId', $this->thirdDocId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->docHash) {
            $res['doc_hash'] = $this->docHash;
        }
        if (null !== $this->thirdDocId) {
            $res['third_doc_id'] = $this->thirdDocId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return WitnessDocs
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['doc_hash'])){
            $model->docHash = $map['doc_hash'];
        }
        if(isset($map['third_doc_id'])){
            $model->thirdDocId = $map['third_doc_id'];
        }
        return $model;
    }
    // 文档摘要值
    /**
     * @example 04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a9790099269
     * @var string
     */
    public $docHash;

    // 第三方文档id
    /**
     * @example someId
     * @var string
     */
    public $thirdDocId;

}
